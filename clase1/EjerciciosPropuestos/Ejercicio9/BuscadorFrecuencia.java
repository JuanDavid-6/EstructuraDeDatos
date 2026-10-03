package clase1.EjerciciosPropuestos.Ejercicio9;

public class BuscadorFrecuencia {
    private int[] arreglo;

    public BuscadorFrecuencia(int[] arreglo) {
        this.arreglo = arreglo;
    }

    public int contarOcurrencias(int numeroBuscado) {
        int contador = 0;
        for (int elemento : arreglo) {
            if (elemento == numeroBuscado) {
                contador++;
            }
        }
        return contador;
    }
}