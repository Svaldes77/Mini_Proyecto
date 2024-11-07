package soldados;

import rangos.Nivel_militar;

<<<<<<< HEAD
//import java.util.Scanner;
=======
import java.util.Scanner;
>>>>>>> origin/deploy

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

    public void reportarEstado(){ 
<<<<<<< HEAD
        System.out.println("Soy un: " + Nivel_militar.SOLDADO_RASO + "ESTOY VIGIA EN LA TORRETA"); //Mensaje que se imprime en consola
=======
        System.out.println(Nivel_militar.CORONEL+" AQUI ESTOY VIGIA EN LA TORRETA"); //Mensaje que se imprime en consola
>>>>>>> origin/deploy
     };

    //Sobre escritura de metodos de la clase padre
    @Override
    public void realizarAccion() {
        System.out.println("Soy un: "+ Nivel_militar.SOLDADO_RASO + "estoy en la trinchera");//Mensaje que se imprime en consola
    }

    // public static SoldadoRaso crearSoldadoRaso(Scanner scanner) {
<<<<<<< HEAD
    // System.out.print("Ingrese el nivel: ");
    // int nivel = scanner.nextInt();
    // scanner.nextLine(); // Consumir la nueva línea

    // System.out.print("Ingrese el nombre: ");
    // String nombre = scanner.nextLine();

    // System.out.print("Ingrese el ID: ");
    // String id = scanner.nextLine();

    // System.out.print("Ingrese el rango (SOLDADO, SOLDADO_RASO, TENIENTE, CORONEL): ");
    // String rangoStr = scanner.nextLine();
    // Nivel_militar rango = Nivel_militar.valueOf(rangoStr.toUpperCase());

    // return new SoldadoRaso(nivel, nombre, id, rango);
=======
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

>>>>>>> origin/deploy
}


