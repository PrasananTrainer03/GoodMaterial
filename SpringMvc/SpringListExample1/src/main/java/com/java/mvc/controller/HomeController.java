package com.java.mvc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="showEmploys")
	public ModelAndView showEmploys() {
		List<Employ> employs = new ArrayList<Employ>();
		employs.add(new Employ(1, "Manoj", "Java", "Programmer", 94234));
		employs.add(new Employ(2, "Anuvardhan", "Angular", "Programmer", 94234));
		employs.add(new Employ(3, "Manideep", "Sql", "Programmer", 94234));
		employs.add(new Employ(4, "Sanup", "Dba", "Programmer", 94234));
		employs.add(new Employ(5, "Karthik", "Sql", "Programmer", 94234));
		return new ModelAndView("showEmploy","employs",employs);
	}
	@RequestMapping(value="showNames")
	public ModelAndView show() {
		List<String> names = new ArrayList<String>();
		names.add("Sainath");
		names.add("Roshini");
		names.add("Sindhuja");
		names.add("Srinvas");
		names.add("Manoj");
		return new ModelAndView("show","names",names);
	}
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
}
