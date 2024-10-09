public class Capitan extends Soldado {
    private int numeroDeSoldados;
    
    public Capitan(int nivel, String nombre, String id, String rango , int numeroDeSoldados) {
        super(nivel, nombre, id,rango);
        this.numeroDeSoldados = numeroDeSoldados; 
    }
    

    @Override
    public void realizarAccion() {
        System.out.println("Soy un capitan y estoy implementando la contra");
    }


    public int getNumeroDeSoldados() {
        return numeroDeSoldados;
    }


    public void setNumeroDeSoldados(int numeroDeSoldados) {
        this.numeroDeSoldados = numeroDeSoldados;
    } 
    
}
