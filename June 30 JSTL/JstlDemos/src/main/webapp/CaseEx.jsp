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
	<form method="get" action="CaseEx.jsp">
		<center>
			Enter a Number : 
			<input type="number" name="no" />
			<br/><br/>
			<input type="submit" value="Show" />
		</center>
	</form>
	<c:if test="${param.no!=null}">
		<c:set var="no" value="${param.no}"/>
		<c:choose>
			<c:when test="${no==1}">
				<c:out value="Anushka Priya"/>
			</c:when>
			<c:when test="${no==2}">
				<c:out value="Obuli Sundar"></c:out>
			</c:when>
			<c:when test="${no==3}">
				<c:out value="Hari Chandana"/>
			</c:when>
			<c:otherwise>
				<c:out value="Invalid Value..."/>
			</c:otherwise>
		</c:choose>
	</c:if>
</body>
</html>