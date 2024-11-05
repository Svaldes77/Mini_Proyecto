package soldados;

import rangos.Nivel_militar;
//import rangos.Rango;
import misiones.OperacionesMilitares;
<<<<<<< HEAD
//importamos los paquetes necesarios

//Clase Capitan que hereda de la clase Soldado e implementa la interfaz OperacionesMilitares
public class Capitan extends Soldado implements OperacionesMilitares{
    private int numeroDeSoldados;//Atributo de la clase Capitan
    
    //Constructor de la clase Capitan que recibe los parametros nivel, nombre, id, rango y numeroDeSoldados
    public Capitan(int nivel, String nombre, String id, Nivel_militar rango , int numeroDeSoldados) {
        super(nivel, nombre, id, rango);//Llamada al constructor de la clase padre
=======

// La clase Capitan extiende la clase Soldado e implementa la interfaz OperacionesMilitares
public class Capitan extends Soldado implements OperacionesMilitares{

    // Atributo que almacena el número de soldados bajo el mando del capitán
    private int numeroDeSoldados;
    
    // Constructor de la clase Capitan
    public Capitan(int nivel, String nombre, String id, Nivel_militar rango , int numeroDeSoldados) {
        super(nivel, nombre, id, rango); // Llama al constructor de la clase base Soldado
>>>>>>> 10afdc437e9998d65b1e0cd01def35220799b40e
        //super(3);
        this.numeroDeSoldados = numeroDeSoldados; //Inicialización de atributos propios de la clase Capitan
    }
<<<<<<< HEAD

    //Sobre escritura de metodos de la clase padre
=======
    
    // Método sobrescrito de la clase Soldado
>>>>>>> 10afdc437e9998d65b1e0cd01def35220799b40e
    @Override
    public void realizarAccion() {
        System.out.println("Soy un capitan y estoy implementando la contra");
    }

<<<<<<< HEAD
    //Metodos Get y Set
=======
    // Método getter para obtener el número de soldados
>>>>>>> 10afdc437e9998d65b1e0cd01def35220799b40e
    public int getNumeroDeSoldados() {
        return numeroDeSoldados;
    }

<<<<<<< HEAD
=======
    // Método setter para establecer el número de soldados
>>>>>>> 10afdc437e9998d65b1e0cd01def35220799b40e
    public void setNumeroDeSoldados(int numeroDeSoldados) {
        this.numeroDeSoldados = numeroDeSoldados;
    } 

<<<<<<< HEAD
    //Sobre escritura de metodos de la interfaz OperacionesMilitares
=======
    // Método sobrescrito de la interfaz OperacionesMilitares para asignar una misión
>>>>>>> 10afdc437e9998d65b1e0cd01def35220799b40e
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
