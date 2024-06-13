<%@page import="java.time.LocalDateTime" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
     <h2>This is help page</h2>
     <h3>Rahul</h3>
     <%
     String name = (String)request.getAttribute("name");
     Integer roll = (Integer)request.getAttribute("roll");
     LocalDateTime d = (LocalDateTime)request.getAttribute("time");
     %>
     
     <%= name %>
     <%= roll %>
     <%= d.toString() %>
     
</body>
</html>