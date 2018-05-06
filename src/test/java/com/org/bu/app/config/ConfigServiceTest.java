package com.org.bu.app.config;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.org.bu.app.ApplicationTests;

public class ConfigServiceTest extends ApplicationTests{
	
	@Autowired
	ConfigService configService;

	@Before
	public void setUp() throws Exception {
		configService.deleteAll();
		configService.save(new Config("ca-500", "C:\\Users\\vidhir\\git\\demo-dif\\data\\ca-500.csv", "USERS_CA", "INSERT INTO USERS_CA(first_name,last_name,company_name,address,city,province,postal,phone1,phone2,email,web) VALUES(?,?,?,?,?,?,?,?,?,?,?)", 11, 10));
		configService.save(new Config("us-500", "C:\\Users\\vidhir\\git\\demo-dif\\data\\us-500.csv", "USERS_US", "INSERT INTO USERS_US(first_name,last_name,company_name,address,city,province,postal,phone1,phone2,email,web) VALUES(?,?,?,?,?,?,?,?,?,?,?)", 11, 10));
		configService.save(new Config("policy", "C:\\Users\\vidhir\\git\\demo-dif\\data\\policy.csv", "POLICY_DATA", "INSERT INTO POLICY_DATA(policyID,statecode,county,eq_site_limit,hu_site_limit,fl_site_limit,fr_site_limit,tiv_2011,tiv_2012,eq_site_deductible,hu_site_deductible,fl_site_deductible,fr_site_deductible,point_latitude,point_longitude,line,construction,point_granularity) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", 18, 10));
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindById() {
		Config config = configService.findById("ca-500");
		assertThat(config.getSource()).isEqualTo("C:\\Users\\vidhir\\git\\demo-dif\\data\\ca-500.csv");
		
	}

}
