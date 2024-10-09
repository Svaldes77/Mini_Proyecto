public class SoldadoRaso extends Soldado {

    public SoldadoRaso(int nivel, String nombre, String id, String rango) {
        super(nivel, nombre, id,rango);
        this.rango = " Soldado Raso";  
    }

    @Override
    public void realizarAccion() {
        System.out.println("Soy un soldado raso y estoy en la trinchera");
    } 
    
}
