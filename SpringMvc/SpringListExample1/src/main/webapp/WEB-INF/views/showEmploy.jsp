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
		<th>Employ No</th>
		<th>Employ Name</th>
		<th>Department</th>
		<th>Designation</th>
		<th>Basic</th>
	</tr>

	<c:forEach var="e" items="${employs}">
	<tr>
		<td>
			${e.empno}
		</td>
				<td>
			${e.name}
		</td>
				<td>
			${e.dept}
		</td>
				<td>
			${e.desig}
		</td>
			<td>
			${e.basic}
		</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>