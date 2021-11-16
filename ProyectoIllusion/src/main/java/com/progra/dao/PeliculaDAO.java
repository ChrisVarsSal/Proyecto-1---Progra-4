package com.progra.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.progra.en.pedidos.Pelicula;


public class PeliculaDAO {

    /*Obtenemos la conexion mediante un driver */
    private final Connection connection;


    public PeliculaDAO(){
        connection = new ConexionDBJNDI().getConnection();
    }

    /**
     * Metodo que recibe el seteo de un producto
     * y lo inserta en la base de datos
     * @param pelicula
     * @return
     */
    public boolean insertar(Pelicula pelicula) {
        try {
            CallableStatement statement = connection.prepareCall("{call insertarPelicula (?,?,?,?)}");
            statement.setString("nombre_p", pelicula.getNombre());
            statement.setInt("cantidad_p", pelicula.getCantidad());
            statement.setString("descripcion_p", pelicula.getDescripcion());
            statement.setDouble("precio_p", pelicula.getPrecio());
            statement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    /**
     * Metodo que elimina un producto de la
     * base de datos por el codigo
     * @param pelicula
     * @return
     */
    public boolean eliminar(Pelicula pelicula) {
        try {
            CallableStatement statement = connection.prepareCall("{call eliminaPelicula (?)}");
            statement.setString("codigo_p", pelicula.getCodigo());
            statement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    /**
     * Metodo que se actualiza con la nueva informacion que brinda el usuario
     * @param pelicula
     * @return
     */
    public boolean actualizar(Pelicula pelicula) {
        try {
            CallableStatement statement = connection.prepareCall("{call modificaPelicula (?,?,?,?,?)}");
            statement.setString("codigo_p", pelicula.getCodigo());
            statement.setString("nombre_p", pelicula.getNombre());
            statement.setInt("cantidad_p", pelicula.getCantidad());
            statement.setDouble("precio_p", pelicula.getPrecio());
            statement.setString("descripcion_p", pelicula.getDescripcion());
            statement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    /**
     * Lista los productos que estan en la base de datos
     * @return lista de productos
     */
    public ArrayList<Pelicula> listaPeliculas() {
        ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
        try {
            CallableStatement statement = connection.prepareCall("{call listaPeliculas }");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Pelicula pelicula = new Pelicula();
                pelicula.setNombre(resultSet.getString("nombre"));
                pelicula.setCodigo(resultSet.getString("codigo"));
                pelicula.setCantidad(resultSet.getInt("cantidad"));
                pelicula.setDescripcion(resultSet.getString("descripcion"));
                pelicula.setPrecio(resultSet.getDouble("precio"));
                peliculas.add(pelicula);
            }
            return peliculas;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    }
}
