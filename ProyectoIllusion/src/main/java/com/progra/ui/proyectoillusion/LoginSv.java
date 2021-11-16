package com.progra.ui.proyectoillusion;

import com.progra.services.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Servlet implementation class Login
 */
@WebServlet("/LoginSv")
public class LoginSv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginSv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String usuario, password;
		usuario = request.getParameter("login");
		password = request.getParameter("password");

		com.progra.en.pedidos.Login login
		= new com.progra.en.pedidos.Login(usuario, password);
		
		LoginService loginSv = new LoginService();
		boolean acceso = loginSv.validarAcceso(login);
		if(acceso){
			//Session
			com.progra.en.pedidos.Login loginCorrecto = loginSv.obtenerSesion(login);
			HttpSession sesion = request.getSession(); 
		/*	if (sesion.isNew()) {*/ 
			 sesion = request.getSession(true); 
			 sesion.setAttribute("usuario", loginCorrecto.getUsuario()); 
			 sesion.setAttribute("nombre", loginCorrecto.getNombre());
		/*	} */
			request.getRequestDispatcher("menu.jsp").forward(
					request, response);			
		}else{
			request.setAttribute("error", "Login fallo");
			request.getRequestDispatcher("error.jsp").forward(
					request, response);	
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
