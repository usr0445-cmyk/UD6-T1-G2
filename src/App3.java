// Files permite leer y escribir ficheros usando metodos simples
import java.nio.file.Files;
//Path representa la ruta del fichero
import java.nio.file.Path;
import java.util.ArrayList;

//List se usa para almacenar las líneas del CSV 
import java.util.List;
import net.salesianoslacuesta.Pelicula.*;


public class App3 {
    public static void main(String[] args) {

        ArrayList<pelicula> lista = new ArrayList<>();

        try {
            //Leemos todas las lineas del CSV
            List<String> lineas = Files.readAllLines(Path.of("data/peliculas.csv"));

            //Ignoramos la primera linea
            for (int i = 1; i < lineas.size(); i++) {
                String linea = lineas.get(i);

                int coma1 = linea.indexOf(",");
                int coma2 = linea.indexOf(",");

                pelicula pelicula = new Pelicula(linea);
                lista.add(pelicula);
                
            }

        } catch (Exception e) {
            // getMessage devuelve el mensaje de error que explica que ha fallado
            System.out.println("Error al leer el fichero " + e.getMessage());
        }

        System.out.println("Peliculas leidas: ");
        for (pelicula pelicula : lista) {
            System.out.println(pelicula);
        }

        try {
            String contenido = "Número total de películas: " + lista.size() + "\n";

            //writeString escribe el texto en un fichero, y si el fichero no existe lo crea en este caso
            Files.writeString(Path.of("resumen_peliculas.txt"), contenido);

        } catch (Exception e) {
            System.out.println("Error al escribir resumen: " + e.getMessage());
        }

        try {
            String log = "Ejecución realizada correctamente.";
            Files.writeString(
                //APPEND añade el texto al final del fichero sin borrar lo anterior
                Path.of("log_peliculas.txt"), log, java.nio.file.StandardOpenOption.APPEND );
        

    //Mostramos el mensaje del error si falla la escritura del log
    } catch (Exception e) {
        System.out.println("Error al escribir log: " + e.getMessage());
    }

    System.out.println("Proceso completado");
}
}
