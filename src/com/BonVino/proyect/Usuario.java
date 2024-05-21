package com.BonVino.proyect;

public class Usuario {
    private String nombre;
    private String contraseña;
    private boolean premium;

    // Constructor
    public Usuario(String nombre, String contraseña, boolean premium) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.premium = premium;
    }

    // Métodos getter y setter para el atributo 'nombre'
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    // Métodos getter y setter para el atributo 'contraseña'
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String nuevaContraseña) {
        this.contraseña = nuevaContraseña;
    }

    // Métodos getter y setter para el atributo 'premium'
    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean esPremium) {
        this.premium = esPremium;
    }
}
