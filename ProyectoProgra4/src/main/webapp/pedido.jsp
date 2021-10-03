
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:useBean id="Solicitud" scope="request" class="com.pro.en.solicitudes.Solicitud"/>

<html>
<head>
    <title>JSP - Datos de Solicitudes</title>
    <link rel="stylesheet" href="CSS/estilosRespuesta.css">
</head>
<body>

<form action="" method="POST" id="formpedidos">
    <div class="form">
        <h2>Informacion:</h2>
        <div class="grupo">
            <label for="">Nombre: </label>
            <%= Solicitud.getNombre()%>
        </div>
        <div class="grupo">
            <label for="">Email: </label>
            <%=Solicitud.getEmail()%>
        </div>
        <div class="grupo">
            <label for=""># de Miembro: </label>
            <%=Solicitud.getMiembro()%>
        </div>
        <div class="grupo">
            <label for="">Telefono: </label>
            <%=Solicitud.getTelefono()%>
        </div>
        <div class="grupo">
            <label for="">Accion: </label>
            <%=Solicitud.getAccion()%>
        </div>
        <div class="grupo">
            <label for="">Cantidad: </label>
            <%=Solicitud.getCantidad()%>
            <%=Solicitud.Cantidad()%>
        </div>
        <div class="grupo">
            <label for="">Encuesta: </label>
            <%= Solicitud.getGenero()%>
        </div>
        <div class="grupo">
            <label for="">Informacion extra: </label>
            <%=Solicitud.getInfo()%>
        </div>
    </div>
</form>

</body>
</html>
