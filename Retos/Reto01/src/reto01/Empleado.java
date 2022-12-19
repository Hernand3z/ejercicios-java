package reto01;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author Hernández
 */
public class Empleado {

    private String numNit;
    private String nombres;
    private String apellidos;
    private String direccion;
    private double salarioDevengado;
    private double salarioConDescuento;
    private boolean estadoEmpleado;

    public Empleado(String numNit, String nombres, String apellidos, String direccion, double salarioDevengado, boolean estadoEmpleado) {
        this.numNit = numNit;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.salarioDevengado = salarioDevengado;
        this.estadoEmpleado = estadoEmpleado;
    }

    public String getNumNit() {
        return numNit;
    }

    public void setNumNit(String numNit) {
        this.numNit = numNit;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSalarioDevengado() {
        return salarioDevengado;
    }

    public void setSalarioDevengado(double salarioDevengado) {
        this.salarioDevengado = salarioDevengado;
    }

    public boolean isEstadoEmpleado() {
        return estadoEmpleado;
    }

    public void setEstadoEmpleado(boolean estadoEmpleado) {
        this.estadoEmpleado = estadoEmpleado;
    }

    private void calcularSalario() {
        this.salarioConDescuento = salarioDevengado - (salarioDevengado * 0.10);
    }

    public void mostarNombre() {
        System.out.println("Nombre del contribuyente: " + nombres + " " + apellidos);
    }

    private static String formatoMoneda(double numero) {
        return NumberFormat.getCurrencyInstance(Locale.US).format(numero);
    }

    public void mostrarEmpleado() {
        calcularSalario();
        System.out.println("N° NIT: " + numNit);
        System.out.println("Nombres: " + nombres);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Dirección: " + direccion);
        System.out.println("Salario devengado: " + formatoMoneda(salarioDevengado));
        System.out.println("Salario con descuento: " + formatoMoneda(salarioConDescuento));
        System.out.println("Estado: " + estadoEmpleado);
    }
}
