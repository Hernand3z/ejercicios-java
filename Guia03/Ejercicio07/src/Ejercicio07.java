
/**
 * Ejercicio 7.
 *
 * Escribe un programa que imprima en pantalla o consola el horóscopo a partir de la
 * captura del mes y del día de nacimiento.
 *
 * @author Hernández
 */
import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese día de nacimiento (1-31): ");
        int diaNacimiento = Integer.parseInt(s.nextLine());

        if (diaNacimiento > 0 && diaNacimiento <= 31) {

            System.out.print("Ingrese mes de nacimiento: ");
            String mesNacimiento = s.nextLine();

            System.out.println("====================================");

            switch (mesNacimiento.toLowerCase().trim()) {
                case "enero":
                    if (diaNacimiento < 21) {
                        System.out.println("Tu signo es: Capricornio");
                    } else {
                        System.out.println("Tu signo es: Acuario");
                    }
                    break;
                case "febrero":
                    if (diaNacimiento < 20) {
                        System.out.println("Tu signo es: Acuario");
                    } else {
                        System.out.println("Tu signo es: Piscis");
                    }
                    break;
                case "marzo":
                    if (diaNacimiento < 21) {
                        System.out.println("Tu signo es: Piscis");
                    } else {
                        System.out.println("Tu signo es: Aries");
                    }
                    break;
                case "abril":
                    if (diaNacimiento < 22) {
                        System.out.println("Tu signo es: Aries");
                    } else {
                        System.out.println("Tu signo es: Tauro");
                    }
                    break;
                case "mayo":
                    if (diaNacimiento < 22) {
                        System.out.println("Tu signo es: Tauro");
                    } else {
                        System.out.println("Tu signo es: Géminis");
                    }
                    break;
                case "junio":
                    if (diaNacimiento < 22) {
                        System.out.println("Tu signo es: Géminis");
                    } else {
                        System.out.println("Tu signo es: Cáncer");
                    }
                    break;
                case "julio":
                    if (diaNacimiento < 23) {
                        System.out.println("Tu signo es: Cáncer");
                    } else {
                        System.out.println("Tu signo es: Leo");
                    }
                    break;
                case "agosto":
                    if (diaNacimiento < 23) {
                        System.out.println("Tu signo es: Leo");
                    } else {
                        System.out.println("Tu signo es: Virgo");
                    }
                    break;
                case "septiembre":
                    if (diaNacimiento < 23) {
                        System.out.println("Tu signo es: Virgo");
                    } else {
                        System.out.println("Tu signo es: Libra");
                    }
                    break;
                case "octubre":
                    if (diaNacimiento < 23) {
                        System.out.println("Tu signo es: Libra");
                    } else {
                        System.out.println("Tu signo es: Escorpio");
                    }
                    break;
                case "noviembre":
                    if (diaNacimiento < 23) {
                        System.out.println("Tu signo es: Escorpio");
                    } else {
                        System.out.println("Tu signo es: Sagitario");
                    }
                    break;
                case "diciembre":
                    if (diaNacimiento < 23) {
                        System.out.println("Tu signo es: Sagitario");
                    } else {
                        System.out.println("Tu signo es: Capricornio");
                    }
                    break;
                default:
                    System.out.println("¡Mes Incorrecto!");
            }
        } else {
            System.out.println("====================================");
            System.out.println("¡Ingrese valores entre 0 y 31!");
        }
    }
}
