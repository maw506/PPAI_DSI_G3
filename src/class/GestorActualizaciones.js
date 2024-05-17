export default class Gestor {
  constructor(bodega, vino, enofilos, varietal, tipoDeUva, maridaje) {
    this.bodega = bodega; // Relación con Bodega
    this.bodegaSeleccioanada = bodegaSeleccionada;
    this.vino = vino; // Relación con Vino
    this.enofilos = enofilos; // Relación con Enofilo
    this.varietal = varietal; // Relación con Varietal
    this.tipoDeUva = tipoDeUva; // Relación con TipoDeUva
    this.maridaje = maridaje; // Relación con Maridaje
  }

  // Métodos getter y setter para las relaciones de Gestor
  get bodega() {
    return this.bodega;
  }

  set bodega(bodega) {
    this.bodega = bodega;
  }

  get vino() {
    return this.vino;
  }

  set vino(vino) {
    this.vino = vino;
  }

  get enofilo() {
    return this.enofilo;
  }

  set enofilo(enofilo) {
    this.enofilo = enofilo;
  }

  get varietal() {
    return this.varietal;
  }

  set varietal(varietal) {
    this.varietal = varietal;
  }

  get tipoDeUva() {
    return this.tipoDeUva;
  }

  set tipoDeUva(tipoDeUva) {
    this.tipoDeUva = tipoDeUva;
  }

  get maridaje() {
    return this.maridaje;
  }

  set maridaje(maridaje) {
    this.maridaje = maridaje;
  }
}
