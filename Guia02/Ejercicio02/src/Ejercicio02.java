
/**
 * Ejercicio 2.
 *
 * Escribe 2 programas similares: 1 que permita convertir dólares a euros y 1 que permita
 * convertir euros a dólares, luego que muestre los resultados.
 *
 * https://www.xe.com/es/currencyconverter/
 *
 * @author Hernández
 */
import java.text.NumberFormat;
import java.util.Scanner;

public class Ejercicio02 {

    private static String formatoNumero(double valor) {
        return NumberFormat.getNumberInstance().format(valor);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double dolaresEuros = 0.94910;
        double eurosDolares = 1.05360;

        System.out.print("Digite cantidad en Dolares: ");
        double dolares = s.nextDouble();

        System.out.print("Digite cantidad en Euros: ");
        double euros = s.nextDouble();

        if (dolares >= 0 && euros >= 0) {

            System.out.println("=======================================");
            // Dolares a Euros
            double conversionDolaresEuros = dolares * dolaresEuros;

            System.out.println(formatoNumero(dolares) + " dolares = " + formatoNumero(conversionDolaresEuros) + " euros");

            // Euros a Dolares
            double conversionEurosDolares = euros * eurosDolares;

            System.out.println(formatoNumero(euros) + " euros = " + formatoNumero(conversionEurosDolares) + " dolares");

        } else {
            System.out.println("====================================");
            System.out.println("¡Ingrese valores positivos!");
        }
    }
}
