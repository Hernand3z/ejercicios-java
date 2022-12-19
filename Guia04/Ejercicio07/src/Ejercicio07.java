
/**
 * Ejercicio 7.
 *
 * Escribe un programa que imprima en pantalla la tabla de multiplicar
 * introducida por teclado.
 *
 * @author Hernández
 */
import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Digite número de tabla de multiplicar: ");
        int num = s.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}
