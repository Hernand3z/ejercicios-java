
/**
 * Ejercicio 4.
 *
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes de un
 * determinado año y que muestre un diagrama de barras horizontales con esos datos. Las
 * barras del diagrama se pueden dibujar a base de asteriscos o cualquier otro carácter.
 * Puedes usar colores también.
 *
 * @author Hernández
 */
import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] temperatura = new int[12];

        // Captura de datos
        for (int i = 0; i < 12; i++) {
            System.out.print("Ingrese temperatura mes " + (i + 1) + ": ");
            temperatura[i] = s.nextInt();
        }

        System.out.print("\n");

        // Mostrando diagrama con resultados
        for (int i = 0; i < 12; i++) {

            if (i < 9) {
                System.out.print("Mes " + (i + 1) + " | ");
            } else {
                System.out.print("Mes " + (i + 1) + "| ");
            }

            for (int j = 0; j < temperatura[i]; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("      --------------------------------------------------------------");
        System.out.println("       0        10        20        30        40        50       60");
    }
}
