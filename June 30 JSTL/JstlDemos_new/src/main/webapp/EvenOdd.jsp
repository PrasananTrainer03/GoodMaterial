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
	<form method="get" action="EvenOdd.jsp">
		<center>
			Enter a Number : 
			<input type="number" name="sno" /> <br/><br/> 
			<input type="submit" value="Show" /> 
		</center>
	</form>
	<c:if test="${param.sno!=null}">
		<c:set var="sno" value="${param.sno}"/>
		<c:if test="${sno%2==0}">
			<c:out value="Even Number..."/>
		</c:if>
		<c:if test="${sno%2==1}">
			<c:out value="Odd Number..."/>
		</c:if>
	</c:if>
</body>
</html>