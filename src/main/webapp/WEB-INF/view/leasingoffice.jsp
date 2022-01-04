<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
<%@ include file="menu.jsp" %>
	<!-- load the data here -->
	<!--  -->
	<div class="container">
	<h1>Leasing Office :</h1>
	<div align="right">
	<a href="/leasingoffice">Refresh List</a>
	</div>
	<form:form action="search" method="GET" modelAttribute="searchDTO">
	<lable>Enter Office ID: </lable>
	 <form:input path="officeId" />  
	 <input type="submit"/>
	</form:form>
	
	<table class="table table-striped">
		<thead class="thead-dark">
		<tr>
			<th>Office ID</th>
			<th>Employee Count</th>
			<th>Regd. ID</th>
			<th>Pindcode</th>
			<th>van details</th>
			<th>Suv details</th>
			<th>Sedan details</th>
			<th>Pickup Truck details</th>
			</tr>
		</thead>
		<tbody>

			<c:forEach var="temp" items="${leasingofficeList}">
				<tr>

					<td>${temp.offid}</td>
					<td>${temp.empcount}</td>
					<td>${temp.rid}</td>
					<td>${temp.pincode}</td>
					<td>
						<table class="table table-striped">
							<thead>
							<tr class="table-primary">
								<th>Van ID</th>
								<th>Model</th>
								<th>Pincode</th>
								<th>Customer Id</th>
								</tr>
							</thead>
							<c:forEach var="van" items="${temp.vans}">
								<tr>
									<td>${van.vanId}</td>
									<td>${van.model}</td>
									<td>${van.pincode}</td>
									<td>${van.customerId}</td>

								</tr>
							</c:forEach>
						</table>
					</td>
					<!-- my suv details start -->
					<td>
						<table class="table table-striped">
							<thead>
							<tr class="table-danger">
								<th>SUV ID</th>
								<th>SUV Model</th>
								<th>Pincode</th>
								<th>Customer Id</th>
								</tr>
							</thead>
							<c:forEach var="suv" items="${temp.suv}">
								<tr>

									<td>${suv.suvId}</td>
									<td>${suv.model}</td>
									<td>${suv.pincode}</td>
									<td>${suv.customerId}</td>

								</tr>
							</c:forEach>
						</table>
					</td>

					<!-- my suv details end -->
					
					<!-- my sedan details start -->
					<td>
						<table class="table table-striped">
							<thead>
							<tr class="table-warning">
								<th>Sedan ID</th>
								<th>Sedan Model</th>
								<th>Pincode</th>
								<th>Customer Id</th>
								</tr>
							</thead>
							<c:forEach var="sedan" items="${temp.sedanes}">
								<tr>
									<td>${sedan.sedanId}</td>
									<td>${sedan.model}</td>
									<td>${sedan.pincode}</td>
									<td>${sedan.customerId}</td>
								</tr>
							</c:forEach>
						</table>
					</td>

					<!-- my sedan details end -->
					
					<!-- my pickup truck details start -->
					<td>
						<table class="table table-striped">
							<thead>
							<tr class="table-info">
								<th>PickupTruck ID</th>
								<th>PickupTruck Model</th>
								<th>Pincode</th>
								<th>Customer Id</th>
								</tr>
							</thead>
							<c:forEach var="pickuptruck" items="${temp.pickupTrucks}">
								<tr>
									<td>${pickuptruck.truckid}</td>
									<td>${pickuptruck.model}</td>
									<td>${pickuptruck.pincode}</td>
									<td>${pickuptruck.customerId}</td>
								</tr>
							</c:forEach>
						</table>
					</td>

					<!-- my sedan details end -->
					
				</tr>

			</c:forEach>

		</tbody>
	</table>
</div>
</body>
</html>