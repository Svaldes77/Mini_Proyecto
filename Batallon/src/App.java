import javax.swing.*; // Importa las clases necesarias para la creación de la GUI
import controlador.controlador; // Importa la clase controlador
import vista.Gui; // Importa la clase Gui
import org.jfree.chart.ChartFactory; // Importa la clase ChartFactory de JFreeChart
import org.jfree.chart.ChartPanel; // Importa la clase ChartPanel de JFreeChart
import org.jfree.chart.JFreeChart; // Importa la clase JFreeChart de JFreeChart
import org.jfree.chart.plot.PiePlot; // Importa la clase PiePlot de JFreeChart
import org.jfree.data.general.DefaultPieDataset; // Importa la clase DefaultPieDataset de JFreeChart

/**
 * Clase principal del programa que inicializa la GUI y el controlador.
 */
public class App {
    public static void main(String[] args) {
        // Crea una instancia de la GUI
        Gui gui = new Gui();
        
        // Crea una instancia del controlador y le pasa la GUI
        controlador controlador = new controlador(gui);

        // Ejecuta la GUI en el hilo de despacho de eventos de Swing
        SwingUtilities.invokeLater(() -> {
            gui.setVisible(true); // Hace visible la GUI
        });
    }
}