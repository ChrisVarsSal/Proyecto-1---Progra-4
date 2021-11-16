package com.progra.en.pedidos;

public class Pelicula {
    private String codigo;
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidad;

    private boolean seleccionado;

    public Pelicula (String codigo, String nombre, String descripcion,double precio,int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion=descripcion;
        this.precio=precio;
        this.cantidad=cantidad;
        this.seleccionado=false;
    }

    public Pelicula () {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad= cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(boolean seleccionado) {
        this.seleccionado = seleccionado;
    }

    public double getMonto() {
        return cantidad*precio;
    }
}
