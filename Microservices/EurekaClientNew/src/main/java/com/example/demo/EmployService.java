package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class EmployService {

	@Autowired
    private EmployRepository repo;
	
	public List<Employ> show() {
		return repo.findAll();
	}
	
	
	public Employ showByEmpno(int empno) {
		// repo.getById(empno);
		return repo.findById(empno).get();
	}
}
