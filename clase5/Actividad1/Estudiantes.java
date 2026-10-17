package clase5.Actividad1;

public class Estudiantes {

    private int codigo;
    private String nombre;
    private String progAcademico;
    private double promedio;

    public Estudiantes(int codigo, String nombre, String progAcademico, double promedio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.progAcademico = progAcademico;
        this.promedio = promedio;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProgAcademico() {
        return progAcademico;
    }

    public double getPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        return "Estudiantes [codigo=" + codigo + ", nombre=" + nombre + ", progAcademico=" + progAcademico
                + ", promedio=" + promedio + ", getCodigo()=" + getCodigo() + ", getNombre()=" + getNombre()
                + ", getProgAcademico()=" + getProgAcademico() + ", getPromedio()=" + getPromedio() + ", getClass()="
                + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }

    public String mostrarDatos() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Programa academico: " + progAcademico);
        System.out.println("Promedio: " + promedio);
        return null;

    }
}
