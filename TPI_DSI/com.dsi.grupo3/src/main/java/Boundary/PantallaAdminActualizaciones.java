package Boundary;

import Control.GestorActualizaciones;
import Entidades.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PantallaAdminActualizaciones extends Application {

    private GestorActualizaciones gestor;

    @Override
    public void init() {
        // Crear una instancia de GestorActualizaciones
        gestor = new GestorActualizaciones();

        // Configurar el gestor con algunos valores iniciales
        Bodega bodega = new Bodega(123, "Descripción", "Historia", "Nombre", 2, LocalDate.of(2024,3,29)); // La última actualización fue hace 3 meses y el período es de 2 meses
        TipoUva tipoDeUva = new TipoUva("Descripción TipoDeUva", "Nombre TipoDeUva");
        Varietal varietal = new Varietal("Descripción Varietal", 75.5, tipoDeUva);
        Vino vino = new Vino(2021, bodega, "imagen_etiqueta.jpg", "Nombre del Vino", "Nota de cata de la bodega", 1500.0, varietal, null);
        Maridaje maridaje = new Maridaje("Descripción Maridaje", "Nombre Maridaje");

    }

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Importar Actualizacion de vinos de Bodega");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Llamar a algunos métodos de GestorActualizaciones
                Bodega bodega = new Bodega(123, "Descripción", "Historia", "Nombre", 2,  LocalDate.of(2024,3,29));
                List<Bodega> bodegasDelSist = new ArrayList<>();
                bodegasDelSist.add(bodega);

                List<String> bodegasNombre = new ArrayList<>(); //cree una lista de strings solo para probar el metodo, aca deberia funcionar el metodo del gestor que hace toda la logica de conseguir los nombres de bodegas
                bodegasNombre.add("Bodega internacional");     //con actualizaciones disponibles
                bodegasNombre.add("Bodega nacional");


                /*// Imprimir las clases instanciadas en la consola
                System.out.println("Clases Instanciadas:");
                System.out.println("Bodega Seleccionada: " + gestor.getBodegaSeleccionada());
                System.out.println("Vino: " + gestor.getVino());
                System.out.println("Tipo de Uva: " + gestor.getTipoUva());
                System.out.println("Maridaje: " + gestor.getMaridaje());
                System.out.println("Varietal: " + gestor.getVarietal());*/

                if(bodega.hayActualizaciones(LocalDate.now())){  //uso el metodo de la bodega creada mas arriba, pero de vuelta, esto lo deberia hacer el gestor, es a modo de prueba
                    System.out.println("Hay actualizaciones");
                    mostrarBodega(bodegasNombre);
                    //despues de este metodo hay que usar el metodo tomarSeleccionDeBodega que sera un String que luego el gestor lo convierte a un objeto
                    //tomarSeleccionBodega() "por ejemplo"


                }
                else{
                    System.out.println("No hay actualizaciones");
                    //aca si fuera el caso, deberia hacer uso del metodo del gestor FinCU(), pero todavia no se bien cual seria la logica de ese metodo para que detenga toda la app
                }

            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Pantalla Administrativa de Actualizaciones");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void opcionImportarActDeVinosDeBodega(){

    }

    public void mostrarBodega(List<String> nombresBodegas){
        for(String bodega: nombresBodegas){
            System.out.println(bodega.toString());
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}

