public class SoldadoRaso extends Soldado {

    public SoldadoRaso(int nivel, String nombre, String id, Nivel_militar rango) {
        super(nivel, nombre, id,rango);
        this.nivel = 1; //nivel de soldado raso 
        //this.rango =  "Soldado Raso";
        this.rango = Nivel_militar.SOLDADO_RASO;

    }

    @Override
    public void realizarAccion() {
        System.out.println("Soy un: "+ Nivel_militar.SOLDADO_RASO + "estoy en la trinchera");
    } 

    // @Override
    // public void asignarMision(String mision) {
    //     System.out.println("Soldado Raso asignado a la misión: " + mision);
    // }
    
}
