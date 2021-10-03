package com.pro.ui.proyectoprogra4;

import com.pro.en.solicitudes.Solicitud;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Pedidos", value = "/Pedidos")
public class Pedidos extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try (PrintWriter out = response.getWriter()) {

            String nombre, email, miembro, telefono, accion, cantidad, generos, info;

            nombre = request.getParameter("name");

            email = request.getParameter("email");

            miembro = request.getParameter("miembro");

            telefono = request.getParameter("telefono");

            accion = request.getParameter("accion");

            cantidad = request.getParameter("cantidad");

            generos = request.getParameter("Encuesta");

            info = request.getParameter("extrainfo");

            Solicitud solicitud = new Solicitud();

            solicitud.setNombre(nombre);
            solicitud.setEmail(email);
            solicitud.setMiembro(miembro);
            solicitud.setTelefono(telefono);
            solicitud.setAccion(accion);
            solicitud.setCantidad(cantidad);
            solicitud.setGenero(generos);
            solicitud.setInfo(info);



            // get reCAPTCHA request param
            String gRecaptchaResponse = request.getParameter("g-recaptcha-response");
            System.out.println(gRecaptchaResponse);
            boolean verify = VerificarRecaptcha.verify(gRecaptchaResponse);

            if (verify) {
                request.setAttribute("Solicitud", solicitud);
                request.getRequestDispatcher("pedido.jsp").forward(request, response);
            } else {
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.html");
                out.println("<font color=red>Fallaste el captcha.</font>");
                rd.include(request, response);
                }

            }

    }
}
