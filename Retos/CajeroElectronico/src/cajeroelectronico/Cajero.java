package cajeroelectronico;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hernández
 */
public class Cajero {

    List<Cliente> clientes = new ArrayList<>();

    /**
     * @param usuario
     * @param contrasena
     * @return El cliente que corresponde a un usuario y contraseña determinado.
     */
    public Cliente login(String usuario, String contrasena) {
        Cliente clienteLogeado = null;

        for (Cliente cliente : clientes) {
            if (cliente.getUsuario().equals(usuario)) {
                if (cliente.getContrasena().equals(contrasena)) {
                    clienteLogeado = cliente;
                }
                break;
            }
        }
        return clienteLogeado;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

}
