package soldados;

import java.util.ArrayList;

import rangos.Nivel_militar;
import rangos.Rango;
//import misiones.OperacionesMilitares;

// La clase Soldado extiende la clase Rango
public class Soldado extends Rango { 
    
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

    //en el app.java esta el ejemplo de como se imprime la informacion de los soldados
    }

     //Metodo que recibe un ArrayList de Soldados y muestra la informacion de cada uno
    public static void mostrarInformacion(ArrayList<Soldado> listaSoldados) {
        for (Soldado soldado : listaSoldados) { //Recorre la lista de soldados
            soldado.mostrarInformacion(); //Muestra la informacion de cada soldado
        }
    }
}

