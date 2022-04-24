package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployController {

	@RequestMapping("/empall") 
	public Employ[] showEmploy() {
		Employ[] arrEmp = new Employ[] {
			new Employ(1, "Anmol", 88234),
			new Employ(3, "Jegan",882355),
			new Employ(4, "Tanmai",88123)
		};
		return arrEmp;
	}
	
	@RequestMapping("/empsearch/{eno}")
	public Employ searchEmploy(@PathVariable int eno) {
		Employ e1 = new Employ(1, "Anushka", 99434);
		Employ e2 = new Employ(2, "Naman",99423);
		if (eno==1) {
			return e1;
		}
		if (eno==2) {
			return e2;
		}
		return null;
	}
}
