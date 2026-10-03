package clase1.EjerciciosPropuestos.Ejercicio8;
import java.util.Random;

public class AnalizadorAleatorios {
    private int[] numeros;

    public AnalizadorAleatorios(int cantidad) {
        this.numeros = new int[cantidad];
        generarAleatorios();
    }

    private void generarAleatorios() {
        Random rand = new Random();
        for (int i = 0; i < numeros.length; i++) {
            this.numeros[i] = rand.nextInt(50) + 1; // Números entre 1 y 50
        }
    }

    public int[] getNumeros() {
        return numeros;
    }

    public int obtenerMayor() {
        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        return mayor;
    }

    public int obtenerMenor() {
        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        return menor;
    }

    public int contarRepeticiones(int valor) {
        int contador = 0;
        for (int num : numeros) {
            if (num == valor) contador++;
        }
        return contador;
    }
}