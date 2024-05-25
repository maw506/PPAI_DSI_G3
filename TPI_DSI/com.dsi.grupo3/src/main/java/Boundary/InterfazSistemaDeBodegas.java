package Boundary;

import Entidades.Bodega;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class InterfazSistemaDeBodegas {

    private List<Bodega> bodegasConActualizaciones;

    public ArrayList<Bodega> buscarActualizaciones(){
        Gson gson = new Gson();
        try(InputStream inputStream = getClass().getClassLoader().getResourceAsStream("bodegasConActualizaciones.json");
            InputStreamReader fileReader = new InputStreamReader(inputStream)) {

            JsonObject jsonObject = gson.fromJson(fileReader, JsonObject.class);
            JsonArray bodegasArray = jsonObject.getAsJsonArray("bodegas");

            Type listType = new TypeToken<List<Bodega>>() {}.getType();
            ArrayList<Bodega> bodegas = gson.fromJson(bodegasArray, listType);
            return bodegas;
        }catch (IOException e ){
            e.toString();
            return null;

        }
    }

    public void setBodegasConActualizaciones(ArrayList<Bodega> bodegasConActualizaciones) {
        this.bodegasConActualizaciones = bodegasConActualizaciones;
    }
}
