package Boundary;

import Control.GestorActualizaciones;
import Entidades.Bodega;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
public class PantallaAdminActualizaciones {

    private GestorActualizaciones gestor;

    private List<String> nombresBodega;

    private String bodegaSeleccionada;


    public void setNombresBodega(List<String> nombresBodega) {
        this.nombresBodega = nombresBodega;
    }

    public void opcionImportarActDeVinoDeBodega(ArrayList<Bodega> bodegasDelSistema){
        habilitarPantalla();
        gestor.buscarBodegasConActualizaciones(bodegasDelSistema, LocalDate.now());
        ArrayList<String> aux = new ArrayList<>(gestor.getBodegas());
        setNombresBodega(gestor.getBodegas());
    }

    public void habilitarPantalla(){
        System.out.println("####### PANTALLA ADMIN ACTUALIZACIONES ######");
        System.out.println("\n\n");
    }

    public void mostrarBodega(){
        for(String b : nombresBodega){
            System.out.println(b);
        }
    }

    public void solicitarSeleccionBodegas(String nombre){
        tomarSeleccionBodega(nombre);
    }

    public void tomarSeleccionBodega(String nombre){
        setBodegaSeleccionada(nombre);
    }

    public void mostrarOpcionFinalizar(){

    }

    public void opcionFinalizar(){

    }

}
