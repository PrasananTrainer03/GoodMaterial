package com.java.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployServlet
 */
public class EmployServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int empno = Integer.parseInt(request.getParameter("empno"));
		String name = request.getParameter("ename");
		String gender = request.getParameter("gender");
		String dept = request.getParameter("dept");
		String desig = request.getParameter("desig");
		int basic = Integer.parseInt(request.getParameter("basic"));
		out.println("Employ No   " +empno+ "<br/>");
		out.println("Employ Name  " +name+ "<br/>");
		out.println("Gender  " +gender+ "<br/>");
		out.println("Department  " +dept + "<br/>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
