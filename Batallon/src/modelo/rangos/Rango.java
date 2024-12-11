package modelo.rangos; // Paquete de la clase

// Clase abstracta Rango que define el nivel de un rango militar
public abstract class Rango {

    // Atributo nivel que almacena el nivel del rango
    protected int nivel;

    
    // Constructor que inicializa el nivel del rango
    public Rango(int nivel) {
        this.nivel = nivel;
    }



    //public abstract void realizarAccion();
    // Método getter para obtener el nivel del rango
    public int getNivel() {
        return nivel;
    }

    // Método setter para establecer el nivel del rango
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    

    public abstract void realizarAccion();
}



