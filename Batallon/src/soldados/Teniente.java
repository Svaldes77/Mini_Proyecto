package soldados;

import rangos.Nivel_militar;
// import rangos.Rango;
// import misiones.OperacionesMilitares;
// importamos los packages necesarios

// Clase Teniente que hereda de la clase Soldado
public class Teniente extends Soldado {

    private String unidad; // Atributo de la clase Teniente

    // Constructor de la clase Teniente que recibe los parametros nivel, nombre, id, rango y unidad
    public Teniente(int nivel, String nombre, String id, Nivel_militar rango , String unidad) {
        super(nivel, nombre, id, rango); // Llamada al constructor de la clase padre
        this.rango = Nivel_militar.TENIENTE;
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
        System.out.println("Soy el "+ Nivel_militar.TENIENTE + " y estoy Supervisando la trinchera"); //Mensaje que se imprime en consola
    }
}