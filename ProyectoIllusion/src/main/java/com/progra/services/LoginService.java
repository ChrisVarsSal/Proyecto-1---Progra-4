package com.progra.services;



import com.progra.en.pedidos.Login;
import com.progra.dao.LoginDAO;


public class LoginService implements ServiceManagerLogin {

	    private final LoginDAO loginDAO;
            
            public LoginService(){
                loginDAO = new LoginDAO();
            }
	 

	    public boolean validarAcceso(Login login){
	    	if(!loginDAO.validarAcceso(login)){
                    return false;
                }else{
                    return true;
                }
	    }
	    
	    public Login obtenerSesion(Login login){
	    	return loginDAO.obtenerSesion(login);
	    }
	    
}

