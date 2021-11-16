package com.progra.services;


import com.progra.en.pedidos.Pelicula;
import com.progra.dao.PeliculaDAO;

import java.util.ArrayList;

public class PeliculaService implements ServiceManager {

	    private PeliculaDAO daoPelicula = new PeliculaDAO();
	 
	    public PeliculaService() {
	    }
	 
	    
	    public boolean insertar(Pelicula pelicula) {
	        return daoPelicula.insertar(pelicula);
	    }
	 
	    public boolean eliminar(Pelicula pelicula) {
	        return daoPelicula.eliminar(pelicula);
	    }
	 
	    public boolean actualizar(Pelicula pelicula) {
	        return daoPelicula.actualizar(pelicula);
	    }
	 
	    public ArrayList<Pelicula> consultar() {
	        return daoPelicula.listaPeliculas();
	    }
               
}

