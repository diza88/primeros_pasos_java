import java.util.Scanner;

// Formula de conversion 0 K − 273.15 = -273.1 °C

public class EjercicioP2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double kelvin = 0;
        
        System.out.println("Ingrese la cantidad de grados Kelvin: ");

        kelvin = entrada.nextDouble();

        System.out.println("Su conversion es: " + Math.round((kelvin - 273.15) * 100) / 100 + "°c");

    }

}
