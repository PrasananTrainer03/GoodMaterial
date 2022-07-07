package com.java.hib.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.hib.model.Employ;
import com.java.hib.model.EmployDAO;

@Controller
public class HomeController {

	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		EmployDAO dao = new EmployDAO();
		List<Employ> employList = dao.showEmploy();
		return new ModelAndView("home","employList",employList);
	}
}
