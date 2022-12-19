
/**
 * Ejercicio 3.
 *
 * Escribe un programa que pida 10 números por teclado y que luego muestre los números
 * introducidos de forma creativa.
 *
 * @author Hernández
 */
import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] numeros = new int[10];

        // Captura de datos
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese número " + (i + 1) + ": ");
            numeros[i] = s.nextInt();
        }

        System.out.println("==============================");
        System.out.println("Los números introducidos son: ");
        System.out.println("==============================");

        // Mostrando resultados
        for (int i = 0; i < 10; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
    }
}
