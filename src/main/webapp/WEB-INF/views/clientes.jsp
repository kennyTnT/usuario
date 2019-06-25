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
<style type="text/css">
.msg {
	color: #008000;
	font-weight: bold;
}
</style>
</head>
<body>
	<h2>Agregar Clientes</h2>
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
			<tr>
			<tr>
				<td>Fecha de Nacimiento:</td>
				<td><form:input type="date" path="fechaNac" /></td>
			</tr>
			<tr>
				<td>direccion:</td>
				<td><form:input path="direccion" /></td>
				<td><select name="idCiudad">
						<c:forEach items="${listCiudad}" var="ci">
							<option value="${ci.id}">${ci.nombre}-${ci.pais.nombre}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td><input type="submit" value="Enviar"></td>
			</tr>
		</table>
	</form:form>
	<h5 class="msg">${mensaje}</h5>
	<br>
	<br>

	<h2>Agregar Nuevo Telefono</h2>
	<form:form method="POST" action="crearTelefono"
		modelAttribute="telefono">
		<table>
			<tr>
				<td>Numero de telefono:</td>
				<td><form:input path="numeroTel" /></td>
				<td><select name="idCliente">
						<c:forEach items="${listCliente}" var="c">
							<option value="${c.id}">${c.nombre} ${c.apellido}</option>
						</c:forEach>
				</select></td>
			</tr>

			<tr>
				<td><input type="submit" value="Agregar"></td>
			</tr>
		</table>
	</form:form>
	<h5 class="msg">${mensaje2}</h5>
</body>
</html>