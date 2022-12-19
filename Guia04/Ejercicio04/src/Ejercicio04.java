
/**
 * Ejercicio 4.
 *
 * Crea un programa que muestre en pantalla los números del 320 al 160,
 * contando de 20 en 20 hacia atrás usando el bucle For.
 *
 * @author Hernández
 */
public class Ejercicio04 {

    public static void main(String[] args) {

        for (int i = 320; i >= 160; i -= 20) { // Decremento: i = i - 20;
            System.out.println(i);
        }
    }
}
