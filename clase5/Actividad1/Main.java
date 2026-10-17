package clase5.Actividad1;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        GestionEstudiantes gestion = new GestionEstudiantes();

        int opcion;

        do {
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Listar estudiantes");
            System.out.println("3. Buscar estudiante por codigo");
            System.out.println("4. Mostrar promedios iguales o superiores a 4.0");
            System.out.println("5. Mostrar estudiante con mayor promedio");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = Integer.parseInt(entrada.nextLine());

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el codigo: ");
                    String codigo = entrada.nextLine();

                    System.out.print("Ingrese el nombre: ");
                    String nombre = entrada.nextLine();

                    System.out.print("Ingrese el programa academico: ");
                    String programa = entrada.nextLine();

                    System.out.print("Ingrese el promedio: ");
                    double promedio = Double.parseDouble(entrada.nextLine());

                    gestion.registrarEstudiante(codigo, nombre, programa, promedio);
                    break;

                case 2:
                    gestion.listarEstudiantes();
                    break;

                case 3:
                    System.out.print("Ingrese el codigo a buscar: ");
                    String codigoBuscar = entrada.nextLine();

                    gestion.mostrarEstudiante(codigoBuscar);
                    break;

                case 4:
                    gestion.mostrarPromediosAltos();
                    break;

                case 5:
                    gestion.mostrarMayorPromedio();
                    break;

                case 6:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 6);

        entrada.close();
    }
}
