public class Coronel extends Soldado {
    private String estrategia; 
    
    public Coronel(int nivel, String nombre, String id, String rango, String estrategia) {
        super(nivel, nombre, id,rango); 
        this.estrategia = estrategia; 
    }
    

    @Override
    public void realizarAccion() {
        System.out.println("Soy un coronel y estoy Preparando la estrategia de ataque"); 
    }


    public String getEstrategia() {
        return estrategia;
    }


    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }
    
}
