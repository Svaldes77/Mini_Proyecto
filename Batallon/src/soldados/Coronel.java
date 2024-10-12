package soldados; //Paquete de la Clase
import rangos.Nivel_militar;
//import rangos.Rango;
import misiones.OperacionesMilitares;
//importamos los paquetes necesarios

//Clase Coronel que hereda de la clase Soldado e implementa la interfaz OperacionesMilitares
public class Coronel extends Soldado implements OperacionesMilitares{

    //Atributos
    private String estrategia; 
    
    //Constructor Coronel
    public Coronel(int nivel, String nombre, String id, Nivel_militar rango, String estrategia) {
        super(nivel, nombre, id,rango); 
        this.estrategia = estrategia; //Inicialización de atributos propios de la clase Coronel
    }

    //Sobre escritura de metodos
    @Override
    public void realizarAccion() {
        System.out.println("Soy un coronel y estoy Preparando la estrategia de ataque"); 
    }

    @Override
    public void reportarEstado() {
        System.out.println("Soy un coronel y estoy reportando el estado de la tropa"); 
    }
    
    @Override
    public void asignarMision(String mision) {
        System.out.println("Soy un coronel y estoy asignando a la mision de: "+ mision);
        // + mision es para concatenar el valor de la variable mision que le otorgamos en el app.java

    }
    //Metodos Get y Set
    public String getEstrategia() {
        return estrategia;
    }
    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }
    
}
