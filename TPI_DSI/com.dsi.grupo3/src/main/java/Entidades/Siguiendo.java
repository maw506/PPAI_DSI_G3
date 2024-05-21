package Entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Siguiendo {
    private Usuario usuario;
    private Bodega bodega;
    private Date fechaInicio;
    private Date fechaFin;
}
