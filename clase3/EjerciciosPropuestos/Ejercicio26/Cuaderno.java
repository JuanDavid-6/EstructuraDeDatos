package clase3.EjerciciosPropuestos.Ejercicio26;

public class Cuaderno {
    private String distribuidora;
    private String modelo;
    private double precio;
    private int[] ventas;

    public Cuaderno(String distribuidora, String modelo, double precio) {
        this.distribuidora = distribuidora;
        this.modelo = modelo;
        this.precio = precio;
        this.ventas = new int[30];
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public int[] getVentas() {
        return ventas;
    }

    public void setVentas(int[] ventas) {
        this.ventas = ventas;
    }
}
