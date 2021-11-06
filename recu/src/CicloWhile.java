import java.util.Scanner;

public class CicloWhile {
    public static void main(String[] args) {
        int iteracion = 0;
        Scanner entrada = new Scanner(System.in);
        String respuesta = "SI";
        while (iteracion < 10) {
            System.out.println("El valor de la variable iteracion es: " + iteracion);
            iteracion ++;  //esto es equivalente a tener iteracion = iteracion + 1, aumenta una unidad en cada ciclo
            System.out.println("Desea continuar (Si / NO)");
            respuesta = entrada.nextLine();

        }

    }
}
