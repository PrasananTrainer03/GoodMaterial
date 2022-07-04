package com.java.mvc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.mvc.dao.EmployDaoImpl;
import com.java.mvc.model.Employ;
import com.java.mvc.model.Gender;

@Controller
public class HomeController {

	@Autowired 
	EmployDaoImpl dao;
	
	@RequestMapping(value="/updateEmpFinal")
	public ModelAndView updateEmployFinal(HttpServletRequest req) {
		Employ employ = new Employ();
		employ.setEmpno(Integer.parseInt(req.getParameter("empno")));
		employ.setName(req.getParameter("name"));
		String gen = req.getParameter("gender");
		if (gen.equals("MALE")) {
			employ.setGender(Gender.MALE);
		}
		if (gen.toUpperCase().equals("FEMALE")) {
			employ.setGender(Gender.FEMALE);
		}
		employ.setDept(req.getParameter("dept"));
		employ.setDesig(req.getParameter("desig"));
		employ.setBasic(Integer.parseInt(req.getParameter("basic")));
		dao.updateEmploy(employ);
		//return new ModelAndView("home");
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value="/updateemploy")
	public ModelAndView updateEmploy(HttpServletRequest req) {
		int empno = Integer.parseInt(req.getParameter("empno"));
		Employ employ = dao.searchEmploy(empno);
		return new ModelAndView("employsearchform","employ",employ);
	}
	
	@RequestMapping(value="/deleteemploy")
	public ModelAndView deleteEmploy(HttpServletRequest req) {
		int empno = Integer.parseInt(req.getParameter("empno"));
		dao.deleteEmploy(empno);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value="/saveEmploy")
	public ModelAndView saveEmploy(HttpServletRequest req) {
		Employ employ = new Employ();
		employ.setName(req.getParameter("name"));
		employ.setGender(Gender.valueOf(req.getParameter("gender")));
		employ.setDept(req.getParameter("dept"));
		employ.setDesig(req.getParameter("desig"));
		employ.setBasic(Double.parseDouble(req.getParameter("basic")));
		dao.addEmploy(employ);
		//return new ModelAndView("home");
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value="/newemploy")
	public ModelAndView addEmploy() {
		return new ModelAndView("addEmploy");
	}
	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		List<Employ> employList = dao.showEmploy();
		return new ModelAndView("home","employList",employList);
	}
}
