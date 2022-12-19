
/**
 * Ejercicio 1.
 *
 * Realiza un programa que pida desde el teclado un día de la semana y que diga que
 * asignatura de las que tienes inscritas te toca primero.
 *
 * @author Hernández
 */
import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese día de la semana: ");
        String dia = s.nextLine();

        switch (dia.toLowerCase().trim()) {
            case "lunes":
                System.out.println("Matematicas");
                break;
            case "martes":
                System.out.println("Historia");
                break;
            case "miercoles":
                System.out.println("Programación");
                break;
            case "jueves":
                System.out.println("Literatura");
                break;
            case "viernes":
                System.out.println("Fisica");
                break;
            case "sabado":
                System.out.println("Contabilidad");
                break;
            case "domingo":
                System.out.println("Redes");
                break;
            default:
                System.out.println("!Dia incorrecto!");
        }
    }
}
