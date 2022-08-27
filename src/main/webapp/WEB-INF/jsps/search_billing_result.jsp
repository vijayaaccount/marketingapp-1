<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ include file="menu.jsp" %>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List All leads</title>
</head>
<body>
<h2>List All Bills</h2>

<table>
<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Email</th>
		<th>Mobile</th>
		<th>Product</th>
	    <th>Amount</th>
	    <th>Delete</th>
	    <th>Update</th>
	    
</tr>

 <c:forEach var="billing" items="${billings}">
 
 <tr>
		<td><a href="billingInfo?id=${billing.id}">${billing.firstName}</a></td>
		<td>${billing.lastName}</td>
		<td>${billing.email}</td>
		<td>${billing.mobile}</td>
		<td>${billing.product}</td>
		<td>${billing.amount}</td>
		<td><a href="delete?id=${billing.id}">delete</a></td>
		<td><a href="update?id=${billing.id}">update</a></td>
</tr>
        

   </c:forEach>



</table>
</body>
</html>