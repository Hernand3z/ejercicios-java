
/**
 * Ejercicio 4.
 *
 * Escribe un programa que calcule el área de un rectángulo.
 *
 * @author Hernández
 */
import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese base: ");
        double base = s.nextDouble();

        System.out.print("Ingrese altura: ");
        double altura = s.nextDouble();

        if (base >= 0 && altura >= 0) {
            double area = base * altura;

            System.out.println("===============================");
            System.out.println("El area del rectangulo es: " + (double) Math.round(area * 100d) / 100);
        } else {
            System.out.println("===============================");
            System.out.println("¡Ingrese valores positivos!");
        }
    }
}
