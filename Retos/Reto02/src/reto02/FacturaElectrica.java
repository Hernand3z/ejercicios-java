package reto02;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author Hernández
 */
public class FacturaElectrica {

    private String numCuenta;
    private int lecturaActualMedidor;
    private int lecturaAnteriorMedidor;
    private int multiplicador;
    private int consumoMensual;
    private double consumoDiario;
    private double valorFactura;

    public FacturaElectrica(String numCuenta, int lecturaActualMedidor, int lecturaAnteriorMedidor, int multiplicador) {
        this.numCuenta = numCuenta;
        this.lecturaActualMedidor = lecturaActualMedidor;
        this.lecturaAnteriorMedidor = lecturaAnteriorMedidor;
        this.multiplicador = multiplicador;
    }

    private void calcularConsumoDiario() {
        this.consumoDiario = consumoMensual / 30;
    }

    private void calcularConsumoMes() {
        this.consumoMensual = (lecturaActualMedidor - lecturaAnteriorMedidor) * multiplicador;
    }

    private void calcularValorFactura() {
        this.valorFactura = consumoMensual * 0.20;
    }

    private static String formatoMoneda(double numero) {
        return NumberFormat.getCurrencyInstance(Locale.US).format(numero);
    }

    public void mostarDatos() {
        calcularConsumoMes();
        calcularConsumoDiario();
        calcularValorFactura();

        System.out.println("=======================================================");
        System.out.println("N° Factura: " + numCuenta);
        System.out.println("Lectura actual del medidor: " + lecturaActualMedidor);
        System.out.println("Lectura anterior del medidor: " + lecturaAnteriorMedidor);
        System.out.println("Multiplicador: " + multiplicador);
        System.out.println("Consumo mensual: " + consumoMensual + " kWh");
        System.out.println("Consumo diario: " + consumoDiario + " kWh");
        System.out.println("Valor de la factura: " + formatoMoneda(valorFactura));
        System.out.println("=======================================================");
    }
}
