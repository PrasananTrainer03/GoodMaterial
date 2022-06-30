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
	<c:set var="x" value="12" />
	X value is : 
	<c:out value="${x}"/> <br/><br/>
	<c:set var="name" value="Hari Chandana"/>
	Name is : 
	<c:out value="${name}"/>
</body>
</html>