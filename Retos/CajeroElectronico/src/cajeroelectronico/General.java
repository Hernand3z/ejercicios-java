package cajeroelectronico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hernández
 */
public class General {

    private static Cajero cajero = null;
    public static List<Cliente> clientes = null;

    public static void crearClientes() {
        Cliente cliente1 = new Cliente("Juan Valdez", "00001", "juan", "123", 100);
        Cliente cliente2 = new Cliente("Sofia Salazar", "00002", "sofia", "123", 200);
        Cliente cliente3 = new Cliente("Jorge Hernández", "00003", "jorge", "123", 300);
        clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
    }

    public static void iniciarCajero() {
        cajero = new Cajero();
        crearClientes();
        cajero.setClientes(clientes);
    }

    public static Cajero getCajero() {
        return cajero;
    }
}
