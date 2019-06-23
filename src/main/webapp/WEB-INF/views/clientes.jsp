<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>clientes</title>
</head>
<body>
	<h2>clientes:</h2>
	<form:form method="POST" action="crearCliente" modelAttribute="cliente">
		<table>
			<tr>
				<td>Nombre:</td>
				<td><form:input path="nombre" /></td>
			</tr>
			<tr>
				<td>Apellido:</td>
				<td><form:input path="apellido" /></td>
			</tr>
			<td>
			<tr>
				<td>direccion:</td>
				<td><form:input type="date" path="direccion" /></td>
				<td><form:select path="idCiudad">
						<c:forEach items="${cuidad}" var="c">
							<option value="${c.id}">${c.nombre}</option>
						</c:forEach>
					</form:select></td>
				</td>
			</tr>

			<tr>
				<td><input type="submit" value="Enviar"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>