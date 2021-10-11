package com.progra.ui.proyectoillusion;

import com.progra.en.pedidos.Pedido;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Solicitudes", value = "/Solicitudes")
public class Solicitudes extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try (PrintWriter out = response.getWriter()) {
        String nombre, correo, id, telefono, tipo, cantidad, genero1, genero2, genero3, genero4, genero5, info, peli;

        nombre =  request.getParameter("1name");

        correo = request.getParameter("1email");

        id = request.getParameter("1miembro");

        telefono = request.getParameter("1telefono");

        tipo = request.getParameter("1accion");

        cantidad = request.getParameter("1cantidad");

        genero1 = request.getParameter("1encuesta");
        genero2 = request.getParameter("2encuesta");
        genero3 = request.getParameter("3encuesta");
        genero4 = request.getParameter("4encuesta");
        genero5 = request.getParameter("5encuesta");

        info = request.getParameter("1extrainfo");

        peli = request.getParameter("1peli");

        Pedido pedido = new Pedido();

        pedido.setNombre(nombre);
        pedido.setEmail(correo);
        pedido.setMiembro(id);
        pedido.setTelefono(telefono);
        pedido.setAccion(tipo);
        pedido.setCantidad(cantidad);
        pedido.setGenero1(genero1);
        pedido.setGenero2(genero2);
        pedido.setGenero3(genero3);
        pedido.setGenero4(genero4);
        pedido.setGenero5(genero5);
        pedido.setInfo(info);
        pedido.setPeli(peli);

            String gRecaptchaResponse = request
                    .getParameter("g-recaptcha-response");
            System.out.println(gRecaptchaResponse);
            boolean verify = VerificarRecaptcha.verify(gRecaptchaResponse);

            if (verify) {
                request.setAttribute("Pedido", pedido);
                request.getRequestDispatcher("RespCompra.jsp").forward(request, response);
            } else {
                RequestDispatcher rd = getServletContext().getRequestDispatcher(
                        "/Ppedidos.html");
                out.println("<font color=red>Fallaste el captcha.</font>");
                rd.include(request, response);
            }

        }

    }
}
