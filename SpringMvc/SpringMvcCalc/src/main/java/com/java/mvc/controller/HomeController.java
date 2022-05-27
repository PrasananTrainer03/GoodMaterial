package com.java.mvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/calculation")
	public ModelAndView calc(HttpServletRequest req) {
		int firstNo = Integer.parseInt(req.getParameter("firstNo"));
		int secondNo = Integer.parseInt(req.getParameter("secondNo"));
		int sum = firstNo + secondNo;
		String result="";
		result+=sum;
		return new ModelAndView("result", "result", result);
	}
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
}
