package com.example.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@RequestMapping(value="/showCustomer")
	public List<Customer> list() {
		return service.showCustomer();
	}
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/customer/{id}")
	public ResponseEntity<Customer> get(@PathVariable int id) {
		try {
		Customer customer = service.searchByCustomerId(id);
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
		} catch(NoSuchElementException e) {
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
	} 
	
	@PostMapping("/addCustomer")
	public void add(@RequestBody Customer customer) {
		service.addCustomer(customer);
	}
	
	@RequestMapping("/showCustomerInfo/{user}")
	public ResponseEntity<Customer> get(@PathVariable String user) {
		try {
		Customer customer = service.searchByCustomerName(user);
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
		} catch(NoSuchElementException e) {
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
	} 
}
