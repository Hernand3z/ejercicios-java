package reto03;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hernández
 */
public class General {

    private static Aula aula;
    private static Profesor profesor;
    private static List<Alumno> listaAlumnos;

    private static void crearAlumnos() {
        Alumno alumno1 = new Alumno("PR001", 7, "Rosendo", "Pineda", 18, 'M');
        Alumno alumno2 = new Alumno("CF002", 9, "Fabiola", "Castillo", 17, 'F');
        Alumno alumno3 = new Alumno("DM003", 8.5, "Maria", "Delgado", 19, 'F');
        Alumno alumno4 = new Alumno("CR004", 5, "Raul", "Castro", 18, 'M');
        listaAlumnos = new ArrayList<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
    }

    private static void crearProfesor() {
        profesor = new Profesor("Fisica", true, "Juan", "Carcamo", 39, 'M');
    }

    private static void crearAula() {
        aula = new Aula("C01", "Fisica", 10);
    }

    public static void mostrarListaAlumnos() {
        int aprobados = 0;
        int reprobados = 0;
        System.out.println("BIENVENIDO - Materia: " + aula.getMateria());
        System.out.println("==========================================");
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getPromedioFinal() >= 6) {
                System.out.println(alumno.getCarnet() + " - " + alumno.getNombre() + " " + alumno.getApellido() + " - " + alumno.getPromedioFinal() + " - Aprobado");
                aprobados++;
            } else {
                System.out.println(alumno.getCarnet() + " - " + alumno.getNombre() + " " + alumno.getApellido() + " - " + alumno.getPromedioFinal() + " - Reprobado");
                reprobados++;
            }
        }
        System.out.println("==========================================");
        System.out.println("Total aprobados: " + aprobados);
        System.out.println("Total reprobados: " + reprobados);
    }

    public static boolean isDarClase() {
        if (profesor.isAsistencia()) {
            if (profesor.getMateria().equals(aula.getMateria())) {
                return true;
            }
        }
        return false;
    }

    public static void iniciarAula() {
        crearAula();
        crearAlumnos();
        crearProfesor();
    }
}
