package soldados;

import rangos.Nivel_militar;

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


    //Sobre escritura de metodos de la clase padre
    @Override
    public void realizarAccion() {
        System.out.println("Soy un: "+ Nivel_militar.SOLDADO_RASO + " estoy en la trinchera");//Mensaje que se imprime en consola
    }

<<<<<<< HEAD
    //Metodo que crea un objeto de la clase SoldadoRaso
    public static SoldadoRaso crearSoldadoRaso(Scanner scanner) { 
        try { //Manejo de excepciones
            System.out.println("Ingrese el nivel: "); //Mensaje que se imprime en consola
            int nivel = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea
=======
    // public static SoldadoRaso crearSoldadoRaso(Scanner scanner) { //Método para crear un Soldado Raso 
    //     try {
    //         System.out.println("Ingrese el nivel: ");
    //         int nivel = scanner.nextInt();
    //         scanner.nextLine(); // Consumir la nueva línea
>>>>>>> deploy

    //         System.out.println("Ingrese el nombre: ");
    //         String nombre  = scanner.nextLine();
           
    //         System.out.println("Ingrese el ID: ");
    //         String id = scanner.nextLine();

<<<<<<< HEAD
            System.out.print("Ingrese el rango (SOLDADO, SOLDADO_RASO, TENIENTE, CORONEL): "); // Mensaje que se imprime en consola
            String rangoStr = scanner.nextLine(); // Se lee el rango
            Nivel_militar rango = Nivel_militar.valueOf(rangoStr.toUpperCase()); // Se convierte a mayúsculas

            return new SoldadoRaso(nivel, nombre, id, rango); // Se retorna un nuevo objeto de la clase SoldadoRaso
        } catch (Exception e) { // Se captura la excepción
            System.out.println("Ocurrió un error al crear Soldado Raso: " + e.getMessage()); // mensaje en consola
        }
        return null;
    }
=======
    //         System.out.print("Ingrese el rango (SOLDADO, SOLDADO_RASO, TENIENTE, CORONEL): ");
    //         String rangoStr = scanner.nextLine();
    //         Nivel_militar rango = Nivel_militar.valueOf(rangoStr.toUpperCase());

    //         return new SoldadoRaso(nivel, nombre, id, rango);
    //     } catch (Exception e) {
    //         System.out.println("Ocurrió un error al crear Soldado Raso: " + e.getMessage());
    //     }
    //     return null;
    // }
>>>>>>> deploy

}


