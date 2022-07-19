package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Orders, Integer>{

//	List<Orders> customerOrders(int cusId);
//	List<Orders> vendorOrders(int venId);;
}
