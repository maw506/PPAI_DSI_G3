package Control;

import Entidades.*;
import lombok.Data;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

import static java.lang.System.in;

@Data
public class GestorActualizaciones {

    private Bodega bodega;

    private Bodega bodegaSeleccionada;

    private Vino vino;

    private ArrayList<Enofilo> enofilos;

    private Varietal varietal;

    private TipoUva tipoUva;

    private Maridaje maridaje;


    public void opcionImportarActDeVinoDeBodega(){
        buscarBodegasConActualizaciones(null, null);
    }
    //ver logica del metodo

    public ArrayList<Bodega> buscarBodegasConActualizaciones(ArrayList<Bodega> bodegas, Date fechaActual){
        ArrayList<Bodega> buscadas = new ArrayList<>();
        for(Bodega b: bodegas){
            if(b.hayActualizaciones(fechaActual)){
                b.getNombre();
                buscadas.add(b);
            }
        }
        return buscadas;
    }

    public void tomarSeleccionBodega(Bodega bodega){
        this.setBodega(bodegaSeleccionada);
    }

    public ArrayList<Bodega> buscarActualizaciones(){
        ArrayList<Bodega> bodegasConActualizaciones = buscarActualizaciones();


        return bodegasConActualizaciones;
    }


    public void actualizarDatosDeVinos(){

    }

    public void buscarVarietal(ArrayList<Vino> vinos){

    }

    public void buscarTipoUva(){

    }

    public void buscarMaridaje(){

    }

    public Vino crearVino(){
        Vino nuevo = new Vino();

        return nuevo;
    }

    public void buscarSeguidores(){

    }

    public void finDelCU(){

    }
}
