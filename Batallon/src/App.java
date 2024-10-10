import java.util.ArrayList;
import rangos.Nivel_militar;
//import soldados.Capitan;
import soldados.Coronel;
import soldados.Soldado;
import soldados.SoldadoRaso;
import soldados.Teniente;
//import rangos.Nivel_militar;
// import rangos.Rango;
// import misiones.OperacionesMilitares;

public class App {
    public static void main(String[] args) {
        // Crear instancias de Soldado, SoldadoRaso, Teniente y Coronel
        SoldadoRaso soldadoRaso1 = new SoldadoRaso(6, "Pedro Gomez", "67890", Nivel_militar.TENIENTE);
        Teniente teniente = new Teniente(3, "Luis Martinez", "54321",Nivel_militar.TENIENTE, "Unidad Alfa");
        Coronel coronel = new Coronel(4, "Carlos Sanchez", "98765",Nivel_militar.CORONEL, "Estrategia de Defensa"); 

        // Llamar a los métodos realizarAccion 
        //soldadoRaso1.realizarAccion();
        //teniente.realizarAccion();
        //coronel.realizarAccion();

        // //Prueba de los métodos get y set para cada clase atributos private 
        // System.out.println("---------------------------------------");
        // System.out.println("Unidad del teniente: " + teniente.getUnidad());
        // System.out.println("Estrategia del coronel: " + coronel.getEstrategia());
        // System.out.println("Nombre del soldado raso: " + soldadoRaso1.getNombre());
        // System.out.println("ID del soldado raso: " + soldadoRaso1.getId());
        // System.out.println("Rango del soldado: "+ soldadoRaso1.getRango());
        // System.out.println("---------------------------------------");

        //Prueba de herencia, metodo mostrarInformacion
        soldadoRaso1.mostrarInformacion();
        teniente.mostrarInformacion();

        soldadoRaso1.asignarMision("MISION SALVAR MARTE"); 
        soldadoRaso1.reportarEstado(); 
        coronel.asignarMision("Armar contraataque enemigo");
        coronel.reportarEstado();

<<<<<<< HEAD

        System.out.println("---------------------------------------");
        System.out.println("El numero de soldados es: "+ Soldado.getContadorSoldados() );
=======
        System.out.println("el numero de soldados es "+ Soldado.getContadorSoldados() );
>>>>>>> 610e7d6bbd77285a5238ccc8a74198806e3afa20


        //Downcasting}
        ArrayList<Soldado> lista = new ArrayList<Soldado>();
        lista.add(soldadoRaso1);
        lista.add(teniente);
        lista.add(coronel);
        System.out.println("--------------------------------");
        for (Soldado soldadito: lista) {
            if(soldadito.getClass() == Teniente.class){
                Teniente tenientesoldadito = (Teniente)soldadito;
                System.out.println("Es teniente");
                tenientesoldadito.realizarAccion();
            }
        }

    }
}
