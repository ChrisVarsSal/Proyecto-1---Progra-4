package com.progra.ui.proyectoillusion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.progra.en.pedidos.Pelicula;
import com.progra.services.PeliculaService;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Dario
 */
@WebServlet(urlPatterns = {"/EliminarPelicula"})
public class EliminarPelicula extends HttpServlet {

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
       	try{
                    ArrayList<Pelicula> peliculas;
       
                String codigo;    
                codigo = request.getParameter("codigo");

            Pelicula pelicula = new Pelicula();
            pelicula.setCodigo(codigo);
                
                
                // Se instancia al servicio de la capa logica de negocio
            PeliculaService peliculaServices = new PeliculaService();
		boolean eliminado = peliculaServices.eliminar(pelicula);
		
		if(eliminado){
			request.setAttribute("respuesta", "Eliminado con exito!!");
			request.getRequestDispatcher("ListarProductosSolo").forward( request, response);			
		}else{
			request.setAttribute("respuesta", "Error");
			request.getRequestDispatcher("Mostrar.jsp").forward( request, response);						
		}
                
             
               
                }catch(Exception e){
                    request.getRequestDispatcher("error.jsp")
                            .forward( request, response);							
                    System.out.print(e.getMessage());
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
