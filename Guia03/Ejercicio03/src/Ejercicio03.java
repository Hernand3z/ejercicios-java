
/**
 * Ejercicio 3.
 *
 * Escribe un programa que dado el número del 1 al 7 escriba o imprima en consola el
 * correspondiente nombre del día de la semana.
 *
 * @author Hernández
 */
import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int dia = s.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("¡Ingrese un número entre 1 y 7!");
        }
    }
}
