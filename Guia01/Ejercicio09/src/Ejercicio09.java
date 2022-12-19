
/**
 * Ejercicio 9.
 *
 * Tomando de base el ejercicio 4, modifica tu horario de clases para que el nombre de cada
 * asignatura aparezca con un color diferente, usa los códigos de colores para imprimir en
 * pantalla.
 *
 * @author Hernández
 */
public class Ejercicio09 {

    public static void main(String args[]) {
        // Variables de colores
        String negro = "\033[30m";
        String rojo = "\033[31m";
        String verde = "\033[32m";
        String naranja = "\033[33m";
        String azul = "\033[34m";
        String morado = "\033[35m";
        String cyan = "\033[36m";
        String blanco = "\033[37m";

        System.out.println(rojo + "-------------------------------------------------------------------------------------------------");
        System.out.println(verde + "HORARIO \t\t\t MIERCOLES \t JUEVES \t VIERNES \t SABADO");
        System.out.println(rojo + "-------------------------------------------------------------------------------------------------");
        System.out.println(azul + "Base de Datos \t\t\t\t\t\t\t 16:30-20:30");
        System.out.println(morado + "Programación V \t\t\t\t\t\t\t\t\t 08:00-12:00");
        System.out.println(cyan + "Redes y Comunicaciones \t\t 17:00-18:40 \t 17:00-18:40");
        System.out.println(naranja + "Seguridad de Sistemas \t\t 18:50-20:30 \t 18:50-20:30");
        System.out.println(rojo + "-------------------------------------------------------------------------------------------------");
    }
}
