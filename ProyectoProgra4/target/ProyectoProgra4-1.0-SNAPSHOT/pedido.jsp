
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:useBean id="Solicitud" scope="request" class="com.pro.en.solicitudes.Solicitud"/>

<html>
<head>
    <title>JSP - Datos de Solicitudes</title>
    <link rel="stylesheet" href="CSS/estiloJSP.css">
</head>
<body>
<h1> Datos del formulario</h1>
<div><%= Solicitud.getNombre()%></div>
<div><%= Solicitud.getEmail()%></div>
<div><%= Solicitud.getMiembro()%></div>
<div><%= Solicitud.getTelefono()%></div>
<div><%= Solicitud.getAccion()%></div>
<div><%= Solicitud.Cantidad()%></div>
<div><%= Solicitud.getGenero()%></div>
<div><%= Solicitud.getInfo()%></div>
</body>
</html>
