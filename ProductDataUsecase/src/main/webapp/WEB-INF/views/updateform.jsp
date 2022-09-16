<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update form</title>
</head>
<body>
	<h1>Fill The updated Product Details Here</h1>
	<form:form action="update" modelAttribute="product" method="post">
		<label>Id: </label>
		<form:input path="id" placeholder="Product id" />
		<label>Name: </label>
		<form:input path="name" placeholder="Product Name" />
		<label>Price: </label>
		<form:input path="price" id="price" placeholder="Product price" />
		<label>Brand: </label>
		<form:input path="brand" placeholder="Product Brand or Manufacturer" />
		<label>Available Quantity: </label>
		<form:input path="availableQuantity"
			placeholder="Available Quantities in Numbers" />
		<input type="submit">
	</form:form>
</body>
</html>