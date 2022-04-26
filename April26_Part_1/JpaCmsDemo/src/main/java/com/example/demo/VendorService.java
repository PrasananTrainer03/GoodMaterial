package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class VendorService {

	@Autowired
    private VendorRepository repo;
	
	public List<Vendor> showVendors() {
		return repo.findAll();
	}
	
	public Vendor searchByVendorId(int venId) {
		return repo.findById(venId).get();
	}
	
	public Vendor searchByVendorUserName(String user) {
		return repo.searchByvenUsername(user);
	}
}
