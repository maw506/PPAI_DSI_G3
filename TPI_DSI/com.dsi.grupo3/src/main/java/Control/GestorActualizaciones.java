package Control;

import Boundary.InterfazSistemaDeBodegas;
import Entidades.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.lang.System.in;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class GestorActualizaciones {

    private List<String> bodegas; //solo guardo el nombre de las bodegas

    private Bodega bodegaSeleccionada;

    private Vino vino;

    private List<Vino> vinosActualizables;

    private List<Enofilo> enofilos;

    private Varietal varietal;

    private TipoUva tipoUva;

    private Maridaje maridaje;


    public void opcionImportarActDeVinoDeBodega(){
        buscarBodegasConActualizaciones(null, null);
    }
    //ver logica del metodo

    public void buscarBodegasConActualizaciones(ArrayList<Bodega> bodegas, String fechaActual){
        //busca entre las bodegas existentes en el sistema
        ArrayList<String> buscadas = new ArrayList<>();
        int index = 0;
        for(Bodega b: bodegas){     //podria hacerse con while pero es mas sencillo un foreach
            if(b.hayActualizaciones(fechaActual)){
                buscadas.add(b.getNombre());
                setBodegas(buscadas);
                //Falta ver que hacer con el metodo getNombre()
                //guarda solo el nombre o la bodega?
            }
        }
    }

    //metodo de soporte?
    public Bodega buscarBodegaSeleccionada(List<Bodega> bodegasDelSist, String nombre){
        for(Bodega bodega: bodegasDelSist){
            if(bodega.getNombre().equals(nombre)){
                return bodega;
            }
        }
        return null;
    }

    public void tomarSeleccionBodega(String nombreBodega, List<Bodega> bodegasDelSist){
        for(Bodega bodega: bodegasDelSist){
            if(bodega.getNombre().equals(nombreBodega)){
                this.setBodegaSeleccionada(bodega);
            }
        }
    }

    public void buscarActualizaciones(){
        List<Vino> vinosAux;
        vinosAux = InterfazSistemaDeBodegas.buscarActualizaciones(this.bodegaSeleccionada); //el segundo es el metodo de interfaz sist de bodegas
        setVinosActualizables(vinosAux);

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
