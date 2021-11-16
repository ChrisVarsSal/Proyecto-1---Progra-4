package com.progra.proyecto.dao;
import com.progra.proyecto.entities.Usuario;
import com.progra.proyecto.utils.Conection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao{
    public static Connection con= Conection.getConnection();
    public Usuario login(Usuario u)throws Exception{
        ResultSet rs;
        try{
            String sql="select username, type, estadoUsuario from usuario where " +
                    "username=? and password=?";
            PreparedStatement p= con.prepareStatement(sql);
            p.setString(1,u.getUsername());
            p.setString(2,u.getPassword());
            rs=p.executeQuery();
            if(rs.next()){
                u.setUsername(rs.getString("username"));
                u.setType(rs.getInt("type"));
                u.setEstadoUsuario(rs.getInt("estadoUsuario"));
            }
        }catch (Exception e){
            throw new Exception("ERROR");
        }
        return u;
    }
}
