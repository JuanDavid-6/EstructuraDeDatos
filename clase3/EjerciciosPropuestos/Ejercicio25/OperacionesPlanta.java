package clase3.EjerciciosPropuestos.Ejercicio25;

public class OperacionesPlanta {
    
    public double calcularProduccionSemanal(Planta planta) {

        double total = 0;

        for (int i = 0; i < planta.getProduccion().length; i++) {
            total += planta.getProduccion()[i];
        }

        return total;
    }

    public Planta buscarMayorProduccionSemanal(Planta[] plantas) {

        Planta mayor = plantas[0];

        for (int i = 1; i < plantas.length; i++) {

            if (calcularProduccionSemanal(plantas[i]) > calcularProduccionSemanal(mayor)) {

                mayor = plantas[i];
            }
        }

        return mayor;
    }

    public Planta buscarMayorProduccionDia(Planta[] plantas, int dia) {

        Planta mayor = plantas[0];

        for (int i = 1; i < plantas.length; i++) {

            if (plantas[i].getProduccion()[dia] > mayor.getProduccion()[dia]) {
                mayor = plantas[i];
            }
        }

        return mayor;
    }
}
