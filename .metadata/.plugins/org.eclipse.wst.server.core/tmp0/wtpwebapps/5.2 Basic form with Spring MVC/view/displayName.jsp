<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Name view</title>
</head>
<body>
Hello <%= request.getAttribute("firstName2") %>					<!-- This will allow us to write one liner java code in our JSP page -->
</body>
</html>