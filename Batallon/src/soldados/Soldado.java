package soldados;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import misiones.OperacionesMilitares;
import rangos.Nivel_militar;
import rangos.Rango;
import misiones.OperacionesMilitares;

// La clase Soldado extiende la clase Rango
public class Soldado extends Rango  implements OperacionesMilitares {  
    
    //Atributos de la clase Soldado
    private final String nombre;
    private final String id;
    protected Nivel_militar rango;
    private static int contadorSoldados = 0; // Contador de Soldados

    //Constructor de la clase Soldado que recibe los parametros nivel, nombre, id y rango
    public Soldado(int nivel, String nombre, String id, Nivel_militar rango) {
        super(nivel); 
        this.nombre = nombre;
        this.id = id;
        this.rango = rango;
        contadorSoldados++ ; // Incrementa el contador de Soldados 
    }

    //Metodo que retorna el contador de Soldados, es static para que pueda ser accedido sin instanciar un objeto
    public static int getContadorSoldados() {
        return contadorSoldados;
    } 

    //Metodo que se implementa en las clases hijas
    public void realizarAccion() { 
        // Implementacion de metodo realizar accion
    }


    //Metodos Get
    public String getNombre() {
        return nombre;

    }
    public String getId() {
        return id;

    }
     public Nivel_militar getRango() {
         return rango;
    }

    //Metodo Set
    public void setRango(Nivel_militar rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre  + ", Nivel Militar: " + rango;
    }

    // public interface OperacionesMilitares{
    //     void asignarMision(String mision);
    //     void reportarEstado();

    // }

    //Mostra en consola informacion de los Militares
     public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Rango: " + rango);
        System.out.println("Nivel: " + nivel);
        System.out.println("--------------------------");
    }

    //en el app.java esta el ejemplo de como se imprime la informacion de los soldados

    
    
    //Mostra en cosola informacion de militares pero que son de tipo coronel

    public static void mostrarInformacion(ArrayList<Soldado> listaSoldados) {
        for (Soldado soldado : listaSoldados) {
            soldado.mostrarInformacion();
        }
    }
    
<<<<<<< HEAD
=======
    // // Método regañado que baja de nivel al ser regañado
    // public void regañado(ArrayList<Soldado> listaSoldados) {
    //     if (this.nivel > 0) {
    //         this.nivel--;  // Baja el nivel
    //         System.out.println(this.nombre + " ha sido regañado y su nivel ha bajado.");
    //     }

    //     // Si el nivel llega a 0, se expulsa al soldado
    //     if (this.nivel == 0) {
    //         System.out.println(this.nombre + " ha sido expulsado por llegar al nivel más bajo.");
    //         listaSoldados.remove(this);  // Remueve el soldado de la lista
    //     }
    // }
>>>>>>> c02074827648c8f7ad76d00ca8ef175b1891de08


    public void patrullar(){
        switch (rango) {
            case SOLDADO_RASO:
                System.out.println("El soldado raso "+nombre+" esta patrullando en patines");
                break;
            case TENIENTE:
                System.out.println("El teniente "+nombre+" esta patrullando en burro");
                break;
            case CAPITAN:
                System.out.println("El capitan "+nombre+" esta patrullando en un unicornio y esta chill de cojones");
                break;
            case CORONEL:
                System.out.println("Soy el coronel " +nombre+ " y no patrullo, soy el fuking jefe");
            default:
                break;
        }

    }

    public void saludar(){
        char primeraLetra = nombre.charAt(0);
        char ultimaLetra = nombre.charAt(nombre.length()-1);

        if(primeraLetra == ultimaLetra ){
            System.out.println(" hola, soy el " + rango + " "+nombre+ " y ponte hacer algo ");
        }else{
            System.out.println(" hola, soy el " + rango + " "+nombre+ " estoy mamado de esta vida");
        }
       
    }

<<<<<<< HEAD
=======
    
>>>>>>> c02074827648c8f7ad76d00ca8ef175b1891de08
    // Método regañado que baja de nivel al ser regañado
    public void regañado(List<Soldado> listaSoldados) {
        if (this.nivel > 0) {
            this.nivel--;  // Baja el nivel
            System.out.println(this.nombre + " ha sido regañado y su nivel ha bajado.");
        }

        // Si el nivel llega a 0, se expulsa al soldado
        if (this.nivel == 0) {
            System.out.println(this.nombre + " ha sido expulsado por llegar al nivel más bajo.");
            listaSoldados.remove(this);  // Remueve el soldado de la lista
        }
    }

    @Override
    public void asignarMision(String mision) {

    }

    @Override
    public void reportarEstado() {

    }

}
