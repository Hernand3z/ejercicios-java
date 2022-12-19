
/**
 * Ejercicio 1.
 *
 * Realiza un programa que pida 2 números, que realice la multiplicación y muestre el
 * resultado en la pantalla.
 *
 * @author Hernández
 */
import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Digite primer número: ");
        int num1 = s.nextInt();

        System.out.print("Digite segundo número: ");
        int num2 = s.nextInt();

        int total = num1 * num2;

        System.out.println("La multiplicación de: " + num1 + " * " + num2 + " = " + total);
    }
}
