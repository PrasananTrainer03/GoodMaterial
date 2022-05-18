package com.java.mvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="manideep")
	public ModelAndView manideep() {
		return new ModelAndView("manideep");
	}
	
	@RequestMapping(value="srinivas")
	public ModelAndView srininvas() {
		return new ModelAndView("srinivas");
	}
	
	@RequestMapping(value="manoj")
	public ModelAndView manoj() {
		return new ModelAndView("manoj");
	}
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
}
