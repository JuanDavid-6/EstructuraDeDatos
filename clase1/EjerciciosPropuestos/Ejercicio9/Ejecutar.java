package clase1.EjerciciosPropuestos.Ejercicio9;

public class Ejecutar {
    public static void main(String[] args) {
        int[] datos = {4, 2, 8, 4, 5, 4, 9, 1, 4, 3};
        int numeroBuscado = 4;

        BuscadorFrecuencia buscador = new BuscadorFrecuencia(datos);
        int total = buscador.contarOcurrencias(numeroBuscado);

        System.out.println("El número " + numeroBuscado + " se encuentra " + total + " veces en el arreglo.");
    }
}
