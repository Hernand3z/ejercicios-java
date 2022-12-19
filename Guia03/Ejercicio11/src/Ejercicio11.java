
/**
 * Ejercicio 11.
 *
 * Escribe un programa que imprima si el numero introducido es positivo o negativo.
 *
 * @author Hernández
 */
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        double num = s.nextDouble();

        if (num > 0) {
            System.out.println("El número es Positivo");
        } else if (num < 0) {
            System.out.println("El número es Negativo");
        } else {
            System.out.println("El número es Neutro");
        }
    }
}
