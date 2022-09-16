<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import ="com.md.entity.Product, java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<table>
		<tr>
		<th>Product Id</th>
		<th>Product Name</th>
		<th>Product Price</th>
		<th>Product Brand</th>
		<th>Product Available Quantity</th>
		</tr>
		<% List<Product> products=(List<Product>) request.getAttribute("Products");
			for(Product product: products)	{%>
				<tr>
				<td><%=product.getId() %></td>
				<td><%=product.getName() %></td>
				<td><%=product.getPrice() %></td>
				<td><%=product.getBrand() %></td>
				<td><%=product.getAvailableQuantity() %></td>
				</tr>
				<% 
			}
		%>
	</table>
	<a href="/ProductDataUsecase">Home Page</a>
</body>
</html>