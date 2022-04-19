<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login Page</title>
</head>
<body>
<form:form  method="POST" action="userlogin.htm">
Username: <form:input path="username"/>
Password: <form:password path="password"/>
<form:button>Login</form:button>
</form:form>
</body>
</html>