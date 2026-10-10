package clase5;

import java.util.*;

public class Pila {
    public static void main(String[] args) {

        // Creacion de la pila de Enteros
        Stack<Integer> pila = new Stack<Integer>();

        // Validar si la Pila esta Vacia
        System.out.println(pila.empty());

        // Agregar elemetos a la pila
        pila.push(5);
        pila.push(8);
        pila.push(10);
        pila.push(2);
        pila.push(20);
        pila.push(15);
        pila.push(1);

        // Imprimir la pila
        System.out.println(pila);

        // Mostrar el Tope de la pila sin mover el elemento
        System.out.println("Tope de la Pila: " + pila.peek());

        //Buscar un elemento dentro de la pila
        System.out.println("Pos: "+ pila.search(10));

        // Eliminar dos elementos de la pila
        pila.pop(); //1
        pila.pop(); //15

        //Imprimir la pila
        System.out.println(pila);

        // Obtener el tamaño de la pila
        System.out.println("Tamaño de la pila: " + pila.size());

    }
}
