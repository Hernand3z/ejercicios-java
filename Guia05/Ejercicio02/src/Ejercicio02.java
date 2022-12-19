
/**
 * Ejercicio 2.
 *
 * Defina 3 arreglos de 20 números enteros cada 1, con los siguientes nombres: numero,
 * cuadrado, cubo. Carga el arreglo numero con valores aleatorios entre 0 y 100. En el
 * arreglo cuadrado se deben almacenar los cuadrados de los valores que hay en el arreglo
 * numero. En el arreglo cubo se deben almacenar los cubos de los valores que hay en
 * numero. Muestra el contenido de los 3 arreglos en columnas.
 *
 * @author Hernández
 */
public class Ejercicio02 {

    public static void main(String[] args) {

        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        // Números aleatorios
        for (int i = 0; i < 20; i++) {
            numero[i] = ((int) (Math.random() * 100));
        }

        // Calculando el cuadrado de n
        for (int i = 0; i < 20; i++) {
            cuadrado[i] = (int) Math.pow((double) numero[i], 2);
        }

        // Calculando el cudo de n
        for (int i = 0; i < 20; i++) {
            cubo[i] = (int) Math.pow((double) numero[i], 3);
        }

        // Mostrando resultado
        System.out.println("Números \t Cuadrado \t Cubo");
        System.out.println("============================================");
        for (int i = 0; i < 20; i++) {
            System.out.println(numero[i] + "\t\t" + cuadrado[i] + "\t\t" + cubo[i]);
        }
    }
}
