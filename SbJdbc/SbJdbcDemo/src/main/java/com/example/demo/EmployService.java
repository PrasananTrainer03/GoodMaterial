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
	
	public Employ[] showEmploy() {
		List<Employ> employList = dao.showEmploy();
		return employList.toArray(new Employ[employList.size()]);
	}
	
	public Employ searchEmploy(int empno) {
		return dao.searchEmploy(empno);
	}
}
