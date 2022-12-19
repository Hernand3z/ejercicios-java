
/**
 * Ejercicio 1.
 *
 * Realiza un programa que lea 10 números por teclado y luego los muestre en orden
 * inverso, el primero que se introduce es el último en mostrarse y viceversa.
 *
 * @author Hernández
 */
import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] listaNumeros = new int[10];

        // Captura de datos
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese número " + (i + 1) + ": ");
            listaNumeros[i] = s.nextInt();
        }
        System.out.println("==================================");

        // Mostrar datos
        for (int i = 9; i >= 0; i--) {
            System.out.println("Posición " + i + ": " + listaNumeros[i]);
        }
    }
}
