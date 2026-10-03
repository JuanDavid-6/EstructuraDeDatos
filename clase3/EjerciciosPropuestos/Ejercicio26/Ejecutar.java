package clase3.EjerciciosPropuestos.Ejercicio26;

public class Ejecutar {
    public static void main(String[] args) {

        Cuaderno[] cuadernos = new Cuaderno[8];

        cuadernos[0] = new Cuaderno("Norma", "A", 5000);
        cuadernos[1] = new Cuaderno("Caribe", "B", 4500);
        cuadernos[2] = new Cuaderno("Alpes", "C", 6000);
        cuadernos[3] = new Cuaderno("Norma", "D", 5500);
        cuadernos[4] = new Cuaderno("Caribe", "E", 4000);
        cuadernos[5] = new Cuaderno("Alpes", "F", 6500);
        cuadernos[6] = new Cuaderno("Norma", "G", 7000);
        cuadernos[7] = new Cuaderno("Caribe", "H", 4800);

        for (int posicion = 0; posicion < cuadernos.length; posicion++) {
            for (int dia = 0; dia < 30; dia++) {
                cuadernos[posicion].getVentas()[dia] = (posicion + 2) * (dia + 5);
            }
        }

        Operaciones operaciones = new Operaciones();

        for (int posicion = 0; posicion < cuadernos.length; posicion++) {
            double total = operaciones.calcularTotalModelo(cuadernos[posicion]);
            System.out.println("Modelo " + cuadernos[posicion].getModelo() + ": $" + total);
        }

        for (int dia = 0; dia < 30; dia++) {
            double total = operaciones.calcularTotalDia(cuadernos, dia);
            System.out.println("Día " + (dia + 1) + ": $" + total);
        }

        Cuaderno mayor = operaciones.buscarMayorModelo(cuadernos);

        double totalMayor = operaciones.calcularTotalModelo(mayor);

        System.out.println("Modelo que más dinero produjo: " + mayor.getModelo());
        System.out.println("Distribuidora: " + mayor.getDistribuidora());
        System.out.println("Total producido: $" + totalMayor);
    }
}
