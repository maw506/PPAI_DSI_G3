package Entidades;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@AllArgsConstructor
@Data
public class Bodega {

    private int coordenadasUbicacion;
    private String descripcion;
    private String historia;
    private String nombre;
    private Date periodoActualizacion;


    public boolean hayActualizaciones(Date fechaActual){
        if(this.periodoActualizacion == fechaActual){
            return true;
        }
        return false;
    }
    public Date validarFechaUltimaActualizacion(){


        return null;
    }

    public void tenesEsteVino(Vino vino){

    }





}
