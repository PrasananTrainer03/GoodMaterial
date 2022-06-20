package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriverDetailsController {

	@Autowired
	private DriverDetailsDAO dao;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="/showDriverDetails")
	public List<DriverDetails> list() {
		return dao.showUserDetails();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/driverAuthenticate/{user}/{pwd}")
	public String autneticateion(@PathVariable String user, @PathVariable String pwd) {
		return dao.authenticate(user, pwd);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="/searchDriverUserDetails/{id}")
	public DriverDetails searchById(@PathVariable int id) {
		return dao.searchByUserId(id);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="/searchByDriverUserName/{userName}")
	public DriverDetails searchById(@PathVariable String userName) {
		return dao.searchByUserName(userName);
	}
}
