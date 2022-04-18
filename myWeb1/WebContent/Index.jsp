<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="rest/root/info" method="GET">
		<table>
		<tr><td>Person :</td><td><input type="text" name="tname"/></td></tr>
		<tr><td>Location :</td><td><input type="text" name="tloc"/></td></tr>
		<tr><td><button>Send Data</button></td></tr>
		</table>
	</form>
</body>
</html>