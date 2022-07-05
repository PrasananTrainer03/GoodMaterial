package com.java.mvc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.mvc.dao.CanteenDAO;
import com.java.mvc.model.Customer;
import com.java.mvc.model.Menu;
import com.java.mvc.model.Orders;
import com.java.mvc.model.Wallet;

@Controller
public class HomeController {

	@Autowired 
	CanteenDAO dao;
	
	@RequestMapping(value="/menushow")
	public ModelAndView menuShow() {
		List<Menu> menuList = dao.showMenu();
		return new ModelAndView("menushow","menuList",menuList);
	}
	
	@RequestMapping(value="/customerOrders")
	public ModelAndView showCustomerOrders(HttpServletRequest req) {
		String id = req.getParameter("cid");
		int cid = Integer.parseInt(id);
		List<Orders> customerOrders = dao.customerOrders(cid);
		return new ModelAndView("customerOrders","customerOrders",customerOrders);
	}
	
	@RequestMapping(value="/walletShow")
	public ModelAndView showCustomerWallet(HttpServletRequest req) {
		String id = req.getParameter("cid");
		int cid = Integer.parseInt(id);
		List<Wallet> wallestList = dao.showCusotmerWallet(cid);
		return new ModelAndView("customerWallet", "walletList", wallestList);
	}
	
	@RequestMapping(value="/home")
	public ModelAndView home(HttpServletRequest req, HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	@RequestMapping(value="/customerLogin")
	public ModelAndView doLogin(HttpServletRequest req) {
		String user = req.getParameter("userName");
		String pwd = req.getParameter("passWord");
		String res = dao.customerAuthentication(user, pwd);
		int r = Integer.parseInt(res);
		if (r==1) {
			Customer customer =dao.searchByCustomerUserName(user);
			int cid = customer.getCusId();
			String result = "";
			result+=cid;
			HttpSession session = req.getSession(true);
			session.setAttribute("result", result);
			return new ModelAndView("CustomerDashBoard","result",result);
		}
		return new ModelAndView("home","error","Invalid Credentials...");
	}
	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
}
