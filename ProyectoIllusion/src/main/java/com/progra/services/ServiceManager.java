package com.progra.services;


import com.progra.en.pedidos.Pelicula;
import java.util.ArrayList;


public interface ServiceManager extends Service {
            public boolean insertar(Pelicula pelicula);
	    public boolean actualizar(Pelicula pelicula);
	    public boolean eliminar(Pelicula pelicula);
	    public ArrayList<Pelicula> consultar();
}