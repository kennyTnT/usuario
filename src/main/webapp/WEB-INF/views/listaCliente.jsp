<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Cliente</title>
</head>
<body>
	<h3>Clientes:</h3>
	<table>
		<tr>
			<td>Nombres:</td>
			<td><c:forEach items="${cliente}" var="c">
					${c.nombre} , ${c.apellido} 
					</c:forEach></td>
		</tr>

		<tr>
			<td>Edad</td>
			<td><c:forEach items="${cliente}" var="c">
					${c.edad} - ${c.fechaNac}
					</c:forEach></td>
		</tr>
		
		<tr>
			<td>Direccion</td>
			<td><c:forEach items="${cliente}" var="c">
					${c.direccion}
					</c:forEach></td>
		</tr>

	</table>
</body>
</html>