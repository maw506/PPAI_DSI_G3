package com.BonVino.proyect;

public class GestorActualizaciones {
    private Bodega bodega;
    private Bodega bodegaSeleccionada;
    private Vino vino;
    private Enofilo enofilo;
    private Varietal varietal;
    private TipoDeUva tipoDeUva;
    private Maridaje maridaje;

    // Constructor
    public GestorActualizaciones(Bodega bodega, Bodega bodegaSeleccionada, Vino vino, Enofilo enofilo,
                  Varietal varietal, TipoDeUva tipoDeUva, Maridaje maridaje) {
        this.bodega = bodega;
        this.bodegaSeleccionada = bodegaSeleccionada;
        this.vino = vino;
        this.enofilo = enofilo;
        this.varietal = varietal;
        this.tipoDeUva = tipoDeUva;
        this.maridaje = maridaje;
    }

    // Métodos getter y setter para las relaciones de Gestor
    public Bodega getBodega() {
        return bodega;
    }

    public void setBodega(Bodega bodega) {
        this.bodega = bodega;
    }

    public Bodega getBodegaSeleccionada() {
        return bodegaSeleccionada;
    }

    public void setBodegaSeleccionada(Bodega bodegaSeleccionada) {
        this.bodegaSeleccionada = bodegaSeleccionada;
    }

    public Vino getVino() {
        return vino;
    }

    public void setVino(Vino vino) {
        this.vino = vino;
    }

    public Enofilo getEnofilo() {
        return enofilo;
    }

    public void setEnofilo(Enofilo enofilo) {
        this.enofilo = enofilo;
    }

    public Varietal getVarietal() {
        return varietal;
    }

    public void setVarietal(Varietal varietal) {
        this.varietal = varietal;
    }

    public TipoDeUva getTipoDeUva() {
        return tipoDeUva;
    }

    public void setTipoDeUva(TipoDeUva tipoDeUva) {
        this.tipoDeUva = tipoDeUva;
    }

    public Maridaje getMaridaje() {
        return maridaje;
    }

    public void setMaridaje(Maridaje maridaje) {
        this.maridaje = maridaje;
    }
}
