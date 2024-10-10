package soldados;
import rangos.Nivel_militar;
// import rangos.Rango;
// import misiones.OperacionesMilitares;
<<<<<<< HEAD
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
=======

public class Teniente extends Soldado {
    private String unidad; 

    public Teniente(int nivel, String nombre, String id, Nivel_militar rango , String unidad) {
        super(nivel, nombre, id, rango);
        this.rango = Nivel_militar.TENIENTE;
        this.unidad = unidad; 
    }

    public String getUnidad() {
        return unidad;
    }

>>>>>>> 610e7d6bbd77285a5238ccc8a74198806e3afa20
    public void setUnidad(String unidad) {
        this.unidad = unidad;
    } 

<<<<<<< HEAD
    //Sobre escritura del metodo realizarAccion de la clase Soldado
    @Override
    public void realizarAccion() {
        System.out.println("Habla el "+ Nivel_militar.TENIENTE + "y estoy Supervisando la trinchera");  
=======
    @Override
    public void realizarAccion() {
        System.out.println("Soy un"+ Nivel_militar.TENIENTE + "y estoy Supervisando la trinchera");  
>>>>>>> 610e7d6bbd77285a5238ccc8a74198806e3afa20
    }
}
