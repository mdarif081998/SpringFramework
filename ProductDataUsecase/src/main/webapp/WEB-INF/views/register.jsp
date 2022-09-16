<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<h1>Fill The Product Details Here</h1>
	<form action="register" method="post">
	<label>Id: </label>
	<input type="number" name="id" id="id" placeholder="Product id" />
	<label>Name: </label>
	<input type="text" name="name" id="name" placeholder="Product Name" />
	<label>Price: </label>
	<input type="number" name="price" id="price" placeholder="Product price" />
	<label>Brand: </label>
	<input type="text" name="brand" id="brand" placeholder="Product Brand or Manufacturer" />
	<label>Available Quantity: </label>
	<input type="number" name="availableQuantity" placeholder="Available Quantities in Numbers" />
	<input type="submit">
	</form>
</body>
</html>