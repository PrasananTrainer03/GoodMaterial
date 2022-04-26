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
public class VendorController {

	@Autowired
	private VendorService service;
	
	@RequestMapping(value="/showVendor")
	public List<Vendor> list() {
		return service.showVendors();
	}
	
	@RequestMapping("/vendor/{id}")
	public ResponseEntity<Vendor> get(@PathVariable int id) {
		try {
		Vendor vendor = service.searchByVendorId(id);
		return new ResponseEntity<Vendor>(vendor,HttpStatus.OK);
		} catch(NoSuchElementException e) {
			return new ResponseEntity<Vendor>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping("/searchByVendorUserName/{user}")
	public ResponseEntity<Vendor> searchByUserName(@PathVariable String user) {
		try {
		Vendor vendor = service.searchByVendorUserName(user);
		return new ResponseEntity<Vendor>(vendor,HttpStatus.OK);
		} catch(NoSuchElementException e) {
			return new ResponseEntity<Vendor>(HttpStatus.NOT_FOUND);
		}
	} 
}
