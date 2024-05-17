export default class Maridaje {
  constructor(descripcion, nombre) {
    this.descripcion = descripcion;
    this.nombre = nombre;
  }

  // Métodos getter y setter para los atributos de la clase Maridaje
  get descripcion() {
    return this.descripcion;
  }

  set descripcion(descripcion) {
    this.descripcion = descripcion;
  }

  get nombre() {
    return this.nombre;
  }

  set nombre(nombre) {
    this.nombre = nombre;
  }
}
