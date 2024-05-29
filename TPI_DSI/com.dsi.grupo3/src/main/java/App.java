import Control.GestorActualizaciones;
import Entidades.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        TipoUva tipoUva = new TipoUva("violeta", "uva violeta");

        Bodega bodega1 = new Bodega(123456, "Una bodega con una gran selección de vinos internacionales.",
                "Fundada en 1990, esta bodega ha sido un punto de referencia para los amantes del vino.",
                "Bodega Internacional",
                2,
                LocalDate.of(2024,5,3));
        Bodega bodega2 = new Bodega(654321,
                "Bodega local famosa por su vino tinto artesanal.",
                "Desde 1985, esta bodega ha producido vinos de alta calidad usando técnicas tradicionales.",
                "Bodega Artesanal",
                3,
                LocalDate.of(2024,5,3));
        Bodega bodega3 = new Bodega(123456,
                "Bodega local famosa por su vino tinto artesanal.",
                "Desde 1985, esta bodega ha producido vinos de alta calidad usando técnicas tradicionales.",
                "Bodega Artesanal",
                2,
                LocalDate.of(2024,5,3));
        Bodega bodega4 = new Bodega(123456,
                "Bodega local famosa por su vino tinto artesanal.",
                "Desde 1985, esta bodega ha producido vinos de alta calidad usando técnicas tradicionales.",
                "Bodega Artesanal",
                5,
                LocalDate.of(2024,5,3));
        ArrayList<Bodega> bodegasSist = new ArrayList<>();
        bodegasSist.add(bodega1);
        bodegasSist.add(bodega2);

        Varietal varietal = new Varietal("varietal", 12.5f, tipoUva);
        Maridaje maridaje = new Maridaje();

        Vino vino1 = new Vino(1, bodega1, "favicon.ico", "Vino 1", "nota de cata", 12.5, varietal, maridaje);
        Vino vino2 = new Vino(2, bodega2, "favicon.ico", "Vino 2", "nota de cata", 12.5, varietal, maridaje);
        Vino vino3 = new Vino(3, bodega3, "favicon.ico", "Vino 3", "nota de cata", 12.5, varietal, maridaje);

        GestorActualizaciones control = new GestorActualizaciones();


        System.out.println("En esta parte el gestor busca las bodegas con actualizaciones: \n");
        control.buscarBodegasConActualizaciones(bodegasSist, LocalDate.now());
        System.out.println(control.getBodegas().toString());

        Scanner sc = new Scanner(System.in);
        System.out.print("\n Seleccione la bodega a actualizar: ");
        String nombre = sc.nextLine();
        control.tomarSeleccionBodega(nombre, bodegasSist);
        System.out.println("La bodega que selecciono es:" +
                "\n" + control.getBodegaSeleccionada().toString());
        control.buscarActualizaciones();

        System.out.println("Mostramos los vinos a actualizar");
        System.out.println(control.getVinosImportados().stream().toList());

        System.out.println("\nProbamos la parte de buscar a los seguidos de un enofilo");
        List<Bodega> seguidoBodegas = new ArrayList<>();
        seguidoBodegas.add(bodega1);
        //creo las bodegas que sigue

        Siguiendo seguido = new Siguiendo(seguidoBodegas, null, "24-04-04", "24-04-04");
        List<Siguiendo> seguidos = new ArrayList<>();
        seguidos.add(seguido);

        Enofilo enofilo = new Enofilo(null, seguidos, "Maxi", "Martinez", "img.png");
        List<Enofilo> enofilosDelSistema = new ArrayList<>();
        enofilosDelSistema.add(enofilo);

        //el gestor busca los que siguen a la bodega pasada por parametro
        control.buscarSeguidores(enofilosDelSistema, bodega1);

        System.out.println(control.getUsuarios().stream().toList());


    }
}
