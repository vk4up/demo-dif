package com.org.bu.app.dao;

public class BaseDao {

	private String url = "jdbc:oracle:thin:@192.168.99.100:49161:xe";
	private String user = "admin";
	private String password = "pass55word";

	public String getUrl() {
		return url;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}

}
