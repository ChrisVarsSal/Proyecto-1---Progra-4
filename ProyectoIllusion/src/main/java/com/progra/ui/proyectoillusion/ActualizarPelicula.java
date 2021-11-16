package com.progra.ui.proyectoillusion;

import com.progra.en.pedidos.Pelicula;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Servlet implementation class AgregarProducto
 */
@WebServlet("/ActualizarPelicula")
public class ActualizarPelicula extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizarPelicula() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
            
               // String[] valoresSeleccionados = request.getParameterValues("producto");
		try{
                    ArrayList<Pelicula> peliculas;
       
                String codigo;    
                codigo = request.getParameter("codigo");
                
                HttpSession session = request.getSession();
                peliculas = (ArrayList<Pelicula>)
                        session.getAttribute("peliculas");
                
                for (int i=0; i<peliculas.size(); i++){
                    Pelicula pelicula;
                    pelicula = peliculas.get(i);
                   if(pelicula.getCodigo().equals(codigo)){
                       request.setAttribute("pelicula", pelicula);
                       request.getRequestDispatcher("ActualizarProducto2.jsp")
                               .forward(request, response);
                   }
                } 
               
                }catch(Exception e){
                    request.getRequestDispatcher("error.jsp")
                            .forward( request, response);							
                    System.out.print(e.getMessage());
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
