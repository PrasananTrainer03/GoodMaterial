package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployController {

	@Autowired
	EmployService service;
	
	@GetMapping("/")
	public Employ[] showEmploy() {
		return service.showEmploy();
	}
	
	@GetMapping("/{id}")
	public Employ searchEmploy(@PathVariable int id) {
		return service.searchEmploy(id);
	}
}
