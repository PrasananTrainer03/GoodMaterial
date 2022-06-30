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
	<form method="get" action="Name.jsp">
		<center>
			First Name : 
			<input type="text" name="firstName" /> <br/><br/> 
			Last Name : 
			<input type="text" name="lastName" /> <br/><br/>
			<input type="submit" value="Show" />
		</center>
	</form>
	<c:if test="${param.firstName!=null && param.lastName!=null}">
	First Name:
		<c:out value="${param.firstName}"/> <br/><br/>
	Last Name : 
		<c:out value="${param.lastName}"/>
	</c:if>
</body>
</html>