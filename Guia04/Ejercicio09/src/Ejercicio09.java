
/**
 * Ejercicio 9.
 *
 * Realiza un programa que pida una base y un exponente (entero positivo) y que calcule la
 * potencia para luego imprimirla en pantalla.
 *
 * @author Hernández
 */
import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese base: ");
        int base = s.nextInt();

        System.out.print("Ingrese exponente: ");
        int exponente = s.nextInt();

        int potencia = ((int) Math.pow(base, exponente));

        System.out.println("=============================");
        System.out.println(base + " elevado a " + exponente + " = " + potencia);
    }
}
