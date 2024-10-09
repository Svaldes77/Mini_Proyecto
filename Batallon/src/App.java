public class App {
    public static void main(String[] args) {
        // Crear instancias de Soldado, SoldadoRaso, Teniente y Coronel
        Soldado soldado = new Soldado(1, "Juan Perez", "12345", "Cabo");
        SoldadoRaso soldadoRaso = new SoldadoRaso(2, "Pedro Gomez", "67890", "Raso");
        Teniente teniente = new Teniente(3, "Luis Martinez", "54321", "Teniente", "Unidad Alfa");
        Coronel coronel = new Coronel(4, "Carlos Sanchez", "98765", "Coronel", "Estrategia de Defensa");

        // Llamar a los métodos realizarAccion 
        soldado.realizarAccion();
        soldadoRaso.realizarAccion();
        teniente.realizarAccion();
        coronel.realizarAccion();

        // Prueva de los métodos get y set para cada clase atributos private 
        System.out.println("Unidad del teniente: " + teniente.getUnidad());
        System.out.println("Estrategia del coronel: " + coronel.getEstrategia());
    }
}
