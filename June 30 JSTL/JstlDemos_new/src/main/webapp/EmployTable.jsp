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
	<table border="3">
		<tr>
			<th>Employ NO</th>
			<th>Employ Name</th>
			<th>Gender</th>
			<th>Department</th>
			<th>Designation</th>
			<th>Basic</th>
		</tr>
	
	<c:forEach var="employ" items="${employQuery.rows}">
	<tr>
		<td><c:out value="${employ.empno}"/> </td>
		<td><c:out value="${employ.name}"/> </td>
		<td><c:out value="${employ.gender}"/> </td>
		<td><c:out value="${employ.dept}"/> </td>
		<td><c:out value="${employ.desig}"/> </td>
		<td><c:out value="${employ.basic}"/> </td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>