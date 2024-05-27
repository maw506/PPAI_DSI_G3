import Boundary.InterfazSistemaDeBodegas;
import Control.GestorActualizaciones;
import Entidades.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static javafx.scene.input.KeyCode.T;

public class App {

    public static void main(String[] args) {

        TipoUva tipoUva = new TipoUva("violeta", "uva violeta");

        Bodega bodega1 = new Bodega(123456, "Una bodega con una gran selección de vinos internacionales.",
                "Fundada en 1990, esta bodega ha sido un punto de referencia para los amantes del vino.",
                "Bodega Internacional",
                "2024-05-25");
        Bodega bodega2 = new Bodega(654321,
                "Bodega local famosa por su vino tinto artesanal.",
                "Desde 1985, esta bodega ha producido vinos de alta calidad usando técnicas tradicionales.",
                "Bodega Artesanal",
                "2024-04-20");
        ArrayList<Bodega> bodegasSist = new ArrayList<>();
        bodegasSist.add(bodega1);
        bodegasSist.add(bodega2);

        Varietal varietal =  new Varietal("varietal", 12.5f, tipoUva);
        Maridaje maridaje = new Maridaje();

        GestorActualizaciones control = new GestorActualizaciones();


        System.out.println("En esta parte el gestor busca las bodegas con actualizaciones: \n");
        control.buscarBodegasConActualizaciones(bodegasSist, "2024-04-20");
        System.out.println(control.getBodegas().toString());

        Scanner sc = new Scanner(System.in);
        System.out.print("\n Seleccione la bodega a actualizar: ");
        String nombre = sc.nextLine();
        control.tomarSeleccionBodega(nombre, bodegasSist);
        System.out.println("La bodega que selecciono es:" +
                "\n" + control.getBodegaSeleccionada().toString());
        control.buscarActualizaciones();

        System.out.println("Mostramos los vinos a actualizar");
        System.out.println(control.getVinosActualizables().stream().toList());

    }
}
