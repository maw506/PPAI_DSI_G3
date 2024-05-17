export default class Usuario {
  constructor(nombre, contraseña, premium) {
    this.nombre = nombre;
    this.contraseña = contraseña;
    this.premium = premium;
  }

  // Métodos getter y setter para el atributo 'nombre'
  get nombre() {
    return this.nombre;
  }

  set nombre(nuevoNombre) {
    this.nombre = nuevoNombre;
  }

  // Métodos getter y setter para el atributo 'contraseña'
  get contraseña() {
    return this.contraseña;
  }

  set contraseña(nuevaContraseña) {
    this.contraseña = nuevaContraseña;
  }

  // Métodos getter y setter para el atributo 'premium'
  get premium() {
    return this.premium;
  }

  set premium(esPremium) {
    this.premium = esPremium;
  }
}
