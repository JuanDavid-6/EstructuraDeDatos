package clase1.EjerciciosPropuestos.Ejercicio15;

public class MainEjercicio15 {
    public static void main(String[] args) {
        Trabajador[] nomina = new Trabajador[] {
            new Trabajador("Juan", 1500000),
            new Trabajador("María", 2000000),
            new Trabajador("Carlos", 2000000),
            new Trabajador("Ana", 2500000)
        };

        Empresa empresa = new Empresa(nomina);

        double promedio = empresa.calcularSueldoPromedio();
        Trabajador[] coinciden = empresa.obtenerTrabajadoresConSueldoPromedio();

        System.out.println("Sueldo Promedio General: " + promedio);
        System.out.println("Cantidad de trabajadores con sueldo promedio: " + coinciden.length);
        System.out.println("Nombres:");
        for (Trabajador t : coinciden) {
            System.out.println("- " + t.getNombre());
        }
    }
}