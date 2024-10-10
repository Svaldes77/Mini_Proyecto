public class Coronel extends Soldado {
    private String estrategia; 
    
    public Coronel(int nivel, String nombre, String id, Nivel_militar rango, String estrategia) {
        super(nivel, nombre, id,rango); 
        this.estrategia = estrategia; 
    }
    

    @Override
    public void realizarAccion() {
        System.out.println("Soy un coronel y estoy Preparando la estrategia de ataque"); 
    }


    //Metodos Get y Set

    public String getEstrategia() {
        return estrategia;
    }


    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }
    
}
