<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h2>Login Here...</h2>
    <form action="loginController" method="post">
    Username  <input type="Email" name="Email"/>
    Password  <input type="Password" name="Password"/>
    <input type="submit" name="login"/>
    </form>
    <br/>
    
    <%if(request.getAttribute("error")!=null){
    	out.println(request.getAttribute("error"));
    } 
    %>

</body>
</html>