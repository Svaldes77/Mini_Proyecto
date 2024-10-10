package soldados;
import rangos.Nivel_militar;
//import rangos.Rango;
import misiones.OperacionesMilitares;
//importamos los paquetes necesarios


//Clase SoldadoRaso que hereda de la clase Soldado e implementa la interfaz OperacionesMilitares
public class SoldadoRaso extends Soldado implements OperacionesMilitares {

    //Constructor de la clase SoldadoRaso con parametros    
    public SoldadoRaso(int nivel, String nombre, String id, Nivel_militar rango) {
        super(nivel, nombre, id,rango);
        this.nivel = 1; //nivel de soldado raso 
        //this.rango =  "Soldado Raso";
        this.rango = Nivel_militar.SOLDADO_RASO; //Inicialización de atributos propios de la clase SoldadoRaso
        //Utilizamos una clse enum "Nivel_militar" para asignar el valor  rango = SOLDADO_RASO

    }

    //Sobre escritura de metodos que vienen de la interfaz OperacionesMilitares
    @Override 
    public void asignarMision(String mision){
        System.out.println("Soldado Raso asignado a la misión: " + mision);

    };

    public void reportarEstado(){ 
        System.out.println(Nivel_militar.CORONEL+" ESTOY VIGIA EN LA TORRETA");     
     };

    //Sobre escritura del metodo realizarAccion de la clase Soldado
    @Override
    public void realizarAccion() {
        System.out.println("Soy un: "+ Nivel_militar.SOLDADO_RASO + "estoy en la trinchera");
    }

}
