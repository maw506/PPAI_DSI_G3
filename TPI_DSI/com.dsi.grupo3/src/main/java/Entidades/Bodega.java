package Entidades;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
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

    public boolean tenesEsteVino(Vino vino) {
        return vino.sosEsteVino(vino);
    }

    public String actualizarDatosDeVino(List<Vino> vinosSistema, List<Vino> vinosActualizables) {
        String mensaje = " No es actualizable";
        for (Vino vinoActualizable : vinosActualizables) {
            if(vinoActualizable.sosVinoActualizable(vinosSistema)){
                mensaje = "Es vino actualizable";}
        }
        return mensaje;
    }




}
