
/**
 * Ejercicio 8.
 *
 * Desarrolla un programa que dada una hora especifica (tomar en cuenta la captura
 * de horas y minutos), calcule los segundos para llegar a la media noche, para luego
 * imprimir en pantalla.
 *
 * @author Hernández
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        LocalDate horaIngresada = LocalDate.now();

        final int segundosMinutos = 60;
        final int segundosHora = 3600;
        final int segudosDia = 86400;

        int x = 0, y = 0, resultado = 0;

        System.out.print("Ingrese la hora (formato 24hrs): ");
        int hora = s.nextInt();

        System.out.print("Ingrese los minutos: ");
        int minutos = s.nextInt();

        if ((minutos >= 0 && minutos <= 60) && (hora >= 0 && hora < 24)) {

            // Minutos a segundos
            if (minutos >= 0 && minutos <= 60) {
                y = minutos * segundosMinutos;
            }

            // Horas a segundos
            if (hora >= 0 && hora < 24) {
                x = hora * segundosHora;
            }

            resultado = segudosDia - x - y;

            // Formatear Hora
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");

            System.out.println("==========================================");
            System.out.println("La hora es: " + formato.format(horaIngresada.atTime(hora, minutos)));
            System.out.println("¡Faltan " + resultado + " segundos para la medianoche!");

        } else {
            System.out.println("==========================================");
            System.out.println("¡Ingrese valores validos!");
        }
    }
}
