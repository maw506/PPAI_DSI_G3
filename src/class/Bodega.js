class Bodega {
  constructor(
    coordenadasUbicacion,
    descripcion,
    historia,
    nombre,
    periodoActualizacion
  ) {
    this.coordenadasUbicacion = coordenadasUbicacion;
    this.descripcion = descripcion;
    this.historia = historia;
    this.nombre = nombre;
    this.periodoActualizacion = periodoActualizacion;
  }

  // Métodos getter y setter para los atributos de la clase Bodega
  get coordenadasUbicacion() {
    return this.coordenadasUbicacion;
  }

  set coordenadasUbicacion(coordenadasUbicacion) {
    this.coordenadasUbicacion = coordenadasUbicacion;
  }

  get descripcion() {
    return this.descripcion;
  }

  set descripcion(descripcion) {
    this.descripcion = descripcion;
  }

  get historia() {
    return this.historia;
  }

  set historia(historia) {
    this.historia = historia;
  }

  get nombre() {
    return this.nombre;
  }

  set nombre(nombre) {
    this.nombre = nombre;
  }

  get periodoActualizacion() {
    return this.periodoActualizacion;
  }

  set periodoActualizacion(periodoActualizacion) {
    this.periodoActualizacion = periodoActualizacion;
  }
}

