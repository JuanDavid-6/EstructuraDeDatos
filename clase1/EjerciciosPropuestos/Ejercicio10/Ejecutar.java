package clase1.EjerciciosPropuestos.Ejercicio10;

import java.util.Arrays;

public class Ejecutar {
    public static void main(String[] args) {
        int[] datosEjemplo = {8, 5, 3, 10, 2, 8, 1};

        SumaOpuestos opuestos = new SumaOpuestos(datosEjemplo);
        int[] resultado = opuestos.calcularSumaOpuestos();

        System.out.println("Arreglo A: " + Arrays.toString(datosEjemplo));
        System.out.println("Arreglo B: " + Arrays.toString(resultado));
    }
}
