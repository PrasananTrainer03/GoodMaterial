package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	Customer searchBycusUsername(String cusUsername);
	// It generates query as select * from Customer where cus_UserName=?
}
