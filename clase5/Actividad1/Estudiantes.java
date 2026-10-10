package clase5.Actividad1;

public class Estudiantes {

    private int codigo;
    private String nombre;
    private String progAcademico;
    private double calificacion;
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

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProgAcademico() {
        return progAcademico;
    }

    public void setProgAcademico(String progAcademico) {
        this.progAcademico = progAcademico;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Estudiantes [codigo=" + codigo + ", nombre=" + nombre + ", progAcademico=" + progAcademico
                + ", promedio=" + promedio + "]";
    }


    //Mostrar el estudiante por codigo
    public String buscarEstudiante(Estudiantes[] estudiantes, int codigo) {
        for (Estudiantes estudiante : estudiantes) {
            if (estudiante.getCodigo() == codigo) {
                return estudiante.toString();
            }
        }
        return null;
    }

    // Mostrar estudiantes por promedio igual o superior a 4.0
    public static Estudiantes[] estudiantesConPromedioAlto(Estudiantes[] estudiantes) {
        int cont = 0;
        for (Estudiantes estudiante : estudiantes) {
            if (estudiante.getPromedio() >= 4.0) {
                cont++;
            }
        }

        Estudiantes[] resultado = new Estudiantes[cont];
        int index = 0;
        for (Estudiantes estudiante : estudiantes) {
            if (estudiante.getPromedio() >= 4.0) {
                resultado[index++] = estudiante;
            }
        }
        return resultado;
    }

    // Identificar al estudiante con el promedio más alto.
    public static Estudiantes estudianteConPromedioMasAlto(Estudiantes[] estudiantes) {
        Estudiantes estudianteMasAlto = null;
        double maxPromedio = -1;

        for (Estudiantes estudiante : estudiantes) {
            if (estudiante.getPromedio() > maxPromedio) {
                maxPromedio = estudiante.getPromedio();
                estudianteMasAlto = estudiante;
            }
        }

        return estudianteMasAlto;
    }

}
