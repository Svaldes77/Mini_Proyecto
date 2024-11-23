package soldados;

//import java.util.Scanner;

import rangos.Nivel_militar;
// import rangos.Rango;
import misiones.OperacionesMilitares;
// importamos los packages necesarios

// Clase Teniente que hereda de la clase Soldado
public class Teniente extends Soldado implements OperacionesMilitares {

    private String unidad; 


    // Constructor de la clase Teniente que recibe los parametros nivel, nombre, id, rango y unidad
    public Teniente(int nivel, String nombre, String id, Nivel_militar rango , String unidad) {
        super(nivel, nombre, id, rango); // Llamada al constructor de la clase padre
        this.rango = Nivel_militar.TENIENTE;
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
<<<<<<< HEAD

    // Metodo que crea un objeto de la clase Teniente
    public static Teniente crearTeniente(Scanner scanner) { //static para que pueda ser accedido sin instanciar un objeto
        try { // try-catch para manejar excepciones
            System.out.println("Ingrese el nivel: ");
            int nivel = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            System.out.println("Ingrese el nombre: "); //Mensaje que se imprime en consola
            String nombre  = scanner.nextLine();
=======
    //metodo mostrar unidad 
    public void mostrarUnidad(){
        System.out.println("La unidad del teniente es: " + unidad);
        

    } 

    public void realizarRegano(){

    }


    @Override
    public void asignarMision(String mision) {
        System.out.println("El teniente le han asignado la mision: " + mision);
    }
    @Override
    public void reportarEstado(String estado) {
        System.out.println("El teniente reporta que la mision esta: " + estado);
    }

    // Metodo que se sobre escribe de la interfaz OperacionesMilitares



    // public static Teniente crearTeniente(Scanner scanner) {
    //     try {
    //         System.out.println("Ingrese el nivel: ");
    //         int nivel = scanner.nextInt();
    //         scanner.nextLine(); // Consumir la nueva línea

    //         System.out.println("Ingrese el nombre: ");
    //         String nombre  = scanner.nextLine();
>>>>>>> deploy
           
    //         System.out.println("Ingrese el ID: ");
    //         String id = scanner.nextLine();

    //         System.out.print("Ingrese el rango (SOLDADO, SOLDADO_RASO, TENIENTE, CORONEL): ");
    //         String rangoStr = scanner.nextLine();
    //         Nivel_militar rango = Nivel_militar.valueOf(rangoStr.toUpperCase());

<<<<<<< HEAD
            System.out.println("Ingrese la unidad: "); //Mensaje que se imprime en consola
            String unidad = scanner.nextLine(); //unidad es un parametro propio de la clase Teniente


            return new Teniente(nivel, nombre, id, rango, unidad); // Se retorna un nuevo objeto de la clase Teniente
        } catch (Exception e) {
            System.out.println("Ocurrió un error al crear Soldado Raso: " + e.getMessage());
        }
        return null; // Se retorna null en caso de error
    }
=======
    //         System.out.println("Ingrese la unidad: ");
    //         String unidad = scanner.nextLine();


    //         return new Teniente(nivel, nombre, id, rango, unidad);
    //     } catch (Exception e) {
    //         System.out.println("Ocurrió un error al crear Soldado Raso: " + e.getMessage());
    //     }
    //     return null;
    // }
>>>>>>> deploy
}
