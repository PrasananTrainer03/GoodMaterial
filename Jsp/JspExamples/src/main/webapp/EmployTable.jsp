<%@page import="com.java.jsp.Employ"%>
<%@page import="com.java.jsp.EmployDAO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	List<Employ> employList = new EmployDAO().showEmploy();
%>
	<table border="3" align="center">
		<tr>
			<th>Employ No</th>
			<th>Employ Name</th>
			<th>Department</th>
			<th>Designation</th>
			<th>Basic</th>
		</tr>
		<tr>
			<%
				for(Employ e : employList) {
			%>
				<td><%=e.getEmpno() %> </td>
				<td><%=e.getName() %> </td>
				<td><%=e.getDept() %> </td>
				<td><%=e.getDesig() %> </td>
				<td><%=e.getBasic() %> </td>
				</tr>
			<%
				}
			%>
		
	</table>
</body>
</html>