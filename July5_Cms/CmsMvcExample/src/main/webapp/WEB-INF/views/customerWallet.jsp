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
			<td>Wallet Id</td>
			<td> Customer Id</td>
			<td> Wallet Type</td>
			<td> Wallet Amount</td>
		</tr>
	<c:forEach var="w" items="${walletList}">
		<tr>
			<td>${w.getWalletId()} </td>
			<td>${w.getCustId()} </td>
			<td>${w.getWalAmount()} </td>
			<td>${w.getWalSource()} </td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>