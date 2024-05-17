const Bodega = require("./class/Bodega.js");
const Vino = require("./class/Vino.js");
const Varietal = require("./class/Varietal.js");
const Enofilo = require("./class/Enofilo.js");
const TipoDeUva = require("./class/TipoDeUva.js");
const Maridaje = require("./class/Maridaje.js");
const GestorActualizaciones = require("./class/GestorActualizaciones.js");

// Crear instancias de las clases
let bodega = new Bodega(
  "coordenadas",
  "descripción",
  "historia",
  "nombreBodega",
  "periodoActualizacion"
);
let tipoDeUva1 = new TipoDeUva("descripciónTipoDeUva1", "nombreTipoDeUva1");
let tipoDeUva2 = new TipoDeUva("descripciónTipoDeUva2", "nombreTipoDeUva2");
let varietales = [
  new Varietal("descripciónVarietal1", "porcentaje1", tipoDeUva1),
  new Varietal("descripciónVarietal2", "porcentaje2", tipoDeUva2),
];
let vino = new Vino(
  "añada",
  "imagenEtiqueta",
  "nombreVino",
  "notaDeCataBodega",
  "precioARS",
  varietales[1]
);
let enofilo = new Enofilo(
  usuario,
  "nombreEnofilo",
  "apellidoEnofilo",
  "imagenPerfilEnofilo"
);
let maridaje = new Maridaje("descripciónMaridaje", "nombreMaridaje");

let gestor = new GestorActualizaciones(
  bodega,
  vino,
  enofilo,
  varietales,
  [tipoDeUva1, tipoDeUva2],
  maridaje
);

// inicializar la configuaacion
console.log(gestor);
