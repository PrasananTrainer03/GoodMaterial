<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="conn" 
	driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/infinitepractice"
	user="root"
	password="root"
/>
<sql:query var="employQuery" dataSource="${conn}">
	select * from Employ
</sql:query>
<c:forEach var="e" items="${employQuery.rows}">
	Employ No : 
	<c:out value="${e.empno}"/> <br/>
	Employ Name : 
	<c:out value="${e.name}"/> <br/>
	Gender : 
	<c:out value="${e.gender}"/> <br/>
	Department : 
	<c:out value="${e.dept}"/> <br/>
	Designation : 
	<c:out value="${e.desig}"/> <br/>
	Basic :
	<c:out value="${e.basic}"/> <br/> <hr/>
	
</c:forEach>
</body>
</html>