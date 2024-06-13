<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1>Called By Home Controller</h1>
<h2>This is home page</h2>

<%
   String name= (String)request.getAttribute("name");
%>

  <h3>My name is <%= name %></h3>
  
<%
     Integer id = (Integer)request.getAttribute("id");
%>
     
     <h4>My Phone Number is <%= id %></h4>
</body>
</html>