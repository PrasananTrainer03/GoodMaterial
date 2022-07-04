<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="updateEmpFinal">
		Employ Number : 
		<input type="number" name="empno" value="${employ.empno}" /> <br/><br/> 
		Employ Name : 
		<input type="text" name="name" value="${employ.name}" /> <br/><br/>
		Gender : 
		<input type="text" name="gender" value="${employ.gender}" /> <br/><br/> 
		Department : 
		<input type="text" name="dept" value="${employ.dept}" /> <br/><br/>
		Designation : 
		<input type="text" name="desig" value="${employ.desig}" /> <br/><br/>
		Basic : 
		<input type="number" name="basic" value="${employ.basic}" /> <Br/><br/>
		<input type="submit" value="Update Employ" />
	</form>
</body>
</html>