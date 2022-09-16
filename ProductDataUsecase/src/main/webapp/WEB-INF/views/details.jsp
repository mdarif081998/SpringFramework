<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="com.md.entity.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details</title>
</head>
<body>

	<h1>Product Details</h1>
	<p>
		<%
			Product product = (Product) request.getAttribute("Product");
		%>
	</p>
	<p>ID :<%=product.getId()%></p>
	<p>Name: <%=product.getName()%></p>
	<p>Price: <%=product.getPrice()%></p>
	<p>Brand: <%=product.getBrand()%></p>
	<p>Available Quantity: <%=product.getAvailableQuantity()%></p>
	
	
	<a href="/ProductDataUsecase">Home Page</a>
</body>
</html>