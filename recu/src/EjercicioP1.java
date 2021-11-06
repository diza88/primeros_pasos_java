import java.util.Scanner;

public class EjercicioP1 {
    public static void main(String[] args) {

        double continuar = 0;
        double num1 = 0;
        double num2 = 0;
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese el valor 1: ");
        num1 = ingreso.nextDouble();
        System.out.println("Ingrese el valor 2: ");
        num2 = ingreso.nextDouble();
        System.out.println("Desea continuar (1/0)");
        continuar = ingreso.nextDouble();

        while (num1 > 0 & num2 > 0 & continuar == 1) {
            // double continuar1 = 0;
            // double resultado = num1 * num2;

            System.out.println("El resultado es: " + (num1 * num2));
            System.out.println("--------------***********---------------\n");
            System.out.println("Desea continuar (1/0)");
            continuar = ingreso.nextDouble();
            System.out.println("Ingrese el valor 1: ");
            num1 = ingreso.nextDouble();
            System.out.println("Ingrese el valor 2: ");
            num2 = ingreso.nextDouble();

        }

    }
}
