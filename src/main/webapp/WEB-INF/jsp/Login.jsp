<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en">
<head> <!-- 
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
 	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<style><!--<//%@include file="../assets/myTemp.css" %></style>
			 -->					
<meta charset="UTF-8">
<title>Home Page</title>
<style>
.error{
	color:red;
}
</style>
</head>
<body>
	<h1>Employee Login Home Page</h1>
	<c:url var="next" value="/{arg}" />
	<form:form modelAttribute="name" action="${next}" >
		<label>Employee ID:</label>
		<!-- <form:errors path="*" cssClass="errorBlock" element="div"/>  -->
		
		<form:input type="number" path="employeeId" cssErrorClass="error" />
		<form:errors path="employeeId" cssClass="error" />
		
		<br/>
		<input type="Submit"  value="Login!"/>
		
	</form:form>

</body>
</html>