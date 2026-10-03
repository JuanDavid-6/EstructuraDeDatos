package clase3.EjerciciosPropuestos.Ejercicio26;

public class Operaciones {
    
    public double calcularTotalModelo(Cuaderno cuaderno) {

        double total = 0;

        for (int dia = 0; dia < cuaderno.getVentas().length; dia++) {

            total += cuaderno.getVentas()[dia] * cuaderno.getPrecio();
        }

        return total;
    }

    public double calcularTotalDia(Cuaderno[] cuadernos, int dia) {

        double total = 0;

        for (int posicion = 0; posicion < cuadernos.length; posicion++) {

            total += cuadernos[posicion].getVentas()[dia] * cuadernos[posicion].getPrecio();
        }

        return total;
    }

    public Cuaderno buscarMayorModelo(Cuaderno[] cuadernos) {

        Cuaderno mayor = cuadernos[0];

        for (int posicion = 1; posicion < cuadernos.length; posicion++) {

            if (calcularTotalModelo(cuadernos[posicion]) > calcularTotalModelo(mayor)) {
                mayor = cuadernos[posicion];
            }
        }

        return mayor;
    }
}
