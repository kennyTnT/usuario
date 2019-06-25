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
	<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<th>Nombres</th>
			<th>Fecha de Nacimiento</th>
			<th>Direccion</th>
			<th>Ciudad</th>
			<th>Telefonos</th>
		</tr>
		
		<c:forEach items="${clienteList}" var="c">		
			<tr>
				<td><a href="<c:url value="#"/>"> ${c.nombre},${c.apellido}</a></td>
				<td>${c.fechaNac}</td>
				<td>${c.direccion}</td>
				<td>${c.ciudad.nombre},${c.ciudad.pais.nombre}</td>
				<td><c:set var="cont" value="${1}"/>
				<c:forEach items="${telefonoList}" var="t">
						<c:set var="telefonoId" value="${t.cliente.id}" />
						<c:set var="clienteId" value="${c.id}" />	                    
						<c:if test="${telefonoId == clienteId}">
							<c:choose>
								<c:when test="${cont == 1}">${t.numeroTel}</c:when>
								<c:otherwise> , ${t.numeroTel}</c:otherwise>
							</c:choose>
							<c:set var="cont" value="${cont=cont+1}" />
						</c:if>						
				</c:forEach></td>				
			</tr>
		</c:forEach>
	</table>
	
	
	<table>
	<tr>
	<th>Nombre</th>
	<th>Telefonos</th>
	</tr>
	
	<tr>
	<td></td>
	<td></td>
	</tr>
	
	</table>
</body>
</html>