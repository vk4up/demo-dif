package com.org.bu.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.org.bu.app.domain.Policy;

public class PolicyDao extends BaseDao {

	private static final int BATCH_SIZE = 10;
	private static final String SQL_USERS_CA = "INSERT INTO POLICY_DATA(policyID,statecode,county,eq_site_limit,hu_site_limit,fl_site_limit,fr_site_limit,tiv_2011,tiv_2012,eq_site_deductible,hu_site_deductible,fl_site_deductible,fr_site_deductible,point_latitude,point_longitude,line,construction,point_granularity) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

	private Log log = LogFactory.getLog(PolicyDao.class);

	public void insert(List<Policy> policies) {
		String url = getUrl();
		String user = getUser();
		String password = getPassword();
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
			conn.setAutoCommit(false);

			int counter = 1;
			PreparedStatement stmt = conn.prepareStatement(SQL_USERS_CA);
			for (int index = 1; index < policies.size(); index++) {
				stmt.setString(1, policies.get(index).getPolicyID());
				stmt.setString(2, policies.get(index).getStateCode());
				stmt.setString(3, policies.get(index).getCounty());
				stmt.setString(4, policies.get(index).getEqSiteLimit());
				stmt.setString(5, policies.get(index).getHuSiteLimit());
				stmt.setString(6, policies.get(index).getFlSiteLimit());
				stmt.setString(7, policies.get(index).getFrSiteLimit());
				stmt.setString(8, policies.get(index).getTiv2011());
				stmt.setString(9, policies.get(index).getTiv2012());
				stmt.setString(10, policies.get(index).getEqSiteDeductible());
				stmt.setString(11, policies.get(index).getHuSiteDeductible());
				stmt.setString(12, policies.get(index).getFlSiteDeductible());
				stmt.setString(13, policies.get(index).getFrSiteDeductible());
				stmt.setString(14, policies.get(index).getPointLatitude());
				stmt.setString(15, policies.get(index).getPointLongitude());
				stmt.setString(16, policies.get(index).getLine());
				stmt.setString(17, policies.get(index).getConstruction());
				stmt.setString(18, policies.get(index).getPointGranularity());

				stmt.addBatch();
				if (index % BATCH_SIZE == 0) {
					stmt.executeBatch();
					conn.commit();
					log.info("Batch " + (counter++) + " executed.");
				}
			}
			stmt.executeBatch();
			conn.commit();
			log.info("Final Batch executed.");
		} catch (SQLException e) {
			e.printStackTrace();
			if (conn != null) {
				try {
					conn.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		}
	}

}
