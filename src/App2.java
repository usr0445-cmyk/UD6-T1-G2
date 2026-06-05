//Estos imports son necesarios para usar las clases HashSet y HashMap en el codigo
import java.util.HashSet;
import java.util.HashMap;
import net.salesianoslacuesta.Participante.*;

 public class App2 {
    public static void main(String[] args) {

 //Aqui usamos HashSet que es para almacenar objetos de tipo participante sin permitir duplicados, no se pueden agregar dos participantes con el mismo idJugador
    HashSet<participante> participantes = new HashSet<>();

    participante p1 = new participante("J001", "Adrian", "Junior");
    participante p2 = new participante("J002", "Paula", "Senior");
    participante p3 = new participante("J003", "Samuel", "Senior");
    participante p4 = new participante("J001", "Adrian repetido", "Senior");
    participante p5 = new participante("J004", "Claudia", "Senior");
    participante p6 = new participante("J005", "Diego", "Junior");
    participante p7 = new participante("J006", "Alba", "Experto");


    int intentos = 0;

    intentos++; participantes.add(p1);
    intentos++; participantes.add(p2);
    intentos++; participantes.add(p3);
    intentos++; participantes.add(p4); //Este participante no se agregará porque tiene el mismo idJugador que p1
    intentos++; participantes.add(p5);
    intentos++; participantes.add(p6);
    intentos++; participantes.add(p7);

    System.out.println("Participantes registrados:");
    for (participante participante : participantes) { //Usamos for para para recorrer el HashSet de participantes
        System.out.println(participante);
}
    //Los duplicados no se añaden porque HashSet usa equals() y hashCode para evitar elementos repetidos
    System.out.println("Intentos de añadir: " + intentos);
    System.out.println("Participantes reales: " + participantes.size());

    //Usamos HashMap que es para almacenar pares clave valor, en este caso la clave es la categoria y el valor es el numero de participantes
    HashMap<String, Integer> categorias = new HashMap<>();

   for (participante participante : participantes) {
    String categoria = participante.getCategoria();

   //Ponemos aqui un containsKey sirve para comprobar si esa categoria ya existe en el mapa y si existe, hacemos un put aumentando en 1
    if (categorias.containsKey(categoria)) {
        categorias.put(categoria, categorias.get(categorias) + 1);
        
    } else {
        categorias.put(categoria, 1);
   }
   
}
   System.out.println("Partcipantes por categoria: ");
   System.out.println(categorias);

   System.out.println("Junior: " + categorias.get("Junior"));

   System.out.println("¿Existe la categorias experto? " + categorias.containsKey("Experto"));

   categorias.remove("Experto");

   System.out.println("Categorias restantes: ");
   // keySet devuelve solo los nombres de las categorias 
   System.out.println(categorias.keySet());
}

}
