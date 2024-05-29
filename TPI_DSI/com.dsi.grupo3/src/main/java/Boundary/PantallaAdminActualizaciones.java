package Boundary;

import Entidades.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class PantallaAdminActualizaciones extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Mostrar Clases Instanciadas");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Crear instancias de las clases necesarias
                Bodega bodega = new Bodega(123, "Descripción", "Historia", "Nombre", null, null); // agregue como null la fecha de la ultima actualizacion
                TipoUva tipoDeUva = new TipoUva("Descripción TipoDeUva", "Nombre TipoDeUva");
                Varietal varietal = new Varietal("Descripción Varietal", 75.5, tipoDeUva);
                Vino vino = new Vino(2021, bodega, "imagen_etiqueta.jpg", "Nombre del Vino", "Nota de cata de la bodega", 1500.0, varietal, null);
                Usuario usuario = new Usuario();
                // Enofilo enofilo = new Enofilo(usuario, "Nombre", "Apellido", "imagen_perfil.jpg");
                Maridaje maridaje = new Maridaje("Descripción Maridaje", "Nombre Maridaje");

                // Imprimir las clases instanciadas en la consola
                System.out.println("Clases Instanciadas:");
                System.out.println("Bodega: " + bodega);
                System.out.println("Vino: " + vino);
                //System.out.println("Enófilo: " + enofilo);
                System.out.println("Tipo de Uva: " + tipoDeUva);
                System.out.println("Maridaje: " + maridaje);
                System.out.println("Varietal: " + varietal);
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Pantalla Administrativa de Actualizaciones");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
