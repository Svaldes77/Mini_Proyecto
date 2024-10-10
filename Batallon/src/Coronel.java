public class Coronel extends Soldado implements OperacionesMilitares{
    
    //Atributos

    private String estrategia; 
    
    //Constructor Coronel
    public Coronel(int nivel, String nombre, String id, Nivel_militar rango, String estrategia) {
        super(nivel, nombre, id,rango); 
        this.estrategia = estrategia; 
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
        System.out.println("Soy un coronel y estoy asignando la mision de: "+ mision);

    }
    //Metodos Get y Set

    public String getEstrategia() {
        return estrategia;
    }


    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }
    
}
