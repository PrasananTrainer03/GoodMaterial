package com.java.spr.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="sindhu")
	public ModelAndView sindhu() {
		return new ModelAndView("result","message","Hi I am Sindhuja Manga");
	}

	
	@RequestMapping(value="roshini")
	public ModelAndView roshini() {
		return new ModelAndView("result","message","Hi I am Roshini Siripalli");
	}
	
	@RequestMapping(value="sainath")
	public ModelAndView sainath() {
		return new ModelAndView("result","message","Hi I am Sainath Vaddepally");
	}

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
}
