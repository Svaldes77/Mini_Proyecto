package modelo.soldados; // Paquete de la clase

import modelo.rangos.Nivel_militar; // Importa la enumeración Nivel_militar
import javax.swing.JOptionPane; // Importa la clase JOptionPane para mostrar mensajes

/**
 * La clase Capitan extiende la clase Soldado e implementa la interfaz OperacionesMilitares.
 */
public class Capitan extends Soldado {

    // Atributo propio de la clase Capitan que almacena la cantidad de soldados bajo su mando
    private int cantidadSoldadosBajoSuMando;

    /**
     * Constructor de la clase Capitan.
     *
     * @param nivel El nivel del capitán.
     * @param nombre El nombre del capitán.
     * @param id El ID del capitán.
     * @param rango El rango del capitán.
     * @param cantidadSoldadosBajoSuMando La cantidad de soldados bajo su mando.
     */
    public Capitan(int nivel, String nombre, String id, Nivel_militar rango, int cantidadSoldadosBajoSuMando) {
        super(nivel, nombre, id, rango); // Llama al constructor de la clase base Soldado
        this.cantidadSoldadosBajoSuMando = cantidadSoldadosBajoSuMando; // Inicializa el atributo propio de la clase Capitan
        this.nivel = 3; // Establece el nivel del capitán
    }

    /**
     * Método getter para obtener la cantidad de soldados bajo su mando.
     *
     * @return La cantidad de soldados bajo su mando.
     */
    public int getCantidadSoldadosBajoSuMando() {
        return cantidadSoldadosBajoSuMando;
    }

    /**
     * Método setter para establecer la cantidad de soldados bajo su mando.
     *
     * @param cantidadSoldadosBajoSuMando La nueva cantidad de soldados bajo su mando.
     */
    public void setNumSoldados(int cantidadSoldadosBajoSuMando) {
        this.cantidadSoldadosBajoSuMando = cantidadSoldadosBajoSuMando;
    }

    /**
     * Método sobrescrito de la clase Soldado para realizar una acción específica.
     */
    @Override
    public void realizarAccion() {
        JOptionPane.showMessageDialog(null, "Soy el " + getRango() + " " + getNombre() + "  estoy en la hora del almuerzo");
    }

    /**
     * Método sobrescrito de la interfaz OperacionesMilitares para asignar una misión.
     *
     * @param mision La misión asignada.
     */
    @Override
    public void asignarMision(String mision) {
        System.out.println("Capitán asignado a coordinar la misión: " + mision); // Mensaje que se imprime en consola
    }

    /**
     * Método para mostrar la cantidad de soldados bajo su mando.
     */
    public void mostrarNumerosoldados() {
        System.out.println("El numero de soldados bajo mi mando es: " + cantidadSoldadosBajoSuMando);
    }

    /**
     * Método sobrescrito de la interfaz OperacionesMilitares para reportar el estado.
     */
    @Override
    public void reportarEstado() {
        JOptionPane.showMessageDialog(null, "Capitán " + getNombre() + " reporto ofensiva contra los pinguinos de madagascar ");
    }

    /**
     * Método sobrescrito de la clase Soldado para representar el objeto como una cadena de texto.
     *
     * @return Una cadena de texto que representa el objeto.
     */
    @Override
    public String toString() {
        return super.toString() + ", Numero de soldados en mando: " + cantidadSoldadosBajoSuMando;
    }
}