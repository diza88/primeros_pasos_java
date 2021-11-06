import java.util.Scanner;

public class Condicionales {

    public static void main(String[] args) {
        double nota = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el cvalor de una nota: ");
        nota = entrada.nextDouble();

        if (nota >= 60 && nota <= 79) {
            System.out.println("Aprobado");
        } else if (nota >= 80 && nota <= 89) {
            System.out.println("Aprobado, promedio muy bueno");
        } else if (nota >= 90 && nota <= 100) {
            System.out.println("Aprobado, promedio excelente");
        } else {
            System.out.println("Nota invalida");
        }

    }

}
