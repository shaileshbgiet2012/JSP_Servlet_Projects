<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ include file="menu.jsp" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<h2>Create new registration</h2>
	<form action="saveReg" method="post">
	<pre>
		 Name   <input type="text" name="Name"/>
		 City   <input type="text" name="City"/>
		 Email  <input type="text" name="Email"/>
		 Mobile <input type="text" name="Mobile"/>
		 
		 <input type="submit" value="save"/>
	</pre>
	</form>
	<br/>
	<%if(request.getAttribute("msg")!=null){
    	out.println(request.getAttribute("msg"));
    } 
    %> 
	
</body>
</html>