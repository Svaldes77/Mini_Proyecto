import javax.swing.*;
import controlador.controlador;
import vista.Gui;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class App {
    public static void main(String[] args) {
        


        Gui gui = new Gui();
        controlador controlador = new controlador(gui);

    
       
        SwingUtilities.invokeLater(() -> {
            gui.setVisible(true);
        });
    }
}
  
            


            
 
