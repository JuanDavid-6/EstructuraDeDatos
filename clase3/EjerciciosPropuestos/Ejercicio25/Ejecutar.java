package clase3.EjerciciosPropuestos.Ejercicio25;

import java.util.Scanner;

public class Ejecutar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] dias = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };

        Planta[] plantas = new Planta[20];

        for (int posicionPlanta = 0; posicionPlanta < plantas.length; posicionPlanta++) {
            plantas[posicionPlanta] = new Planta(posicionPlanta + 1);
            System.out.println("\nPlanta " + (posicionPlanta + 1));
            for (int posicionDia = 0; posicionDia < dias.length; posicionDia++) {
                System.out.print("Digite la producción del " + dias[posicionDia] + ": ");
                plantas[posicionPlanta].getProduccion()[posicionDia] = sc.nextDouble();
            }
        }

        OperacionesPlanta operaciones = new OperacionesPlanta();

        Planta mayorSemanal = operaciones.buscarMayorProduccionSemanal(plantas);

        System.out.print("\nDigite el día que desea consultar (1-7): ");
        int dia = sc.nextInt();

        while (dia < 1 || dia > 7) {

            System.out.print("Día inválido. Digite un número entre 1 y 7: ");
            dia = sc.nextInt();
        }

        int posicionDia = dia - 1;

        Planta mayorDia = operaciones.buscarMayorProduccionDia(plantas, posicionDia);

        double produccionSemanal = operaciones.calcularProduccionSemanal(mayorSemanal);

        System.out.println("Planta con mayor producción semanal: " + mayorSemanal.getNumero());
        System.out.println("Producción semanal: " + produccionSemanal);
        System.out.println("Día consultado: " + dias[posicionDia]);
        System.out.println("Planta con mayor producción ese día: " + mayorDia.getNumero());
        System.out.println("Producción ese día: " + mayorDia.getProduccion()[posicionDia]);
    }
}
