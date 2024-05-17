export default class Vino {
  constructor(
    añada,
    imagenEtiqueta,
    nombre,
    notaDeCataBodega,
    precioARS,
    varietal,
    maridaje
  ) {
    this.añada = añada;
    this.imagenEtiqueta = imagenEtiqueta;
    this.nombre = nombre;
    this.notaDeCataBodega = notaDeCataBodega;
    this.precioARS = precioARS;
    this.varietal = varietal; // Relación con la clase Varietal
    this.maridaje = maridaje; // Relación con la clase maridaje
  }

  // Métodos getter y setter para los atributos de la clase Vino

  get añada() {
    return this.añada;
  }

  set añada(añada) {
    this.añada = añada;
  }

  get imagenEtiqueta() {
    return this.imagenEtiqueta;
  }

  set imagenEtiqueta(imagenEtiqueta) {
    this.imagenEtiqueta = imagenEtiqueta;
  }

  get nombre() {
    return this.nombre;
  }

  set nombre(nombre) {
    this.nombre = nombre;
  }

  get notaDeCataBodega() {
    return this.notaDeCataBodega;
  }

  set notaDeCataBodega(notaDeCataBodega) {
    this.notaDeCataBodega = notaDeCataBodega;
  }

  get precioARS() {
    return this.precioARS;
  }

  set precioARS(precioARS) {
    this.precioARS = precioARS;
  }

  get varietal() {
    return this.varietal;
  }

  set varietal(varietal) {
    this.varietal = varietal;
  }

  get maridaje() {
    return this.maridaje;
  }

  set maridaje(maridaje) {
    this.maridaje = maridaje;
  }
}
