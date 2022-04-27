package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class NameConfigurationController {

	@GetMapping("/names")
	public NameConfiguration retrieveNames() {
		return new NameConfiguration("Prasanna", "Pappu");
	}
}
