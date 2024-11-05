package soldados;

import rangos.Nivel_militar;
//import rangos.Rango;
import misiones.OperacionesMilitares;

// La clase Capitan extiende la clase Soldado e implementa la interfaz OperacionesMilitares
public class Capitan extends Soldado implements OperacionesMilitares{

    // Atributo que almacena el número de soldados bajo el mando del capitán
    private int numeroDeSoldados;
    
    // Constructor de la clase Capitan
    public Capitan(int nivel, String nombre, String id, Nivel_militar rango , int numeroDeSoldados) {
        super(nivel, nombre, id, rango); // Llama al constructor de la clase base Soldado
        //super(3);
        this.numeroDeSoldados = numeroDeSoldados; //Inicialización de atributos propios de la clase Capitan
    }
    
    // Método sobrescrito de la clase Soldado
    @Override
    public void realizarAccion() {
        System.out.println("Soy un capitan y estoy implementando la contra");
    }

    // Método getter para obtener el número de soldados
    // Método setter para establecer el número de soldados

    public void setNumeroDeSoldados(int numeroDeSoldados) {
        this.numeroDeSoldados = numeroDeSoldados;
    } 

    // Método sobrescrito de la interfaz OperacionesMilitares para asignar una misión
    @Override 
    public void asignarMision(String mision) {
    System.out.println("Capitán asignado a coordinar la misión: " + mision);//Mensaje que se imprime en consola
    // + mision es para concatenar el valor de la variable mision que le otorgamos en el app.java
    }

    // Método sobrescrito de la interfaz OperacionesMilitares para reportar el estado
    @Override 
    public void reportarEstado() {
     System.out.println("Capitán supervisando " + numeroDeSoldados + " soldados.");//Mensaje que se imprime en consola
    }
    
}
