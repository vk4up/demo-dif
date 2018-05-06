package com.org.bu.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.org.bu.app.service.LoadService;

@RestController
public class LoadController {

	@Autowired
	private LoadService loadService;

	@GetMapping("/load/{file}")
	public String insert(@PathVariable String file) {
		loadService.insert(file);
		return "Submitted request to load " + file;
	}
}
