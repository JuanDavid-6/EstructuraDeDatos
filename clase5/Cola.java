package clase5;
import java.util.*;

public class Cola {

    public static void main(String[] args) {

        // Creacion de la cola
        Queue<String> cola = new LinkedList<>();

        // Agregar elementos a la cola
        cola.add("Predro");
        cola.add("Juan");
        cola.add("Maria");
        cola.offer("Miguel");
        cola.offer("Daniel");

        // Mostrar los elementos de la cola
        System.out.println(cola);

        // Mostrar quien esta en la cabeza de la cola
        System.out.println(cola.peek()); // Pedro
        System.out.println(cola.element()); // Pedro

        // Eliminar dos elementos de la cola
        cola.remove();  // Mostrar los elementos eliminados: System.out.println(cola.remove());
        cola.poll();  // Mostrar los elementos eliminados: System.out.println(cola.poll());

        //Mostrar los elementos de la cola
        System.out.println(cola);

        // Validar si la cola esta vacia
        System.out.println(cola.isEmpty()); // false

        // Validar si un elemento esta dentro de la cola
        System.out.println(cola.contains("Miguel")); // True
        System.out.println(cola.contains("pedro")); // false

        String cad = "Hola";

        System.out.println(cad.toUpperCase()); // HOLA
        System.out.println(cad.toLowerCase()); // hola








    }
}
