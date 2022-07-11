package com.example.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired 
	CustomerService service;
	
	@RequestMapping("/custAuthenticate/{user}/{pwd}")
	public String autneticateion(@PathVariable String user, @PathVariable String pwd) {
		return service.customerAuthenticate(user, pwd);
	}
	
	@RequestMapping(value="/showCustomer")
	public List<Customer> showCustomer() {
		return service.showCustomer();
	}
	
	@RequestMapping("/searchCustomer/{id}")
	public ResponseEntity<Customer> get(@PathVariable int id) {
		try {
		Customer customer = service.searchByCustomerId(id);
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
		} catch(NoSuchElementException e) {
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
	} 
}
