package com.progra.proyecto.ui;
import com.progra.proyecto.services.LoginService;
import com.progra.proyecto.services.LoginServiceIm;
import com.progra.proyecto.entities.Usuario;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Optional;

@WebServlet(name = "LoginServlet",value = "/LoginServlet")
public class LoginServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext aplicacion = request.getServletContext();
        aplicacion.setAttribute("variableAplicacion", "aplicacionWeb");
        String user, password;
        try{
            user = request.getParameter("username");
            password = request.getParameter("password");
            if(!user.equals("") && !password.equals("")){
                Usuario usuario = new Usuario();
                usuario.setUsername(user);
                usuario.setPassword(password);
                LoginService loginService = new LoginServiceIm();
                usuario = loginService.login(usuario);
                if(Optional.ofNullable(usuario.getType()).isPresent()){
                    HttpSession oldSession = request.getSession(false);
                    if (oldSession != null) {
                        oldSession.invalidate();
                    }
                    HttpSession session = request.getSession(true);
                    session.setMaxInactiveInterval(5*60);
                    Cookie message = new Cookie("mensaje", "Bienvenido");
                    response.addCookie(message);
                    session.setAttribute("usuario", usuario);
                    response.sendRedirect("admin/index.jsp");
                }else{
                    throw new Exception("Login fallido");
                }
            }else{
                throw new Exception("Login fallido");
            }
        }catch(Exception e){
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("Error.jsp").forward(request, response);
        }
    }
}
