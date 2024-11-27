package soldados;

import javax.swing.JOptionPane;

//import java.util.Scanner;
import rangos.Nivel_militar;

//import rangos.Rango;
// importamos los packages necesarios
// Clase Teniente que hereda de la clase Soldado
public class Teniente extends Soldado {

    private String unidad; 

    // Constructor de la clase Teniente que recibe los parametros nivel, nombre, id, rango y unidad
    public Teniente(int nivel, String nombre, String id, Nivel_militar rango , String unidad) {
        super(nivel, nombre, id, rango); // Llamada al constructor de la clase padre
        this.rango = Nivel_militar.TENIENTE;
        this.nivel = 2; // Nivel de Teniente
        this.unidad = unidad; 
    }

    // Metodos Get y Set
    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    } 

    // Metodo que se sobre escribe de la clase padre
    @Override
    public void realizarAccion() {
        System.out.println("Soy el "+ Nivel_militar.TENIENTE + " y estoy Supervisando la trinchera"); //Mensaje que se imprime en consola
        //JOptionPane.showMessageDialog(null, "Soy "+ Nivel_militar.TENIENTE + " y estoy Supervisando la trinchera");
    
    }
    //metodo mostrar unidad 
    public void mostrarUnidad(){
        System.out.println("La unidad del teniente es: " + unidad);
    } 

    public void realizarRegano(){

    }

    @Override
    public String toString() {
        return super.toString() + ", Unidad: " + unidad;
    }

    @Override
    public void asignarMision(String mision) {
        System.out.println("El teniente le han asignado la mision: " + mision);
    }
    @Override
    public void reportarEstado() {
        JOptionPane.showMessageDialog(null, "Soy el teniente " + getNombre() + "  me reporto en la trinchera con la unidad " + getUnidad());
    }


    // Metodo que se sobre escribe de la interfaz OperacionesMilitares
  
}
