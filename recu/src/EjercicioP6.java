import java.util.Scanner;

public class EjercicioP6 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        double numero = 0;

        System.out.println("Ingrese un numero cualquiera:");
        numero = intro.nextDouble();

        if (numero == 0) {
            System.out.println("Su numero es cero:");
        } else if (numero % 2 == 0) {
            System.out.println("Su numero es positivo");
        } else {
            System.out.println("Su numero es negativo");
        }

    }
}
