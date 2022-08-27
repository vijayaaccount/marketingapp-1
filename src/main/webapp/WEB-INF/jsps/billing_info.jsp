<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing Info</title>
</head>
<body>
<h2>Billing | Information</h2>

Lead Id: ${billing.id}<br/>
First Name: ${billing.firstName}<br/>
Last Name: ${billing.lastName}<br/>
Email: ${billing.email}<br/>
Mobile: ${billing.mobile}<br/>
Product: ${billing.product}<br/>
Amount: ${billing.amount}<br/>


</body>
</html>