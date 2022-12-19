
/**
 * Ejercicio 2.
 *
 * Escribe un programa que pida una hora (solo la hora, los minutos no se tomarán en
 * cuenta), que imprima “Buenos Días”, “Buenas Tardes” o “Buenas Noches” según la hora
 * capturada.
 *
 * @author Hernández
 */
import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese la hora (formato 24hrs):  ");
        int hora = s.nextInt();

        if (hora >= 0 && hora < 24) {
            if (hora >= 1 && hora <= 11) {
                System.out.println("Buenos Días");
            } else if (hora >= 12 && hora <= 18) {
                System.out.println("Buenas Tardes");
            } else {
                System.out.println("Buenas Noches");
            }
        } else {
            System.out.println("=========================================");
            System.out.println("¡Ingrese valores entre 0 y 23!");
        }
    }
}
