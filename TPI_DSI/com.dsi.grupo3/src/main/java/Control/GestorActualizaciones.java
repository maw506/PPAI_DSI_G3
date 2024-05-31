package Control;

import Boundary.InterfazSistemaDeBodegas;
import Boundary.InterfazDetActualizaciones;
import Boundary.InterfazActualizarBodegas;
import Boundary.PantallaAdminActualizaciones;
import Entidades.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GestorActualizaciones {
    String bodegasJson = "src/main/java/util/bodegas.json";
    Gson gson = new Gson();
    List<Bodega> bodegas = Arrays.asList(gson.fromJson(bodegasJson, Bodega.class));

    private Bodega bodegaSeleccionada;

    private List<Bodega> bodegasSeleccionadas;
    
    private Vino vino;

    private List<Vino> vinosImportados;

    private List<Vino> vinosActualizables;

    private List<String> usuarios;

    private Varietal varietal;

    private TipoUva tipoUva;

    private Maridaje maridaje;

    public void importarActVino() {
        // Crea una lista de las bodegas que tienen actualizaciones
        LocalDate fechaActual = LocalDate.now();
        ArrayList<String> bodegasConAct = new ArrayList<>();
        for(Bodega b: bodegas){
            if(b.hayActualizaciones(fechaActual)){
                bodegasConAct.add(b.getNombre());
            }
        }
        if (!bodegasConAct.isEmpty()) {
            new InterfazActualizarBodegas(this, bodegasConAct);
        } else {
            System.out.println("No hay actualizaciones disponibles en ninguna bodega.");
        }
    }


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
                // setBodegas(buscadas);
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

    public void tomarSeleccionBodegas(List<String> nombresBodegas){
        // v2 - InterfazActualizarBodegas envía un listado con las bodegas a actualizar al gestor
        // gestor recorre el listado y para cada bodega compara contra las existentes en el sistema
        // si la bodega existe en el sistema, el gestor busca la informacion de los vinos y los manda a InterfazDetActualizaciones
        List<Vino> vinosAux = new ArrayList<>(0);
        for(String nombreBodega: nombresBodegas){
            for(Bodega b: bodegas){
                if(b.getNombre().equals(nombreBodega)){
                    vinosAux = InterfazSistemaDeBodegas.buscarActualizaciones(b);
                    new InterfazDetActualizaciones(vinosAux);
                }
            }
        }
        
    }

    public void confirmarActualizacion(){
        // TODO - finalizar con la creación/modicicacion de los vinos
    }

    public void cancelarActualizacion(){
        // El cancelar actualizacion no hace nada, simplemente retorna para que continue con la siguiente bodega de la lsita de bodegas seleccionadas
        return;
    }

    public void buscarActualizaciones(){
        List<Vino> vinosAux;
        vinosAux = InterfazSistemaDeBodegas.buscarActualizaciones(this.bodegaSeleccionada); //el segundo es el metodo de interfaz sist de bodegas
        setVinosImportados(vinosAux);
    }

    public void determinarVinosActualizar(){
        List<Vino> vinosAux = new ArrayList<>(0);
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
