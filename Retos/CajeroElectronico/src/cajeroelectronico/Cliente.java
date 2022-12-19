package cajeroelectronico;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author Hernández
 */
public class Cliente {

    private String nombreCliente;
    private String numCuenta;
    private String usuario;
    private String contrasena;
    private double saldo;

    public Cliente(String nombreCliente, String numCuenta, String usuario, String contrasena, double saldo) {
        this.nombreCliente = nombreCliente;
        this.numCuenta = numCuenta;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.saldo = saldo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private static String formatoMoneda(double numero) {
        return NumberFormat.getCurrencyInstance(Locale.US).format(numero);
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombreCliente=" + nombreCliente + ", numCuenta=" + numCuenta + ", usuario=" + usuario + ", contrasena=" + contrasena + ", saldo=" + formatoMoneda(saldo) + '}';
    }
}
