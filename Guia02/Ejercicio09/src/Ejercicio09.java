
/**
 * Ejercicio 9.
 *
 * Escribe 2 programas similares: 1 que permita convertir Mb a Kb y 1 que permita
 * convertir de Kb a Mb, luego que muestre los resultados.
 *
 * @author Hernández
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio09 {

    // Eliminar la notación cientifica
    public static String EliminarNotacionCientifica(double Número) {
        return new DecimalFormat("#.####################################").format(Número);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese Mb: ");
        double Mb = s.nextDouble();

        System.out.print("Ingrese kb: ");
        double kb = s.nextDouble();

        if (Mb >= 0 && kb >= 0) {

            System.out.println("=====================================");

            // Mb a kb
            double conversionKb = 1024 * Mb;
            System.out.println(Mb + " Mb = " + conversionKb + " kb");

            // kb a Mb
            double conversionMb = 0.00097656 * kb;
            System.out.println(kb + " kb = " + EliminarNotacionCientifica(conversionMb) + " Mb");

        } else {
            System.out.println("==================================");
            System.out.println("¡Ingrese valores positivos!");
        }
    }
}
