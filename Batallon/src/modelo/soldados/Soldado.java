package modelo.soldados; // Paquete de la clase

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.misiones.OperacionesMilitares;
import modelo.rangos.Nivel_militar;
import modelo.rangos.Rango;

/**
 * La clase Soldado extiende la clase Rango e implementa la interfaz OperacionesMilitares.
 */
public class Soldado extends Rango implements OperacionesMilitares {

    // Atributos de la clase Soldado
    private final String nombre;
    private final String id;
    protected Nivel_militar rango;
    private static int contadorSoldados = 0; // Contador de Soldados

    /**
     * Constructor de la clase Soldado que recibe los parámetros nivel, nombre, id y rango.
     *
     * @param nivel El nivel del soldado.
     * @param nombre El nombre del soldado.
     * @param id El ID del soldado.
     * @param rango El rango del soldado.
     */
    public Soldado(int nivel, String nombre, String id, Nivel_militar rango) {
        super(nivel);
        this.nombre = nombre;
        this.id = id;
        this.rango = rango;
        contadorSoldados++; // Incrementa el contador de Soldados
    }

    /**
     * Método que retorna el contador de Soldados.
     *
     * @return El contador de Soldados.
     */
    public static int getContadorSoldados() {
        return contadorSoldados;
    }

    /**
     * Método que se implementa en las clases hijas para realizar una acción específica.
     */
    public void realizarAccion() {
        // Implementación de método realizar acción
    }

    // Métodos Get
    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public Nivel_militar getRango() {
        return rango;
    }

    // Método Set
    public void setRango(Nivel_militar rango) {
        this.rango = rango;
    }

    /**
     * Método que retorna la información del soldado en forma de cadena de texto.
     *
     * @return La información del soldado.
     */
    @Override
    public String toString() {
        String rango;
        String detallesAdicionales = ""; // Inicializamos una cadena vacía para detalles adicionales

        // Asignar rango según el nivel
        switch (nivel) {
            case 1:
                rango = "Soldado Raso";
                break;
            case 2:
                rango = "Teniente";
                break;
            case 3:
                rango = "Capitán";
                break;
            default:
                rango = nivel >= 4 ? "Coronel" : "Expulsado"; // Nivel >= 4: Coronel, Nivel 0: Expulsado
                break;
        }

        return "ID: " + id + ", Nombre: " + nombre + ", Nivel: " + nivel + ", Rango: " + rango + detallesAdicionales;
    }

    /**
     * Método para mostrar en consola la información de los militares.
     */
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Rango: " + rango);
        System.out.println("Nivel: " + nivel);
        System.out.println("--------------------------");
    }

    /**
     * Método estático para mostrar en consola la información de militares de tipo coronel.
     *
     * @param listaSoldados La lista de soldados.
     */
    public static void mostrarInformacion(ArrayList<Soldado> listaSoldados) {
        for (Soldado soldado : listaSoldados) { // Recorre la lista de soldados
            soldado.mostrarInformacion(); // Muestra la información de cada soldado
        }
    }

    /**
     * Método que se implementa en las clases hijas para patrullar.
     */
    public void patrullar() {
        switch (rango) {
            case SOLDADO_RASO:
                JOptionPane.showMessageDialog(null, "soy el " + getRango() + " " + getNombre() + " y estoy patrullando en patines");
                break;
            case TENIENTE:
                JOptionPane.showMessageDialog(null, "soy el " + getRango() + " " + getNombre() + " y estoy patrullando en burro táctico");
                break;
            case CAPITAN:
                JOptionPane.showMessageDialog(null, "soy el " + getRango() + " " + getNombre() + " y estoy patrullando chill de cojones en un unicornio");
                break;
            case CORONEL:
                JOptionPane.showMessageDialog(null, "soy el " + getRango() + " " + getNombre() + " y no patrullo, soy fvking jefe");
                break;
            default:
                break;
        }
    }

    /**
     * Método para saludar.
     */
    public void saludar() {
        char primeraLetra = nombre.charAt(0);
        char ultimaLetra = nombre.charAt(nombre.length() - 1);

        if (primeraLetra == ultimaLetra) {
            JOptionPane.showMessageDialog(null, "un saludo del " + getRango() + " " + getNombre() + " y ponte a estudiar inglés");
        } else {
            JOptionPane.showMessageDialog(null, "un saludo del " + getRango() + " " + getNombre() + " y estoy mamado de esta vida");
        }
    }

    /**
     * Método para regañar a un soldado, disminuyendo su nivel y creando un nuevo objeto con el nuevo nivel.
     *
     * @param listaSoldados La lista de soldados.
     * @return El nuevo objeto Soldado con el nuevo nivel.
     */
    public Soldado regañado(List<Soldado> listaSoldados) {
        if (this.nivel > 0) {
            this.nivel--;  // Baja el nivel
        }

        if (this.nivel == 0) {
            listaSoldados.remove(this);  // Remueve el soldado de la lista
            return null;
        } else {
            Soldado nuevoSoldado;
            switch (this.nivel) {
                case 1:
                    nuevoSoldado = new SoldadoRaso(this.nivel, this.nombre, this.id, this.rango);
                    break;
                case 2:
                    if (this instanceof Teniente) {
                        nuevoSoldado = new Teniente(this.nivel, this.nombre, this.id, this.rango, ((Teniente) this).getUnidad());
                    } else {
                        nuevoSoldado = new Teniente(this.nivel, this.nombre, this.id, this.rango, null);
                    }
                    break;
                case 3:
                    if (this instanceof Capitan) {
                        nuevoSoldado = new Capitan(this.nivel, this.nombre, this.id, this.rango, ((Capitan) this).getCantidadSoldadosBajoSuMando());
                    } else {
                        nuevoSoldado = new Capitan(this.nivel, this.nombre, this.id, this.rango, 0);
                    }
                    break;
                default:
                    if (this instanceof Coronel) {
                        nuevoSoldado = new Coronel(this.nivel, this.nombre, this.id, this.rango, ((Coronel) this).getEstrategia());
                    } else {
                        nuevoSoldado = new Coronel(this.nivel, this.nombre, this.id, this.rango, null);
                    }
                    break;
            }
            return nuevoSoldado;
        }
    }

    @Override
    public void asignarMision(String mision) {
        // Implementación del método asignarMision
    }

    @Override
    public void reportarEstado() {
        // Implementación del método reportarEstado
    }
}