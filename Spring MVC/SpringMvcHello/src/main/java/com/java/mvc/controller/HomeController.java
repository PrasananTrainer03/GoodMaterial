package com.java.mvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/shubham")
	public ModelAndView shubham() {
		return new ModelAndView("result","message","Hi I am Shubham...Thank You");
	}
	@RequestMapping(value="/aditi")
	public ModelAndView aditi() {
		return new ModelAndView("result","message","Hi I am Aditi...Thank You");
	}
	
	@RequestMapping(value="/girish")
	public ModelAndView girish() {
		return new ModelAndView("result","message","Hi I am Girish...Thank You");
	}
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
}
