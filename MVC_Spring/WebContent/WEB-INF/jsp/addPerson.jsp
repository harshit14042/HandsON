<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/MVC_Spring/add" method="post">
	<label for="pid">Id</label>
	<input type="number" name="pid" id="pid" required/><br/>
	<label for="pname">Name</label>
	<input type="text" name="pname" id="pname" required/><br/><br/>
	<input type="submit" value="Submit"/>
</form>
</body>
</html>