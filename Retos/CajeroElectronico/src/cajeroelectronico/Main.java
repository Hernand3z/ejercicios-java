package cajeroelectronico;

/**
 * Cajero Electrónico.
 *
 * Implementar la simulación de un cajero eléctronico.
 *
 * @author Hernández
 */
public class Main {

    public static void main(String[] args) {

        General.iniciarCajero();
        Cajero cajero = General.getCajero();

        Cliente clienteLogeado = cajero.login("jorge", "123");

        if (clienteLogeado == null) {
            System.out.println("¡Datos Incorrectos!");
        } else {
            System.out.println("Bienvenido: " + clienteLogeado.toString());
        }
    }
}
