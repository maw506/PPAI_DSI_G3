package com.BonVino.proyect;

public class Vino {
    private int añada;
    private String imagenEtiqueta;
    private String nombre;
    private String notaDeCataBodega;
    private double precioARS;
    private Varietal varietal; // Relación con la clase Varietal
    private Maridaje maridaje; // Relación con la clase Maridaje

    // Constructor
    public Vino(int añada, String imagenEtiqueta, String nombre, String notaDeCataBodega,
                double precioARS, Varietal varietal, Maridaje maridaje) {
        this.añada = añada;
        this.imagenEtiqueta = imagenEtiqueta;
        this.nombre = nombre;
        this.notaDeCataBodega = notaDeCataBodega;
        this.precioARS = precioARS;
        this.varietal = varietal;
        this.maridaje = maridaje;
    }

    // Métodos getter y setter para añada
    public int getAñada() {
        return añada;
    }

    public void setAñada(int añada) {
        this.añada = añada;
    }

    // Métodos getter y setter para imagenEtiqueta
    public String getImagenEtiqueta() {
        return imagenEtiqueta;
    }

    public void setImagenEtiqueta(String imagenEtiqueta) {
        this.imagenEtiqueta = imagenEtiqueta;
    }

    // Métodos getter y setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getter y setter para notaDeCataBodega
    public String getNotaDeCataBodega() {
        return notaDeCataBodega;
    }

    public void setNotaDeCataBodega(String notaDeCataBodega) {
        this.notaDeCataBodega = notaDeCataBodega;
    }

    // Métodos getter y setter para precioARS
    public double getPrecioARS() {
        return precioARS;
    }

    public void setPrecioARS(double precioARS) {
        this.precioARS = precioARS;
    }

    // Métodos getter y setter para varietal
    public Varietal getVarietal() {
        return varietal;
    }

    public void setVarietal(Varietal varietal) {
        this.varietal = varietal;
    }

    // Métodos getter y setter para maridaje
    public Maridaje getMaridaje() {
        return maridaje;
    }

    public void setMaridaje(Maridaje maridaje) {
        this.maridaje = maridaje;
    }
}
