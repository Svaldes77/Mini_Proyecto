package soldados;

import rangos.Nivel_militar;

import java.util.ArrayList;

//import java.util.Scanner;

//import rangos.Rango;
import misiones.OperacionesMilitares;
//importamos los paquetes necesarios

//Clase SoldadoRaso que hereda de la clase Soldado e implementa la interfaz OperacionesMilitares
public class SoldadoRaso extends Soldado implements OperacionesMilitares {

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

    public void reportarEstado(String estado){ 

        System.out.println("Soy un: " + Nivel_militar.SOLDADO_RASO  +  estado); //Mensaje que se imprime en consola
     };

     
    @Override
    public String toString() {
        return super.toString();
    } 

    
    // Este método no tiene lógica propia, pero puede ser llamado
//    @Override
//     public void reganado() {
//         if (getNivel() > 1) {
//             setNivel(getNivel() - 1); // Reducir el nivel del soldado
//             System.out.println("El Teniente " + getNombre() + " ha regañado a " + getNombre() + ". Nuevo nivel: " + getNivel());
//         } else {
//             System.out.println(getNombre() + " ha sido expulsado, su nivel era 1.");
//         }
//     }


    //Sobre escritura de metodos de la clase padre
    @Override
    public void realizarAccion() {
        System.out.println("Soy un: "+ Nivel_militar.SOLDADO_RASO + " estoy en la trinchera");//Mensaje que se imprime en consola
    }

    // public static SoldadoRaso crearSoldadoRaso(Scanner scanner) { //Método para crear un Soldado Raso 
    //     try {
    //         System.out.println("Ingrese el nivel: ");
    //         int nivel = scanner.nextInt();
    //         scanner.nextLine(); // Consumir la nueva línea

    //         System.out.println("Ingrese el nombre: ");
    //         String nombre  = scanner.nextLine();
           
    //         System.out.println("Ingrese el ID: ");
    //         String id = scanner.nextLine();

    //         System.out.print("Ingrese el rango (SOLDADO, SOLDADO_RASO, TENIENTE, CORONEL): ");
    //         String rangoStr = scanner.nextLine();
    //         Nivel_militar rango = Nivel_militar.valueOf(rangoStr.toUpperCase());

    //         return new SoldadoRaso(nivel, nombre, id, rango);
    //     } catch (Exception e) {
    //         System.out.println("Ocurrió un error al crear Soldado Raso: " + e.getMessage());
    //     }
    //     return null;
    // }

    
}


