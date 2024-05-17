export default class Varietal {
  constructor(descripcion, porcentajeComposicion, tipoDeUva) {
    this.descripcion = descripcion;
    this.porcentajeComposicion = porcentajeComposicion;
    this.tipoDeUva = tipoDeUva; // Relación con la clase TipoDeUva
  }

  // Métodos getter y setter para los atributos de la clase Varietal

  get descripcion() {
    return this.descripcion;
  }

  set descripcion(descripcion) {
    this.descripcion = descripcion;
  }

  get porcentajeComposicion() {
    return this.porcentajeComposicion;
  }

  set porcentajeComposicion(porcentajeComposicion) {
    this.porcentajeComposicion = porcentajeComposicion;
  }

  get tipoDeUva() {
    return this.tipoDeUva;
  }

  set tipoDeUva(tipoDeUva) {
    this.tipoDeUva = tipoDeUva;
  }
}
