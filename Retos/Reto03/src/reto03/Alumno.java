package reto03;

/**
 * @author Hernández
 */
public class Alumno extends Persona {

    private String carnet;
    private double promedioFinal;

    public Alumno(String carnet, double promedioFinal, String nombre, String apellido, int edad, char sexo) {
        super(nombre, apellido, edad, sexo);
        this.carnet = carnet;
        this.promedioFinal = promedioFinal;
    }

    public String getCarnet() {
        return carnet;
    }

    public double getPromedioFinal() {
        return promedioFinal;
    }
}
