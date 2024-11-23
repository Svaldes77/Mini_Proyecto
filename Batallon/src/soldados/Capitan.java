package soldados;

import rangos.Nivel_militar;



//import java.util.Scanner;

//import rangos.Rango;
import misiones.OperacionesMilitares;

// La clase Capitan extiende la clase Soldado e implementa la interfaz OperacionesMilitares
public class Capitan extends Soldado implements OperacionesMilitares{

    
    int cantidadSoldadosBajoSuMando; // Atributo propio de la clase Capitan
    
    
    // Constructor de la clase Capitan
    public Capitan(int nivel, String nombre, String id, Nivel_militar rango , int cantidadSoldadosBajoSuMando) {
        super(nivel, nombre, id, rango); // Llama al constructor de la clase base Soldado
        //super(3);
        this.cantidadSoldadosBajoSuMando = cantidadSoldadosBajoSuMando; //Inicialización de atributos propios de la clase Capitan
        this.nivel = 2;
    }
    
    // Método sobrescrito de la clase Soldado
    @Override
    public void realizarAccion() {
        System.out.println("Soy un capitan y estoy implementando la contra");
    }

    // Método sobrescrito de la interfaz OperacionesMilitares para asignar una misión
    @Override 
    public void asignarMision(String mision) {
    System.out.println("Capitán asignado a coordinar la misión: " + mision);//Mensaje que se imprime en consola
    // + mision es para concatenar el valor de la variable mision que le otorgamos en el app.java
    }

    // Método sobrescrito de la interfaz OperacionesMilitares para reportar el estado
    @Override 
    public void reportarEstado(String estado) {
     System.out.println("Soy un capitan y estoy" + estado);//Mensaje que se imprime en consola
    }

    public void mostrarNumerosoldados(){
        System.out.println("El numero de soldados bajo mi mando es: " + cantidadSoldadosBajoSuMando);
    } 

    @Override
    public String toString() {
        return super.toString() + ", Número de Soldados: " + cantidadSoldadosBajoSuMando;
    }


    // Este método no tiene lógica propia, pero puede ser llamado
    
    
    // Método estático para crear una instancia de Capitan
    // public static Capitan crearCapitan(Scanner scanner) {
    //     try {
    //         System.out.println("Escribe el nivel: ");
    //         int nivel = scanner.nextInt();
    //         scanner.nextLine(); //Consumir linea
            
    //         System.out.println("Escribe el nombre: ");
    //         String nombre = scanner.nextLine();

    //         System.out.println("Escribe el ID: ");
    //         String id = scanner.nextLine();

    //         System.out.println("Escribe un rango (SOLDADO, SOLDADO_RASO, TENIENTE, CORONEL) :");
    //         String rangoStr = scanner.nextLine();

    //         Nivel_militar rango =Nivel_militar.valueOf(rangoStr.toUpperCase());

    //         System.out.println("Escribe el numero de soldados a disposicion: ");
    //         int numero_Soldados = scanner.nextInt();
    //         scanner.nextLine(); //Consumir linea

        
    //         return new Capitan(nivel, nombre, id, rango, numero_Soldados);
    //     } catch (Exception e) {
    //         System.out.println("Ocurrió un error al crear Capitán: " + e.getMessage());
    //     }
    //     return null;
    // }    

}