package clase3.EjerciciosPropuestos.Ejercicio24;

public class OperacionesCosecha {
    
    public double calcularPromedio(Cosechas[] cosechas) {

        double suma = 0;

        for (int i = 0; i < cosechas.length; i++) {
            suma += cosechas[i].getToneladas();
        }

        return suma / cosechas.length;
    }

    public int contarMesesSuperiores(Cosechas[] cosechas, double promedio) {

        int contador = 0;

        for (int i = 0; i < cosechas.length; i++) {

            if (cosechas[i].getToneladas() > promedio) {
                contador++;
            }
        }

        return contador;
    }

    public int contarMesesInferiores(Cosechas[] cosechas, double promedio) {

        int contador = 0;

        for (int i = 0; i < cosechas.length; i++) {

            if (cosechas[i].getToneladas() < promedio) {
                contador++;
            }
        }

        return contador;
    }

    public Cosechas buscarMayorCosecha(Cosechas[] cosechas) {

        Cosechas mayor = cosechas[0];

        for (int i = 1; i < cosechas.length; i++) {

            if (cosechas[i].getToneladas() > mayor.getToneladas()) {
                mayor = cosechas[i];
            }
        }

        return mayor;
    }
    
}
