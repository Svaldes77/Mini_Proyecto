package modelo.rangos; // Paquete de la clase

/**
 * Clase abstracta Rango que define el nivel de un rango militar.
 */
public abstract class Rango {

    // Atributo nivel que almacena el nivel del rango
    protected int nivel;

    /**
     * Constructor que inicializa el nivel del rango.
     *
     * @param nivel El nivel del rango.
     */
    public Rango(int nivel) {
        this.nivel = nivel;
    }

    /**
     * Método getter para obtener el nivel del rango.
     *
     * @return El nivel del rango.
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * Método setter para establecer el nivel del rango.
     *
     * @param nivel El nuevo nivel del rango.
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * Método abstracto que debe ser implementado por las subclases para realizar una acción específica.
     */
    public abstract void realizarAccion();
}