package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class EmployController {

	@GetMapping(value="/empAll")
	public List<Employ> showAll() {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Aditi", 84234));
		employList.add(new Employ(2, "Sravanthi", 90423));
		employList.add(new Employ(3, "Deepika", 87524));
		employList.add(new Employ(4, "Srikanth", 90542));
		employList.add(new Employ(5, "Neeraj", 91914));
		return employList;
	}
}
