package soldados;

import javax.swing.JOptionPane;

import rangos.Nivel_militar;


//import java.util.Scanner;

//import rangos.Rango;

//importamos los paquetes necesarios

//Clase SoldadoRaso que hereda de la clase Soldado e implementa la interfaz OperacionesMilitares
public class SoldadoRaso extends Soldado  {

    //Constructor de la clase SoldadoRaso que recibe los parametros nivel, nombre, id y rango
    public SoldadoRaso(int nivel, String nombre, String id, Nivel_militar rango) {
        super(nivel, nombre, id,rango);
        this.nivel = 1; //nivel de soldado raso 
        //this.rango =  "Soldado Raso";
        this.rango = Nivel_militar.SOLDADO_RASO; //Inicialización de atributos propios de la clase SoldadoRaso
    }

    //Sobre escritura de metodos de la interfaz OperacionesMilitares
    @Override 
    public void asignarMision(String mision){
        System.out.println("Soldado Raso asignado a la misión: " + mision);
    };

    public void reportarEstado(){ 
        JOptionPane.showMessageDialog(null, "Soldado Raso " +  getNombre() + " reportandome desde la selva");
     };

     
    @Override
    public String toString() {
        return super.toString();
    } 

    //Sobre escritura de metodos de la clase padre
    @Override
    public void realizarAccion() {
        JOptionPane.showMessageDialog(null, "Soy el "+ getRango() + " "+ getNombre() + "  estoy en la trinchera combatiendo contra el sr. tocino");//Mensaje que se imprime en consola
    }
    
}


