package com.BonVino.proyect;

public class Siguiendo {
    private String usuario;
    private String bodega;
    private String fechaInicio;
    private String fechaFin;

    // Constructor
    public Siguiendo(String usuario, String bodega, String fechaInicio, String fechaFin) {
        this.usuario = usuario;
        this.bodega = bodega;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    // Métodos getter y setter para el atributo 'usuario'
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    // Métodos getter y setter para el atributo 'bodega'
    public String getBodega() {
        return bodega;
    }

    public void setBodega(String bodega) {
        this.bodega = bodega;
    }

    // Métodos getter y setter para el atributo 'fechaInicio'
    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    // Métodos getter y setter para el atributo 'fechaFin'
    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
}
