package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@Autowired
	OrderService service;
	
	@GetMapping(value="/customerOrders/{id}")
	public List<Orders> showCustomerOrders(@PathVariable int id) {
		return service.showCustomerOrders(id);
	}
	
	@GetMapping(value="/customerPendingOrders/{id}")
	public List<Orders> showCustomerPendingOrders(@PathVariable int id) {
		return service.showCustomerPendingOrders(id);
	}

	@GetMapping(value="/vendorPendingOrders/{id}")
	public List<Orders> showVendorPendingOrders(@PathVariable int id) {
		return service.showVendorPendingOrders(id);
	}

	
	@GetMapping(value="/vendorOrders/{id}")
	public List<Orders> showVendorOrders(@PathVariable int id) {
		return service.showVendorOrders(id);
	}
}
