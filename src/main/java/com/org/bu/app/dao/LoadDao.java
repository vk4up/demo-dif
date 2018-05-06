package com.org.bu.app.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.org.bu.app.config.Config;

@Component
public class LoadDao extends BaseDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insert(List<List<String>> rows, Config config) {
		String sql = config.getSql();
		int cols = config.getCols();

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
