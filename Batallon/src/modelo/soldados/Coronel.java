package modelo.soldados; // Paquete de la clase

import modelo.rangos.Nivel_militar; // Importa la enumeración Nivel_militar
import javax.swing.JOptionPane; // Importa la clase JOptionPane para mostrar mensajes

/**
 * La clase Coronel extiende la clase Soldado e implementa la interfaz OperacionesMilitares.
 */
public class Coronel extends Soldado {

    // Atributo que almacena la estrategia del coronel
    private String estrategia;

    /**
     * Constructor de la clase Coronel.
     *
     * @param nivel El nivel del coronel.
     * @param nombre El nombre del coronel.
     * @param id El ID del coronel.
     * @param rango El rango del coronel.
     * @param estrategia La estrategia del coronel.
     */
    public Coronel(int nivel, String nombre, String id, Nivel_militar rango, String estrategia) {
        super(nivel, nombre, id, rango); // Llama al constructor de la clase base Soldado
        this.estrategia = estrategia; // Inicializa el atributo propio de la clase Coronel
        this.nivel = 4; // Establece el nivel del coronel
    }

    /**
     * Método sobrescrito de la clase Soldado para realizar una acción específica.
     */
    @Override
    public void realizarAccion() {
        JOptionPane.showMessageDialog(null, "Soy el " + getRango() + " " + getNombre() + "  estoy libre viendo planeta vegeta");
    }

    /**
     * Método sobrescrito de la interfaz OperacionesMilitares para reportar el estado.
     */
    @Override
    public void reportarEstado() {
        JOptionPane.showMessageDialog(null, "Coronel " + getNombre() + " reporto la estrategia: " + getEstrategia() + " en su fase final");
    }

    /**
     * Método sobrescrito de la interfaz OperacionesMilitares para asignar una misión.
     *
     * @param mision La misión asignada.
     */
    @Override
    public void asignarMision(String mision) {
        System.out.println("Soy un coronel y estoy asignando a la misión de: " + mision);
    }

    /**
     * Método getter para obtener la estrategia.
     *
     * @return La estrategia del coronel.
     */
    public String getEstrategia() {
        return estrategia;
    }

    /**
     * Método setter para establecer la estrategia.
     *
     * @param estrategia La nueva estrategia del coronel.
     */
    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }

    /**
     * Método para mostrar la estrategia del coronel.
     */
    public void mostrarEstrategia() {
        System.out.println("La estrategia del coronel es: " + estrategia);
    }

    /**
     * Método sobrescrito de la clase Soldado para representar el objeto como una cadena de texto.
     *
     * @return Una cadena de texto que representa el objeto.
     */
    @Override
    public String toString() {
        return super.toString() + ", Estrategia: " + estrategia;
    }

    /**
     * Método para asignar una unidad.
     *
     * @param unidad La unidad asignada.
     */
    public void asignarUnidad(String unidad) {
        System.out.println("El Coronel " + getNombre() + " ha asignado la unidad: " + unidad);
    }
}