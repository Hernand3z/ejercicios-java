
/**
 * Ejercicio 6.
 *
 * Debes agregar al código del programa anterior, para que ahora diga junto a la nota
 * obtenida lo siguiente: “Insuficiente”, “Suficiente”, “Bien”, “Notable”, “Sobresaliente”,
 * tomar de base 2 para cada enunciado con una nota base de 10 ptos.
 *
 * @author Hernández
 */
import java.util.Scanner;

public class Ejercicio06 {

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

            System.out.println("=====================");

            if (media < 3) {
                System.out.println("Insuficiente");
            } else if (media >= 3 && media < 5) {
                System.out.println("Suficiente");
            } else if (media >= 5 && media < 7) {
                System.out.println("Bien");
            } else if (media >= 7 && media < 9) {
                System.out.println("Notable");
            } else if (media >= 9 && media < 11) {
                System.out.println("Sobresaliente");
            }

            System.out.println("La media es: " + (double) Math.round(media * 100d) / 100);

        } else {
            System.out.println("==========================================");
            System.out.println("¡Ingrese valores entre 0 y 10!");
        }
    }
}
