<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:useBean id="Pedido" scope="request" class="com.progra.en.pedidos.Pedido"/>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Datos de Pedido</title>
    <link rel="stylesheet" href="CSS/estilosRespuesta.css">
</head>
<body>
<form action="" method="" id="form">
    <div class="form">
        <h2>Factura:</h2>
        <div class="grupo">
            <label for="">Nombre: </label>
            <%= Pedido.getNombre()%>
        </div>
        <div class="grupo">
            <label for="">Email: </label>
            <%=Pedido.getEmail()%>
        </div>
        <div class="grupo">
            <label for=""># de Miembro: </label>
            <%=Pedido.getMiembro()%>
        </div>
        <div class="grupo">
            <label for="">Telefono: </label>
            <%=Pedido.getTelefono()%>
        </div>
        <div class="grupo">
            <label for="">Accion: </label>
            <%=Pedido.getAccion()%>
        </div>
        <div class="grupo">
            <label for="">Cantidad: </label>
            <%=Pedido.getCantidad()%>

        </div>
        <div class="grupo">
            <label for="">Terror: </label>
            <%= Pedido.getGenero1()%>
        </div>
        <div class="grupo">
            <label for="">Comedia: </label>
            <%= Pedido.getGenero2()%>
        </div>
        <div class="grupo">
            <label for="">Accion: </label>
            <%= Pedido.getGenero3()%>
        </div>
        <div class="grupo">
            <label for="">Fantasia: </label>
            <%= Pedido.getGenero4()%>
        </div>
        <div class="grupo">
            <label for="">Romanticas: </label>
            <%= Pedido.getGenero5()%>
        </div>
        <div class="grupo">
            <label for="">Informacion extra: </label>
            <%=Pedido.getInfo()%>
        </div>
        <div class="grupo">
            <label for="">Pelicula seleccionada: </label>
            <%=Pedido.getPeli()%>
        </div>
        <div class="grupo">
            <label for="">Recibo: </label>
            <%=Pedido.Precio()%>
        </div>
        <div class="grupo">
            <label for="">Su solicitud a sido enviada con exito! </label>
        </div>
        <div class="grupo">
            <a href="#" onclick="history.go(-2)">Volver a la pagina anterior</a>
        </div>
    </div>
</form>
<script defer src="js/validar.js"></script>
</body>
</html>