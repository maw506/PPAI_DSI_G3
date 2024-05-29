package Control;

import Boundary.InterfazSistemaDeBodegas;
import Entidades.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GestorActualizaciones {

    private List<String> bodegas; //solo guardo el nombre de las bodegas

    private Bodega bodegaSeleccionada;

    private Vino vino;

    private List<Vino> vinosImportados;

    private List<Vino> vinosActualizables;

    private List<String> usuarios;

    private Varietal varietal;

    private TipoUva tipoUva;

    private Maridaje maridaje;


    public void opcionImportarActDeVinoDeBodega(ArrayList<Bodega> bodega, LocalDate fechaActual){
        // busca las bodegas con actualizaciones
        buscarBodegasConActualizaciones(bodega, fechaActual);
    }
    //ver logica del metodo

    public void buscarBodegasConActualizaciones(ArrayList<Bodega> bodegas, LocalDate fechaActual){ // Esto no sería mejor como guardar bodegas con actualizaciones?
        //busca entre las bodegas existentes en el sistema
        ArrayList<String> buscadas = new ArrayList<>();
        for(Bodega b: bodegas){     //podria hacerse con while pero es mas sencillo un foreach
            if(b.hayActualizaciones(fechaActual)){
                buscadas.add(b.getNombre());
                setBodegas(buscadas);
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

    public void tomarSeleccionBodega(String nombreBodega, List<Bodega> bodegasDelSist){ // nombreBodega es ingresado por el usuario para buscar entre las Bodegas existentes
        for(Bodega bodega: bodegasDelSist){
            if(bodega.getNombre().equals(nombreBodega)){
                this.setBodegaSeleccionada(bodega);
            }
        }
    }

    public void buscarActualizaciones(){
        List<Vino> vinosAux;
        vinosAux = InterfazSistemaDeBodegas.buscarActualizaciones(this.bodegaSeleccionada); //el segundo es el metodo de interfaz sist de bodegas
        setVinosImportados(vinosAux);
    }


    public void determinarVinosActualizar(){
        List<Vino> vinosAux =new ArrayList<>(0);
        for(Vino vino: this.vinosImportados){
            if(bodegaSeleccionada.tenesEsteVino(vino)) vinosAux.add(vino);
        }
        setVinosActualizables(vinosAux);
    }

    public void actualizarDatosDeVinos(List<Vino> vinosSistema) {
        for (int i = 0; i < vinosSistema.size(); i++) {
            Vino vinoActual = vinosSistema.get(i);              // Aqui se asume que la posicion del vinoActual se encuentra en la misma posicion que el vinoActualizable, se recomienda que se busque el vino en el sistema (por nombre?)
            Vino vinoActualizable = vinosActualizables.get(i);

            vinoActual.setPrecioARS(vinoActualizable.getPrecioARS());
            vinoActual.setImagenEtiqueta(vinoActualizable.getImagenEtiqueta());
            vinoActual.setNotaDeCataBodega(vinoActualizable.getNotaDeCataBodega());
        }
    }

    // public void actualizarDatosDeVinos(){
    //     for(Vino vino : this.vinosActualizables){
    //         /*vino.setPrecioARS();
    //         vino.setImagenEtiqueta();
    //         vino.setNotaDeCataBodega();*/

    //         //falta la logica
    //     }

    // }

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

    public void buscarSeguidores(List<Enofilo> enofilosSistema, Bodega bodega){
        List<String> auxEnofilos = new ArrayList<>(0);
        for(Enofilo enofilo : enofilosSistema){
            if(enofilo.seguisBodega(bodega)) auxEnofilos.add(enofilo.getUsuario().getNombre());
        }
        setUsuarios(auxEnofilos);
    }

    public void finDelCU(){
        
    }
}
