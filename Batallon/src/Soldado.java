//Clase Soldado que hereda de la clase Rango

public class Soldado extends Rango { 
    
    //Atributos
    private final String nombre;
    private final String id;
    protected Nivel_militar rango;
    private static int contadorSoldados = 0; // Contador de Soldados

    public Soldado(int nivel, String nombre, String id, Nivel_militar rango) {
        super(nivel); 
        this.nombre = nombre;
        this.id = id;
        this.rango = rango;
        contadorSoldados++ ; // Incrementa el contador de Soldados 
    }

    public static int getContadorSoldados() {
        return contadorSoldados;
    } 

    public void realizarAccion() { 
        // Implementacion de metodo realizar accion
    }

    public String getNombre() {
        return nombre;
    }


    public String getId() {
        return id;
    }


     public Nivel_militar getRango() {
         return rango;
    }

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
    }
    

    

}

