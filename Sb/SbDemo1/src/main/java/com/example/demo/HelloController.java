package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("greeting/{name}")
	public String greetMe(@PathVariable String name) {
		return "Good Morning..."+name;
	}
	
	@GetMapping("/sum/{a}/{b}")
	public String sum(@PathVariable int a, @PathVariable int b) {
		int c=a+b;
		String res="";
		res+=c;
		return res;
	}
	@GetMapping(value="/")
	public String show() {
		return "Welcome to Spring Boot...";
	}
	
	@GetMapping(value="/manideep")
	public String manideep() {
		return "Hi I am Manideep...";
	}
	
	@GetMapping(value="/sindhu")
	public String sindhu() {
		return "Hi I am Sindhu...";
	}
	
	@GetMapping(value="/manoj")
	public String manoj() {
		return "Hi I am Manoj...";
	}
}
