package com.example.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MenuController {

	@Autowired
	private MenuService service;
	
	@RequestMapping(value="/showMenu")
	public List<Menu> list() {
		return service.showEmploy();
	}
	
	@RequestMapping("/menu/{id}")
	public ResponseEntity<Menu> get(@PathVariable int id) {
		try {
		Menu employ = service.search(id);
		return new ResponseEntity<Menu>(employ,HttpStatus.OK);
		} catch(NoSuchElementException e) {
			return new ResponseEntity<Menu>(HttpStatus.NOT_FOUND);
		}
	}
}
