
/**
 * Ejercicio 10.
 *
 * Realiza un programa que pida una palabra introducida por teclado y que lo imprima en
 * pantalla al revés. Por ejemplo, si se introduce hola debe imprimir aloh.
 *
 * @author Hernández
 */
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String num = s.nextLine();

        /**
         * Ejemplo: hola longitud de la cadena: 4 posición 0 = h posición 1 = o
         * posición 2 = l posición 3 = a
         */
        for (int i = 1; i <= num.length(); i++) {
            System.out.print(num.charAt(num.length() - i));
        }

        System.out.println("");
    }
}
