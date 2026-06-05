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
}
