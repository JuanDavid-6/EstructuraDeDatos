import java.util.ArrayList;
import java.util.List;

public class SeparadorParesImpares {
    private int[] arregloA;

    public SeparadorParesImpares(int[] arregloA) {
        this.arregloA = arregloA;
    }

    public List<Integer> obtenerPares() {
        List<Integer> pares = new ArrayList<>();
        for (int num : arregloA) {
            if (num % 2 == 0) {
                pares.add(num);
            }
        }
        return pares;
    }

    public List<Integer> obtenerImpares() {
        List<Integer> impares = new ArrayList<>();
        for (int num : arregloA) {
            if (num % 2 != 0) {
                impares.add(num);
            }
        }
        return impares;
    }
}
