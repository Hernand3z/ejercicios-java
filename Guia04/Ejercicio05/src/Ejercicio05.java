
/**
 * Ejercicio 5.
 *
 * Crea un programa que muestre en pantalla los números del 320 al 160,
 * contando de 20 en 20 hacia atrás usando el bucle While.
 *
 * @author Hernández
 */
public class Ejercicio05 {

    public static void main(String[] args) {

        int i = 320;

        while (i >= 160) {
            System.out.println(i);
            i -= 20; // i = i - 20;
        }
    }
}
