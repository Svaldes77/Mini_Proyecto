package soldados; //Paquete de la Clase

import rangos.Nivel_militar;

import javax.swing.JOptionPane;

//import java.util.ArrayList;

//import java.util.Scanner;

//import java.util.Iterator;

//import rangos.Rango;

//importamos los paquetes necesarios

//Clase Coronel que hereda de la clase Soldado e implementa la interfaz OperacionesMilitares
public class Coronel extends Soldado{

    // Atributo que almacena la estrategia del coronel
    private String estrategia; 

    //Constructor Coronel
    public Coronel(int nivel, String nombre, String id, Nivel_militar rango, String estrategia) {
        super(nivel, nombre, id,rango); // Llama al constructor de la clase base Soldado 
        this.estrategia = estrategia; //Inicialización de atributos propios de la clase Coronel
        this.nivel = 4;
    }

    // Sobrescritura del método realizarAccion de la clase Soldado
    @Override
    public void realizarAccion() {
        JOptionPane.showMessageDialog(null, "Soy el "+ getRango() + " "+ getNombre() + "  estoy libre viendo planeta vegeta");
    }

    // Sobrescritura del método reportarEstado de la interfaz OperacionesMilitares
    @Override
    public void reportarEstado() {
        JOptionPane.showMessageDialog(null, "Coronel " + getNombre() + " reporto la  estrategia: " + getEstrategia() + " en su fase final" );
    }
    
    // Sobrescritura del método asignarMision de la interfaz OperacionesMilitares
    @Override
    public void asignarMision(String mision) {
        System.out.println("Soy un coronel y estoy asignando a la mision de: "+ mision);
        // + mision es para concatenar el valor de la variable mision que le otorgamos en el app.java
    }
    
    // Método getter para obtener la estrategia
    public String getEstrategia() {
        return estrategia;
    }

    // Método setter para establecer la estrategia
    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }

    public void mostrarEstrategia(){
        System.out.println("La estrategia del coronel es: " + estrategia);
    } 

    // Método toString() sobreescrito
    @Override
    public String toString() {
        return super.toString() + ", Estrategia: " + estrategia;
    }

    public void asignarUnidad(String unidad) {
        System.out.println("El Coronel " + getNombre() + " ha asignado la unidad: " + unidad);
    }


    }

