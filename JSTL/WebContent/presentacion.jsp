<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Bienvenido!!</h1>
<hr>
<c:out value=" Id:  ${estudiante.id}"></c:out>
<br>
<c:out value=" Nombre:  ${estudiante.nombre}"></c:out>
<br>



</body>
</html>