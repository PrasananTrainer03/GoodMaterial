package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class MenuService {

	@Autowired
	MenuRepository repo;
	
	public List<Menu> showMenu() {
		return repo.findAll();
	}
	
	public Menu searchById(int id) {
		return repo.findById(id).get();
	}
}
