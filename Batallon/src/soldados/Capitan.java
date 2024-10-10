<<<<<<< HEAD
package soldados; //Paquete donde se encuentra la clase
import rangos.Nivel_militar;  
//import rangos.Rango;
import misiones.OperacionesMilitares;
// impotrtamos los paquetes necesarios

//Clase Capitan que hereda de la clase Soldado e implementa la interfaz OperacionesMilitares
public class Capitan extends Soldado implements OperacionesMilitares{
    private int numeroDeSoldados; //Atributo numeroDeSoldados de tipo entero
    
    //Constructor de la clase Capitan con parametros
    public Capitan(int nivel, String nombre, String id, Nivel_militar rango , int numeroDeSoldados) { 
        super(nivel, nombre, id, rango); //Llamada al constructor de la clase padre "Soldado
        //super(3);
        this.numeroDeSoldados = numeroDeSoldados; //Inicialización de atributos propios de la clase Capitan
    }
    

    //Sobre escritura del metodo realizarAccion de la clase Soldado
=======
package soldados;
import rangos.Nivel_militar;
//import rangos.Rango;
import misiones.OperacionesMilitares;
public class Capitan extends Soldado implements OperacionesMilitares{
    private int numeroDeSoldados;
    
    public Capitan(int nivel, String nombre, String id, Nivel_militar rango , int numeroDeSoldados) {
        super(nivel, nombre, id, rango);
        //super(3);
        this.numeroDeSoldados = numeroDeSoldados; 
    }
    
>>>>>>> 610e7d6bbd77285a5238ccc8a74198806e3afa20
    @Override
    public void realizarAccion() {
        System.out.println("Soy un capitan y estoy implementando la contra");
    }

<<<<<<< HEAD
    //Metodos Get y Set
    public int getNumeroDeSoldados() {
        return numeroDeSoldados;
    }
=======

    public int getNumeroDeSoldados() {
        return numeroDeSoldados;
    }


>>>>>>> 610e7d6bbd77285a5238ccc8a74198806e3afa20
    public void setNumeroDeSoldados(int numeroDeSoldados) {
        this.numeroDeSoldados = numeroDeSoldados;
    } 

<<<<<<< HEAD
    //Sobre escritura de los metodos que vienen de la interfaz OperacionesMilitares
    @Override 
    public void asignarMision(String mision) {
    System.out.println("Capitán asignado a coordinar la misión: " + mision); //Mensaje que se imprime en consola
    // + mision es para concatenar el valor de la variable mision
=======
    @Override 
    public void asignarMision(String mision) {
    System.out.println("Capitán asignado a coordinar la misión: " + mision);
>>>>>>> 610e7d6bbd77285a5238ccc8a74198806e3afa20
    }

    @Override 
    public void reportarEstado() {
     System.out.println("Capitán supervisando " + numeroDeSoldados + " soldados.");
    }
    
}
