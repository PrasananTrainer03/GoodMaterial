<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="3" align="center">
		<tr>
			<th>Order Id</th>
			<th>Customer Id</th>
			<th>Vendor Id</th>
			<th>Menu Id</th>
			<th>Wallet Source</th>
			<th>Order Quantity</th>
			<th>Bill Amount</th>
			<th>Order Status</th>
			<th>Order Comments</th>
		</tr>
		<c:forEach var="o" items="${customerOrders}">
			<tr>
				<td>${o.getOrderId()} </td>
				<td>${o.getCustomerId()} </td>
				<td>${o.getVendoId()} </td>
				<td>${o.getMenuId()} </td>
				<td>${o.getWalSource()} </td>
				<td>${o.getOrderQuantity()} </td>
				<td>${o.getBillAmount()} </td>
				<td>${o.getOrderStatus()} </td>
				<td>${o.getOrderComments()} </td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>