
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="com.md.entity.Student, java.util.List"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello World</title>
</head>
<body>
	<h1>Hello World!</h1>

	<%
		Integer id = (Integer) request.getAttribute("id");
		String name = (String) request.getAttribute("name");
		Integer age = (Integer) request.getAttribute("age");

		out.println("Id : " + id);
		out.println(", name : " + name);
		out.println(", age : " + age);
	%>
	<br>


	<p>Using JSP Expression Language</p>
	<br> Id:
	<b>${id }</b> Name:
	<b>${name }</b> Age:
	<b>${age }</b>
	<br>


	<p>Using Object</p>
	<%=request.getAttribute("student")%>


	<p>List of Students</p>
	<%
		List<Student> students = (List<Student>) request.getAttribute("students");
		for (Student s : students) {
			out.println(s);
	%>
	<br>
	<%
		}
	%>
	
	<br>
	
	<p>
		<a href="/SpringMVC">Home Page</a>
	</p>
</body>
</html>