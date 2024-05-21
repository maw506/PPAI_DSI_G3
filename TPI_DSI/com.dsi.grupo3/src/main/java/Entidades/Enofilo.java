package Entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Enofilo {

    private Usuario usuario;
    private String nombre;
    private String apellido;
    private String imagenPerfil;


}
