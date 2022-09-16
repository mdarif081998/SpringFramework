<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter ID</title>
</head>
<body>

	<form action="delete" method="post">
		<label>Id: </label> <input type="number" name="id" id="id"
			placeholder="Product id" /> <input type="submit">
	</form>
	<br>
	<a href="/ProductDataUsecase">Home Page</a>
</body>
</html>