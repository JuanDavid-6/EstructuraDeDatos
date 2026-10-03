package clase1.EjerciciosPropuestos.Ejercicio10;

public class SumaOpuestos {
    private int[] arregloA;

    public SumaOpuestos(int[] arregloA) {
        this.arregloA = arregloA;
    }

    public int[] calcularSumaOpuestos() {
        int n = arregloA.length;
        int tamanoB = (n + 1) / 2;
        int[] arregloB = new int[tamanoB];

        for (int i = 0; i < tamanoB; i++) {
            int opuestoIndex = n - 1 - i;
            if (i == opuestoIndex) {
                arregloB[i] = arregloA[i]; // Elemento central
            } else {
                arregloB[i] = arregloA[i] + arregloA[opuestoIndex];
            }
        }
        return arregloB;
    }
}