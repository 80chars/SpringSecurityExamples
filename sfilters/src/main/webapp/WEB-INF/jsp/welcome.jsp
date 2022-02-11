<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MVC welcome view</title>
</head>

<body>
    <% String message = (String) request.getAttribute("message"); %>

Backend response: ${message}.
 
</body>
</html>