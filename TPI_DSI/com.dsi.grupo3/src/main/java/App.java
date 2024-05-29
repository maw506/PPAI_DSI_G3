import Boundary.PantallaAdminActualizaciones;
import Boundary.PantallaAdminActualizacionesFX;
import Control.GestorActualizaciones;
import Entidades.*;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        PantallaAdminActualizaciones pantallaAdminActualizaciones = new PantallaAdminActualizaciones();
        GestorActualizaciones control = new GestorActualizaciones();

        TipoUva tipoUva = new TipoUva("violeta", "uva violeta");

        Bodega bodega1 = new Bodega(123456, "Una bodega con una gran selección de vinos internacionales.",
                "Fundada en 1990, esta bodega ha sido un punto de referencia para los amantes del vino.",
                "Bodega Internacional",
                2,
                LocalDate.of(2024,3,3));
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


        List<Bodega> seguidoBodegas = new ArrayList<>();
        seguidoBodegas.add(bodega1);
        //creo las bodegas que sigue

        Siguiendo seguido = new Siguiendo(seguidoBodegas, null, "24-04-04", "24-04-04");
        ArrayList<Siguiendo> seguidos = new ArrayList<>();
        seguidos.add(seguido);

        Enofilo enofilo = new Enofilo(null, seguidos, "Maxi", "Martinez", "img.png");
        List<Enofilo> enofilosDelSistema = new ArrayList<>();
        enofilosDelSistema.add(enofilo);

        //Arranca el CU
        System.out.println();
        //falta el metodo opcionImportarVinosDeBodega de la clase pantalla
        pantallaAdminActualizaciones.habilitarPantalla();

        Boolean flag = control.opcionImportarActDeVinoDeBodega(bodegasSist,LocalDate.now()); //
        if(flag){ //aca deberian ir todas las llamadas al gestor y a la pantalla
            System.out.println("Hay actualizaciones!!!!");
            System.out.println("\nCargando las bodegas ccon actualizaciones...");
            //la pantalla muestra las bodegas pero solo los nombres
            pantallaAdminActualizaciones.mostrarBodega(control.getBodegas());
            System.out.println("\n");
            //aca hay que ingresar el nombre de la bodega tal cual aparece porque si no no funciona
            control.solicitarSeleccionBodegas(pantallaAdminActualizaciones, bodegasSist); //dentro de este metodo esta el paso 5 que busca las actualizaciones
            System.out.println("\n");
            //esto es a modo de comprobacion para ver si funcionaba el metodo
            System.out.println(control.getVinosImportados().stream().toList());
            //falta que el sistema actualice los vinos y la pantalla los muestre



        }
        else{ //esto podria ser el flujo alternativo
            System.out.println("No hay actualizaciones");
        }


    }
}
