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
	<form method="get" action="EmploySearch.jsp">
		<center>
			Employ No : 
			<input type="number" name="empno" /> <br/><br/> 
			<input type="submit" value="Search" />
		</center>
	</form>
	<c:if test="${param.empno!=null}">
	<c:set var="eno" value="${param.empno}"/>
		<sql:setDataSource var="conn" 
		driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/infinitepractice"
		user="root"
		password="root"
		/>
	<sql:query var="employQuery" dataSource="${conn}">
		select * from Employ where empno=?
		<sql:param value="${eno}"/>
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
	<c:set var="flag" value="1"/>
	<c:forEach var="employ" items="${employQuery.rows}">
		<c:set var="flag" value="0"/>
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
	<c:if test="${flag==1}">
		<c:out value="Not Found..."/>
	</c:if>
	</c:if>
</body>
</html>