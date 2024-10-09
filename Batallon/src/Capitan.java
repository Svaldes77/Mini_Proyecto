public class Capitan extends Soldado {
    private int numeroDeSoldados;
    
    public Capitan(int nivel, String nombre, String id, Nivel_militar rango , int numeroDeSoldados) {
        super(nivel, nombre, id, rango);
        //super(3);
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

    // @Override
    // public void asignarMision(String mision) {
    //     System.out.println("Capitán asignado a coordinar la misión: " + mision);
    // }

    // @Override
    // public void reportarEstado() {
    //     System.out.println("Capitán supervisando " + numeroDeSoldados + " soldados.");
    // }
    
}
