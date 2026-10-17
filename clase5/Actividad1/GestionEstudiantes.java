package clase5.Actividad1;

public class GestionEstudiantes {
    private Estudiantes[] estudiantes;
    private int cantidad;

    public GestionEstudiantes() {
        estudiantes = new Estudiantes[10];
        cantidad = 0;
    }

    public String registrarEstudiante(String codigo, String nombre,
            String programa, double promedio) {

        if (cantidad == estudiantes.length) {
            System.out.println("No hay espacio para mas estudiantes.");
            
        }

        if (buscarPorCodigo(codigo) != null) {
            System.out.println("El codigo ya existe.");
            
        }

        if (promedio < 0 || promedio > 5) {
            System.out.println("El promedio debe estar entre 0.0 y 5.0.");
        }

        estudiantes[cantidad] = new Estudiantes( Integer.parseInt(codigo), nombre, programa, promedio);

        cantidad++;

        System.out.println("Estudiante registrado correctamente.");

        return " ";
    }

    public String listarEstudiantes() {

        if (cantidad == 0) {
            System.out.println("No hay estudiantes registrados.");

            
        }

        for (int i = 0; i < cantidad; i++) {
            estudiantes[i].mostrarDatos();
        }

        return " ";
    }

    public Estudiantes buscarPorCodigo(String codigo) {

        for (int i = 0; i < cantidad; i++) {
            if (String.valueOf(estudiantes[i].getCodigo()).equals(codigo)) {
                return estudiantes[i];
            }
        }

        return null;
    }

    public String mostrarEstudiante(String codigo) {

        Estudiantes estudiante = buscarPorCodigo(codigo);

        if (estudiante != null) {
            estudiante.mostrarDatos();
        } else {
            System.out.println("Estudiante no encontrado.");
        }

        return " ";
    }

    public String mostrarPromediosAltos() {

        boolean encontrado = false;

        for (int i = 0; i < cantidad; i++) {
            if (estudiantes[i].getPromedio() >= 4.0) {
                estudiantes[i].mostrarDatos();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay estudiantes con promedio igual o superior a 4.0.");
        }

        return " ";
    }

    public String mostrarMayorPromedio() {

        if (cantidad == 0) {
            System.out.println("No hay estudiantes registrados.");
            return " ";
        }

        Estudiantes mejor = estudiantes[0];

        for (int i = 1; i < cantidad; i++) {
            if (estudiantes[i].getPromedio() > mejor.getPromedio()) {
                mejor = estudiantes[i];
            }
        }

        System.out.println("Estudiante con mayor promedio:");
        mejor.mostrarDatos();

        return " ";
    }
}
