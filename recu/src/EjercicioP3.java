import java.util.Scanner;

public class EjercicioP3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double D, V, T;

        System.out.println("Ingrese el valor de la velocidad (V, en Km/h): ");
        V = leer.nextDouble();
        System.out.println("Ingrese el valor del tiempo (T, en minutos): ");
        T = leer.nextDouble();

        System.out.println("Su valor de distancia es: " + (V * T/60) + " Km");

    }
}

