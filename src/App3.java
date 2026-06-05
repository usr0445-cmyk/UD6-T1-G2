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



        }
        
     









    }
}
