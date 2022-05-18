<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
		<table border="3" align="center">
			<tr>
				<th>Employ No</th>
				<th>Employ Name</th>
				<th>Gender</th>
				<th>Department</th>
				<th>Designation</th>
				<th>Basic</th>
			</tr>
		<c:forEach var="e" items="${employList}">
			<tr>
				<td>${e.empno}</td>
				<td>${e.name}</td>
				<td>${e.gender}</td>
				<td>${e.dept}</td>
				<td>${e.desig}</td>
				<td>${e.basic}</td>
				<td>
        				<a href="editemploy?empno=${e.empno}">Edit</a>
        			</td>
			</tr>
		</c:forEach>
		</table>
		        <h3><a href="newemploy">New Employ</a></h3>
		
    </body>
</html>
