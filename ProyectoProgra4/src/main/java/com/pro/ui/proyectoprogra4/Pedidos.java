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

//        try (PrintWriter out = response.getWriter()) {

            String nombre, correo, miembroid, tele, tipo , can, generospeli, infoe;

            nombre = request.getParameter("name");

            correo = request.getParameter("email");

            miembroid = request.getParameter("miembro");

            tele = request.getParameter("telefono");

            tipo = request.getParameter("accion");

            can = request.getParameter("cantidad");

            generospeli = request.getParameter("Encuesta");

            infoe = request.getParameter("extrainfo");

            Solicitud solicitud = new Solicitud();

            solicitud.setNombre(nombre);
            solicitud.setEmail(correo);
            solicitud.setMiembro(miembroid);
            solicitud.setTelefono(tele);
            solicitud.setAccion(tipo);
            solicitud.setCantidad(can);
            solicitud.setGenero(generospeli);
            solicitud.setInfo(infoe);

            request.setAttribute("Solicitud", solicitud);
            request.getRequestDispatcher("pedido.jsp").forward(request, response);


//
//            String gRecaptchaResponse = request
//                    .getParameter("g-recaptcha-response");
//            System.out.println(gRecaptchaResponse);
//            boolean verify = VerificarRecaptcha.verify(gRecaptchaResponse);
//
//            if (verify) {
//                request.setAttribute("Solicitud", solicitud);
//                request.getRequestDispatcher("pedido.jsp").forward(request, response);
//            } else {
//                RequestDispatcher rd = getServletContext().getRequestDispatcher(
//                        "/index.html");
//                out.println("<font color=red>Fallaste el captcha.</font>");
//                rd.include(request, response);
//            }
//
//        }

    }
}
