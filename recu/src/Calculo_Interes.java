import java.util.Scanner;
import java.lang.String;

public class Calculo_Interes {
    public static void main(String[] args) {
        double cap = 100;
        double inte = 0.05;
        double per = 3;
        String continuar = "SI";

        Scanner entrada = new Scanner(System.in);

        while (continuar == "SI") {

            System.out.println("Ingrese el valor del capital: ");
            System.out.println("Ingrese el valor del interes: ");
            System.out.println("Ingrese el valor del periodo: ");
            double simple = (cap * inte * per);
            double compuesto = cap * Math.round(Math.pow((1 + inte), per) * 100) / 100;

            System.out.println("Desea continuar (SI/NO)");
            System.out.println("Interes simple: " + simple);
            System.out.println("Interes compuesto: " + compuesto);
        }

    }
}
