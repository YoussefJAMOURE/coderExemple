<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page import="com.Coder.coderApp.entities.Customer"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="css/styleError.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Ops ... !</title>
</head>
<body>
		<div class="table-responsive">
			<table class="table">
				<h3>List des Users</h3>
				<thead>
					<th>#</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Action</th>
				</thead>
				<tbody>
					<c:forEach items="${users}" var="item">
						<tr>
							<td><c:out value="${item.id}" /></td>
							<td><c:out value="${item.firstName}" /></td>
							<td><c:out value="${item.lastName}" /></td>
							<td><a
								href="linkRemove/<c:out value="${item.id}" />">remove</a>
								<a
								href="linkUpdate/<c:out value="${item.id}" />">update</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
</body>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<style>
a{
	color : #0c2461;
}
	body {
		background: #33b0cc;
        color:#fff;
	}
</style>
</html>