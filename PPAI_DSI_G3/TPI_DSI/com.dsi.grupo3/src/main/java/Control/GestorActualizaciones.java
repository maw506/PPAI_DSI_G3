package Control;

import Boundary.InterfazSistemaDeBodegas;
import Boundary.PantallaAdminActualizaciones;
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


    public boolean opcionImportarActDeVinoDeBodega(ArrayList<Bodega> bodega, LocalDate fechaActual){
        // busca las bodegas del sistema con actualizaciones
        buscarBodegasConActualizaciones(bodega, fechaActual);
        if(!bodegas.isEmpty()){
            return true;
        }
        return false;
    }
    //ver logica del metodo

    public void buscarBodegasConActualizaciones(ArrayList<Bodega> bodegas, LocalDate fechaActual){ // Esto no sería mejor como guardar bodegas con actualizaciones?
        //busca entre las bodegas existentes en el sistema
        ArrayList<String> buscadas = new ArrayList<>();
        for(Bodega b: bodegas){
            if(b.hayActualizaciones(fechaActual)){
                buscadas.add(b.getNombre());
                setBodegas(buscadas);
            }
        }
    }

    public void solicitarSeleccionBodegas(PantallaAdminActualizaciones pantalla, List<Bodega> bodegasDelSist){
        pantalla.solicitarSeleccionBodegas();
        tomarSeleccionBodega(pantalla.getBodegaSeleccionada(), bodegasDelSist);
    }

    public void tomarSeleccionBodega(String nombreBodega, List<Bodega> bodegasDelSist){ // nombreBodega es ingresado por el usuario para buscar entre las Bodegas existentes
        for(Bodega bodega: bodegasDelSist){
            if(bodega.getNombre().equals(nombreBodega)){
                setBodegaSeleccionada(bodega);
            }
        }

        buscarActualizaciones();
    }

    public void buscarActualizaciones(){
        List<Vino> vinosAux;
        vinosAux = InterfazSistemaDeBodegas.buscarActualizaciones(this.bodegaSeleccionada); //el segundo es el metodo de interfaz sist de bodegas
        setVinosImportados(vinosAux);
    }


    public void determinarVinosActualizar(){
        List<Vino> vinosAux =new ArrayList<>(0);
        for(Vino vino: vinosImportados){
            if(bodegaSeleccionada.tenesEsteVino(vino)) vinosAux.add(vino);
        }
        setVinosActualizables(vinosAux);
    }

    public String actualizarDatosDeVino(List<Vino> vinosSistema) {
        String mensaje = bodegaSeleccionada.actualizarDatosDeVino(vinosSistema, vinosActualizables);
        return mensaje;

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
        System.exit(0);
    }
}
