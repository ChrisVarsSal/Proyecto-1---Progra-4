package com.progra.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import com.progra.en.pedidos.Login;

public class LoginDAO {
    private final Connection connection;


    public LoginDAO(){
        connection = new ConexionDBJNDI().getConnection();
    }

    /*Realiza una conexion a la base de
     * datos. Verifica si el usuario esta en la tabla
     * y devuelve verdadero o falso.
     */
    public boolean validarAcceso(Login login) {
        boolean resultadoConsulta= false;
        try {
            CallableStatement statement = connection.prepareCall("{call validarLogin (?,?)}");
            statement.setString("login_p", login.getUsuario());
            statement.setString("password_p", login.getPassword());
            ResultSet resultado = statement.executeQuery();
            if(resultado.next()){
                resultadoConsulta = resultado.getBoolean(1);
            }
            return resultadoConsulta;
        } catch (Exception ex) {
            ex.printStackTrace();
            return resultadoConsulta;
        }
    }

    /**
     * Aplica la logica de obtener un objeto de sesion
     * basado en los datos obtenidos de la consulta del
     * procedimiento almacenado en bases de datos.
     * @param login
     * @return
     */
    public Login obtenerSesion(Login login) {
        Login loginCorrecto = null;
        try {
            CallableStatement statement = connection.prepareCall("{call obtenerSesion (?,?)}");
            statement.setString("usuario_p", login.getUsuario());
            statement.setString("password_p", login.getPassword());
            ResultSet resultado = statement.executeQuery();
            if(resultado.next()){
                loginCorrecto = new Login();
                loginCorrecto.setUsuario(resultado.getString("usuario"));
                loginCorrecto.setPassword(resultado.getString("password"));
                loginCorrecto.setNombre(resultado.getString("nombre"));
            }
            return loginCorrecto;
        } catch (Exception ex) {
            ex.printStackTrace();
            return loginCorrecto;
        }
    }
}
