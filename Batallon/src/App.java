import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner; 
import rangos.Nivel_militar;
import soldados.Capitan;
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
        //SoldadoRaso soldadoRaso1 = new SoldadoRaso(6, "Pedro Gomez", "67890", Nivel_militar.TENIENTE);
        //Teniente teniente = new Teniente(3, "Luis Martinez", "54321",Nivel_militar.TENIENTE, "Unidad Alfa");
        //Coronel coronel = new Coronel(4, "Carlos Sanchez", "98765",Nivel_militar.CORONEL, "Estrategia de Defensa"); 

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
        //soldadoRaso1.mostrarInformacion();
        //teniente.mostrarInformacion();

        // Asignar misiones y reportar estado
        //soldadoRaso1.asignarMision("MISION SALVAR MARTE"); 
        //soldadoRaso1.reportarEstado(); 
       // coronel.asignarMision("Armar contraataque enemigo");
        //coronel.reportarEstado();

        // Mostrar el número de soldados
        //System.out.println("el numero de soldados es: "+ Soldado.getContadorSoldados() );

        // Downcasting 
    //     ArrayList<Soldado> lista = new ArrayList<Soldado>();
    //     lista.add(soldadoRaso1);
    //     lista.add(teniente);
    //     lista.add(coronel);
    //     System.out.println("--------------------------------");
    //     for (Soldado soldadito: lista) {
    //         if(soldadito.getClass() == Teniente.class){
    //             Teniente tenientesoldadito = (Teniente)soldadito;
    //             System.out.println("Es teniente");
    //             tenientesoldadito.realizarAccion();
    //         }
    //     }

    Scanner scanner = new Scanner(System.in);
    ArrayList<Soldado> listaSoldados = new ArrayList<Soldado>();  
    while (true) {
        try {    
        System.out.println("Seleccione una opción:");
        System.out.println("1. Crear Soldado Raso");
        System.out.println("2. Crear Teniente");
        System.out.println("3. Crear Coronel");
        System.out.println("4. Crear Capitán");
        System.out.println("5. Mostrar información de todos los soldados");
        System.out.println("6. Salir");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        switch (opcion) {
            case 1:
                //listaSoldados.add(crearSoldadoRaso(scanner));
                break;
            case 2:
                //listaSoldados.add(crearTeniente(scanner));
                break;
            case 3:
                // listaSoldados.add(crearCoronel(scanner));
                break;
            case 4:
                //listaSoldados.add(crearcapitan(scanner));
                break;
            case 5:
                //mostrarInformacion(listaSoldados);
                break;
            case 6:
                System.out.println("Saliendo...");
                scanner.close();
                return;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                scanner.nextLine(); // Consumir la entrada no válida
            } catch (IllegalArgumentException e) {
                System.out.println("Rango no válido. Por favor, ingrese un rango válido.");
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
        }
    }

}
