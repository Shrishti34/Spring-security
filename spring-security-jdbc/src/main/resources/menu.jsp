<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="/welcome">Home</a> |  

    <a href="/addNewEmployee">Add
        Employee</a> |   <a
        href="/getEmployees">Show
        Employees</a> |   <u><h2 style="color: red;">
            <a onclick="document.forms['logoutForm'].submit()">Logout</a>
            </h3></u>

    <form id="logoutForm" method="POST" action="/logout">
    </form>
</body>
</html>