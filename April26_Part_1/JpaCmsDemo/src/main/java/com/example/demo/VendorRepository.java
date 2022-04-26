package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {
	Vendor searchByvenUsername(String venUsername);
	
	// select * from Vendor where ven_user_Name=?
}
