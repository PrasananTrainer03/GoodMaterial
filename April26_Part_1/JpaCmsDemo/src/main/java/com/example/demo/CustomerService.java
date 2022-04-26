package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CustomerService {

	@Autowired
    private CustomerRepository repo;
	
	public List<Customer> showCustomer() {
		return repo.findAll();
	}
	
	public Customer searchByCustomerId(int custId) {
		return repo.findById(custId).get();
	}
	
	public void addCustomer(Customer customer) {
		repo.save(customer);
	}
	public Customer searchByCustomerName(String userName) {
		return repo.searchBycusUsername(userName);
	}
}
