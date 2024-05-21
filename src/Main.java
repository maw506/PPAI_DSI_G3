import com.BonVino.proyect.*;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Usuario
        Usuario usuario = new Usuario("nombreUsuario", "contraseña123", true);

        // Crear instancias de TipoDeUva y Maridaje
        TipoDeUva tipoDeUva = new TipoDeUva("Descripción TipoDeUva", "Nombre TipoDeUva");
        Maridaje maridaje = new Maridaje("Descripción Maridaje", "Nombre Maridaje");

        // Crear una instancia de Varietal asociándola con TipoDeUva
        Varietal varietal = new Varietal("Descripción Varietal", 75.5, tipoDeUva);

        // Crear una instancia de Vino asociándola con Varietal y Maridaje
        Vino vino = new Vino(2021, "imagen_etiqueta.jpg", "Nombre del Vino", "Nota de cata de la bodega", 1500.0, varietal, maridaje);

        // Imprimir los detalles del vino y sus relaciones en la consola
        System.out.println("Detalles del vino:");
        System.out.println("Añada: " + vino.getAñada());
        System.out.println("Nombre: " + vino.getNombre());
        System.out.println("Imagen de etiqueta: " + vino.getImagenEtiqueta());
        System.out.println("Nota de cata de la bodega: " + vino.getNotaDeCataBodega());
        System.out.println("Precio en ARS: " + vino.getPrecioARS());
        System.out.println("Variedad de uva: " + vino.getVarietal().getDescripcion());
        System.out.println("Porcentaje de composición: " + vino.getVarietal().getPorcentajeComposicion());
        System.out.println("Tipo de uva: " + vino.getVarietal().getTipoDeUva().getNombre());
        System.out.println("Descripción de maridaje: " + vino.getMaridaje().getDescripcion());
        System.out.println("Nombre de maridaje: " + vino.getMaridaje().getNombre());

        // Imprimir los detalles del usuario en la consola
        System.out.println("\nDetalles del usuario:");
        System.out.println("Nombre de usuario: " + usuario.getNombre());
        System.out.println("Contraseña: " + usuario.getContraseña());
        System.out.println("¿Es usuario premium? " + usuario.isPremium());
    }
}
