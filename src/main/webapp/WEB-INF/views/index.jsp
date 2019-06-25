<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inicio</title>
</head>
<body>
<h2>Bienvenido Usuario</h2>

Listar Clientes 
<a href="<c:url value="listClient"/>">Ir >></a>
<br>

Crear Nuevo Registro Cliente
<a href="<c:url value="crearClient"/>">Ir >></a>

</body>
</html>
