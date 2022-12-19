package reto04;

/**
 * @author Hernández
 */
public class Apartamento extends Inmueble {

    private int nivel;

    public Apartamento(int nivel, String tipoInmueble, String Color, double areaTerreno, double areaConstruida, String direccion, int numDormitorio, int numBanios, double precio) {
        super(tipoInmueble, Color, areaTerreno, areaConstruida, direccion, numDormitorio, numBanios, precio);
        this.nivel = nivel;
    }

    public void mostarDatos() {
        System.out.println("===============================================");
        System.out.println("Detalles de Inmuble");
        System.out.println("Tipo de Inmueble: " + getTipoInmueble());
        System.out.println("Color: " + getColor());
        System.out.println("Area de terreno: " + getAreaTerreno() + " m2");
        System.out.println("Area construida: " + getAreaConstruida() + " m2");
        System.out.println("Nivel: " + nivel);
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Cantidad de dormitorios: " + getNumDormitorio());
        System.out.println("Cantidad de baños: " + getNumBanios());
        System.out.println("Precio: " + formatoMoneda(getPrecio()));
    }
}
