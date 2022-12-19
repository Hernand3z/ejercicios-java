
/**
 * Ejercicio 5.
 *
 * Realiza un programa que calcule la media de 3 notas que obtuviste en tus actividades de
 * periodo.
 *
 * @author Hernández
 */
import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese nota 01: ");
        double nota01 = s.nextDouble();

        System.out.print("Ingrese nota 02: ");
        double nota02 = s.nextDouble();

        System.out.print("Ingrese nota 03: ");
        double nota03 = s.nextDouble();

        if ((nota01 >= 0 && nota01 <= 10) && (nota02 >= 0 && nota02 <= 10) && (nota03 >= 0 && nota03 <= 10)) {

            double media = (nota01 + nota02 + nota03) / 3;

            System.out.println("=======================");
            System.out.println("La media es: " + (double) Math.round(media * 100d) / 100);

        } else {
            System.out.println("==========================================");
            System.out.println("¡Ingrese valores entre 0 y 10!");
        }
    }
}
