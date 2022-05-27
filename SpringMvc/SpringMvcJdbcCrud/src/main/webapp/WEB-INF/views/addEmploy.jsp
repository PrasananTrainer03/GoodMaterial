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
				<option value="MALE">Male</option>
				<option vale="FEMALE">Female</option>
			</select> <br/><br/>
			Department : 
			<input type="text" name="dept" /> <br/><br/>
			Designation : 
			<input type="text" name="desig" /> <Br/><br/> 
			Basic : 
			<input type="number" name="basic" /> <br/><br/> 
			<input type="submit" value="Add Employ" />
		</center>
	</form>
</body>
</html>