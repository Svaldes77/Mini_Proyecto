import javax.swing.*;
import controlador.controlador;
import vista.Gui;

public class App {
    public static void main(String[] args) {
        


        Gui gui = new Gui();
        controlador controlador = new controlador(gui);

    
       
        SwingUtilities.invokeLater(() -> {
            gui.setVisible(true);
        });
    }
}
  
            


            
 
