package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDetailsController {

	@Autowired
	private UserDetailsDAO dao;
	
//	@CrossOrigin(origins = "http://localhost:4200")
//	@RequestMapping(value="/showUserBookings/{id}")
//	public List<Booking> showBookings(@PathVariable int id) {
//		return dao.userBooking(id);
//	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="/searchByBookId/{id}")
	public Booking searchByBookingId(@PathVariable int id) {
		return dao.searchBooking(id);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="/showUserDetails")
	public List<UserDetails> list() {
		return dao.showUserDetails();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/userAuthenticate/{user}/{pwd}")
	public String autneticateion(@PathVariable String user, @PathVariable String pwd) {
		return dao.authenticate(user, pwd);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="/searchUserDetails/{id}")
	public UserDetails searchById(@PathVariable int id) {
		return dao.searchByUserId(id);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="/showUserBookings/{id}")
	public List<Booking> userBookings(@PathVariable int id) {
		return dao.userBooking(id);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(value="/bookRide")
	public String bookRide(@RequestBody Booking booking) {
		return dao.bookRide(booking);
	}
	
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="/searchByUserName/{userName}")
	public UserDetails searchById(@PathVariable String userName) {
		return dao.searchByUserName(userName);
	}
}
