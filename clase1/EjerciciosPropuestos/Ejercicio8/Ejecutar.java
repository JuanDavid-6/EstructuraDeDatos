package clase1.EjerciciosPropuestos.Ejercicio8;
import java.util.Arrays;

public class Ejecutar {
    public static void main(String[] args) {
        AnalizadorAleatorios analizador = new AnalizadorAleatorios(30);

        int mayor = analizador.obtenerMayor();
        int menor = analizador.obtenerMenor();

        System.out.println("Números generados: " + Arrays.toString(analizador.getNumeros()));
        System.out.println("Número mayor: " + mayor + " (se repite " + analizador.contarRepeticiones(mayor) + " veces)");
        System.out.println("Número menor: " + menor + " (se repite " + analizador.contarRepeticiones(menor) + " veces)");
    }
}
