package clase5.Actividad2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        Inventario gestion = new Inventario();

        int opcion;

        do {
            System.out.println("\n Selecciona la opcion de su preferencia ");
            System.out.println("1. Registrar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Buscar producto por codigo");
            System.out.println("4. Calcular valor total del inventario");
            System.out.println("5. Mostrar producto con mayor cantidad");
            System.out.println("6. Contar posiciones vacias");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = Integer.parseInt(entrada.nextLine());

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el codigo: ");
                    String codigo = entrada.nextLine();

                    System.out.print("Ingrese el nombre: ");
                    String nombre = entrada.nextLine();

                    System.out.print("Ingrese el precio: ");
                    double precio = Double.parseDouble(entrada.nextLine());

                    System.out.print("Ingrese la cantidad disponible: ");
                    int cantidad = Integer.parseInt(entrada.nextLine());

                    System.out.print("Ingrese la fila (1 a 3): ");
                    int fila = Integer.parseInt(entrada.nextLine());

                    System.out.print("Ingrese la columna (1 a 4): ");
                    int columna = Integer.parseInt(entrada.nextLine());

                    gestion.registrarProducto( codigo, nombre, precio, cantidad, fila, columna);
                    break;

                case 2:
                    gestion.mostrarProductos();
                    break;

                case 3:
                    System.out.print("Ingrese el codigo del producto: ");
                    String codigoBuscar = entrada.nextLine();

                    gestion.buscarProducto(codigoBuscar);
                    break;

                case 4:
                    gestion.calcularValorInventario();
                    break;

                case 5:
                    gestion.mostrarMayorCantidad();
                    break;

                case 6:
                    gestion.contarPosicionesVacias();
                    break;

                case 7:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 7);

        entrada.close();
    }
}
