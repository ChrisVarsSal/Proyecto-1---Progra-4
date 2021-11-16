package com.progra.ui.proyectoillusion;


import com.progra.en.pedidos.Pelicula;
import com.progra.services.PeliculaService;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Servlet implementation class ListarProducto
 */
@WebServlet("/ListarPeliculas")
public class ListarPeliculas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarPeliculas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
	  	out.println("<head>");
	  	out.println("<title> Productos</title>");
	  	out.println("</head>");
	  	out.println("<body>");
		out.println("<table border='1'>");
		out.println("<tr><th>Nombre</th> <th>Descripcion</th> <th>Cantidad</th> <th>Precio</th>    </tr>");

		PeliculaService peliculaSv = new PeliculaService();
		ArrayList<Pelicula> peliculas = peliculaSv.consultar();
		for(int i=0; i<peliculas.size(); i++){

			 if(i%2==0){ 
				 out.println("<tr bgcolor=\"#FFFFFF\">"); 
				 out.println("<td>" + peliculas.get(i).getNombre() + "</td>");
				 out.println("<td align=\"center\" valign=\"top\">"+ peliculas.get(i).getDescripcion()+"</td>");
				 out.println("<td align=\"center\" valign=\"top\">"+ peliculas.get(i).getCantidad() +"</td>");
                                 out.println("<td align=\"center\" valign=\"top\">"+ peliculas.get(i).getPrecio() +"</td>");
				 out.println("</tr>"); 
			 }else{ 
				 out.println("<tr>"); 
				 out.println("<td>" + peliculas.get(i).getNombre() + "</td>");
                                 out.println("<td align=\"center\" valign=\"top\">"+ peliculas.get(i).getDescripcion()+"</td>");
				 out.println("<td align=\"center\" valign=\"top\">"+ peliculas.get(i).getCantidad() +"</td>");
				 out.println("<td align=\"center\" valign=\"top\">"+ peliculas.get(i).getPrecio() +"</td>");
				 out.println("</tr>"); 
			 } 

			}
		out.println("</table>");
		out.println("</body>");
	  	out.println("</html>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
