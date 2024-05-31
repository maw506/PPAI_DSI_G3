import Boundary.InterfazBodega;
import Control.GestorActualizaciones;
import Entidades.*;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

public class App {
        String bodegasJson = "src/main/java/util/bodegas.json";
        Gson gson = new Gson();

        public static void main(String[] args) {

        GestorActualizaciones control = new GestorActualizaciones();

        ArrayList<Bodega> bodegasSist = new ArrayList<>();
        // bodegasSist.add(bodega1);
        // bodegasSist.add(bodega2);
        // bodegasSist.add(bodega4);


        List<Vino> vinosDelSist = new ArrayList<>();
        // vinosDelSist.add(vino1);

        List<Bodega> seguidoBodegas = new ArrayList<>();
        // seguidoBodegas.add(bodega1);
        //creo las bodegas que sigue

        Siguiendo seguido = new Siguiendo(seguidoBodegas, null, "24-04-04", "24-04-04");
        ArrayList<Siguiendo> seguidos = new ArrayList<>();
        seguidos.add(seguido);

        Enofilo enofilo = new Enofilo(null, seguidos, "Maxi", "Martinez", "img.png");
        List<Enofilo> enofilosDelSistema = new ArrayList<>();
        enofilosDelSistema.add(enofilo);

        new InterfazBodega(control);
    }
}
