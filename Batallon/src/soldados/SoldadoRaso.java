package soldados;
import rangos.Nivel_militar;
//import rangos.Rango;
import misiones.OperacionesMilitares;
<<<<<<< HEAD
//importamos los paquetes necesarios


//Clase SoldadoRaso que hereda de la clase Soldado e implementa la interfaz OperacionesMilitares
public class SoldadoRaso extends Soldado implements OperacionesMilitares {

    //Constructor de la clase SoldadoRaso con parametros    
=======

public class SoldadoRaso extends Soldado implements OperacionesMilitares {

>>>>>>> 610e7d6bbd77285a5238ccc8a74198806e3afa20
    public SoldadoRaso(int nivel, String nombre, String id, Nivel_militar rango) {
        super(nivel, nombre, id,rango);
        this.nivel = 1; //nivel de soldado raso 
        //this.rango =  "Soldado Raso";
<<<<<<< HEAD
        this.rango = Nivel_militar.SOLDADO_RASO; //Inicialización de atributos propios de la clase SoldadoRaso
        //Utilizamos una clse enum "Nivel_militar" para asignar el valor  rango = SOLDADO_RASO

    }

    //Sobre escritura de metodos que vienen de la interfaz OperacionesMilitares
=======
        this.rango = Nivel_militar.SOLDADO_RASO;

    }

>>>>>>> 610e7d6bbd77285a5238ccc8a74198806e3afa20
    @Override 
    public void asignarMision(String mision){
        System.out.println("Soldado Raso asignado a la misión: " + mision);

    };

    public void reportarEstado(){ 
<<<<<<< HEAD
        System.out.println(Nivel_militar.CORONEL+" ESTOY VIGIA EN LA TORRETA");     
     };

    //Sobre escritura del metodo realizarAccion de la clase Soldado
=======
        System.out.println(Nivel_militar.CORONEL+"ESTOY VIGIA EN LA TORRETA");     
     };

     //Sobre escrit
>>>>>>> 610e7d6bbd77285a5238ccc8a74198806e3afa20
    @Override
    public void realizarAccion() {
        System.out.println("Soy un: "+ Nivel_militar.SOLDADO_RASO + "estoy en la trinchera");
    }

}
