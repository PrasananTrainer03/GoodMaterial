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
	
	@Autowired
	private CustomerDAO dao;
	
	public Customer searchByUserName(String user) {
		return dao.searchByCustomerName(user);
	}
	public String authenticate(String user,String pwd) {
		return dao.authenticate(user, pwd);
	}
	
	public Customer search(int menuId) {
		return repo.findById(menuId).get();
	}
	public List<Customer> showEmploy() {
		return repo.findAll();
	}
}
