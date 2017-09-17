package com.org.bu.app.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class LoadDao extends BaseDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insert(List<List<String>> rows, Map config) {
//		String sql = "INSERT INTO USERS_CA(first_name,last_name,company_name,address,city,province,postal,phone1,phone2,email,web) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
//		int cols = 11;
		
		String sql = "INSERT INTO POLICY_DATA(policyID,statecode,county,eq_site_limit,hu_site_limit,fl_site_limit,fr_site_limit,tiv_2011,tiv_2012,eq_site_deductible,hu_site_deductible,fl_site_deductible,fr_site_deductible,point_latitude,point_longitude,line,construction,point_granularity) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		int cols = 18;
		
		jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps, int index) throws SQLException {
				List<String> row = rows.get(index);
				for(int colIndex = 0; colIndex < cols; colIndex++){
					ps.setString(colIndex+1, row.get(colIndex));
				}
			}
			
			@Override
			public int getBatchSize() {
				return rows.size();
			}
		});
	}

}
