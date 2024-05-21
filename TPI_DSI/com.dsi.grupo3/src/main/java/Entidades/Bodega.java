package Entidades;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
public class Bodega {

    private int coordenadasUbicacion;
    private String descripcion;
    private String historia;
    private String nombre;
    private int periodoActualizacion;


}
