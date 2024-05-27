package Entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Vino {

    private int añada;
    private Bodega bodega;
    private String imagenEtiqueta;
    private String nombre;
    private String notaDeCataBodega;
    private double precioARS;
    private Varietal varietal;
    private Maridaje maridaje;


    public void calcularRanking(){}

    public void compararEtiqueta(){}

    public Boolean esDeBodega(Bodega bodegaValidar){
        if(bodegaValidar.equals(this.bodega)){
            return true;
        }
        return false;
    }

    public void esDeRegionVitivinicola(){}


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Vino{");
        sb.append("añada=").append(añada);
        sb.append(", bodega=").append(bodega);
        sb.append(", imagenEtiqueta='").append(imagenEtiqueta).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", notaDeCataBodega='").append(notaDeCataBodega).append('\'');
        sb.append(", precioARS=").append(precioARS);
        sb.append(", varietal=").append(varietal);
        sb.append(", maridaje=").append(maridaje);
        sb.append('}');
        return sb.toString();
    }
}
