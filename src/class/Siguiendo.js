export default class Siguiendo {
  constructor(usuario, bodega, fechaInicio, fechaFin) {
    this.usuario = usuario;
    this.bodega = bodega;
    this.fechaInicio = fechaInicio;
    this.fechaFin = fechaFin;
  }

  // Métodos getter y setter para el atributo 'usuario'
  get usuario() {
    return this.usuario;
  }

  set usuario(usuario) {
    this.usuario = usuario;
  }

  // Métodos getter y setter para el atributo 'bodega'
  get bodega() {
    return this.bodega;
  }

  set bodega(bodega) {
    this.bodega = bodega;
  }

  // Métodos getter y setter para el atributo 'fechaInicio'
  get fechaInicio() {
    return this.fechaInicio;
  }

  set fechaInicio(fechaInicio) {
    this.fechaInicio = fechaInicio;
  }

  // Métodos getter y setter para el atributo 'fechaFin'
  get fechaFin() {
    return this.fechaFin;
  }

  set fechaFin(fechaFin) {
    this.fechaFin = fechaFin;
  }
}
