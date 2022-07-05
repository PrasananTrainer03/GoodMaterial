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
			<th>Menu Id</th>
			<th>Menu Name</th>
			<th>Price</th>
			<th>Calories</th>
			<th>Speciality</th>
		</tr>
	<c:forEach var="m" items="${menuList}">
		<tr>
			<td>${m.getMenuId()} </td>
			<td>${m.getMenuItem()} </td>
			<td>${m.getMenuPrice()} </td>
			<td>${m.getMenuCalories()} </td>
			<td>${m.getMenuSpeciality()} </td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>