<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.md.entity.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Appreciation Page</title>
</head>
<body>
	<%
		Student student = (Student) request.getAttribute("student");
	%>
	<h1>
		Thank You <%=student.getName() %> for Selecting our Services. Hope you will Enjoy a lot here.
	</h1>

</body>
</html>