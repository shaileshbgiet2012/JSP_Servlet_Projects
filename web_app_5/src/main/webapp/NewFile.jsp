<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="x" value="100"></c:set>
	<c:out value="${x}"></c:out>
	
	<c:if test="${x>100}">
	<p>Hello, <c:out value="Welcome"/></p>
	</c:if>
	<c:if test="${x<100}">
	<p>Hello, <c:out value="Hello"/></p>
	</c:if>

	<c:if test="${x==100}">
	<p>Hello, <c:out value="Most Welcome"/></p>
	</c:if>	
</body>
</html>