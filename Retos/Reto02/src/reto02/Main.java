package reto02;

import java.util.Scanner;

/**
 * Reto 2.
 *
 * Crear la clase Factura Eléctrica utilizando ENCAPSULAMIENTO con las
 * siguientes características:
 *
 * Atributos: No Cuenta, Lectura actual del medidor, Lectura anterior del
 * medidor, Multiplicador ,Consumo Mensual, Consumo Diario y Valor Factura.
 *
 * Métodos: Crear un método para calcular el Consumo en el mes, Crear un método
 * para calcular el Consumo Diario, Crear un método para calcular el Valor
 * Factura y Crear método para imprimir todos los Atributos.
 *
 * Ejemplo del cálculo: Lectura Anterior: 2010, Lectura Actual: 3025,
 * Multiplicador: 10, Días de facturación: 30. Consumo Mensual: (lectura actual
 * - lectura anterior) x el multiplicador. Consumo Mensual = (3025kWh 2010kWh) *
 * 10 = 10150kWh. Valor factura = Consumo Mesual * 0.20.
 *
 * @author Hernández
 */
public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese N° Cuenta: ");
        String numCuenta = s.nextLine();

        System.out.print("Ingrese lectura actual del medidor: ");
        int lecturaActualMedidor = s.nextInt();

        System.out.print("Ingrese lectura anterior del medidor: ");
        int lecturaAnteriorMedidor = s.nextInt();

        System.out.print("Ingrese multiplicador: ");
        int multiplicador = s.nextInt();

        FacturaElectrica facturaElectrica = new FacturaElectrica(numCuenta, lecturaActualMedidor, lecturaAnteriorMedidor, multiplicador);

        facturaElectrica.mostarDatos();
    }
}
