package com.org.bu.app.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.org.bu.app.ApplicationTests;
import com.org.bu.app.domain.User;

public class UserDaoTest extends ApplicationTests {

	@Autowired
	private UserDao userDao;

	@Before
	public void setUp() throws Exception {
		// userDao = new UserDao();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInsert_with_good_data() {
		List<User> users = generateGoodData();
		userDao.insert(users);
	}

	@Test
	public void testInsert_with_head_row_only() {
		List<User> users = generateHeadRowData();
		userDao.insert(users);
	}

	@Test
	public void testInsert_with_bad_data() {
		List<User> users = generateBadData();
		userDao.insert(users);
	}

	private List<User> generateGoodData() {
		List<User> users = new ArrayList<User>();
		users.add(new User("first_name", "last_name", "company_name", "address", "city", "province", "postal", "phone1",
				"phone2", "email", "web"));
		users.add(new User("Francoise", "Rautenstrauch", "Riebesell, H F Jr", "2335 Canton Hwy #6", "Windsor", "ON",
				"N8N 3N2", "519-569-8399", "519-978-6179", "francoise.rautenstrauch@rautenstrauch.com",
				"http://www.riebesellhfjr.com"));
		users.add(new User("Kendra", "Loud", "Deloitte & Touche", "6 Arch St #9757", "Alcida", "NB", "E8J 2C4",
				"506-363-1526", "506-932-4472", "kloud@gmail.com", "http://www.deloittetouche.com"));
		users.add(new User("Kendra", "Loud", "Deloitte & Touche", "6 Arch St #9757", "Alcida", "NB", "E8J 2C4",
				"506-363-1526", "506-932-4472", "kloud@gmail.com", "http://www.deloittetouche.com"));
		users.add(new User("Kendra", "Loud", "Deloitte & Touche", "6 Arch St #9757", "Alcida", "NB", "E8J 2C4",
				"506-363-1526", "506-932-4472", "kloud@gmail.com", "http://www.deloittetouche.com"));
		users.add(new User("Kendra", "Loud", "Deloitte & Touche", "6 Arch St #9757", "Alcida", "NB", "E8J 2C4",
				"506-363-1526", "506-932-4472", "kloud@gmail.com", "http://www.deloittetouche.com"));
		users.add(new User("Kendra", "Loud", "Deloitte & Touche", "6 Arch St #9757", "Alcida", "NB", "E8J 2C4",
				"506-363-1526", "506-932-4472", "kloud@gmail.com", "http://www.deloittetouche.com"));
		users.add(new User("Kendra", "Loud", "Deloitte & Touche", "6 Arch St #9757", "Alcida", "NB", "E8J 2C4",
				"506-363-1526", "506-932-4472", "kloud@gmail.com", "http://www.deloittetouche.com"));
		users.add(new User("Kendra", "Loud", "Deloitte & Touche", "6 Arch St #9757", "Alcida", "NB", "E8J 2C4",
				"506-363-1526", "506-932-4472", "kloud@gmail.com", "http://www.deloittetouche.com"));
		users.add(new User("Kendra", "Loud", "Deloitte & Touche", "6 Arch St #9757", "Alcida", "NB", "E8J 2C4",
				"506-363-1526", "506-932-4472", "kloud@gmail.com", "http://www.deloittetouche.com"));
		users.add(new User("Kendra", "Loud", "Deloitte & Touche", "6 Arch St #9757", "Alcida", "NB", "E8J 2C4",
				"506-363-1526", "506-932-4472", "kloud@gmail.com", "http://www.deloittetouche.com"));
		users.add(new User("Francoise", "Rautenstrauch", "Riebesell, H F Jr", "2335 Canton Hwy #6", "Windsor", "ON",
				"N8N 3N2", "519-569-8399", "519-978-6179", "francoise.rautenstrauch@rautenstrauch.com",
				"http://www.riebesellhfjr.com"));
		return users;
	}

	private List<User> generateBadData() {
		List<User> users = new ArrayList<User>();
		users.add(new User("first_name", "last_name", "company_name", "address", "city", "province", "postal", "phone1",
				"phone2", "email", "web"));
		users.add(new User("Francoise", "Rautenstrauch", "Riebesell, H F Jr",
				"2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 2335 Canton Hwy #6 ",
				"Windsor", "ON", "N8N 3N2", "519-569-8399", "519-978-6179", "francoise.rautenstrauch@rautenstrauch.com",
				"http://www.riebesellhfjr.com"));
		users.add(new User("Kendra", "Loud", "Deloitte & Touche", "6 Arch St #9757", "Alcida", "NB", "E8J 2C4",
				"506-363-1526", "506-932-4472", "kloud@gmail.com", "http://www.deloittetouche.com"));
		return users;
	}

	private List<User> generateHeadRowData() {
		List<User> users = new ArrayList<User>();
		users.add(new User("first_name", "last_name", "company_name", "address", "city", "province", "postal", "phone1",
				"phone2", "email", "web"));
		return users;
	}

}
