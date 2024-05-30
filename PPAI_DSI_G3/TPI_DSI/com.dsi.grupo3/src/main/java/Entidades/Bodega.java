package Entidades;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
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

    public boolean tenesEsteVino(Vino vino) {
        return vino.sosEsteVino(vino);
    }

    public String actualizarDatosDeVino(List<Vino> vinosSistema, List<Vino> vinosActualizables) {
        String mensaje = " No es actualizable";
        int i = 0;
        for (Vino vinoSist : vinosSistema) {
            if(vinoSist.sosVinoActualizable(vinosActualizables)){
                System.out.println("\n El vino:" + vinoSist.toString()+ "\n Es actualizable");
                vinoSist.setNotaDeCataBodega(vinosActualizables.get(i).getNotaDeCataBodega());
                vinoSist.setPrecioARS(vinosActualizables.get(i).getPrecioARS());
                vinoSist.setImagenEtiqueta(vinosActualizables.get(i).getImagenEtiqueta());
                mensaje = "El vino queda como: \n" + vinoSist.toString();
                i ++;;}
            else{
                mensaje= "\nEl vino:"+ vinoSist.toString() + "\n Se debe crear en el sistema";
            }


        }
        return mensaje;
    }




}
