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

<h2>Create | Lead</h2>
<form action="saveLead" method="post">

<table>

<tr>
<td>First Name<input type="text" name="firstName"/></td>
</tr>
<tr>
<td>Last Name<input type="text" name="lastName"/></td>
</tr>
<tr>
<td>Source<select name="source">
	  <option value="news paper">news paper</option>
	  <option value="radio">radio</option>
	  <option value="tv commercial">tv commercial</option>
	  <option value="online">online</option>
</select></td>
</tr>
<tr>
<td>Email<input type="email" name="email"/></td>
</tr>
<tr>
<td>Mobile<input type="text" name="mobile"/></td>
</tr>
<tr>
<td><input type="submit" value="save"/></td>
</tr>
</table>


</form>

</body>
</html>