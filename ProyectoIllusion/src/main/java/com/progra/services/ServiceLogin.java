package com.progra.services;

import com.progra.en.pedidos.Login;

interface ServiceLogin {
    boolean validarAcceso(Login login);
    Login obtenerSesion(Login login);
}