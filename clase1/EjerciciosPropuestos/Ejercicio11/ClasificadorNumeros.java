package clase1.EjerciciosPropuestos.Ejercicio11;

public class ClasificadorNumeros {
    private int[] arregloInicial;

    public ClasificadorNumeros(int[] arregloInicial) {
        this.arregloInicial = arregloInicial;
    }

    public int[] obtenerNegativos() {
        int cont = 0;
        for (int num : arregloInicial) if (num < 0) cont++;

        int[] negativos = new int[cont];
        int idx = 0;
        for (int num : arregloInicial) {
            if (num < 0) negativos[idx++] = num;
        }
        return negativos;
    }

    public int[] obtenerCeros() {
        int cont = 0;
        for (int num : arregloInicial) if (num == 0) cont++;

        int[] ceros = new int[cont];
        int idx = 0;
        for (int num : arregloInicial) {
            if (num == 0) ceros[idx++] = num;
        }
        return ceros;
    }

    public int[] obtenerPositivos() {
        int cont = 0;
        for (int num : arregloInicial) if (num > 0) cont++;

        int[] positivos = new int[cont];
        int idx = 0;
        for (int num : arregloInicial) {
            if (num > 0) positivos[idx++] = num;
        }
        return positivos;
    }
}