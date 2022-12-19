package ejercicio02;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author Hernández
 */
public class Vendedor {

    private String nombreVendedor;
    private double salarioBruto;
    private double salarioLiquido;
    private double cantidadComputadoras;
    private double retencionRenta;
    private final double salarioBase = 300;

    private static String formatoMoneda(double valor) {
        return NumberFormat.getCurrencyInstance(Locale.US).format(valor);
    }

    public Vendedor(String nombreVendedor, double cantidadComputadoras) {
        this.nombreVendedor = nombreVendedor;
        this.cantidadComputadoras = cantidadComputadoras;
    }

    private void calcularSalarioBruto() {
        this.salarioBruto = salarioBase + (cantidadComputadoras * 50);
    }

    private void calcularRetencionRenta() {
        this.retencionRenta = salarioBruto * 0.10;
    }

    private void calcularSalarioLiquido() {
        this.salarioLiquido = salarioBruto - retencionRenta;
    }

    public void mostarDatos() {
        calcularSalarioBruto();
        calcularRetencionRenta();
        calcularSalarioLiquido();
        System.out.println("Nombre vendedor: " + nombreVendedor);
        System.out.println("Salario bruto: " + formatoMoneda(salarioBruto));
        System.out.println("Retención de Renta: -" + formatoMoneda(retencionRenta));
        System.out.println("Salario liquido: " + formatoMoneda(salarioLiquido));
    }
}
