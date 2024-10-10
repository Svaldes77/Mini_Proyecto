package soldados;
import rangos.Nivel_militar;
// import rangos.Rango;
// import misiones.OperacionesMilitares;

public class Teniente extends Soldado {
    private String unidad; 

    public Teniente(int nivel, String nombre, String id, Nivel_militar rango , String unidad) {
        super(nivel, nombre, id, rango);
        this.rango = Nivel_militar.TENIENTE;
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
        System.out.println("Soy el "+ Nivel_militar.TENIENTE + " y estoy Supervisando la trinchera");  
    }
}
