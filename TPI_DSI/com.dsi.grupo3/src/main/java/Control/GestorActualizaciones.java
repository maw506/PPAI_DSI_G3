package Control;

import Entidades.*;
import lombok.Data;

import java.util.ArrayList;

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


    public void buscarBodegasConActualizaciones(){

    }

    public void buscarActualizaciones(){

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
