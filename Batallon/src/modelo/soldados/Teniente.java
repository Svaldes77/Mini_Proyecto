package modelo.soldados; // Paquete de la clase

import javax.swing.JOptionPane; // Importa la clase JOptionPane para mostrar mensajes
import modelo.rangos.Nivel_militar; // Importa la enumeración Nivel_militar

/**
 * Clase Teniente que hereda de la clase Soldado e implementa la interfaz OperacionesMilitares.
 */
public class Teniente extends Soldado {

    // Atributo propio de la clase Teniente que almacena la unidad a su cargo
    private String unidad;

    /**
     * Constructor de la clase Teniente que recibe los parámetros nivel, nombre, id, rango y unidad.
     *
     * @param nivel El nivel del teniente.
     * @param nombre El nombre del teniente.
     * @param id El ID del teniente.
     * @param rango El rango del teniente.
     * @param unidad La unidad a cargo del teniente.
     */
    public Teniente(int nivel, String nombre, String id, Nivel_militar rango, String unidad) {
        super(nivel, nombre, id, rango); // Llamada al constructor de la clase padre
        this.rango = Nivel_militar.TENIENTE;
        this.nivel = 2; // Nivel de Teniente
        this.unidad = unidad;
    }

    // Métodos Get y Set
    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    /**
     * Método sobrescrito de la clase Soldado para realizar una acción específica.
     */
    @Override
    public void realizarAccion() {
        JOptionPane.showMessageDialog(null, "Soy el " + getRango() + " " + getNombre() + "  estoy supervisando la trinchera nazi");
    }

    /**
     * Método para anunciar la unidad a cargo del teniente.
     */
    public void anunciarUnidad() {
        JOptionPane.showMessageDialog(null, "Soy el " + getRango() + " " + getNombre() + " La unidad a mi cargo es: " + unidad);
    }

    /**
     * Método sobrescrito de la clase Soldado para representar el objeto como una cadena de texto.
     *
     * @return Una cadena de texto que representa el objeto.
     */
    @Override
    public String toString() {
        return super.toString() + ", Unidad: " + unidad;
    }

    /**
     * Método sobrescrito de la interfaz OperacionesMilitares para asignar una misión.
     *
     * @param mision La misión asignada.
     */
    @Override
    public void asignarMision(String mision) {
        System.out.println("El teniente le han asignado la misión: " + mision);
    }

    /**
     * Método sobrescrito de la interfaz OperacionesMilitares para reportar el estado.
     */
    @Override
    public void reportarEstado() {
        JOptionPane.showMessageDialog(null, "Soy el teniente " + getNombre() + "  me reporto en la trinchera con la unidad " + getUnidad());
    }
}