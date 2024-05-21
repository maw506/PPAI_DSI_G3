package Entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Varietal {

    private String descripcion;

    private double porcentajeComposicion;

    private TipoUva tipoDeUva;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Varietal{");
        sb.append("\ndescripcion='").append(descripcion).append('\'');
        sb.append("\nporcentajeComposicion=").append(porcentajeComposicion);
        sb.append("\n\ntipoDeUva=").append(tipoDeUva);
        sb.append('}');
        return sb.toString();
    }
}
