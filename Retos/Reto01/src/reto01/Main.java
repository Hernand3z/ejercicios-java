package reto01;

import java.util.Scanner;

/**
 * Reto 1.
 *
 * Crear la clase Empleado utilizando ENCAPSULAMIENTO con las siguientes
 * características:
 *
 * Atributos: No Nit, Apellidos, Nombres, Dirección, Salario Devengado, Salario
 * Con Descuento, Bandera de Empleado Activo o Inactivo.
 *
 * Métodos: Crear un método para calcular el Salario con Descuento que es:
 * Salario Devengado – Descuento del 10% de Renta, Crear un método para Imprimir
 * el Nombre Completo del Contribuyente, Crear método para imprimir todos los
 * Atributos.
 *
 * @author Hernández
 */
public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese NIT: ");
        String numNit = s.nextLine();

        System.out.print("Ingrese Nombres: ");
        String nombres = s.nextLine();

        System.out.print("Ingrese Apellidos: ");
        String apellidos = s.nextLine();

        System.out.print("Ingrese Dirección: ");
        String direccion = s.nextLine();

        System.out.print("Ingrese Salario devengado: ");
        double salarioDevengado = s.nextDouble();

        System.out.print("Ingrese estado del empleado (true = activo; false = inactivo): ");
        boolean estadoEmpleado = s.nextBoolean();

        Empleado empleado = new Empleado(numNit, nombres, apellidos, direccion, salarioDevengado, estadoEmpleado);

        System.out.println("=====================================================");
        empleado.mostarNombre();
        empleado.mostrarEmpleado();
    }
}
