package soldados;
import rangos.Nivel_militar;
// import rangos.Rango;
// import misiones.OperacionesMilitares;
//importamos los paquetes necesarios

//Clase Teniente que hereda de la clase Soldado
public class Teniente extends Soldado {
    private String unidad; 

    //Constructor de la clase Teniente con parametros
    public Teniente(int nivel, String nombre, String id, Nivel_militar rango , String unidad) {
        super(nivel, nombre, id, rango);
        //Inicialización de atributos propios de la clase Teniente 
        this.rango = Nivel_militar.TENIENTE; 
        this.unidad = unidad; 
    }

    //Metodos Get y Set
    public String getUnidad() {
        return unidad;
    }
    public void setUnidad(String unidad) {
        this.unidad = unidad;
    } 

    //Sobre escritura del metodo realizarAccion de la clase Soldado
    @Override
    public void realizarAccion() {
        System.out.println("Habla el "+ Nivel_militar.TENIENTE + "y estoy Supervisando la trinchera");  
    }
}
