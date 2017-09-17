package com.org.bu.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.org.bu.app.domain.User;

public class UserDao extends BaseDao {

	private static final int BATCH_SIZE = 10;
	private static final String SQL_USERS_CA = "INSERT INTO USERS_CA(first_name,last_name,company_name,address,city,province,postal,phone1,phone2,email,web) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

	private Log log = LogFactory.getLog(UserDao.class);

	public void insert(List<User> users) {
		String url = getUrl();
		String user = getUser();
		String password = getPassword();
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
			conn.setAutoCommit(false);

			int counter = 1;
			PreparedStatement stmt = conn.prepareStatement(SQL_USERS_CA);
			for (int index = 1; index < users.size(); index++) {
				stmt.setString(1, users.get(index).getFirstName());
				stmt.setString(2, users.get(index).getLastName());
				stmt.setString(3, users.get(index).getCompanyName());
				stmt.setString(4, users.get(index).getAddress());
				stmt.setString(5, users.get(index).getCity());
				stmt.setString(6, users.get(index).getProvince());
				stmt.setString(7, users.get(index).getPostal());
				stmt.setString(8, users.get(index).getPhone1());
				stmt.setString(9, users.get(index).getPhone2());
				stmt.setString(10, users.get(index).getEmail());
				stmt.setString(11, users.get(index).getWeb());

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
