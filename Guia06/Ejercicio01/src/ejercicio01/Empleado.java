package ejercicio01;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author Hernández
 */
public class Empleado {

    private String nombreEmpleado;
    private int diasTrabajados;
    private double salario;
    private double horasExtras;
    private final double salarioDiario = 10;
    private final double porcentaje = 0.10;

    private static String formatoMoneda(double valor) {
        return NumberFormat.getCurrencyInstance(Locale.US).format(valor);
    }

    public Empleado(String nombreEmpleado, int diasTrabajados, double horasExtras) {
        this.nombreEmpleado = nombreEmpleado;
        this.diasTrabajados = diasTrabajados;
        this.horasExtras = horasExtras;
    }

    private void calcularSalario() {
        this.salario = (salarioDiario * diasTrabajados) + (horasExtras * porcentaje);
    }

    public void mostrarDatos() {
        calcularSalario();
        System.out.println("Nombre empleado: " + nombreEmpleado);
        System.out.println("Salario: " + formatoMoneda(salario));
    }
}
