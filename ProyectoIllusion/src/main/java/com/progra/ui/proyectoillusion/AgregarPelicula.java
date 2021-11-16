package com.progra.ui.proyectoillusion;


import com.progra.en.pedidos.Pelicula;
import com.progra.services.PeliculaService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class AgregarProducto
 */
@WebServlet("/AgregarPelicula")
public class AgregarPelicula extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarPelicula() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre, descripcion;
		int cantidad; double precio;
		nombre = request.getParameter("txtnombre");
		descripcion = request.getParameter("txtDescripcion");
		cantidad = Integer.parseInt(request.getParameter("txtcantidad"));
		precio = Double.parseDouble(request.getParameter("txtPrecio"));
		
		// se instancia al constructor de producto.
		Pelicula pelicula = new Pelicula();
		pelicula.setNombre(nombre);
		pelicula.setCantidad(cantidad);
		pelicula.setPrecio(precio);
		pelicula.setDescripcion(descripcion);
		
		// Se instancia al servicio de la capa logica de negocio
		PeliculaService peliculaServices = new PeliculaService();
		boolean ingreso = peliculaServices.insertar(pelicula);
		
		if(ingreso){
			request.setAttribute("respuesta", "Ingresado con exito!!");
			request.getRequestDispatcher("Mostrar.jsp").forward( request, response);			
		}else{
			request.setAttribute("respuesta", "Error");
			request.getRequestDispatcher("Mostrar.jsp").forward( request, response);						
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
