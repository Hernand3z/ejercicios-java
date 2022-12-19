
/**
 * Ejercicio 3.
 *
 * Realiza un programa que muestre números múltiplos de 5 que comience en 0 y termine
 * en 100 usando el bucle do-while.
 *
 * @author Hernández
 */
public class Ejercicio03 {

    public static void main(String[] args) {

        int i = 0;

        do {
            System.out.println(i);
            i = i + 5;

        } while (i <= 100);
    }
}
