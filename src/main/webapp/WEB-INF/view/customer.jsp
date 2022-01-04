<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="menu.jsp" %>
<!-- load the data here -->
<!--  -->
<h1>Customer Details</h1>
	<table class="table" border="1" style="color:blue">

		<thead>
			<th>Customer ID</th>
			<th>Name</th>
			<th>Pincode</th>
			<th>Gender</th>
			<th>Vehichle Type</th>
			<th>Username</th>
			<th>Password</th>
		</thead>
		<tbody style="color:green">
				<c:forEach var="customer" items="${customerList}">
				<tr>
					<td>${customer.customerId}</td>
					<td>${customer.name}</td>
					<td>${customer.pincode}</td>
					<td>${customer.gender}</td>
					<td>${customer.vehichletype}</td>
					<td>${customer.username}</td>
					<td>${customer.pwd}</td>	
				</tr>
			</c:forEach>
		</tbody>
	</table>

<!--${customerList}  --> 
</body>
</html>