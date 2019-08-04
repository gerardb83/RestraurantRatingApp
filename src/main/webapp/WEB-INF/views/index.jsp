<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Restaurant Rate Land</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/spacelab/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
<link href="/styles.css" rel="stylesheet" /> 
</head>
<body>
<div class="container">

		<h1>Restaurant Rate Land</h1>
		<table class="table">
			<thead>
				<tr>
					<th>Rating</th><th>Restaurant</th><th>Description</th><th>Vote</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="restaurants" items="${restaurants}">
				<tr>
					<td>${restaurants.rating}</td>
					<td>${restaurants.name}</td>
					<td>${restaurants.description}</td>
					<td><a href="/upVote?id=${ restaurants.id }" class="btn btn-light btn-sm">UpVote</a>
					<a href="/downVote?id=${ restaurants.id }" class="btn btn-light btn-sm">DownVote</a></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
</body>
</html>