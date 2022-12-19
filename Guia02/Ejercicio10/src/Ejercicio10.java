
/**
 * Ejercicio 10.
 *
 * Escribe un programa que calcule el precio final de un productos según su base
 * imponible (precio antes de impuestos), el tipo de iva aplicado (general, reducido o
 * super reducido) y el código promocional.
 * - Los tipos de iva general, reducido y super reducido son: 21%, 10% y 4% respectivamente.
 * - Los códigos promocionales pueden ser: Nopro, Mitad, Meno5, 5porc que significan respectivamente: no promoción, el
 *   precio se reduce a la mitad, se descuentan $5 o se descuenta el 5%.
 * - El ejercicio debe mostrar los valores correctos.
 *
 * Ejemplo de la salida:
 * Introduzca la base imponible: 25
 * Introduzca el tipo de iva (general, reducido o super reducido): reducido
 * Introduzca el código promocional(nopro, mitad, meno5, 5porc): mitad
 * Base imponible: 25.00
 * IVA (10%): 2.5
 * Precio con IVA: 27.5
 * Cod. Promo (mitad): -13.75
 * Total: 13.75
 *
 * @author Hernández
 */
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio10 {

    double baseImponible;
    String tipoIVA;
    String codigoPromocional;
    double iva;
    double cargoIVA;
    double precioIVA;
    double descuentoPromocion;
    double total;

    public void capturarDatos() {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese base imponible: ");
        baseImponible = Double.parseDouble(s.nextLine());

        System.out.print("Introduzca el tipo de iva (general, reducido o super reducido): ");
        tipoIVA = s.nextLine();

        System.out.print("Introduzca el código promocional(nopro, mitad, meno5, 5porc): ");
        codigoPromocional = s.nextLine();
    }

    public void calcularIVA() {

        switch (tipoIVA.toLowerCase().trim()) {
            case "general":
                iva = 0.21;
                break;
            case "reducido":
                iva = 0.1;
                break;
            case "super reducido":
                iva = 0.04;
                break;
        }

        cargoIVA = baseImponible * iva;
        precioIVA = baseImponible + cargoIVA;
    }

    public void codigoPromocional() {

        switch (codigoPromocional.toLowerCase().trim()) {
            case "mitad":
                descuentoPromocion = precioIVA / 2;
                break;
            case "meno5":
                descuentoPromocion = 5;
                break;
            case "5porc":
                descuentoPromocion = precioIVA * 0.05;
                break;
            case "nopro":
                descuentoPromocion = 0;
                break;
        }

        total = precioIVA - descuentoPromocion;
    }

    private static String formatoMoneda(double valor) {
        return NumberFormat.getCurrencyInstance(Locale.US).format(valor);
    }

    public static void main(String[] args) {

        Ejercicio10 metodo = new Ejercicio10();

        metodo.capturarDatos();
        metodo.calcularIVA();
        metodo.codigoPromocional();

        // Salida de datos
        System.out.println("=========================================================================");
        System.out.println("Base imponible: " + formatoMoneda(metodo.baseImponible));
        System.out.println("IVA (" + (metodo.iva * 100) + "%) : " + formatoMoneda(metodo.cargoIVA));
        System.out.println("Precio con IVA: " + formatoMoneda(metodo.precioIVA));
        System.out.println("Cod. Promo (" + metodo.codigoPromocional.toLowerCase() + "): " + "-" + formatoMoneda(metodo.descuentoPromocion));
        System.out.println("Total: " + formatoMoneda(metodo.total));
    }
}
