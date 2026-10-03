package clase3.EjerciciosPropuestos.Ejercicio24;

import java.util.Scanner;

public class Ejecutar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] meses = {
            "Enero", "Febrero", "Marzo", "Abril",
            "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        Cosechas[] cosechas = new Cosechas[12];

        for (int i = 0; i < cosechas.length; i++) {

            System.out.print("Digite las toneladas cosechadas en "
                    + meses[i] + ": ");

            double toneladas = sc.nextDouble();

            cosechas[i] = new Cosechas(meses[i], toneladas);
        }

        OperacionesCosecha operaciones = new OperacionesCosecha();

        double promedio = operaciones.calcularPromedio(cosechas);

        int mesesSuperiores = operaciones.contarMesesSuperiores(cosechas, promedio);

        int mesesInferiores = operaciones.contarMesesInferiores(cosechas, promedio);

        Cosechas mayor = operaciones.buscarMayorCosecha(cosechas);

        System.out.println("Promedio anual: " + promedio);
        System.out.println("Meses superiores al promedio: " + mesesSuperiores);
        System.out.println("Meses inferiores al promedio: " + mesesInferiores);
        System.out.println("Mes con mayor cosecha: " + mayor.getMes());
        System.out.println("Toneladas producidas: " + mayor.getToneladas());
    }

}
