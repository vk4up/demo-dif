package com.org.bu.app.domain;

import com.opencsv.bean.CsvBindByName;

public class User {

	@CsvBindByName(column = "first_name")
	private String firstName;

	@CsvBindByName(column = "last_name")
	private String lastName;

	@CsvBindByName(column = "company_name")
	private String companyName;

	@CsvBindByName(column = "address")
	private String address;

	@CsvBindByName(column = "city")
	private String city;

	@CsvBindByName(column = "province")
	private String province;

	@CsvBindByName(column = "postal")
	private String postal;

	@CsvBindByName(column = "phone1")
	private String phone1;

	@CsvBindByName(column = "phone2")
	private String phone2;

	@CsvBindByName(column = "email")
	private String email;

	@CsvBindByName(column = "web")
	private String web;

	public User() {
		super();
	}

	public User(String firstName, String lastName, String companyName, String address, String city, String province,
			String postal, String phone1, String phone2, String email, String web) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.companyName = companyName;
		this.address = address;
		this.city = city;
		this.province = province;
		this.postal = postal;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.email = email;
		this.web = web;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [firstName=").append(firstName).append(", lastName=").append(lastName)
				.append(", companyName=").append(companyName).append(", address=").append(address).append(", city=")
				.append(city).append(", province=").append(province).append(", postal=").append(postal)
				.append(", phone1=").append(phone1).append(", phone2=").append(phone2).append(", email=").append(email)
				.append(", web=").append(web).append("]");
		return builder.toString();
	}

}
