package com.org.bu.app.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.opencsv.bean.CsvToBeanBuilder;
import com.org.bu.app.dao.UserDao;
import com.org.bu.app.domain.User;

@Service
public class UserService extends BaseService {

	@Autowired
	private UserDao userDao;

	@Value("${userFile}")
	private String file;

	public void insert() {
		Reader reader = null;
		try {
			reader = new FileReader(file);
			List<User> users = new CsvToBeanBuilder<User>(reader)
										.withType(User.class).build().parse();

			userDao.insert(users);
			
		} catch (FileNotFoundException e) {
			log.error("DIF-FileNotFoundException-User");
			e.printStackTrace();
		} catch (Exception e) {
			log.error("DIF-Exception-User");
			e.printStackTrace();
		}
	}

}
