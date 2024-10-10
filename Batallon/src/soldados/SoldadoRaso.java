package soldados;
import rangos.Nivel_militar;
//import rangos.Rango;
import misiones.OperacionesMilitares;

public class SoldadoRaso extends Soldado implements OperacionesMilitares {

    public SoldadoRaso(int nivel, String nombre, String id, Nivel_militar rango) {
        super(nivel, nombre, id,rango);
        this.nivel = 1; //nivel de soldado raso 
        //this.rango =  "Soldado Raso";
        this.rango = Nivel_militar.SOLDADO_RASO;

    }

    @Override 
    public void asignarMision(String mision){
        System.out.println("Soldado Raso asignado a la misión: " + mision);

    };

    public void reportarEstado(){ 
        System.out.println(Nivel_militar.CORONEL+"ESTOY VIGIA EN LA TORRETA");     
     };

     //Sobre escrit
    @Override
    public void realizarAccion() {
        System.out.println("Soy un: "+ Nivel_militar.SOLDADO_RASO + "estoy en la trinchera");
    }

}
