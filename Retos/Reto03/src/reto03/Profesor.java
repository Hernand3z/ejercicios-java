package reto03;

/**
 * @author Hernández
 */
public class Profesor extends Persona {

    private String materia;
    private boolean asistencia;

    public Profesor(String materia, boolean asistencia, String nombre, String apellido, int edad, char sexo) {
        super(nombre, apellido, edad, sexo);
        this.materia = materia;
        this.asistencia = asistencia;
    }

    public String getMateria() {
        return materia;
    }

    public boolean isAsistencia() {
        return asistencia;
    }
}
