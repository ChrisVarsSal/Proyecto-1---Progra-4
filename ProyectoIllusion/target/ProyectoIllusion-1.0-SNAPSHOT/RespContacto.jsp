
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:useBean id="Contacto" scope="request" class="com.progra.en.pedidos.Contacto"/>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Datos de Contacto</title>
    <link rel="stylesheet" href="CSS/estilosRespuesta.css">
</head>
<body>
<form action="" method="" id="form">
    <div class="form">
        <h2>Informacion:</h2>
        <div class="grupo">
            <label for="">Nombre: </label>
            <%= Contacto.getNombre()%>
        </div>
        <div class="grupo">
            <label for="">Email: </label>
            <%=Contacto.getEmail()%>
        </div>
        <div class="grupo">
            <label for=""># de Miembro: </label>
            <%=Contacto.getMiembro()%>
        </div>
        <div class="grupo">
            <label for="">Telefono: </label>
            <%=Contacto.getTelefono()%>
        </div>
        <div class="grupo">
            <label for="">Comentario: </label>
            <%=Contacto.getInfo()%>
        </div>
    </div>
</form>
</body>
</html>
