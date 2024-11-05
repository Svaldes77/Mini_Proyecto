package soldados; //Paquete de la Clase

import rangos.Nivel_militar;

import java.util.Scanner;

//import rangos.Rango;
import misiones.OperacionesMilitares;
//importamos los paquetes necesarios

//Clase Coronel que hereda de la clase Soldado e implementa la interfaz OperacionesMilitares
public class Coronel extends Soldado implements OperacionesMilitares{

    // Atributo que almacena la estrategia del coronel
    private String estrategia; 
    
    //Constructor Coronel
    public Coronel(int nivel, String nombre, String id, Nivel_militar rango, String estrategia) {
        super(nivel, nombre, id,rango); // Llama al constructor de la clase base Soldado 
        this.estrategia = estrategia; //Inicialización de atributos propios de la clase Coronel
    }

    // Sobrescritura del método realizarAccion de la clase Soldado
    @Override
    public void realizarAccion() {
        System.out.println("Soy un coronel y estoy Preparando la estrategia de ataque"); 
    }

    // Sobrescritura del método reportarEstado de la interfaz OperacionesMilitares
    @Override
    public void reportarEstado() {
        System.out.println("Soy un coronel y estoy reportando el estado de la tropa"); 
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
    // private static Coronel crearCoronel(Scanner scanner) {
    //     try {
    //         int nivel = leerEntero(scanner, "Ingrese el nivel: ");
    //         String nombre = leerCadena(scanner, "Ingrese el nombre: ");
    //         String id = leerCadena(scanner, "Ingrese el ID: ");
    //         Nivel_militar rango = leerRango(scanner, "Ingrese el rango (SOLDADO, SOLDADO_RASO, TENIENTE, CORONEL): ");
    //         String estrategia = leerCadena(scanner, "Ingrese la estrategia: ");
    //         return new Coronel(nivel, nombre, id, rango, estrategia);
    //     } catch (Exception e) {
    //         System.out.println("Ocurrió un error al crear Coronel: " + e.getMessage());
    //     }
    //     return null;
    // }

    // private static int leerEntero(Scanner scanner, String mensaje) {
    //     System.out.print(mensaje);
    //     while (!scanner.hasNextInt()) {
    //         System.out.println("Por favor, ingrese un número entero válido.");
    //         scanner.next(); // Consumir la entrada no válida
    //         System.out.print(mensaje);
    //     }
    //     return scanner.nextInt();
    // }

    // private static String leerCadena(Scanner scanner, String mensaje) {
    //     System.out.print(mensaje);
    //     return scanner.nextLine();
    // }

    // private static Nivel_militar leerRango(Scanner scanner, String mensaje) {
    //     System.out.print(mensaje);
    //     while (true) {
    //         try {
    //             String input = scanner.nextLine().toUpperCase();
    //             return Nivel_militar.valueOf(input);
    //         } catch (IllegalArgumentException e) {
    //             System.out.println("Rango no válido. Por favor, ingrese uno de los siguientes: SOLDADO, SOLDADO_RASO, TENIENTE, CORONEL.");
    //             System.out.print(mensaje);
    //         }
    //     }
    
    // }
}
