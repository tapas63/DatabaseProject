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

	<h1>Eployee Details</h1>
	<table class="table" border="1" style="color:blue">

		<thead>
			<th>Employee ID</th>
			<th>Age</th>
			<th>DOB</th>
			<th>Position</th>
			<th>Department</th>
			<th>Salary</th>
			<th>Joindate</th>
			<th>Pincode</th>
		</thead>
		<tbody style="color:green">
				<c:forEach var="emp" items="${empList}">
				<tr>
					<td>${emp.empId}</td>
					<td>${emp.age}</td>
					<td>${emp.dob}</td>
					<td>${emp.position}</td>
					<td>${emp.department}</td>
					<td>${emp.salary}</td>
					<td>${emp.joinDate}</td>
					<td>${emp.pincode}</td>	
				</tr>
			</c:forEach>
		</tbody>
	</table>
<!--${empList}  -->
</body>
</html>