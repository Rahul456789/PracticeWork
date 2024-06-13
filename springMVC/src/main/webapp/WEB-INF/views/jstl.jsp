<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Page</title>
</head>
<body>
   <h1>We Are Learning JSTL</h1>
   
   <p>We are Leaning ${course}.</p>
   
   <c:forEach var="item" items="${l}">
   <h2>${item}</h2>
   </c:forEach>
</body>
</html>