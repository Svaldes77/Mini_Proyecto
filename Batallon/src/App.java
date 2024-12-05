import javax.swing.*;
import java.util.ArrayList; 
import controlador.controlador;
import modelo.soldados.*;
import modelo.rangos.Nivel_militar;
import vista.Gui;
import java.util.List;

public class App {
    public static void main(String[] args) {
        


        Gui gui = new Gui();
        controlador controlador = new controlador(gui);

    
       
        SwingUtilities.invokeLater(() -> {
            gui.setVisible(true);
        });
    }
}
  
            


            
 
