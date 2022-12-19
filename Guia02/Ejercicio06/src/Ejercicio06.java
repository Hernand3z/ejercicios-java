
/**
 * Ejercicio 6.
 *
 * Escribe un programa que calcule el total de una factura a partir de una base imponible.
 *
 * @author Hernández
 */
import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        final double iva = 0.13;

        System.out.print("Ingrese base imponible: ");
        double baseImponible = s.nextDouble();

        if (baseImponible >= 0) {
            double cargoIVA = baseImponible * iva;
            double total = baseImponible + cargoIVA;

            System.out.println("===============================");
            System.out.println("El total es: $ " + ((double) Math.round(total * 100d) / 100) + " dls");
        } else {
            System.out.println("===============================");
            System.out.println("¡Ingrese valores positivos!");
        }
    }
}
