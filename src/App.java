import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import net.salesianoslacuesta.Pedido.*;

public class App {
    public static void main(String[] args) {

        Queue<pedido> cola = new LinkedList<>();

        cola.add(new pedido("P001", "Carla", "Cafe con leche", 1));
        cola.add(new pedido("P002", "Mario", "Té verde", 0));
        cola.add(new pedido("P003", "Nerea", "Zumo natural", 1));
        cola.add(new pedido("P004", "Ivan", "Tostada integral", 0));
        cola.add(new pedido("P005", "Laura", "Te verde", 1));

        
        System.out.println("Pedido pendientes:");
        for (pedido p: cola){
            System.out.println(p);
        }

        System.out.println("Primer pedido sin eliminar:");
        System.out.println(cola.peek());

        Stack<pedido> pilaPreparados = new Stack<>();

        System.out.println("Preparando 3 pedidos...");
        for ( int i = 0; i < 3; i++) {
            pedido preparado = cola.poll();
            pilaPreparados.push(preparado);

            System.out.println("Pedido preparado: " + preparado);
        }
    }

}
