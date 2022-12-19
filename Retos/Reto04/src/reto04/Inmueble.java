package reto04;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author Hernández
 */
public class Inmueble {

    private String tipoInmueble;
    private String Color;
    private double areaTerreno;
    private double areaConstruida;
    private String direccion;
    private int numDormitorio;
    private int numBanios;
    private double precio;

    public Inmueble(String tipoInmueble, String Color, double areaTerreno, double areaConstruida, String direccion, int numDormitorio, int numBanios, double precio) {
        this.tipoInmueble = tipoInmueble;
        this.Color = Color;
        this.areaTerreno = areaTerreno;
        this.areaConstruida = areaConstruida;
        this.direccion = direccion;
        this.numDormitorio = numDormitorio;
        this.numBanios = numBanios;
        this.precio = precio;
    }

    public String getTipoInmueble() {
        return tipoInmueble;
    }

    public String getColor() {
        return Color;
    }

    public double getAreaTerreno() {
        return areaTerreno;
    }

    public double getAreaConstruida() {
        return areaConstruida;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumDormitorio() {
        return numDormitorio;
    }

    public int getNumBanios() {
        return numBanios;
    }

    public double getPrecio() {
        return precio;
    }

    public void vender() {
        System.out.println(tipoInmueble + ": VENDIDO");
    }

    public void alquilar() {
        System.out.println(tipoInmueble + ": ALQUILADO");
    }

    public static String formatoMoneda(double numero) {
        return NumberFormat.getCurrencyInstance(Locale.US).format(numero);
    }
}
