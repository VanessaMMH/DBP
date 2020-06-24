<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<!--
<jsp:useBean id= "estudiante1" class= "com.ecodeup.proyecto.EstudianteBean" scope=
"session" />
<jsp:setProperty name="estudiante1" property="nombre"
value="Mark"/>
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<!--
<jsp:getProperty name="estudiante1" property="nombre" />
<c:out value="${estudiante.nombre}"></c:out>
<a href="MServlet">Peticion Get</a>
-->
<h1> Login</h1>
<hr>
<form action="MyServlet" method="post">
	<label>   CUI</label>
	<input type="text" name="id">
	<br>
	<label>Nombre</label>
	<input type="text" name="nombre">
	<br>		
	<button type="submit"> Enviar</button>

</form>

</body>
</html>