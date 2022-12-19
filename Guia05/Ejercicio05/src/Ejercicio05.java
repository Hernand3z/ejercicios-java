
/**
 * Ejercicio 5.
 *
 * Crea un programa que pida 8 números enteros y que luego muestre esos números junto
 * con la palabra par o impar según sea el número.
 *
 * @author Hernández
 */
import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] numeros = new int[8];

        // Captura de datos
        for (int i = 0; i < 8; i++) {
            System.out.print("Ingrese número " + (i + 1) + ": ");
            numeros[i] = s.nextInt();
        }

        System.out.println("====================");

        // Mostrando resultados
        for (int i = 0; i < 8; i++) {
            if (numeros[i] == 0) {
                System.out.println(numeros[i] + " - Es Neutro");
            } else if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i] + " - Es Par");
            } else {
                System.out.println(numeros[i] + " - Impar");
            }
        }
    }
}
