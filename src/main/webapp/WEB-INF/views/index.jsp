<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<body>
<h2>Bienvenido Usuario</h2>

Listar Clientes 
<a href="<c:url value="listClient"/>">Ir >></a></br>

Crear Nuevo Registro Cliente
<a href="<c:url value="crearClient"/>">Ir >></a></br>

</body>
</html>
