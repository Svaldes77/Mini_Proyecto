public class App {
    public static void main(String[] args) {
        // Crear instancias de Soldado, SoldadoRaso, Teniente y Coronel
        SoldadoRaso soldadoRaso1 = new SoldadoRaso(2, "Pedro Gomez", "67890", Nivel_militar.TENIENTE);
        // Teniente teniente = new Teniente(3, "Luis Martinez", "54321",Nivel_militar.TENIENTE, "Unidad Alfa");
        // Coronel coronel = new Coronel(4, "Carlos Sanchez", "98765",Nivel_militar.CORONEL, "Estrategia de Defensa");
        //Capitan capitan= new Capitan(2)

        // Llamar a los métodos realizarAccion 
        //soldadoRaso1.realizarAccion();
        //teniente.realizarAccion();
        //coronel.realizarAccion();

        // Prueva de los métodos get y set para cada clase atributos private 
        //System.out.println("Unidad del teniente: " + teniente.getUnidad());
        //System.out.println("Estrategia del coronel: " + coronel.getEstrategia());
        // System.out.println("Nombre del soldado raso: " + soldadoRaso1.getNombre());
        //System.out.println("ID del soldado raso: " + soldadoRaso1.getId());
        //System.out.println("Rango del soldado: "+ soldadoRaso1.getRango());

        //Prueba de herencia, metodo mostrarInformacion
        soldadoRaso1.mostrarInformacion();

    }
}