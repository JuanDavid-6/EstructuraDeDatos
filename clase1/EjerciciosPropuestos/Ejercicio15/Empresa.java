package clase1.EjerciciosPropuestos.Ejercicio15;

public class Empresa {
    private Trabajador[] trabajadores;

    public Empresa(Trabajador[] trabajadores) {
        this.trabajadores = trabajadores;
    }

    public double calcularSueldoPromedio() {
        if (trabajadores.length == 0) return 0.0;
        double suma = 0;
        for (Trabajador t : trabajadores) {
            suma += t.getSueldo();
        }
        return suma / trabajadores.length;
    }

    public Trabajador[] obtenerTrabajadoresConSueldoPromedio() {
        double promedio = calcularSueldoPromedio();

        int contador = 0;
        for (Trabajador t : trabajadores) {
            if (Math.abs(t.getSueldo() - promedio) < 0.01) {
                contador++;
            }
        }
        
        Trabajador[] resultado = new Trabajador[contador];
        int index = 0;
        for (Trabajador t : trabajadores) {
            if (Math.abs(t.getSueldo() - promedio) < 0.01) {
                resultado[index++] = t;
            }
        }
        return resultado;
    }
}