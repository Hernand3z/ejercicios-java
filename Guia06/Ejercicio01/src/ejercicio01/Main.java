package ejercicio01;

import javax.swing.JOptionPane;

/**
 * Ejercicio 1.
 *
 * Escriba un programa para calcular el salario de un empleado sabiendo que su
 * salario diario es de $10.00 y que el pago por hora extra es del 10% del
 * salario diario. El programa deberá permitir ingresar el nombre del empleado,
 * el número de días trabajados y el número total de horas extras. El programa
 * deberá de imprimir el nombre del empleado y el salario final del empleado.
 *
 * @author Hernández
 */
public class Main {

    public static void main(String[] args) {

        String nombreEmpleado = JOptionPane.showInputDialog(null, "Digite su Nombre:");
        int diasTrabajados = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite dias trabajados: "));
        double horasExtras = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite horas Extras: "));

        if (diasTrabajados >= 0 && horasExtras >= 0) {
            Empleado empleado1 = new Empleado(nombreEmpleado, diasTrabajados, horasExtras);
            empleado1.mostrarDatos();
        } else {
            JOptionPane.showMessageDialog(null, "¡Ingrese valores positivos!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
