import java.util.Scanner;

public class EjercicioP5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double lon = 0;

        System.out.println("Ingrese la distancia en metros: ");

        lon = entrada.nextDouble();
        System.out.println("Su conversion en Km es: " + (lon/1000) );
    }
}
