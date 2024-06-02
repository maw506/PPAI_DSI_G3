import Boundary.InterfazActVino;
import Control.GestorActualizaciones;

public class App {

    public static void main(String[] args) {

        GestorActualizaciones control = new GestorActualizaciones();

        new InterfazActVino(control);
    }
}
