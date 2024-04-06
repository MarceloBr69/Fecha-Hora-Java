<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" import="java.text.*"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="/fecha.css">
	</head>
	<body>
		<%Date date = new Date();
		SimpleDateFormat f1 = new SimpleDateFormat("dd-MM-yyyy"); 
		String fecha = f1.format(date); 
		%>
		<h2 onclick="alert('Esta correcta la fecha?')"><%=fecha%></h2>
	</body>
</html>