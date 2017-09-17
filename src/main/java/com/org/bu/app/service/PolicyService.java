package com.org.bu.app.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.opencsv.bean.CsvToBeanBuilder;
import com.org.bu.app.dao.PolicyDao;
import com.org.bu.app.domain.Policy;

@Service
public class PolicyService extends BaseService {

	@Autowired
	private PolicyDao policyDao;
	
	@Value("${policyFile}")
	private String file;
	
	public void insert(){
		Reader reader;
		try {
			reader = new FileReader(file);
			List<Policy> policies = new CsvToBeanBuilder<Policy>(reader)
												.withType(Policy.class).build().parse();

			policyDao.insert(policies );
		
		} catch (FileNotFoundException e) {
			log.error("DIF-FileNotFoundException-Policy");
			e.printStackTrace();
		} catch (Exception e) {
			log.error("DIF-Exception-Policy");
			e.printStackTrace();
		}
		
	}
}
