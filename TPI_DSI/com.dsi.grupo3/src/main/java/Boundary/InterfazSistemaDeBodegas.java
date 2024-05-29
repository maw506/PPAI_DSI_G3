package Boundary;

import Entidades.Bodega;
import Entidades.Vino;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
public class InterfazSistemaDeBodegas {

    private List<Vino> vinosActualizaciones;

    //esto debe devolver Vinos y no Bodegas

    public static List<Vino> buscarActualizaciones(Bodega bodega) {
        Gson gson = new Gson();
        try (InputStream inputStream = InterfazSistemaDeBodegas.class.getClassLoader().getResourceAsStream("vinosActualizables.json");
             InputStreamReader fileReader = new InputStreamReader(inputStream)) {

            // Leer el array de vinos directamente desde el JSON
            Type listType = new TypeToken<List<Vino>>() {
            }.getType();
            List<Vino> vinos = gson.fromJson(fileReader, listType);

            // Filtrar los vinos por el nombre de la bodega
            return vinos.stream()
                    .filter(vino -> vino.getBodega().getNombre().equals(bodega.getNombre())) // Quitar porque un vino tiene solo una bodega
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


}
