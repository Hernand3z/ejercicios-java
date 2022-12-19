package reto04;

/**
 * Reto 4.
 *
 * Implementar la clase Inmueble con sus respectivas subclases, atributos y
 * métodos. Hacer uso de Herencia y Encapsulamiento.
 *
 * @author Hernández
 */
public class Main {
    
    public static void main(String[] args) {

        Casa casa = new Casa(2, "Casa de campo", "Gris", 150, 140, "Bulevar norte # 15 ", 4, 2, 250);
        Apartamento apartamento = new Apartamento(6, "Apartamento de lujo", "Blanco", 130, 130, "Boulevar Olimpico # 4", 1, 1, 200000);

        casa.mostarDatos();
        casa.alquilar();

        apartamento.mostarDatos();
        apartamento.vender();
    }
}
