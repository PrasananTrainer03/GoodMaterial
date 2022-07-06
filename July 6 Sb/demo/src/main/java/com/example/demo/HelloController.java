package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String sayHello() {
		return "Welcome to SpringBoot Application...";
	}
	
	@GetMapping(value="/girish")
	public String girish() {
		return "Hi I am Girish...";
	}
	
	@GetMapping(value="/sourabh") 
	public String sourabh() {
		return "Hi I am Sourabh Benergy from Kolkata...";
	}
}
