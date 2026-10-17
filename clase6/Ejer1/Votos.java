package clase6.Ejer1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Votos {

    public static void main(String[] args) {
        Scanner index = new Scanner(System.in);
        Queue<Integer> cola = new LinkedList<>();
        
        System.out.println("Digite los votos a favor: ");
        int votosAFavor = index.nextInt();

        System.out.println("Digite los votos en contra: ");
        int votosEnContra = index.nextInt();

        for (int i = 0; i < votosAFavor; i++) {
            cola.add(1);

        }

        for (int i = 0; i < votosEnContra; i++) {
                cola.add(-1);
            }

        int resultado = 0;

        while (!cola.isEmpty()) {
                resultado += cola.poll();
            }

            System.out.println("Diferencia de los votos: " + resultado);

        index.close(); 
    } 
}
