<%@page import="com.java.mvc.model.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>
		Welcome to Customer DashBoard...
	</p>
	<p>
		
	</p>
	<%
		String cid = (String)session.getAttribute("result");
	%>
	
	<p>
		<a href="menushow">Show Menu</a>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="walletShow?cid=<%=cid %>">Customer Wallet Show</a>
		<a href="customerOrders?cid=<%=cid %>">Customer Orders Show</a>
	</p>
</body>
</html>