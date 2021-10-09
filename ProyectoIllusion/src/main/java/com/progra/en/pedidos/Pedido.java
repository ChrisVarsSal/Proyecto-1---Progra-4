package com.progra.en.pedidos;

import java.io.Serializable;

public class Pedido implements Serializable {
    private String nombre;
    private String email;
    private String miembro;
    private String telefono;
    private String accion;
    private String cantidad;
    private String genero1;
    private String genero2;
    private String genero3;
    private String genero4;
    private String genero5;
    private String info;


    public Pedido() {
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

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getGenero1() {
        return genero1;
    }

    public void setGenero1(String genero1) {
        String value ="No agregado.";
        if(genero1 == null)
            this.genero1 = value;
        else
            this.genero1 = genero1;
    }

    public String getGenero2() {
        return genero2;
    }

    public void setGenero2(String genero2) {
        String value ="No agregado.";
        if(genero2 == null)
            this.genero2 = value;
        else
            this.genero2 = genero2;
    }

    public String getGenero3() {return genero3;}

    public void setGenero3(String genero3) {
        String value ="No agregado.";
        if(genero3 == null)
            this.genero3 = value;
        else
            this.genero3 = genero3;
    }

    public String getGenero4() {
        return genero4;
    }

    public void setGenero4(String genero4) {
        String value ="No agregado.";
        if(genero4 == null)
            this.genero4 = value;
        else
            this.genero4 = genero4;
    }

    public String getGenero5() {
        return genero5;
    }

    public void setGenero5(String genero5) {
        String value ="No agregado.";
        if(genero5 == null)
            this.genero5 = value;
        else
            this.genero5 = genero5;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Float Precio() {
        float p,r,f,c;
        String g,a;
        g = getAccion();
        c = Float.parseFloat(getCantidad());
        a = getAccion();
        if(g == "Comprar")
            p = 7000;
        else
            p = 2500;

        r = c * p ;

        if(a == "")
            f = r;
        else
            f = (r/100)*95;
        return f;
    }
}