package com.progra.en.pedidos;

import java.io.Serializable;

public class Contacto implements Serializable {
    private String nombre;
    private String email;
    private String miembro;
    private String telefono;
    private String info;


    public Contacto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMiembro() {
        return miembro;
    }

    public void setMiembro(String miembro) {
        this.miembro = miembro;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
