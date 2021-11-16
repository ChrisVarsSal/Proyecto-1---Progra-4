package com.progra.en.pedidos;

import java.util.Date;

public class Login {

    private String usuario;
    private String password;
    private String rol;
    private String nombre;
    private Date ultimafechalogin;

    //Constructor
    public Login(){
    }

    public Login(String usuario, String password){
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the rol
     */
    public String getRol() {
        return rol;
    }

    /**
     * @param rol the rol to set
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the ultimafechalogin
     */
    public Date getUltimafechalogin() {
        return ultimafechalogin;
    }

    /**
     * @param ultimafechalogin the ultimafechalogin to set
     */
    public void setUltimafechalogin(Date ultimafechalogin) {
        this.ultimafechalogin = ultimafechalogin;
    }
}
