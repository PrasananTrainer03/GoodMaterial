<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
    	<form action="login">
    	<center>
    		UserName : 
    		<input type="text" name="userName" /> 
    		<br/><br/>
    		Password : 
    		<input type="password" name="passCode" />
    		<br/><br/>
    		<input type="submit" value="Login" />
    	</center>
    	</form>
    	<br/><hr/>
    	${error}
    </body>
    
</html>
