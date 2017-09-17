package com.org.bu.app.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.org.bu.app.domain.Policy;

@Component
public class PolicyDao extends BaseDao {

	private static final int BATCH_SIZE = 10;
	private static final String SQL_USERS_CA = "INSERT INTO POLICY_DATA(policyID,statecode,county,eq_site_limit,hu_site_limit,fl_site_limit,fr_site_limit,tiv_2011,tiv_2012,eq_site_deductible,hu_site_deductible,fl_site_deductible,fr_site_deductible,point_latitude,point_longitude,line,construction,point_granularity) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

	private Log log = LogFactory.getLog(PolicyDao.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void insert(List<Policy> policies) {

		jdbcTemplate.batchUpdate(SQL_USERS_CA, new BatchPreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps, int index) throws SQLException {
				Policy policy = policies.get(index);
				ps.setString(1, policy.getPolicyID());
				ps.setString(2, policy.getStateCode());
				ps.setString(3, policy.getCounty());
				ps.setString(4, policy.getEqSiteLimit());
				ps.setString(5, policy.getHuSiteLimit());
				ps.setString(6, policy.getFlSiteLimit());
				ps.setString(7, policy.getFrSiteLimit());
				ps.setString(8, policy.getTiv2011());
				ps.setString(9, policy.getTiv2012());
				ps.setString(10, policy.getEqSiteDeductible());
				ps.setString(11, policy.getHuSiteDeductible());
				ps.setString(12, policy.getFlSiteDeductible());
				ps.setString(13, policy.getFrSiteDeductible());
				ps.setString(14, policy.getPointLatitude());
				ps.setString(15, policy.getPointLongitude());
				ps.setString(16, policy.getLine());
				ps.setString(17, policy.getConstruction());
				ps.setString(18, policy.getPointGranularity());
			}

			@Override
			public int getBatchSize() {
				return BATCH_SIZE;
			}
		});

	}

}
