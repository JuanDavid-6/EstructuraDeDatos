package clase3.EjerciciosPropuestos.Ejercicio25;

public class Planta {
    private int numero;
    private double[] produccion;

    public Planta(int numero) {
        this.numero = numero;
        this.produccion = new double[7];
    }

    public int getNumero() {
        return numero;
    }

    public double[] getProduccion() {
        return produccion;
    }

    public void setProduccion(double[] produccion) {
        this.produccion = produccion;
    }
}
