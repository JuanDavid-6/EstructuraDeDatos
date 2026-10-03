package clase4;

public class Main {
        public static void main(String[] args) {
        
        //Creación de un objeto trabajador
        Trabajador objT1 = new Trabajador(1,"Juan","Peréz", 20, 1000.0);
        Trabajador objT2 = new Trabajador(2,"Lina","Cuero", 21, 1500.0);
        Trabajador objT3 = new Trabajador(3,"Git","Hub", 30, 800.0);
        
        System.out.println(objT1);
        System.out.println(objT2);
        System.out.println(objT1.getNombre()); //Juan
        
        //Arreglo de objetos
        Trabajador[] t = new Trabajador[3];
        t[0] = objT1;
        t[1] = objT2;
        t[2] = objT3;
        
        //Sumar los salarios de los trabajadores
        double sumaSalario = 0;
        for(int i = 0; i < t.length; i++){
            sumaSalario += t[i].getSalario();
        }
        System.out.println("Suma de los salarios es: " + sumaSalario);
    }
}
