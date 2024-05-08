
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
	<style type="text/css">
	
	body {
	background-color:  rgba(0, 128, 0, 0.3);
}
	
	
	</style>
</head>
<body>
<br><br><br><br>
<form action="Deletion">
<font size="5px" color="green">
<table border="1" align="center">
<tr>
<td>Room ID:</td>
<td>
<select name="rmid">
<c:forEach items="${idlist}" var="id">
<option>${id}</option>
</c:forEach>
</select>
</td>
</tr>
<tr>
<td colspan="2">
<input type="submit" class="btn btn-primary btn-lg " value="Deleted" />
</td>
</tr>
</table>
</font>
</form>
</body>
</html>
</tr>
<tr>
<td colspan = "3"><inputy type = "submit" class ="btn btn -primary btn-lg" value = "Deleted">
</table>
</font>
</form>

 }
</body>
</html>