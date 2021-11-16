package com.progra.services;

import com.progra.en.pedidos.Login;


public interface ServiceManagerLogin extends ServiceLogin {
	 	public boolean validarAcceso(Login Login);
	 	public Login obtenerSesion(Login Login);
}