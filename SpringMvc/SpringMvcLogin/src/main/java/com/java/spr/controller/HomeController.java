package com.java.spr.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/login")
	public ModelAndView doLogin(HttpServletRequest req) {
		String userName = req.getParameter("userName");
		String pwd = req.getParameter("passCode");
		if (userName.equals("Srinivas") && pwd.equals("Srinivas")) {
			return new ModelAndView("menu");
		} else {
			return new ModelAndView("home","error","Invalid Credentials...");
		}
	}
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
}
