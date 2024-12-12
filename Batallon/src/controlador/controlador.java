package controlador;

import javax.swing.* ;
import java.awt.event.ActionEvent;
import modelo.soldados.Soldado; 
import modelo.soldados.SoldadoRaso;
import modelo.soldados.Capitan;
import modelo.soldados.Coronel;
import modelo.soldados.Teniente;
import modelo.rangos.Nivel_militar;
import modelo.rangos.Rango;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import vista.Gui;
import java.util.List;
import java.util.Map;


public class controlador {

    //private Soldado soldado;
    private Gui gui; 
    private List<Soldado> soldados; 
    DefaultListModel<String> listModel = new DefaultListModel<>();

    // public controlador (Soldado soldado, Gui gui) {
    //     this.soldado = soldado;
    //     this.gui = gui;
    //     this.soldados = new ArrayList<>(); 
    //     initController(); 
    //     inicializarSoldadosPorDefecto();
    //     actualizarListaGrafica(); 
       
    // }

    public controlador(Gui gui) {
        this.gui = gui;
        this.soldados = new ArrayList<>(); 
        initController(); 
        inicializarSoldadosPorDefecto();
        actualizarListaGrafica();
    }


    private void initController() {
        gui.getBotonCrearSoldado().addActionListener(this::botonCrearSoldadoActionPerformed);
        gui.getjRadioButtonSaludar().addActionListener(this::jRadioButtonSaludar);
        gui.getButtonReportarEstado().addActionListener(this::RadioButtonReportarEstado);
        gui.getjCheckBoxReganar().addActionListener(this::CheckBoxReganar);
        gui.getjButton1().addActionListener(this::jButton1ActionPerformed);
        gui.getJCheckboxAsignarMision().addActionListener(this::jCheckBoxAsignarMision);
        gui.getJCheckbocAnunciarEstrategia().addActionListener(this::jCheckBoxAnunciarEstrategia);
        gui.getJCheckbocAnunciarsoldadosBajo().addActionListener(this::jCheckBoxNumeroSoldadosEnMando);
        gui.getjCheckBox2().addActionListener(this::jCheckBoxAnunciarUnidad);
        gui.getJRadioButtonRealizarAccion().addActionListener(this::RadioButtonRealizarAccion);
        gui.getjRadioButtonPatrullar().addActionListener(this::RadioButtonPatrullar);
        gui.getMenuItemAgregar().addActionListener(this::menuItemAgregarActionPerformed); 
        gui.getMenuItemEliminar().addActionListener(this::menuItemEliminarActionPerformed); 
        gui.getMenuItemActualizar().addActionListener(this::menuItemActualizarActionPerformed);
        gui.getMenuItemGraficaPastel().addActionListener(this::menuItemGraficaPastelActionPerformed);
    }

    private void menuItemGraficaPastelActionPerformed(ActionEvent evt) {
            // Crear un dataset de pastel
    DefaultPieDataset dataset = new DefaultPieDataset();

    // Suponiendo que tienes una lista de soldados y un método para obtener el rango
    List<Soldado> soldados = this.soldados; // Método que devuelve la lista de soldados
    Map<String, Integer> rangoConteo = new HashMap<>();

    // Contar los soldados por rango
    for (Soldado soldado : soldados) {
        Nivel_militar nivel = soldado.getRango(); // Método que devuelve el rango del soldado
        String nombreRango = nivel.toString(); // Método que devuelve el nombre del rango 
        rangoConteo.put(nombreRango, rangoConteo.getOrDefault(nombreRango, 0) + 1);
    }

    // Agregar los datos al dataset
    for (Map.Entry<String, Integer> entry : rangoConteo.entrySet()) {
        dataset.setValue(entry.getKey(), entry.getValue());
    }

    // Crear un gráfico de pastel
    JFreeChart chart = ChartFactory.createPieChart(
            "Grafica pastel de Soldados por Rango", // Título del gráfico
            dataset, // Datos
            true, // Incluir leyenda
            true,
            false
    );
        // Personalizar el gráfico
    chart.setBackgroundPaint(Color.WHITE);
    chart.getTitle().setPaint(Color.BLACK);
    chart.getLegend().setItemFont(new Font("Arial", Font.PLAIN, 12));

    // Personalizar el plot
    PiePlot plot = (PiePlot) chart.getPlot();
    plot.setLabelFont(new Font("Arial", Font.PLAIN, 12));
    plot.setCircular(true);
    plot.setLabelGap(0.02);


    // Crear un panel de gráficos y agregarlo a la GUI
    ChartPanel chartPanel = new ChartPanel(chart);
    JFrame frame = new JFrame();
    frame.add(chartPanel);
    frame.pack();
    frame.setVisible(true);
    }
    


