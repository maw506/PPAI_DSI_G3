package Control;

import Boundary.InterfazActVino;
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
    String vinosJson = "src/main/java/util/vinos.json";
    String enofilosJson = "src/main/java/util/enofilos.json";
    String usuariosJson = "src/main/java/util/usuarios.json";
    String varietalsJson = "src/main/java/util/varietals.json";
    String tipoUvasJson = "src/main/java/util/tipoUvas.json";
    String maridajesJson = "src/main/java/util/maridajes.json";

    Gson gson = new Gson();
    List<Bodega> bodegas = Arrays.asList(gson.fromJson(bodegasJson, Bodega.class));
    List<Vino> vinos = Arrays.asList(gson.fromJson(vinosJson, Vino.class));
    List<Enofilo> enofilos = Arrays.asList(gson.fromJson(enofilosJson, Enofilo.class));
    List<Usuario> usuarios = Arrays.asList(gson.fromJson(usuariosJson, Usuario.class));
    List<Varietal> varietals = Arrays.asList(gson.fromJson(varietalsJson, Varietal.class));
    List<TipoUva> tiposUva = Arrays.asList(gson.fromJson(tipoUvasJson, TipoUva.class));
    List<Maridaje> maridajes = Arrays.asList(gson.fromJson(maridajesJson, Maridaje.class));

    private InterfazActVino interfaz;

    private List<Bodega> bodegasSeleccionadas;
    
    private List<Vino> vinosImportados;

    private List<Vino> vinosActualizables;

    private Varietal varietal;

    private TipoUva tipoUva;

    private Maridaje maridaje;

    public void importarActualizacionesVino() {
        // Crea una lista de las bodegas que tienen actualizaciones
        LocalDate fechaActual = LocalDate.now();
        ArrayList<String> bodegasConAct = new ArrayList<>();
        for(Bodega b: bodegas){
            if(b.hayActualizaciones(fechaActual)){
                bodegasConAct.add(b.getNombre());
            }
        }
        if (!bodegasConAct.isEmpty()) {
            interfaz.InterfazMostrarBodegas(bodegasConAct);
        } else {
            System.out.println("No hay actualizaciones disponibles en ninguna bodega.");
        }
    }

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

    public void tomarSeleccionBodegas(List<String> nombresBodegas){
        // v2 - InterfazActualizarBodegas envía un listado con las bodegas a actualizar al gestor
        // gestor recorre el listado y para cada bodega compara contra las existentes en el sistema
        // si la bodega existe en el sistema, el gestor busca la informacion de los vinos y los manda a InterfazDetActualizaciones
        for(String nombreBodega: nombresBodegas){
            for(Bodega b: bodegas){
                if(b.getNombre().equals(nombreBodega)){
                    buscarActualizaciones(nombreBodega);
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

    public void buscarActualizaciones(String nombreBodega){
        List<Vino> vinosAux = new ArrayList<>(0);
        for(Vino v: vinos){
            if (v.bodega.equals(nombreBodega)){
                vinosAux.add(v);
            }
        }
        interfaz.mostrarActualizaciones(vinosAux);
    }

    // public void determinarVinosActualizar(){
    //     List<Vino> vinosAux = new ArrayList<>(0);
    //     for(Vino vino: vinosImportados){
    //         if(bodegaSeleccionada.tenesEsteVino(vino)) vinosAux.add(vino);
    //     }
    //     setVinosActualizables(vinosAux);
    // }

    // public String actualizarDatosDeVino(List<Vino> vinosSistema) {
    //     String mensaje = bodegaSeleccionada.actualizarDatosDeVino(vinosSistema, vinosActualizables);
    //     return mensaje;
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

    // public void buscarSeguidores(List<Enofilo> enofilosSistema, Bodega bodega){
    //     List<String> auxEnofilos = new ArrayList<>(0);
    //     for(Enofilo enofilo : enofilosSistema){
    //         if(enofilo.seguisBodega(bodega)) auxEnofilos.add(enofilo.getUsuario().getNombre());
    //     }
    //     setUsuarios(auxEnofilos);
    // }

    public void finDelCU(){
        System.exit(0);
    }
}
