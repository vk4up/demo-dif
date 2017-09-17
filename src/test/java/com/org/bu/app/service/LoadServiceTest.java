package com.org.bu.app.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.org.bu.app.ApplicationTests;

public class LoadServiceTest extends ApplicationTests {
	
	@Autowired
	LoadService loadService;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInsert() {
		loadService.insert("ca-500");
		loadService.insert("policy");
	}

}
