package com.org.bu.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfigService {

	@Autowired
	private ConfigRepository configRepository;
	
	public void deleteAll(){
		configRepository.deleteAll();
	}
	
	public void save(Config config){
		configRepository.save(config);
	}

	public Config findById(String id) {
		return configRepository.findOne(id);
	}
}
