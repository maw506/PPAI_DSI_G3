export default class Enofilo {
  constructor(usuario, nombre, apellido, imagenPerfil) {
    this.usuario = usuario;
    this.nombre = nombre;
    this.apellido = apellido;
    this.imagenPerfil = imagenPerfil;
  }

  getNombre() {
    return this.nombre;
  }

  setNombre(nombre) {
    this.nombre = nombre;
  }

  getApellido() {
    return this.apellido;
  }

  setApellido(apellido) {
    this.apellido = apellido;
  }

  getImagenPerfil() {
    return this.imagenPerfil;
  }

  setImagenPerfil(imagenPerfil) {
    this.imagenPerfil = imagenPerfil;
  }
}
