<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Parameter Reading</title>
</head>
<body>
 ID:	<%=	request.getParameter("id")	%> <br>
 Name: 	<%=	request.getParameter("name")	%> <br>
 Age(Optional, default 23): 	<%=	request.getAttribute("Age")	%> <br>
</body>
</html>