<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create lead</title>
</head>
<body>

<h2>Lead | Create</h2>
<form action="updatebill" method="post">
<pre>
First Name<input type="text" name="firstName" value="${billing.firstName}"/>
Last Name<input type="text" name="lastName" value="${billing.lastName}"/>
Email<input type="email" name="email" value="${billing.email}"/>
Mobile<input type="text" name="mobile" value="${billing.mobile}"/>
Product<input type="text" name="product" value="${billing.product}"/>
Amount<input type="number" name="amount" value="${billing.amount}"/> 


<input type="submit" value="update bill"/>
</pre>

</form>

</body>
</html>