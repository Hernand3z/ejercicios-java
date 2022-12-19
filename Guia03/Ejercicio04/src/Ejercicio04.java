
/**
 * Ejercicio 4.
 *
 * Crea un programa que calcule el salario semanal de un empleado, teniendo en cuenta que
 * las horas ordinarias (40 horas de trabajo) se pagan a $6 la hora. A partir de la hora 41, se
 * pagan a $10.
 *
 * @author Hernández
 */
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio04 {

    private static String formatoMoneda(double valor) {
        return NumberFormat.getCurrencyInstance(Locale.US).format(valor);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double salarioSemana = 0;

        System.out.print("Ingrese las horas trabajadas en la semana: ");
        int horasTrabajadas = s.nextInt();

        if (horasTrabajadas >= 0) {
            if (horasTrabajadas >= 0 && horasTrabajadas <= 40) {
                salarioSemana = horasTrabajadas * 6;
            } else {
                salarioSemana = (40 * 6) + (horasTrabajadas - 40) * 10;
            }
            System.out.println("Su salario semanal es: " + formatoMoneda(salarioSemana));
        } else {
            System.out.println("=============================================");
            System.out.println("¡Ingrese valores positivos!");
        }
    }
}
