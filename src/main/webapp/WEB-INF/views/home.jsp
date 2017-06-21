<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" ng-app="epUserApp">
<head>
<meta charset="UTF-8">
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script type="text/javascript"
	src="<c:url value="/resources/js/app.js"/>"></script>
<%-- <script type="text/javascript" src="<c:url value="/resources/js/angular.min.js"/>"></script> --%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Home Page</title>
</head>
<body class="fluid-container ">
	<div class="fluid-container col-md-10">
		<div ng-controller="MainController" class="fluid-container">

			<table class="table table-striped">
				<thead>
					<tr >
						<th>id</th>
						<th>LiferayId</th>
						<th>isActive</th>
						<th>screenName</th>
						<th>autoScreenName</th>
						<th>contactEmail</th>
						<th>firstName</th>
						<th>lastName</th>
						<th>userLocation</th>
						<th>createdDate</th>
						<th>lastModifiedDate</th>
					</tr>
				</thead>

				<tbody>
					<tr ng-repeat="epUser in epUsers">
						<td>{{epUser.id}}</td>

						<td>{{epUser.liferayUserId}}</td>

						<td>{{epUser.isActive}}</td>

						<td>{{epUser.screenName}}</td>

						<td>{{epUser.autoScreenName}}</td>

						<td>{{epUser.contactEmail}}</td>

						<td>{{epUser.firstName}}</td>

						<td>{{epUser.lastName}}</td>

						<td>{{epUser.userLocation.street}}
							{{epUser.userLocation.city}} {{epUser.userLocation.country}}</td>

						<td>{{epUser.auditData.createdDate | date}}</td>


						<td>{{epUser.auditData.lastModifiedDate | date}}</td>
					</tr>
				<tbody>
			</table>
		</div>
	</div>
</body>
</html>