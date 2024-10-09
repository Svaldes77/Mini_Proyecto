public class Soldado extends Rango { 

    protected String nombre;
    protected String id;
    protected String rango;

    public Soldado(int nivel, String nombre, String id, String rango) {
        super(nivel); 
        this.nombre = nombre;
        this.id = id;
        this.rango = rango;
    }

    public void realizarAccion() { 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    

    

}
