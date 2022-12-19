
/**
 * Ejercicio 3.
 *
 * Escribe un programa que sume, reste, multiplique y divida dos
 * números introducidos desde el teclado, luego que muestre los resultados.
 *
 * @author Hernández.
 */
import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Digite primer número: ");
        int num1 = s.nextInt();

        System.out.print("Digite segundo número: ");
        int num2 = s.nextInt();

        System.out.println("===============================");

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;

        System.out.println("La suma de: " + num1 + " + " + num2 + " = " + suma);
        System.out.println("La resta de: " + num1 + " - " + num2 + " = " + resta);
        System.out.println("La multiplicación de: " + num1 + " * " + num2 + " = " + multiplicacion);
        System.out.println("La división de: " + num1 + " / " + num2 + " = " + division);
    }
}
