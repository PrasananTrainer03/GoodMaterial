<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="saveEmploy">
		<center>
			Employ Name : 
			<input type="text" name="name" /> <br/><br/>
			Gender :
			<select name="gender">
				<option value="MALE">MALE</option>
				<option value="FEMALE">FEMALE</option>
			</select> <br/><br/>
			Department : 
			<select name="dept">
				<option value="Dotnet">Dotnet</option>
				<option value="Java">Java</option>
				<option value="Angular">Angular</option>
				<option value="React">React</option>
			</select> <br/><br/>
			Designation : 
			<select name="desig">
				<option value="SWE">SWE</option>
				<option value="TL">TL</option>
				<option value="Manager">Manager</option>
			</select> <br/><br/>
			Basic : 
			<input type="number" name="basic" /> <br/><br/>
			<input type="submit" value="Add Employ" />
		</center>
	</form>
</body>
</html>