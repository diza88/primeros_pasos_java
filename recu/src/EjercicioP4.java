import java.util.Scanner;

public class EjercicioP4 {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);

        double cat1, cat2;

        System.out.println("Ingrese el valor del primer cateto (x): ");
        cat1 = ingreso.nextDouble();
        System.out.println("Ingrese el valor del segundo cateto (y): ");
        cat2 = ingreso.nextDouble();

        System.out.println("El valor de la hipotemusa es: " + Math.sqrt(Math.pow(cat1, 2)+Math.pow(cat2, 2))+ " unidades");


    }
}
