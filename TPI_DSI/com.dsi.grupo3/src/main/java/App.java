import Boundary.InterfazSistemaDeBodegas;
import Control.GestorActualizaciones;
import Entidades.*;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        TipoUva tipoUva = new TipoUva("violeta", "uva violeta");

        Varietal varietal =  new Varietal("varietal", 12.5f, tipoUva);
        Maridaje maridaje = new Maridaje();

        Vino vino = new Vino(2015, "imagen.jpg", "Balbo", "es rico con pritty",
                1500.50, varietal, maridaje);

        System.out.println();
        System.out.println(vino.toString() );

        GestorActualizaciones control = new GestorActualizaciones();


        Vino nuevo = control.crearVino();

        System.out.println("\n\nEn esta parte el control crea un nuevo vino");
        System.out.println(nuevo.toString());

        System.out.println("\n En esta parte pruebo el metodo de la interfaz bodegas");
        InterfazSistemaDeBodegas interfazSistemaDeBodegas = new InterfazSistemaDeBodegas();

        ArrayList<Bodega> bodegasActualizadas = interfazSistemaDeBodegas.buscarActualizaciones();
        for(Bodega b: bodegasActualizadas){
            System.out.println(b.getNombre().toString());
        }

    }
}
