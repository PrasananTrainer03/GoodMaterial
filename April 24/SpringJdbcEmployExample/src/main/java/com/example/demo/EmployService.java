package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmployService {

	@Autowired 
	EmployDAO dao;
	
	public List<Employ> showEmploy() {
		return dao.showEmploy();
	}
	
	public Employ searchEmploy(int empno) {
		return dao.searchEmploy(empno);
	}
}
