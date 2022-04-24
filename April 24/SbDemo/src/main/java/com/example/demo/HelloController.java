package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/sum/{a}/{b}")
	public String sum(@PathVariable int a, @PathVariable int b) {
		int c=a+b;
		String res="";
		res+=c;
		return res;
	}
	
	@RequestMapping("/")
	public String sayHello() {
		return "Welcome to SpringBoot Helloword...";
	}
	
	@RequestMapping("/anmol")
	public String anmol() {
		return "Hi I am Anmol Dalela...";
	}
	
	@RequestMapping("/manasvi")
	public String manasvi() {
		return "Welcome, I am Manasvi Srivasthav...";
	}
}
