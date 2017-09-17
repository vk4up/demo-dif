package com.org.bu.app.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.org.bu.app.domain.Policy;

public class PolicyDaoTest {
	
	private PolicyDao policyDao;

	@Before
	public void setUp() throws Exception {
		policyDao = new PolicyDao();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInsert_with_good_data() {
		List<Policy> policies = generateGoodData();
		policyDao.insert(policies);
	}

	private List<Policy> generateGoodData() {
		List<Policy> policies = new ArrayList<Policy>();
		policies.add(new Policy("policyID","statecode","county","eq_site_limit","hu_site_limit","fl_site_limit","fr_site_limit","tiv_2011","tiv_2012","eq_site_deductible","hu_site_deductible","fl_site_deductible","fr_site_deductible","point_latitude","point_longitude","line","construction","point_granularity"));
		policies.add(new Policy("119736","FL","CLAY COUNTY","498960","498960","498960","498960","498960","792148.9","0","9979.2","0","0","30.102261","-81.711777","Residential","Masonry","1"));
		policies.add(new Policy("448094","FL","CLAY COUNTY","1322376.3","1322376.3","1322376.3","1322376.3","1322376.3","1438163.57","0","0","0","0","30.063936","-81.707664","Residential","Masonry","3"));
		policies.add(new Policy("206893","FL","CLAY COUNTY","190724.4","190724.4","190724.4","190724.4","190724.4","192476.78","0","0","0","0","30.089579","-81.700455","Residential","Wood","1"));
		policies.add(new Policy("333743","FL","CLAY COUNTY","0","79520.76","0","0","79520.76","86854.48","0","0","0","0","30.063236","-81.707703","Residential","Wood","3"));
		policies.add(new Policy("172534","FL","CLAY COUNTY","0","254281.5","0","254281.5","254281.5","246144.49","0","0","0","0","30.060614","-81.702675","Residential","Wood","1"));
		policies.add(new Policy("785275","FL","CLAY COUNTY","0","515035.62","0","0","515035.62","884419.17","0","0","0","0","30.063236","-81.707703","Residential","Masonry","3"));
		policies.add(new Policy("995932","FL","CLAY COUNTY","0","19260000","0","0","19260000","20610000","0","0","0","0","30.102226","-81.713882","Commercial","Reinforced Concrete","1"));
		policies.add(new Policy("223488","FL","CLAY COUNTY","328500","328500","328500","328500","328500","348374.25","0","16425","0","0","30.102217","-81.707146","Residential","Wood","1"));
		policies.add(new Policy("433512","FL","CLAY COUNTY","315000","315000","315000","315000","315000","265821.57","0","15750","0","0","30.118774","-81.704613","Residential","Wood","1"));
		policies.add(new Policy("142071","FL","CLAY COUNTY","705600","705600","705600","705600","705600","1010842.56","14112","35280","0","0","30.100628","-81.703751","Residential","Masonry","1"));
		policies.add(new Policy("253816","FL","CLAY COUNTY","831498.3","831498.3","831498.3","831498.3","831498.3","1117791.48","0","0","0","0","30.10216","-81.719444","Residential","Masonry","1"));
		return policies;
	}

}
