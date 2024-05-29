package Entidades;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Bodega {

    private int coordenadasUbicacion;
    private String descripcion;
    private String historia;
    private String nombre;
    private String periodoActualizacion;
    private String fechaUltimaActualizacion; // Se agrego el atributo de la ultima actialización cargada


    public boolean hayActualizaciones(String fechaActual) {
        if (validarFechaUltimaActualizacion().equals(fechaActual)) {
            return true;
        }
        return false;
    }


    public String validarFechaUltimaActualizacion() {
        return this.periodoActualizacion;
    }

    public Boolean tenesEsteVino(Vino vino) {
        vino.sosEsteVino(vino);

        return null;
    }

    /* Por el momento lo dejo asi

    public void actualizarDatosDeVino(List<Vino> vinosList, List<Vino> vinosDeBodega){
        for(Vino vino : vinosList){
            for()
            vino.setPrecioARS();
        }
    }*/

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return "Bodega{" +
                "coordenadasUbicacion=" + coordenadasUbicacion +
                ", descripcion='" + descripcion + '\'' +
                ", historia='" + historia + '\'' +
                ", nombre='" + nombre + '\'' +
                ", periodoActualizacion=" + periodoActualizacion +
                '}';
    }

}
