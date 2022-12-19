package reto03;

/**
 * Reto 3.
 *
 * Queremos representar con programación orientada a objetos, un aula con
 * estudiantes y un profesor. Tanto de los estudiantes como de los profesores
 * necesitamos saber su nombre, apellido, edad y sexo. De los estudiantes,
 * queremos saber también su carnet y calificación actual (entre 0 y 10) y del
 * profesor que materia imparte. El aula debe tener un identificador numérico,
 * el número máximo de estudiantes y para que esta destinada (matemáticas,
 * filosofía o física). Un aula para que se pueda dar clase necesita que el
 * profesor tenga asistencia y que el profesor imparta la materia
 * correspondiente en el aula asignada (un profesor de filosofía no puede dar en
 * un aula de matemáticas). El objetivo es crear un aula de alumnos y un
 * profesor y determinar si puede darse clase, teniendo en cuenta las
 * condiciones antes dichas. Si se puede dar clase mostrar cuantos alumnos y
 * alumnas están aprobados de momento.
 *
 * @author Hernández
 */
public class Main {

    public static void main(String[] args) {

        General.iniciarAula();

        if (General.isDarClase()) {
            General.mostrarListaAlumnos();
        } else {
            System.out.println("!No puede dar clases¡");
        }
    }
}
