package com.progra.services;

import com.progra.en.pedidos.Pelicula;

import java.util.ArrayList;

interface Service {
    boolean insertar(Pelicula pelicula);
    boolean actualizar(Pelicula pelicula);
    boolean eliminar(Pelicula pelicula);
    ArrayList<Pelicula> consultar();
}