    private void menuItemEliminarActionPerformed(ActionEvent evt) {
        int selectedIndex = gui.getjListSoldados().getSelectedIndex();
        if (selectedIndex != -1) {
            soldados.remove(selectedIndex);
            actualizarListaGrafica();
        } else {
            JOptionPane.showMessageDialog(gui, "Seleccione un soldado para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void menuItemAgregarActionPerformed(ActionEvent evt) {
        mostrarDialogoCrearSoldado();
    }

    private void menuItemActualizarActionPerformed(ActionEvent evt) {
        int selectedIndex = gui.getjListSoldados().getSelectedIndex();
        if (selectedIndex != -1) {
            Soldado soldadoSeleccionado = soldados.get(selectedIndex);
            mostrarDialogoActualizarSoldado(soldadoSeleccionado, selectedIndex);
        } else {
            JOptionPane.showMessageDialog(gui, "Seleccione un soldado para actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        // Limpia la lista de soldados en la interfaz, excepto las primeras cuatro posiciones
        DefaultListModel<String> model = (DefaultListModel<String>) gui.getjListSoldados().getModel();
        for (int i = model.getSize() - 1; i >= 4; i--) {
            model.remove(i);
        }
    
        // También puedes limpiar cualquier selección en el JListdd
        gui.getjListSoldados().clearSelection();
    
        JOptionPane.showMessageDialog(null, "La lista ha sido limpiada, excepto los primeros cuatro soldados.", "Operación Exitosa :P", JOptionPane.INFORMATION_MESSAGE);
    }
                                           

    private void botonCrearSoldadoActionPerformed(ActionEvent evt) {
        mostrarDialogoCrearSoldado();
                                                        
    }

    private void CheckBoxReganar(ActionEvent evt) {
        // Verifica si el checkbox está seleccionado
        if (gui.getjCheckBoxReganar().isSelected()) {
            // Verifica que haya un elemento seleccionado en la lista
            int selectedIndex = gui.getjListSoldados().getSelectedIndex();
            if (selectedIndex != -1) {
                // Obtiene el soldado seleccionado
                String soldadoSeleccionadoNombre = gui.getjListSoldados().getSelectedValue();
                Soldado soldadoSeleccionado = null;
    
                // Busca el soldado en la lista de soldados
                for (Soldado soldado : soldados) {
                    if (soldado.toString().equals(soldadoSeleccionadoNombre)) {
                        soldadoSeleccionado = soldado;
                        break;
                    }
                }
    
                if (soldadoSeleccionado != null) {
                    // Llama al método regañado del soldado
                    soldadoSeleccionado.regañado(soldados);

                    actualizarListaGrafica();
    
                    // Actualiza el modelo de la lista
                    if (soldadoSeleccionado.getNivel() > 0) {
                        listModel.setElementAt(soldadoSeleccionado.toString(), selectedIndex);
                        JOptionPane.showMessageDialog(null, 
                            "El nivel del soldado " + soldadoSeleccionado.getNombre() + " ha sido reducido a " + soldadoSeleccionado.getNivel() + ".", 
                            "Regañado", JOptionPane.INFORMATION_MESSAGE);
                            gui.getjListSoldados().clearSelection();      // Limpia la selección de la lista
                            gui.getbuttonGroupAcciones().clearSelection(); // Limpia la selección del grupo de botones
            
                               
                    } else {
                        listModel.removeElementAt(selectedIndex);
                        JOptionPane.showMessageDialog(null, 
                            "El soldado " + soldadoSeleccionado.getNombre() + " ha sido expulsado por alcanzar el nivel más bajo.", 
                            "Expulsión", JOptionPane.INFORMATION_MESSAGE);
                            gui.getjListSoldados().clearSelection();      // Limpia la selección de la lista
                            gui.getbuttonGroupAcciones().clearSelection(); // Limpia la selección del grupo de botones
            
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, 
                        "No se pudo encontrar el soldado seleccionado.", 
                        "Error", JOptionPane.ERROR_MESSAGE);
                        gui.getjListSoldados().clearSelection();      // Limpia la selección de la lista
                        gui.getbuttonGroupAcciones().clearSelection(); // Limpia la selección del grupo de botones
            
                }
            } else {
                JOptionPane.showMessageDialog(null, 
                    "Por favor, selecciona un soldado de la lista para regañar.", 
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
                // Limpia las selecciones y actualiza la interfaz
                gui.getjCheckBoxReganar().setSelected(false); // Desmarca el checkbox
                gui.getjListSoldados().clearSelection();      // Limpia la selección de la lista
                gui.getbuttonGroupAcciones().clearSelection(); // Limpia la selección del grupo de botones
            
            }
        }
        
    private void RadioButtonReportarEstado(ActionEvent evt) {//metodo para el evento de reportar estado
        String soldadoSeleccionado = gui.getjListSoldados().getSelectedValue(); //busca el soldado seleccionado  
        if (soldadoSeleccionado != null) { //si el soldado seleccionado no es nulo
            Soldado soldado = null;
    
            // Buscar el soldado seleccionado en la lista de soldados
            for (Soldado s : soldados) {
                if (s.toString().equals(soldadoSeleccionado)) {
                    soldado = s;
                    break;
                }
            }
    
            if (soldado != null) {
                soldado.reportarEstado();
                gui.getjListSoldados().clearSelection(); 
                gui.getbuttonGroupAcciones().clearSelection();  
            } else {
                JOptionPane.showMessageDialog(null, "Soldado no encontrado.");
                gui.getjListSoldados().clearSelection(); 
                gui.getbuttonGroupAcciones().clearSelection(); 
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un soldado.");
                gui.getjListSoldados().clearSelection(); 
                gui.getbuttonGroupAcciones().clearSelection(); 
        }
        
    }


    
    private void jCheckBoxAnunciarEstrategia(ActionEvent evt) {   
        // Verifica si el checkbox está seleccionado
        if (gui.getJCheckbocAnunciarEstrategia().isSelected()) {
            // Verifica que haya un elemento seleccionado en la lista
            int selectedIndex = gui.getjListSoldados().getSelectedIndex();
            if (selectedIndex != -1) {
                // Obtiene el nombre del soldado seleccionado
                String soldadoSeleccionadoNombre = gui.getjListSoldados().getSelectedValue();
                Soldado soldadoSeleccionado = null;

                // Busca el soldado en la lista interna de soldados
                for (Soldado soldado : soldados) {
                    if (soldado.toString().equals(soldadoSeleccionadoNombre)) {
                        soldadoSeleccionado = soldado;
                        break;
                    }
                }

                if (soldadoSeleccionado != null) {
                    // Verifica si el soldado seleccionado es un Coronel
                    if (soldadoSeleccionado instanceof Coronel) {
                        // Recupera la estrategia ya asignada al Coronel
                        String estrategia = ((Coronel) soldadoSeleccionado).getEstrategia();
                        // Muestra la estrategia en una ventana emergente
                        if (estrategia != null && !estrategia.trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, 
                                "Estrategia del Coronel " + soldadoSeleccionado.getNombre() + ": " + estrategia,
                                "Estrategia Asignada",
                                JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, 
                                "El Coronel " + soldadoSeleccionado.getNombre() + " no tiene una estrategia asignada.", 
                                "Sin Estrategia", 
                                JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        // Si el soldado no es Coronel, muestra un mensaje
                        JOptionPane.showMessageDialog(null, 
                            "Solo un Coronel puede tener una estrategia.", 
                            "Operación No Permitida", 
                            JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, 
                        "No se pudo encontrar el soldado seleccionado.", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, 
                    "Por favor, selecciona un soldado de la lista para ver la estrategia.", 
                    "Advertencia", 
                    JOptionPane.WARNING_MESSAGE);
            }

            // Limpia la selección del checkbox y del JList
            gui.getJCheckbocAnunciarEstrategia().setSelected(false);
            gui.getjListSoldados().clearSelection();
            gui.getbuttonGroupAcciones().clearSelection();
        }
    }

    private void jCheckBoxNumeroSoldadosEnMando(ActionEvent evt) {
        Capitan capitan = null; // Inicializa el Capitán
        String soldadoSeleccionado = gui.getjListSoldados().getSelectedValue(); //busca el soldado seleccionado
        if (soldadoSeleccionado != null) {//si el soldado seleccionado no es nulo
            for (Soldado s : soldados) {
                if (s.toString().equals(soldadoSeleccionado)) { //si el soldado que escogimos es igual al soldado al de la lista
                    if (s instanceof Capitan) { 
                        capitan = (Capitan) s;
                        break;
                    }
                }
            }
    
            if (capitan != null) {
                // Muestra un mensaje con la cantidad de soldados bajo su mando
                JOptionPane.showMessageDialog(null, "El Capitán " + capitan.getNombre() + " tiene " + capitan.getCantidadSoldadosBajoSuMando() + " soldados bajo su mando.");
                gui.getjListSoldados().clearSelection(); // Limpia la selección de la lista
                gui.getbuttonGroupAcciones().clearSelection();  // Limpia la selección de los botones
            } else {
                JOptionPane.showMessageDialog(null, "El soldado seleccionado no es un Capitán.");
                gui.getjListSoldados().clearSelection(); 
                gui.getbuttonGroupAcciones().clearSelection(); 
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un soldado.");
                gui.getjListSoldados().clearSelection(); 
                gui.getbuttonGroupAcciones().clearSelection(); 
        }                    
    }                                          

    private void jCheckBoxAnunciarUnidad(ActionEvent evt) {   
        Teniente teniente = null;
        String soldadoSeleccionado = gui.getjListSoldados().getSelectedValue();//busca el soldado dentro de la lista
        if (soldadoSeleccionado != null) {
            // Buscar el soldado seleccionado en la lista de soldados
            for (Soldado s : soldados) {
                if (s.toString().equals(soldadoSeleccionado)) {
                    if (s instanceof Teniente) {
                        teniente = (Teniente) s;
                        break;
                    }
                }
            }
    
            if (teniente != null) {
                teniente.AnunciarUnidad();//siel teniente esta en la lista se anuncia la unidad
                //.AnunciarUnidad es un metodo que se encuentra en la clase teniente
                gui.getjListSoldados().clearSelection(); 
                gui.getbuttonGroupAcciones().clearSelection();  //limpia la seleción de los botones
            } else {
                JOptionPane.showMessageDialog(null, "El soldado seleccionado no es un Teniente.");
                gui.getjListSoldados().clearSelection(); 
                gui.getbuttonGroupAcciones().clearSelection(); 
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un soldado.");
                gui.getjListSoldados().clearSelection(); 
                gui.getbuttonGroupAcciones().clearSelection(); 
        }
        
        
    }                                          

    private void jCheckBoxAsignarMision(ActionEvent evt) {
        // Verifica si el checkbox está seleccionado
        if (gui.getJCheckboxAsignarMision().isSelected()) {
            // Verifica que haya un elemento seleccionado en la lista
            int selectedIndex = gui.getjListSoldados().getSelectedIndex();
            if (selectedIndex != -1) {
                // Obtiene el nombre del soldado seleccionado en el JList
                String soldadoSeleccionadoNombre = gui.getjListSoldados().getSelectedValue();
                Soldado soldadoSeleccionado = null;
    
                // Busca el soldado en la lista interna
                for (Soldado soldado : soldados) {
                    if (soldado.toString().equals(soldadoSeleccionadoNombre)) {
                        soldadoSeleccionado = soldado;
                        break;
                    }
                }

                
    
                if (soldadoSeleccionado != null) {
                    // Verifica que el rango del soldado sea válido (Teniente, Capitán, Coronel)
                    if (soldadoSeleccionado.getRango() == Nivel_militar.TENIENTE ||
                        soldadoSeleccionado.getRango() == Nivel_militar.CAPITAN ||
                        soldadoSeleccionado.getRango() == Nivel_militar.CORONEL) {
    
                        // Lógica para decidir si pedimos la misión o usamos una predefinida
                        String mision = null;
                        if (Math.random() < 0.5) { // 50% de probabilidad de solicitar la misión
                            mision = JOptionPane.showInputDialog(null,
                                "Ingresa la misión para " + soldadoSeleccionado.getNombre() + ":",
                                "Asignar Misión",
                                JOptionPane.PLAIN_MESSAGE);
                        }
                        
                        // Si no se ingresó una misión (o se canceló), usar la misión predefinida
                        if (mision == null || mision.trim().isEmpty()) {
                            // Asignamos la misión predefinida basada en el rango
                            if (soldadoSeleccionado.getRango() == Nivel_militar.TENIENTE) {
                                mision = "Supervisar la patrulla en la zona norte";
                            } else if (soldadoSeleccionado.getRango() == Nivel_militar.CAPITAN) {
                                mision = "Coordinar el ataque en la frontera";
                            } else if (soldadoSeleccionado.getRango() == Nivel_militar.CORONEL) {
                                mision = "Planificar la estrategia de defensa general";
                            }
                        }
    
                        // Llama al método asignarMision del soldado
                        soldadoSeleccionado.asignarMision(mision);
    
                        JOptionPane.showMessageDialog(null,
                            "Misión asignada exitosamente al " + soldadoSeleccionado.getRango() + " " + soldadoSeleccionado.getNombre() + ".\n" +
                            "Misión: " + mision,
                            "Asignación Exitosa",
                            JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null,
                            "El soldado seleccionado no puede recibir misiones. Solo Tenientes, Capitanes y Coroneles pueden ser asignados.",
                            "Operación No Permitida",
                            JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null,
                        "No se pudo encontrar el soldado seleccionado.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null,
                    "Por favor, selecciona un soldado de la lista para asignar una misión.",
                    "Advertencia",
                    JOptionPane.WARNING_MESSAGE);
            }
    
            // Limpia la selección del checkbox y del JList
            gui.getJCheckboxAsignarMision().setSelected(false);
            gui.getjListSoldados().clearSelection();
            gui.getbuttonGroupAcciones().clearSelection();
        }
    }
    

    private void RadioButtonRealizarAccion(ActionEvent evt) {
        String soldadoSeleccionado = gui.getjListSoldados().getSelectedValue();
        if (soldadoSeleccionado != null) {
            Soldado soldado = null;
    
            // Buscar el soldado seleccionado en la lista de soldados
            for (Soldado s : soldados) {
                if (s.toString().equals(soldadoSeleccionado)) {
                    soldado = s;
                    break;
                }
            }
    
            if (soldado != null) {
                soldado.realizarAccion();
                gui.getjListSoldados().clearSelection(); 
                gui.getbuttonGroupAcciones().clearSelection();  
            } else {
                JOptionPane.showMessageDialog(null, "Soldado no encontrado.");
                gui.getjListSoldados().clearSelection(); 
                gui.getbuttonGroupAcciones().clearSelection(); 
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un soldado.");
                gui.getjListSoldados().clearSelection(); 
                gui.getbuttonGroupAcciones().clearSelection(); 
        }                                      

                                                      

    }                                             
                  
    private void RadioButtonPatrullar(ActionEvent evt) {
        String soldadoSeleccionado = gui.getjListSoldados().getSelectedValue();
        if (soldadoSeleccionado != null) {
            Soldado soldado = null;
    
            // Buscar el soldado seleccionado en la lista de soldados
            for (Soldado s : soldados) {
                if (s.toString().equals(soldadoSeleccionado)) {
                    soldado = s;
                    break;
                }
            }
    
            if (soldado != null) {
                soldado.patrullar();
                gui.getjListSoldados().clearSelection(); 
                gui.getbuttonGroupAcciones().clearSelection();  
            } else {
                JOptionPane.showMessageDialog(null, "Soldado no encontrado.");
                gui.getjListSoldados().clearSelection(); 
                gui.getbuttonGroupAcciones().clearSelection(); 
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un soldado.");
                gui.getjListSoldados().clearSelection(); 
                gui.getbuttonGroupAcciones().clearSelection(); 
        }                                             

        
    }
                  
    private void jRadioButtonSaludar(ActionEvent evt){
        String soldadoSeleccionado = gui.getjListSoldados().getSelectedValue();
        if (soldadoSeleccionado != null) {
            Soldado soldado = null;
    
            // Buscar el soldado seleccionado en la lista de soldados
            for (Soldado s : soldados) {
                if (s.toString().equals(soldadoSeleccionado)) {
                    soldado = s;
                    break;
                }
            }
    
            if (soldado != null) {
                soldado.saludar();
                gui.getjListSoldados().clearSelection(); 
                gui.getbuttonGroupAcciones().clearSelection();  
            } else {
                JOptionPane.showMessageDialog(null, "Soldado no encontrado.");
                gui.getjListSoldados().clearSelection(); 
                gui.getbuttonGroupAcciones().clearSelection(); 
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un soldado.");
                gui.getjListSoldados().clearSelection(); 
                gui.getbuttonGroupAcciones().clearSelection(); 
        }
    }

    private void mostrarDialogoCrearSoldado() {
        JRadioButton rbtnSoldadoRaso = new JRadioButton("Soldado Raso");
        JRadioButton rbtnTeniente = new JRadioButton("Teniente");
        JRadioButton rbtnCoronel = new JRadioButton("Coronel");
        JRadioButton rbtnCapitan = new JRadioButton("Capitán");

        ButtonGroup group = new ButtonGroup();
        group.add(rbtnSoldadoRaso);
        group.add(rbtnTeniente);
        group.add(rbtnCoronel);
        group.add(rbtnCapitan);

        // Crea un panel con los radio buttons 
        JPanel panelRangos = new JPanel(new GridLayout(4, 1));
        panelRangos.add(rbtnSoldadoRaso);
        panelRangos.add(rbtnTeniente);
        panelRangos.add(rbtnCoronel);
        panelRangos.add(rbtnCapitan);

        // Muestra el diálogo de selección de rango y crea el soldado correspondiente 
        int result = JOptionPane.showConfirmDialog(null, panelRangos, "Seleccionar Rango", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            if (rbtnSoldadoRaso.isSelected()) {
                mostrarFormularioSoldadoRaso();
            } else if (rbtnTeniente.isSelected()) {
                mostrarFormularioTeniente();
            } else if (rbtnCoronel.isSelected()) {
                mostrarFormularioCoronel();
            } else if (rbtnCapitan.isSelected()) {
                mostrarFormularioCapitan();
            }
        }
    }
    // comentario: este metodo se encarga de mostrar un dialogo para crear un soldado raso
    private void mostrarFormularioSoldadoRaso() {
        JTextField txtNombre = new JTextField();
        JTextField txtIdentificacion = new JTextField();

        JPanel panel = new JPanel(new GridLayout(2, 2));
        panel.add(new JLabel("Nombre:"));
        panel.add(txtNombre);
        panel.add(new JLabel("Identificación:"));
        panel.add(txtIdentificacion);

        int result = JOptionPane.showConfirmDialog(null, panel, "Crear Soldado Raso", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            String nombre = txtNombre.getText();
            String identificacion = txtIdentificacion.getText();

            Soldado nuevoSoldado = new SoldadoRaso(soldados.size() + 1, nombre, identificacion, modelo.rangos.Nivel_militar.SOLDADO_RASO);
            soldados.add(nuevoSoldado);
            listModel.addElement(nuevoSoldado.toString());
        }
    }
    // comentario: este metodo se encarga de mostrar un dialogo para crear un teniente
    private void mostrarFormularioTeniente() {
        JTextField txtNombre = new JTextField();
        JTextField txtIdentificacion = new JTextField();
        JTextField txtUnidad = new JTextField();

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(new JLabel("Nombre:"));
        panel.add(txtNombre);
        panel.add(new JLabel("Identificación:"));
        panel.add(txtIdentificacion);
        panel.add(new JLabel("Unidad:"));
        panel.add(txtUnidad);

        int result = JOptionPane.showConfirmDialog(null, panel, "Crear Teniente", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            String nombre = txtNombre.getText();
            String identificacion = txtIdentificacion.getText();
            String unidad = txtUnidad.getText();

            Soldado nuevoSoldado = new Teniente(soldados.size() + 1, nombre, identificacion, Nivel_militar.TENIENTE, unidad);
            soldados.add(nuevoSoldado);
            listModel.addElement(nuevoSoldado.toString());
        }
    }

    // comentario: este metodo se encarga de mostrar un dialogo para crear un coronel
    private void mostrarFormularioCoronel() {
        JTextField txtNombre = new JTextField();
        JTextField txtIdentificacion = new JTextField();
        JTextField txtEstrategia = new JTextField();

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(new JLabel("Nombre:"));
        panel.add(txtNombre);
        panel.add(new JLabel("Identificación:"));
        panel.add(txtIdentificacion);
        panel.add(new JLabel("Estrategia:"));
        panel.add(txtEstrategia);

        int result = JOptionPane.showConfirmDialog(null, panel, "Crear Coronel", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            String nombre = txtNombre.getText();
            String identificacion = txtIdentificacion.getText();
            String estrategia = txtEstrategia.getText();

            Soldado nuevoSoldado = new Coronel(soldados.size() + 1, nombre, identificacion, Nivel_militar.CORONEL, estrategia);
            soldados.add(nuevoSoldado);
            listModel.addElement(nuevoSoldado.toString());
        }
    }
    // comentario: este metodo se encarga de mostrar un dialogo para crear un capitan
    private void mostrarFormularioCapitan() {
        JTextField txtNombre = new JTextField();
        JTextField txtIdentificacion = new JTextField();
        JTextField txtNumSoldados = new JTextField();

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(new JLabel("Nombre:"));
        panel.add(txtNombre);
        panel.add(new JLabel("Identificación:"));
        panel.add(txtIdentificacion);
        panel.add(new JLabel("Número de Soldados:"));
        panel.add(txtNumSoldados);

        int result = JOptionPane.showConfirmDialog(null, panel, "Crear Capitán", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            String nombre = txtNombre.getText();
            String identificacion = txtIdentificacion.getText();
            int numSoldados = Integer.parseInt(txtNumSoldados.getText());

            Soldado nuevoSoldado = new Capitan(soldados.size() + 1, nombre, identificacion, Nivel_militar.CAPITAN, numSoldados);
            soldados.add(nuevoSoldado);
            listModel.addElement(nuevoSoldado.toString());
            actualizarListaGrafica();
        }
    }
    
    // Método para inicializar los soldados por defecto en la lista
    private void inicializarSoldadosPorDefecto() {
        Soldado soldado1 = new SoldadoRaso(1, "Juan", "001", Nivel_militar.SOLDADO_RASO);
        Soldado soldado2 = new Teniente(2, "Pedro", "002",Nivel_militar.TENIENTE, "Unidad A");
        Soldado soldado3 = new Capitan(3, "Luis", "003", Nivel_militar.CAPITAN, 50);
        Soldado soldado4 = new Coronel(4, "Carlos", "004", Nivel_militar.CORONEL, "Estrategia X");

        soldados.add(soldado1);
        soldados.add(soldado2);
        soldados.add(soldado3);
        soldados.add(soldado4);

        actualizarListaGrafica();

    }
    private void mostrarDialogoActualizarSoldado(Soldado soldado, int index) {
        JTextField txtNombre = new JTextField(soldado.getNombre());
        JTextField txtIdentificacion = new JTextField(soldado.getId());
        txtNombre.setEnabled(false); // Deshabilita el campo de nombre
        txtIdentificacion.setEnabled(false); // Deshabilita el campo de identificación
    
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(new JLabel("Nombre:"));
        panel.add(txtNombre);
        panel.add(new JLabel("Identificación:"));
        panel.add(txtIdentificacion);
    
        if (soldado instanceof SoldadoRaso) {
            JOptionPane.showMessageDialog(null, "El Soldado Raso no tiene datos adicionales para actualizar.", "Información", JOptionPane.INFORMATION_MESSAGE);
            return;
        } else if (soldado instanceof Teniente) {
            JTextField txtUnidad = new JTextField(((Teniente) soldado).getUnidad());
            panel.add(new JLabel("Unidad:"));
            panel.add(txtUnidad);
    
            int result = JOptionPane.showConfirmDialog(null, panel, "Actualizar Teniente", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (result == JOptionPane.OK_OPTION) {
                String unidad = txtUnidad.getText();
                ((Teniente) soldado).setUnidad(unidad);
            }
        } else if (soldado instanceof Capitan) {
            JTextField txtNumSoldados = new JTextField(String.valueOf(((Capitan) soldado).getCantidadSoldadosBajoSuMando()));
            panel.add(new JLabel("Número de Soldados:"));
            panel.add(txtNumSoldados);
    
            int result = JOptionPane.showConfirmDialog(null, panel, "Actualizar Capitán", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (result == JOptionPane.OK_OPTION) {
                int numSoldados = Integer.parseInt(txtNumSoldados.getText());
                ((Capitan) soldado).setNumSoldados(numSoldados);
            }
        } else if (soldado instanceof Coronel) {
            JTextField txtEstrategia = new JTextField(((Coronel) soldado).getEstrategia());
            panel.add(new JLabel("Estrategia:"));
            panel.add(txtEstrategia);
    
            int result = JOptionPane.showConfirmDialog(null, panel, "Actualizar Coronel", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (result == JOptionPane.OK_OPTION) {
                String estrategia = txtEstrategia.getText();
                ((Coronel) soldado).setEstrategia(estrategia);
            }
        }
    
        soldados.set(index, soldado);
        actualizarListaGrafica(); // Actualiza la lista gráfica
    }

    private void actualizarListaGrafica() {
        listModel.clear(); // Limpia el modelo actual
        for (Soldado soldado : soldados) {
            listModel.addElement(soldado.toString()); // Agrega cada soldado actualizado
        }
        gui.getjListSoldados().setModel(listModel); // Asegúrate de que la JList use el modelo actualizado
    }
        
}         

