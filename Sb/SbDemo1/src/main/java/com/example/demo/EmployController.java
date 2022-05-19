package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployController {

	@RequestMapping("/empall")
	public Employ[] showAll() {
		Employ[] arr = new Employ[] {
			new Employ(1, "Manoj", 88323),
			new Employ(2, "Anuvardhan", 88532),
			new Employ(3, "Usha", 78556),
			new Employ(4, "Karthik", 98033),
			
		};
		return arr;
	}

	@RequestMapping("/empSearch/{empno}")
	public Employ searchEmploy(@PathVariable int empno) {
		Employ e1 = new Employ(1, "Karthik", 98943);
		Employ e2 = new Employ(3, "Surya Jyothi", 98032);
		if (empno==1) {
			return e1;
		}
		if (empno==3) {
			return e2;
		}
		return null;
	}
}
