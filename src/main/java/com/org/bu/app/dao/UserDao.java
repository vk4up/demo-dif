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

import com.org.bu.app.domain.User;

@Component
public class UserDao extends BaseDao {

	private static final int BATCH_SIZE = 10;
	private static final String SQL_USERS_CA = "INSERT INTO USERS_CA(first_name,last_name,company_name,address,city,province,postal,phone1,phone2,email,web) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

	private Log log = LogFactory.getLog(UserDao.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void insert(List<User> users) {

		jdbcTemplate.batchUpdate(SQL_USERS_CA, new BatchPreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps, int index) throws SQLException {
				User user = users.get(index);
				ps.setString(1, user.getFirstName());
				ps.setString(2, user.getLastName());
				ps.setString(3, user.getCompanyName());
				ps.setString(4, user.getAddress());
				ps.setString(5, user.getCity());
				ps.setString(6, user.getProvince());
				ps.setString(7, user.getPostal());
				ps.setString(8, user.getPhone1());
				ps.setString(9, user.getPhone2());
				ps.setString(10, user.getEmail());
				ps.setString(11, user.getWeb());
			}

			@Override
			public int getBatchSize() {
				return BATCH_SIZE;
			}
		});
	}
}
