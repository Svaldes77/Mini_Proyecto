package modelo.soldados; 
import javax.swing.JOptionPane;
import modelo.rangos.Nivel_militar;

//import rangos.Rango;
// importamos los packages necesarios
// Clase Teniente que hereda de la clase Soldado
public class Teniente extends Soldado {

    private String unidad; 

    // Constructor de la clase Teniente que recibe los parametros nivel, nombre, id, rango y unidad
    public Teniente(int nivel, String nombre, String id, Nivel_militar rango , String unidad) {
        super(nivel, nombre, id, rango); // Llamada al constructor de la clase padre
        this.rango = Nivel_militar.TENIENTE;
        this.nivel = 2; // Nivel de Teniente
        this.unidad = unidad; 
    }

    // Metodos Get y Set
    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    } 

    // Metodo que se sobre escribe de la clase padre
    @Override
    public void realizarAccion() {
        JOptionPane.showMessageDialog(null, "Soy el "+ getRango() + " "+ getNombre() + "  estoy supervisando la trinchera nazi"); //Mensaje que se imprime en consola
    } 
    

    //metodo mostrar unidad 
    public void AnunciarUnidad(){
        JOptionPane.showMessageDialog(null, "soy el "+getRango()+ " "+getNombre()+" La unidad a mi cargo es: " + unidad);
    } 

    public void realizarRegano(){

    }

    // Metodo que se sobre escribe de la interfaz OperacionesMilitares
    @Override
    public String toString() {
        return super.toString() + ", Unidad: " + unidad;
    }
    // Metodo que se sobre escribe de la interfaz OperacionesMilitares
    @Override
    public void asignarMision(String mision) {
        System.out.println("El teniente le han asignado la mision: " + mision);
    }
    // Metodo que se sobre escribe de la interfaz OperacionesMilitares 
    @Override
    public void reportarEstado() {
        JOptionPane.showMessageDialog(null, "Soy el teniente " + getNombre() + "  me reporto en la trinchera con la unidad " + getUnidad());
    }
  
}
