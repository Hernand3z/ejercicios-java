package reto05;

import javax.swing.JOptionPane;

/**
 * Reto 5.
 *
 * Crear la clase PilotoDeFormula1 con sus respectivos atributos y métodos.
 *
 * @author Hernández
 */
public class Main {

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog(null, "Ingrese nombre: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese edad: "));
        String nacionalidad = JOptionPane.showInputDialog(null, "Ingrese nacionalidad: ");
        String equipo = JOptionPane.showInputDialog(null, "Ingrese equipo: ");

        Piloto piloto1 = new Piloto(nombre, edad, nacionalidad, equipo);
        piloto1.mostrarPiloto();
    }
}
