/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
 *
 * @author Dario
 */
@WebServlet(name = "ActualizarPelicula2", urlPatterns = {"/ActualizarPelicula2"})
public class ActualizarPelicula2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
                  String nombre, descripcion;
		int cantidad; 
                double precio; 
                String codigo;
		
                codigo = request.getParameter("txtCodigo");
                nombre = request.getParameter("txtnombre");
		descripcion = request.getParameter("txtDescripcion");
		cantidad = Integer.parseInt(request.getParameter("txtcantidad"));
		precio = Double.parseDouble(request.getParameter("txtPrecio"));
		
		// se instancia al constructor de producto.
		Pelicula pelicula = new Pelicula();
        pelicula.setCodigo(codigo);
        pelicula.setNombre(nombre);
        pelicula.setCantidad(cantidad);
        pelicula.setPrecio(precio);
        pelicula.setDescripcion(descripcion);
		
		// Se instancia al servicio de la capa logica de negocio
		PeliculaService peliculaServices = new PeliculaService();
		boolean ingreso = peliculaServices.actualizar(pelicula);
		
		if(ingreso){
			request.setAttribute("respuesta", "Modificado con exito!!");
			request.getRequestDispatcher("Mostrar.jsp").forward( request, response);			
		}else{
			request.setAttribute("respuesta", "Error");
			request.getRequestDispatcher("Mostrar.jsp").forward( request, response);						
		}
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
