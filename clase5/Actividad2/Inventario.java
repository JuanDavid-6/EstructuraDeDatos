package clase5.Actividad2;

public class Inventario {
    private Producto[][] productos;

    public void GestionInventario() {
        productos = new Producto[3][4];
    }

    public void registrarProducto(int codigo, String nombre,
            double precio, int cantidad, int fila, int columna) {

        if (fila < 0 || fila >= 3 || columna < 0 || columna >= 4) {
            System.out.println("La posicion no es valida.");
            return;
        }

        if (productos[fila][columna] != null) {
            System.out.println("La posicion ya esta ocupada.");
            return;
        }

        if (buscarPorCodigo(codigo) != null) {
            System.out.println("El codigo del producto ya existe.");
            return;
        }

        if (precio < 0 || cantidad < 0) {
            System.out.println("El precio y la cantidad no pueden ser negativos.");
            return;
        }

        productos[fila][columna] = new Producto( codigo, nombre, precio, cantidad);

        System.out.println("Producto registrado correctamente.");
    }

    public void mostrarProductos() {

        boolean encontrado = false;

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 4; columna++) {

                if (productos[fila][columna] != null) {
                    System.out.println("\nFila: " + (fila + 1)
                            + " - Columna: " + (columna + 1));

                    productos[fila][columna].mostrarDatos();

                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("No hay productos registrados.");
        }
    }

    public Producto buscarPorCodigo(int codigo) {

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 4; columna++) {

                if (productos[fila][columna] != null
                        && productos[fila][columna].getCodigo() == codigo) {

                    return productos[fila][columna];
                }
            }
        }

        return null;
    }

    public int buscarProducto(int codigo) {

        boolean encontrado = false;

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 4; columna++) {

                if (productos[fila][columna] != null && productos[fila][columna].getCodigo() == codigo) {

                    System.out.println("Producto encontrado.");
                    System.out.println("Fila: " + (fila + 1));
                    System.out.println("Columna: " + (columna + 1));
                    productos[fila][columna].mostrarDatos();

                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }
        return 0;
    }

    public double calcularValorInventario() {

        double total = 0;

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 4; columna++) {

                if (productos[fila][columna] != null) {
                    total += productos[fila][columna].getPrecio()
                            * productos[fila][columna].getCantidad();
                }
            }
        }

        System.out.println("Valor total del inventario: $" + total);

        return total;
    }

    public int mostrarMayorCantidad() {

        Producto mayor = null;

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 4; columna++) {

                if (productos[fila][columna] != null) {

                    if (mayor == null
                            || productos[fila][columna].getCantidad() > mayor.getCantidad()) {

                        mayor = productos[fila][columna];
                    }
                }
            }
        }

        if (mayor == null) {
            System.out.println("No hay productos registrados.");
        } else {
            System.out.println("Producto con mayor cantidad disponible:");
            mayor.mostrarDatos();
        }

        return 0;
    }

    public int contarPosicionesVacias() {

        int vacias = 0;

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 4; columna++) {

                if (productos[fila][columna] == null) {
                    vacias++;
                }
            }
        }

        System.out.println("Posiciones vacias: " + vacias);

        return vacias;
    }
}
