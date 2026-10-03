package clase1.EjerciciosPropuestos.Ejercicio11;

import java.util.Arrays;

public class Ejecutar {
    public static void main(String[] args) {
        int[] datos = {-5, 12, 0, -3, 8, 0, 15, -1, 4};

        ClasificadorNumeros clasificador = new ClasificadorNumeros(datos);

        System.out.println("Arreglo Inicial: " + Arrays.toString(datos));
        System.out.println("Negativos: " + Arrays.toString(clasificador.obtenerNegativos()));
        System.out.println("Ceros: " + Arrays.toString(clasificador.obtenerCeros()));
        System.out.println("Positivos: " + Arrays.toString(clasificador.obtenerPositivos()));
    }
}
