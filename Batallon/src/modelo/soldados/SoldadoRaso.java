package modelo.soldados; // Paquete de la clase

import javax.swing.JOptionPane; // Importa la clase JOptionPane para mostrar mensajes
import modelo.rangos.Nivel_militar; // Importa la enumeración Nivel_militar

/**
 * Clase SoldadoRaso que hereda de la clase Soldado e implementa la interfaz OperacionesMilitares.
 */
public class SoldadoRaso extends Soldado {

    /**
     * Constructor de la clase SoldadoRaso que recibe los parámetros nivel, nombre, id y rango.
     *
     * @param nivel El nivel del soldado raso.
     * @param nombre El nombre del soldado raso.
     * @param id El ID del soldado raso.
     * @param rango El rango del soldado raso.
     */
    public SoldadoRaso(int nivel, String nombre, String id, Nivel_militar rango) {
        super(nivel, nombre, id, rango);
        this.nivel = 1; // Nivel de soldado raso
        this.rango = Nivel_militar.SOLDADO_RASO; // Inicialización de atributos propios de la clase SoldadoRaso
    }

    /**
     * Método sobrescrito de la interfaz OperacionesMilitares para asignar una misión.
     *
     * @param mision La misión asignada.
     */
    @Override
    public void asignarMision(String mision) {
        System.out.println("Soldado Raso asignado a la misión: " + mision);
    }

    /**
     * Método sobrescrito de la interfaz OperacionesMilitares para reportar el estado.
     */
    @Override
    public void reportarEstado() {
        JOptionPane.showMessageDialog(null, "Soldado Raso " + getNombre() + " reportandome desde la selva");
    }

    /**
     * Método sobrescrito de la clase Soldado para representar el objeto como una cadena de texto.
     *
     * @return Una cadena de texto que representa el objeto.
     */
    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * Método sobrescrito de la clase Soldado para realizar una acción específica.
     */
    @Override
    public void realizarAccion() {
        JOptionPane.showMessageDialog(null, "Soy el " + getRango() + " " + getNombre() + "  estoy en la trinchera combatiendo contra el sr. tocino");
    }
}