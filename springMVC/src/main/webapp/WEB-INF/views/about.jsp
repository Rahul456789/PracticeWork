<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About Us</title>
</head>
<body>
     <h3>Hi guys Rahul Here.</h3>
     
     <%
     ArrayList<String> s = (ArrayList<String>)request.getAttribute("f");
     %>
     
     <%for(String i: s){ %>
     <%= i %> <br>
     <%} %>
     
</body>
</html>