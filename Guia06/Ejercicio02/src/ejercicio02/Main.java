package ejercicio02;

import javax.swing.JOptionPane;

/**
 * Ejercicio 2.
 *
 * Una empresa de venta de computadoras paga a su personal de ventas un salario
 * de $300,00 más una comisión de $50,00 por computadora vendida. Diseñar un
 * programa para calcular el salario de un vendedor en un determinado mes,
 * conociendo el nº de computadoras vendidas. Al salario se debe de retener el
 * 10% en concepto de renta. Imprimir el nombre del vendedor, el salario
 * bruto, la retención de la renta y el salario liquido.
 *
 * @author Hernández
 */
public class Main {

    public static void main(String[] args) {

        String nobreVendedor = JOptionPane.showInputDialog(null, "Digite su Nombre:");
        int cantidadComputadoras = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de computadoras vendidas: "));

        if (cantidadComputadoras >= 0) {
            Vendedor vendedor = new Vendedor(nobreVendedor, cantidadComputadoras);
            vendedor.mostarDatos();
        } else {
            JOptionPane.showMessageDialog(null, "¡Ingrese valores positivos!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
