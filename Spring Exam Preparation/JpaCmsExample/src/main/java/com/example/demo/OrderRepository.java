package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface OrderRepository extends JpaRepository<Orders, Integer>{

	List<Orders> findCustomersByCusId(int cusId);
	// select * from Customer where cus_id=?
	List<Orders> findVendorsByVenId(int venId);
	// select * from Vendors where ven_id=?
	
	@Query("from Orders where ORD_STATUS='PENDING' AND cus_id=:cusid")
	List<Orders> findCustomerPendingOrders(@Param("cusid") int cusid);
	
	@Query("from Orders where ORD_STATUS='PENDING' AND ven_id=:venid")
	List<Orders> findVendorPendingOrders(@Param("venid") int venid);
}
