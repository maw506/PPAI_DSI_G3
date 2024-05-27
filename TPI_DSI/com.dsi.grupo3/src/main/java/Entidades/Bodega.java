package Entidades;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.text.SimpleDateFormat;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Bodega {

    private int coordenadasUbicacion;
    private String descripcion;
    private String historia;
    private String nombre;
    private String periodoActualizacion;



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
        return null;
    }

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
