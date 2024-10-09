public class Teniente extends Soldado {
    private String unidad; 

    public Teniente(int nivel, String nombre, String id, String rango , String unidad) {
        super(nivel, nombre, id, rango);
        this.unidad = unidad; 
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    } 


    @Override
    public void realizarAccion() {
        System.out.println("Soy un teniente y estoy Supervisando la trinchera");  
    }
}
