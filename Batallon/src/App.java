import java.util.ArrayList;
//import java.util.InputMismatchException;
//import java.util.Scanner; 
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


    // Metodo que recibe un objeto de tipo SoldadoRaso y muestra el estado del soldado  prueba del polimorfismo 
    // public void recibirSoldado(SoldadoRaso soldadoRaso1){
    //     soldadoRaso1.reportarEstado(" En guardia");
    // }
    
    
    public static void main(String[] args) {
        // Crear instancias de Soldado, SoldadoRaso, Teniente y Coronel
        SoldadoRaso soldadoRaso1 = new SoldadoRaso(1, "Pedro Perez", "12345", Nivel_militar.SOLDADO_RASO);

        // Teniente teniente1 = new Teniente(3, "Luis Martinez", "54321",Nivel_militar.TENIENTE, "Unidad Alfa");
        // Coronel coronel1 = new Coronel(4, "Carlos Sanchez", "98765",Nivel_militar.CORONEL, "Estrategia de Defensa"); 
        // Capitan capitan1 = new Capitan(5, "Juan Perez", "12345", Nivel_militar.CAPITAN, 10); 

        // // Prueba de metodos para soldado 
        // soldadoRaso1.realizarAccion();

    

    
        // System.out.println("----------------------------");
        // // prueba de metodos para teniente
        // teniente1.realizarAccion();
        // teniente1.mostrarUnidad(); 
        // System.out.println("----------------------------"); 

        // // prueba de metodos para coronel
        // coronel1.asignarMision("MISION SALVAR MARTE");
        // coronel1.realizarAccion();
        // coronel1.reportarEstado(" En guardia");
        // coronel1.mostrarEstrategia(); 
        // System.out.println("----------------------------");
        // // prueba de metodos para capitan}
        // capitan1.asignarMision("MISION ATACAR");
        // capitan1.reportarEstado(" En cubierta");  
        // capitan1.mostrarNumerosoldados(); 
        // capitan1.realizarAccion(); 
        // System.out.println("----------------------------"); 


        // //Prueba de los métodos get y set para cada clase atributos private 
        // // System.out.println("---------------------------------------");
        // // System.out.println("Unidad del teniente: " + teniente.getUnidad());
        // // System.out.println("Estrategia del coronel: " + coronel.getEstrategia());
        // // System.out.println("Nombre del soldado raso: " + soldadoRaso1.getNombre());
        // // System.out.println("ID del soldado raso: " + soldadoRaso1.getId());
        // // System.out.println("Rango del soldado: "+ soldadoRaso1.getRango());
        // // System.out.println("---------------------------------------");

        // //Prueba de herencia, metodo mostrarInformacion

        // soldadoRaso1.mostrarInformacion();
        // teniente1.mostrarInformacion();
        // coronel1.mostrarInformacion();
        // capitan1.mostrarInformacion(); 

        // // Mostrar el número de soldados
        // System.out.println("el numero de soldados es: "+ Soldado.getContadorSoldados() );

        // //Downcasting 
        // ArrayList<Soldado> lista = new ArrayList<Soldado>();
        // lista.add(soldadoRaso1);
        // lista.add(teniente1);
        // lista.add(coronel1);
        // lista.add(capitan1); 
        // System.out.println("--------------------------------");
        // for (Soldado soldadito: lista) {
        //     if(soldadito.getClass() == Teniente.class){
        //         Teniente tenientesoldadito = (Teniente)soldadito;
        //         System.out.println("Es teniente");
        //         tenientesoldadito.realizarAccion();
        //     }
        // }


        // Mostrar la lista de soldados antes de ser regañados
        System.out.println("Soldados antes de ser regañados:");
        for (Soldado soldado : lista) {
            System.out.println(soldado.getNombre() + " - Nivel: " + soldado.getNivel());
        }

        // El Coronel regaña a todos los soldados
        System.out.println("\nEl Coronel va a regañar a todos los soldados:");
        coronel1.regañarSoldados(lista);  // El Coronel regaña a todos los soldados

        // Mostrar la lista de soldados después de ser regañados
        System.out.println("\nSoldados después de ser regañados:");
        for (Soldado soldado : lista) {
            System.out.println(soldado.getNombre() + " - Nivel: " + soldado.getNivel());
        }

    // Scanner scanner = new Scanner(System.in);
    // ArrayList<Soldado> listaSoldados = new ArrayList<Soldado>();  
    // while (true) {
    //     try {    
    //     System.out.println("Seleccione una opción:");
    //     System.out.println("1. Crear Soldado Raso");
    //     System.out.println("2. Crear Teniente");
    //     System.out.println("3. Crear Coronel");
    //     System.out.println("4. Crear Capitán");
    //     System.out.println("5. Mostrar información de todos los soldados");
    //     System.out.println("6. Salir");
    //     System.out.print("Opción: ");
    //     int opcion = scanner.nextInt();
    //     scanner.nextLine(); // Consumir la nueva línea

        // switch (opcion) {
        //     case 1:
        //         listaSoldados.add(SoldadoRaso.crearSoldadoRaso(scanner)); // agrega el soldado creado a la lista
        //         break;
        //     case 2:
        //         listaSoldados.add(Teniente.crearTeniente(scanner));
        //         break;
        //     case 3:
        //         // listaSoldados.add(crearCoronel(scanner));
        //         break;
        //     case 4:
        //         //listaSoldados.add(crearcapitan(scanner));
        //         break;
        //     case 5:
        //         Soldado.mostrarInformacion(listaSoldados); // Muestra la información de todos los soldados
        //         break;
        //     case 6:
        //         System.out.println("Saliendo...");
        //         scanner.close();
        //         return;
        //     default:
        //         System.out.println("Opción no válida. Intente de nuevo.");
        //     }
        // } catch (InputMismatchException e) { //InputMismatchException e lo utilizamos para que el programa no se caiga si el usuario ingresa un valor que no es un numero
        //         System.out.println("Entrada no válida. Por favor, ingrese un número.");
        //         scanner.nextLine(); // Consumir la entrada no válida
        //     } catch (IllegalArgumentException e) { //IllegalArgumentException e lo utilizamos para que el programa no se caiga si el usuario ingresa un rango que no es válido
        //         System.out.println("Rango no válido. Por favor, ingrese un rango válido.");
        //     } catch (Exception e) {
        //         System.out.println("Ocurrió un error: " + e.getMessage());
        //     }
        // }
    }


}
