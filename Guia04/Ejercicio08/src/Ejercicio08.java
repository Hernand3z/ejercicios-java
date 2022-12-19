
/**
 * Ejercicio 8.
 *
 * Escribe un programa que lea una lista de 10 números y determine cuantos son positivos y
 * cuantos son negativos.
 *
 * @author Hernández
 */
import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese número " + (i + 1) + ": ");
            int num = s.nextInt();

            // Evalua números positivos.
            if (num > 0) {
                positivos++;
            }
            // Evalua números negativos.
            if (num < 0) {
                negativos++;
            }
        }

        System.out.println("=======================");
        System.out.println("N° Positivos: " + positivos);
        System.out.println("N° Negativos: " + negativos);
    }
}
