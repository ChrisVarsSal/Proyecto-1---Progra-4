package com.progra.ui.proyectoillusion;

import com.progra.en.pedidos.Contacto;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Contactenos", value = "/Contactenos")
public class Contactenos extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try (PrintWriter out = response.getWriter()) {
            String nombre, correo, id, telefono, infos;

            nombre =  request.getParameter("2name");

            correo = request.getParameter("2email");

            id = request.getParameter("2miembro");

            telefono = request.getParameter("2telefono");

            infos = request.getParameter("2comentario");

            Contacto contacto = new Contacto();

            contacto.setNombre(nombre);
            contacto.setEmail(correo);
            contacto.setMiembro(id);
            contacto.setTelefono(telefono);
            contacto.setInfo(infos);


            String gRecaptchaResponse = request
                    .getParameter("g-recaptcha-response");
            System.out.println(gRecaptchaResponse);
            boolean verify = VerificarRecaptcha.verify(gRecaptchaResponse);

            if (verify) {
                request.setAttribute("Contacto", contacto);
                request.getRequestDispatcher("RespContacto.jsp").forward(request, response);
            } else {
                RequestDispatcher rd = getServletContext().getRequestDispatcher(
                        "/Pcontactenos.html");
                out.println("<font color=red>Fallaste el captcha.</font>");
                rd.include(request, response);
            }

        }
    }
}
