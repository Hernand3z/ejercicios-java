
/**
 * Ejercicio 8.
 *
 * Escribe un programa que imprima en la pantalla el resultado del cálculo del
 * volumen de un cono.
 *
 * @author Hernández
 */
import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        final double PI = 3.1416;

        System.out.print("Ingrese base: ");
        double base = s.nextDouble();

        System.out.print("Ingrese altura: ");
        double altura = s.nextDouble();

        if (base >= 0 && altura >= 0) {
            double volumen = (PI * Math.pow(base, 2) * altura) / 3;

            System.out.println("==================================");
            System.out.println("El volumnen del cono es: " + (double) Math.round(volumen * 100d) / 100);
        } else {
            System.out.println("==================================");
            System.out.println("¡Ingrese valores positivos!");
        }
    }
}
