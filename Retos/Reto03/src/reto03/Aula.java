package reto03;

/**
 * @author Hernández
 */
public class Aula {

    private String identificadorAula;
    private String materia;
    private int maxCapacidad;

    public Aula(String identificadorAul, String materia, int maxCapacidad) {
        this.identificadorAula = identificadorAula;
        this.materia = materia;
        this.maxCapacidad = maxCapacidad;
    }

    public String getMateria() {
        return materia;
    }
}
