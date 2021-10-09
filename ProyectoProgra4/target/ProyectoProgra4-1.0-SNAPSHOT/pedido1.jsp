
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Resultados del formulario</title>
</head>
<body>
<h1> Datos del formulario</h1>
<div>${requestScope.Solicitud.nombre}</div>
<div>${requestScope.Solicitud.email}</div>
<div>${requestScope.Solicitud.telefono}</div>
<div>${requestScope.Solicitud.miembro}</div>
</body>
</html>
