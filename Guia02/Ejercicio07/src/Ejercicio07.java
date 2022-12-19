
/**
 * Ejercicio 7.
 *
 * Escribe un programa que calcule el salario semanal en base a las horas
 * trabajadas (usar número de horas, valor de la hora).
 *
 * @author Hernández
 */
import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese numero de horas trabajas en la semana: ");
        int numeroHoras = s.nextInt();

        System.out.print("Ingrese valor de la hora: ");
        double valorHora = s.nextDouble();

        if (numeroHoras > 0 && valorHora >= 0) {
            double salarioSemanal = numeroHoras * valorHora;

            System.out.println("=====================================");
            System.out.println("El salario semanal es: " + ((double) Math.round(salarioSemanal * 100d) / 100) + " dls");
        } else {
            System.out.println("=====================================");
            System.out.println("¡Ingrese valores positivos!");
        }
    }
}
