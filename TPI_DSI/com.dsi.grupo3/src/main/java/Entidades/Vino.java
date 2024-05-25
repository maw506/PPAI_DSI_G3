package Entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Vino {

    private int añada;

    private String imagenEtiqueta;
    private String nombre;
    private String notaDeCataBodega;
    private double precioARS;
    private Varietal varietal;
    private Maridaje maridaje;


    public void calcularRanking(){}

    public void compararEtiqueta(){}

    public Boolean esDeBodega(Bodega bodega){
        if(true){       //falta la logica del metodo
            return true;
        }
        return false;
    }

    public void esDeRegionVitivinicola(){}





    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Vino{");
        sb.append("añada=").append(añada);
        sb.append(", imagenEtiqueta='").append(imagenEtiqueta).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", \nnotaDeCataBodega='").append(notaDeCataBodega).append('\'');
        sb.append(", \nprecioARS=").append(precioARS);
        sb.append("\nvarietal=").append(varietal);
        sb.append(",\n\nmaridaje=").append(maridaje);
        sb.append('}');
        return sb.toString();
    }
}
