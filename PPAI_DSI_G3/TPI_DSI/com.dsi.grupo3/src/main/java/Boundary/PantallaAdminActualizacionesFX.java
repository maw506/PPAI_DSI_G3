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

public class PantallaAdminActualizacionesFX extends Application {

    private GestorActualizaciones gestor;

    private List<String> bodegasNombre;

    @Override
    public void init() {

        Bodega bodega = new Bodega(123, "Descripción", "Historia", "Nombre", 2, LocalDate.of(2024,3,29)); // La última actualización fue hace 3 meses y el período es de 2 meses
        TipoUva tipoDeUva = new TipoUva("Descripción TipoDeUva", "Nombre TipoDeUva");
        Varietal varietal = new Varietal("Descripción Varietal", 75.5, tipoDeUva);
        Vino vino = new Vino(2021, bodega, "imagen_etiqueta.jpg", "Nombre del Vino", "Nota de cata de la bodega", 1500.0, varietal, null);
        Maridaje maridaje = new Maridaje("Descripción Maridaje", "Nombre Maridaje");
        List<Bodega> bodegasList = new ArrayList<>();
        bodegasList.add(bodega);

    }

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Importar Actualizacion de vinos de Bodega");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                habilitarPantalla();
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

    public void habilitarPantalla(){
        Bodega bodega = new Bodega(123, "Descripción", "Historia", "Nombre", 2,  LocalDate.of(2024,3,29));
        ArrayList<Bodega> bodegasDelSist = new ArrayList<>();
        bodegasDelSist.add(bodega);

        List<String> bodegasNombre = new ArrayList<>();
        bodegasNombre.add("Bodega internacional");
        bodegasNombre.add("Bodega nacional");

        if(bodega.hayActualizaciones(LocalDate.now())){
            System.out.println("Hay actualizaciones");


            mostrarBodega(bodegasNombre);
        }
        else{
            System.out.println("No hay actualizaciones");
        }

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

