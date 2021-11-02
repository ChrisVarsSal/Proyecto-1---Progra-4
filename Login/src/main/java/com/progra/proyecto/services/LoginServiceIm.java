package com.progra.proyecto.services;
import com.progra.proyecto.dao.LoginDao;
import com.progra.proyecto.entities.Usuario;

public class LoginServiceIm implements LoginService{
    private LoginDao ld;
    public LoginServiceIm(){
        ld=new LoginDao();
    }
    @Override
    public Usuario login(Usuario u) throws Exception {
        return null;
    }
}
