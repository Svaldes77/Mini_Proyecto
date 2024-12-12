package modelo.soldados; 
import modelo.rangos.Nivel_militar; 
import javax.swing.JOptionPane;


// La clase Capitan extiende la clase Soldado e implementa la interfaz OperacionesMilitares
public class Capitan extends Soldado {

    
    int cantidadSoldadosBajoSuMando; // Atributo propio de la clase Capitan
       
    // Constructor de la clase Capitan
    public Capitan(int nivel, String nombre, String id, Nivel_militar rango , int cantidadSoldadosBajoSuMando) {
        super(nivel, nombre, id, rango); // Llama al constructor de la clase base Soldado
        //super(3);
        this.cantidadSoldadosBajoSuMando = cantidadSoldadosBajoSuMando; //Inicialización de atributos propios de la clase Capitan
        this.nivel = 3;
    }
    public int getCantidadSoldadosBajoSuMando() {
        return cantidadSoldadosBajoSuMando;
    }
    
    public void setNumSoldados(int cantidadSoldadosBajoSuMando) {

        this.cantidadSoldadosBajoSuMando = cantidadSoldadosBajoSuMando;

    }
    // Método sobrescrito de la clase Soldado
    @Override
    public void realizarAccion() {
        JOptionPane.showMessageDialog(null, "Soy el "+ getRango() + " "+ getNombre() + "  estoy en la hora del almuerzo");
    }

    // Método sobrescrito de la interfaz OperacionesMilitares para asignar una misión
    @Override 
    public void asignarMision(String mision) {
        System.out.println("Capitán asignado a coordinar la misión: " + mision);//Mensaje que se imprime en consola
    
    // + mision es para concatenar el valor de la variable mision que le otorgamos en el app.java
    }

    // // Método sobrescrito de la interfaz OperacionesMilitares para reportar el estado



    // Método para mostrar la cantidad de soldados bajo su mando
    public void mostrarNumerosoldados(){
        System.out.println("El numero de soldados bajo mi mando es: " + cantidadSoldadosBajoSuMando);
    } 

    // }

    @Override
    public void reportarEstado() {
        JOptionPane.showMessageDialog(null, "Capitán " + getNombre() + " reporto ofensiva contra los pinguinos de madagascar ");
    }

}