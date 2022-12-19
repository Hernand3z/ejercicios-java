
/**
 * Ejercicio 10.
 *
 * Escribe un programa que pidiendo por teclado se introduzcan 3 números enteros y los
 * ordene de menor a mayor.
 *
 * @author Hernández.
 */
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese primer número: ");
        int num1 = s.nextInt();

        System.out.print("Ingrese segundo número: ");
        int num2 = s.nextInt();

        System.out.print("Ingrese tercer número: ");
        int num3 = s.nextInt();

        System.out.println("========================================");

        if ((num1 >= num2) && (num1 >= num3)) {
            if (num2 > num3) {
                System.out.println("Orden de números es: " + num3 + ", " + num2 + ", " + num1);
            } else {
                System.out.println("Orden de números es: " + num2 + ", " + num3 + ", " + num1);
            }
        } else if ((num2 >= num1) && (num2 >= num3)) {
            if (num1 > num3) {
                System.out.println("Orden de números es: " + num3 + ", " + num1 + ", " + num2);
            } else {
                System.out.println("Orden de números es: " + num1 + ", " + num3 + ", " + num2);
            }
        } else if ((num3 >= num1) && (num3 >= num2)) {
            if (num1 > num2) {
                System.out.println("Orden de números es: " + num2 + ", " + num1 + ", " + num3);
            } else {
                System.out.println("Orden de números es: " + num1 + ", " + num2 + ", " + num3);
            }
        }
    }
}
