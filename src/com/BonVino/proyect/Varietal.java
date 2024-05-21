package com.BonVino.proyect;

public class Varietal {
    private String descripcion;
    private double porcentajeComposicion;
    private TipoDeUva tipoDeUva; // Relación con la clase TipoDeUva

    // Constructor
    public Varietal(String descripcion, double porcentajeComposicion, TipoDeUva tipoDeUva) {
        this.descripcion = descripcion;
        this.porcentajeComposicion = porcentajeComposicion;
        this.tipoDeUva = tipoDeUva;
    }

    // Métodos getter y setter para descripcion
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Métodos getter y setter para porcentajeComposicion
    public double getPorcentajeComposicion() {
        return porcentajeComposicion;
    }

    public void setPorcentajeComposicion(double porcentajeComposicion) {
        this.porcentajeComposicion = porcentajeComposicion;
    }

    // Métodos getter y setter para tipoDeUva
    public TipoDeUva getTipoDeUva() {
        return tipoDeUva;
    }

    public void setTipoDeUva(TipoDeUva tipoDeUva) {
        this.tipoDeUva = tipoDeUva;
    }
}
