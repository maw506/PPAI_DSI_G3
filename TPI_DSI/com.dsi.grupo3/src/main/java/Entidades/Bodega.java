package Entidades;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Bodega {

    private int coordenadasUbicacion;
    private String descripcion;
    private String historia;
    private String nombre;
    private int periodoActualizacion;// cada cierto periodo se reciben actualizaciones
    private LocalDate fechaUltimaActualizacion; //debe estar en formato meses


    public boolean hayActualizaciones(LocalDate fechaActual) {
        return validarFechaUltimaActualizacion(fechaActual);
    }


    public Boolean validarFechaUltimaActualizacion(LocalDate fechaActual) {
        long mesesPasados = ChronoUnit.MONTHS.between(this.fechaUltimaActualizacion, fechaActual);
        return mesesPasados >= this.periodoActualizacion;
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
