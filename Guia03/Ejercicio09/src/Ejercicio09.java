
/**
 * Ejercicio 9.
 *
 * Realiza un programa que permita pasar un cuestionario tipo test con 10 preguntas sobre
 * la asignatura JAVA, cada pregunta acertada sumara un punto, al final deberá mostrar la
 * calificación obtenida en base a las preguntas acertadas correctamente.
 *
 * @author Hernández
 */
import java.util.Scanner;

public class Ejercicio09 {

    // Respuestas
    final int[] respuesta = {1, 2, 3, 1, 2, 3, 1, 2, 3, 1};
    // Preguntas
    int[] pregunta = new int[10];

    public void capturarDatos() {

        Scanner s = new Scanner(System.in);

        // Pregunta 1
        System.out.println("1-¿Qué tipo de lenguaje es Java?");
        System.out.println("1- Intermedio. 2- Interpretado. 3- Compilado");
        pregunta[0] = s.nextInt();

        // Pregunta 2
        System.out.println("2- Software que traduce un programa escrito en un lenguaje de alto nivel en lenguaje de máquina.");
        System.out.println("1- ByteCode. 2- Compilador. 3- Netbeans");
        pregunta[1] = s.nextInt();

        // Pregunta 3
        System.out.println("3-Entorno de desarrollo integrado libre, hecho principalmente para el lenguaje de programación Java");
        System.out.println("1- Dev-C++. 2- Android Studio. 3- Netbeans");
        pregunta[2] = s.nextInt();

        // Pregunta 4
        System.out.println("4-Es un entorno de tiempo de ejecución, ejecuta instrucciones generadas por un compilador Java");
        System.out.println("1- JVM. 2- JRE. 3- JDK");
        pregunta[3] = s.nextInt();

        // Pregunta 5
        System.out.println("5-Para compilar un archivo java en la la terminal usamos en comando: ");
        System.out.println("1- javadoc. 2- javac. 3- javad.");
        pregunta[4] = s.nextInt();

        // Pregunta 6
        System.out.println("6-Espacio en memoria que almacena un valor que puede cambiar durante la ejecución de un programa");
        System.out.println("1-Operador Lógico. 2- Constante. 3- Variable.");
        pregunta[5] = s.nextInt();

        // Pregunta 7
        System.out.println("7-Espacio en la memoria que almacena un valor que no puede variar durante la ejecución de un programa.");
        System.out.println("1- Constante. 2- Variable. 3- Operador Aritmético.");
        pregunta[6] = s.nextInt();

        // Pregunta 8
        System.out.println("8- Integer.parseInt() es utilizado para convertir valores a: ");
        System.out.println("1- Flotantes. 2- Enteros. 3- Double.");
        pregunta[7] = s.nextInt();

        // Pregunta 9
        System.out.println("9- Double.parseDouble() es utilizado para convertir valores a: ");
        System.out.println("1- Flotantes. 2- Enteros. 3- Double.");
        pregunta[8] = s.nextInt();

        // Pregunta 10
        System.out.println("10- Al declarar constantes utilizamos la palabra reservada: ");
        System.out.println("1- final. 2- const. 3- val");
        pregunta[9] = s.nextInt();
    }

    public int calcularNota() {
        int nota = 0;

        for (int i = 0; i < 10; i++) {
            if (pregunta[i] == respuesta[i]) {
                nota++;
            }
        }
        return nota;
    }

    public static void main(String[] args) {

        Ejercicio09 metodo = new Ejercicio09();

        metodo.capturarDatos();

        System.out.println("==========================");
        System.out.println("Tu nota final es: " + metodo.calcularNota());
    }
}
