package com.progra.proyecto.entities;

public class Usuario {
    private int id;
    private String username;
    private String password;
    private Integer type;
    private Integer estadoUsuario;

    public Usuario() {}
    public Usuario(int id, String username, String password, Integer type, Integer estadoUsuario) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.type = type;
        this.estadoUsuario = estadoUsuario;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public Integer getEstadoUsuario() {
        return estadoUsuario;
    }
    public void setEstadoUsuario(Integer estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }
}
