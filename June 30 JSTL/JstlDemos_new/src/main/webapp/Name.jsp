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
	<c:set var="firstName" value="${param.firstName}"/>
	<c:set var="lastName" value="${param.lastName}"/>
	First Name : <b> <c:out value="${firstName}"/> </b> <br/><br/>
	Last Name : <b> <c:out value="${lastName}"/> </b>
</body>
</html>