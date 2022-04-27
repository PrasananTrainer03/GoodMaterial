package com.example.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EmployController {

	 @Autowired
	 private EmployService service;
	
	 @RequestMapping("/")
	 public List<Employ> show() {
			return service.show();
		}
	 
		@RequestMapping("/{id}")
		public Employ get(@PathVariable Integer id) {
			return service.showByEmpno(id);
		}
		
	 
//	 @RequestMapping("/byName/{name}")
//	 public Employ showByName(@PathVariable String name) {
//		 return service.showByName(name);
//	 }
}
