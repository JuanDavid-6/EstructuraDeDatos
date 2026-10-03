import java.util.Arrays;

public class Ejecutar {
    public static void main(String[] args) {
        int[] datos = {12, 7, 23, 44, 8, 19, 30, 15, 2, 91};

        // Instancia del objeto
        SeparadorParesImpares separador = new SeparadorParesImpares(datos);

        System.out.println("Arreglo Original: " + Arrays.toString(datos));
        System.out.println("Arreglo de Pares: " + separador.obtenerPares());
        System.out.println("Arreglo de Impares: " + separador.obtenerImpares());
    }
}
