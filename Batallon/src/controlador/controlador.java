package controlador;

import javax.swing.* ;
import java.awt.event.ActionEvent;
import modelo.soldados.Soldado; 
import modelo.soldados.SoldadoRaso;
import modelo.soldados.Capitan;
import modelo.soldados.Coronel;
import modelo.soldados.Teniente;
import modelo.rangos.Nivel_militar;

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

    // Atributos de la clase Controlador
    private Gui gui; 
    private List<Soldado> soldados; 
    private DefaultListModel<String> listModel = new DefaultListModel<>();

    // Constructor de la clase Controlador que recibe la GUI
    public controlador(Gui gui) {
        this.gui = gui;
        this.soldados = new ArrayList<>(); 
        initController(); 
        inicializarSoldadosPorDefecto();
        actualizarListaGrafica();
    }

    /**
 * Método para inicializar el controlador y agregar los listeners a los componentes de la GUI.
 */
private void initController() {
    // Agrega un ActionListener al botón para crear un soldado
    gui.getBotonCrearSoldado().addActionListener(this::botonCrearSoldadoActionPerformed);

    // Agrega un ActionListener al RadioButton para saludar
    gui.getjRadioButtonSaludar().addActionListener(this::jRadioButtonSaludar);

    // Agrega un ActionListener al botón para reportar el estado
    gui.getButtonReportarEstado().addActionListener(this::RadioButtonReportarEstado);

    // Agrega un ActionListener al CheckBox para regañar
    gui.getjCheckBoxReganar().addActionListener(this::CheckBoxReganar);

    // Agrega un ActionListener al botón jButton1
    gui.getjButton1().addActionListener(this::jButton1ActionPerformed);

    // Agrega un ActionListener al CheckBox para asignar una misión
    gui.getJCheckboxAsignarMision().addActionListener(this::jCheckBoxAsignarMision);

    // Agrega un ActionListener al CheckBox para anunciar la estrategia
    gui.getJCheckbocAnunciarEstrategia().addActionListener(this::jCheckBoxAnunciarEstrategia);

    // Agrega un ActionListener al CheckBox para anunciar el número de soldados bajo mando
    gui.getJCheckbocAnunciarsoldadosBajo().addActionListener(this::jCheckBoxNumeroSoldadosEnMando);

    // Agrega un ActionListener al CheckBox para anunciar la unidad
    gui.getjCheckBox2().addActionListener(this::jCheckBoxAnunciarUnidad);

    // Agrega un ActionListener al RadioButton para realizar una acción
    gui.getJRadioButtonRealizarAccion().addActionListener(this::RadioButtonRealizarAccion);

    // Agrega un ActionListener al RadioButton para patrullar
    gui.getjRadioButtonPatrullar().addActionListener(this::RadioButtonPatrullar);

    // Agrega un ActionListener al menú item para agregar
    gui.getMenuItemAgregar().addActionListener(this::menuItemAgregarActionPerformed);

    // Agrega un ActionListener al menú item para eliminar
    gui.getMenuItemEliminar().addActionListener(this::menuItemEliminarActionPerformed);

    // Agrega un ActionListener al menú item para actualizar
    gui.getMenuItemActualizar().addActionListener(this::menuItemActualizarActionPerformed);

    // Agrega un ActionListener al menú item para mostrar gráfica de pastel
    gui.getMenuItemGraficaPastel().addActionListener(this::menuItemGraficaPastelActionPerformed);

    // Agrega un ActionListener al menú item para mostrar gráfica de barras
    gui.getMenuItemGraficaBarras().addActionListener(this::menuItemGraficaBarrasActionPerformed);

    // Agrega un ActionListener al menú item para mostrar gráfica lineal
    gui.getMenuItemGraficaLineal().addActionListener(this::menuItemGraficaLinealActionPerformed);
}


    /**
 * Método que maneja la acción de mostrar una gráfica de pastel al seleccionar el menú correspondiente.
 *
 * @param evt El evento de acción.
 */
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

    private void menuItemGraficaLinealActionPerformed(ActionEvent evt) {
        // Crear un dataset de líneas
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    
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
            dataset.addValue(entry.getValue(), "Soldados", entry.getKey());
        }
    
        // Crear un gráfico de líneas
        JFreeChart chart = ChartFactory.createLineChart(
                "Grafica lineal de Soldados por Rango", // Título del gráfico
                "Rango", // Etiqueta del eje X
                "Cantidad", // Etiqueta del eje Y
                dataset // Datos
        );
    
        // Personalizar el gráfico
        chart.setBackgroundPaint(Color.WHITE);
        chart.getTitle().setPaint(Color.BLACK);
        chart.getLegend().setItemFont(new Font("Arial", Font.PLAIN, 12));
    
        // Crear un panel de gráficos y agregarlo a la GUI
        ChartPanel chartPanel = new ChartPanel(chart);
        JFrame frame = new JFrame();
        frame.add(chartPanel);
        frame.pack();
        frame.setVisible(true);
    }
    
    private void menuItemGraficaBarrasActionPerformed(ActionEvent evt) {
        // Crear un dataset de barras
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

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
            dataset.addValue(entry.getValue(), "Soldados", entry.getKey());
        }

        // Crear un gráfico de barras
        JFreeChart chart = ChartFactory.createBarChart(
                "Grafica de barras de Soldados por Rango", // Título del gráfico
                "Rango", // Etiqueta del eje X
                "Cantidad", // Etiqueta del eje Y
                dataset // Datos
        );

        // Personalizar el gráfico
        chart.setBackgroundPaint(Color.WHITE);
        chart.getTitle().setPaint(Color.BLACK);
        chart.getLegend().setItemFont(new Font("Arial", Font.PLAIN, 12));

        // Crear un panel de gráficos y agregarlo a la GUI
        ChartPanel chartPanel = new ChartPanel(chart);
        JFrame frame = new JFrame();
        frame.add(chartPanel);
        frame.pack();
        frame.setVisible(true);
    }

    /**
 * Método que maneja la acción de eliminar un soldado al seleccionar el menú correspondiente.
 *
 * @param evt El evento de acción.
 */
private void menuItemEliminarActionPerformed(ActionEvent evt) {
    int selectedIndex = gui.getjListSoldados().getSelectedIndex();
    if (selectedIndex != -1) {
        soldados.remove(selectedIndex);
        actualizarListaGrafica();
    } else {
        JOptionPane.showMessageDialog(gui, "Seleccione un soldado para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

/**
 * Método que maneja la acción de agregar un soldado al seleccionar el menú correspondiente.
 *
 * @param evt El evento de acción.
 */
private void menuItemAgregarActionPerformed(ActionEvent evt) {
    mostrarDialogoCrearSoldado();
}

/**
 * Método que maneja la acción de actualizar un soldado al seleccionar el menú correspondiente.
 *
 * @param evt El evento de acción.
 */
private void menuItemActualizarActionPerformed(ActionEvent evt) {
    int selectedIndex = gui.getjListSoldados().getSelectedIndex();
    if (selectedIndex != -1) {
        Soldado soldadoSeleccionado = soldados.get(selectedIndex);
        mostrarDialogoActualizarSoldado(soldadoSeleccionado, selectedIndex);
    } else {
        JOptionPane.showMessageDialog(gui, "Seleccione un soldado para actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

/**
 * Método que maneja la acción del botón jButton1.
 *
 * @param evt El evento de acción.
 */
private void jButton1ActionPerformed(ActionEvent evt) {
    // Limpia la lista de soldados en la interfaz, excepto las primeras cuatro posiciones
    DefaultListModel<String> model = (DefaultListModel<String>) gui.getjListSoldados().getModel();
    for (int i = model.getSize() - 1; i >= 4; i--) {
        model.remove(i);
    }

    // También puedes limpiar cualquier selección en el JList
    gui.getjListSoldados().clearSelection();

    JOptionPane.showMessageDialog(null, "La lista ha sido limpiada, excepto los primeros cuatro soldados.", "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);
}

/**
 * Método que maneja la acción de crear un soldado al seleccionar el botón correspondiente.
 *
 * @param evt El evento de acción.
 */
private void botonCrearSoldadoActionPerformed(ActionEvent evt) {
    mostrarDialogoCrearSoldado();
}

/**
 * Método que maneja la acción de regañar a un soldado al seleccionar el CheckBox correspondiente.
 *
 * @param evt El evento de acción.
 */
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
                Soldado nuevoSoldado = soldadoSeleccionado.regañado(soldados);

                // Actualiza el modelo de la lista
                if (nuevoSoldado != null) {
                    // Reemplaza el soldado antiguo con el nuevo soldado en la lista
                    soldados.set(selectedIndex, nuevoSoldado);
                    listModel.setElementAt(nuevoSoldado.toString(), selectedIndex);
                    JOptionPane.showMessageDialog(null, 
                        "El nivel del soldado " + nuevoSoldado.getNombre() + " ha sido reducido a " + nuevoSoldado.getNivel() + ".", 
                        "Regañado", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    listModel.removeElementAt(selectedIndex);
                    JOptionPane.showMessageDialog(null, 
                        "El soldado " + soldadoSeleccionado.getNombre() + " ha sido expulsado por alcanzar el nivel más bajo.", 
                        "Expulsión", JOptionPane.INFORMATION_MESSAGE);
                }

                // Limpia las selecciones y actualiza la interfaz
                gui.getjListSoldados().clearSelection();      // Limpia la selección de la lista
                gui.getbuttonGroupAcciones().clearSelection(); // Limpia la selección del grupo de botones
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

        // Desmarca el checkbox después de la operación
        gui.getjCheckBoxReganar().setSelected(false);
    }
}
    
        
    /**
 * Método para manejar el evento de reportar estado.
 *
 * @param evt El evento de acción.
 */
private void RadioButtonReportarEstado(ActionEvent evt) {
    // Busca el soldado seleccionado
    String soldadoSeleccionado = gui.getjListSoldados().getSelectedValue();
    if (soldadoSeleccionado != null) { // Si el soldado seleccionado no es nulo
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

/**
 * Método para manejar la acción de anunciar la estrategia al seleccionar el CheckBox correspondiente.
 *
 * @param evt El evento de acción.
 */
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

    /**
 * Método para manejar la acción de mostrar el número de soldados bajo mando al seleccionar el CheckBox correspondiente.
 *
 * @param evt El evento de acción.
 */
private void jCheckBoxNumeroSoldadosEnMando(ActionEvent evt) {
    Capitan capitan = null; // Inicializa el Capitán
    String soldadoSeleccionado = gui.getjListSoldados().getSelectedValue(); // Busca el soldado seleccionado
    if (soldadoSeleccionado != null) { // Si el soldado seleccionado no es nulo
        for (Soldado s : soldados) {
            if (s.toString().equals(soldadoSeleccionado)) { // Si el soldado que escogimos es igual al soldado de la lista
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

/**
 * Método para manejar la acción de anunciar la unidad al seleccionar el CheckBox correspondiente.
 *
 * @param evt El evento de acción.
 */
private void jCheckBoxAnunciarUnidad(ActionEvent evt) {   
    Teniente teniente = null;
    String soldadoSeleccionado = gui.getjListSoldados().getSelectedValue(); // Busca el soldado dentro de la lista
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
            teniente.anunciarUnidad(); // Si el teniente está en la lista, se anuncia la unidad
            // AnunciarUnidad es un método que se encuentra en la clase Teniente
            gui.getjListSoldados().clearSelection(); 
            gui.getbuttonGroupAcciones().clearSelection();  // Limpia la selección de los botones
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

/**
 * Método para manejar la acción de asignar una misión al seleccionar el CheckBox correspondiente.
 *
 * @param evt El evento de acción.
 */
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
    

    /**
 * Método para manejar la acción de realizar una acción al seleccionar el RadioButton correspondiente.
 *
 * @param evt El evento de acción.
 */
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

/**
 * Método para manejar la acción de patrullar al seleccionar el RadioButton correspondiente.
 *
 * @param evt El evento de acción.
 */
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

/**
 * Método para manejar la acción de saludar al seleccionar el RadioButton correspondiente.
 *
 * @param evt El evento de acción.
 */
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

/**
 * Método para mostrar el diálogo de creación de un soldado.
 */
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

/**
 * Método para mostrar un diálogo para crear un soldado raso.
 */
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
    
    /**
 * Método para mostrar un diálogo para crear un Teniente.
 */
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

/**
 * Método para mostrar un diálogo para crear un Coronel.
 */
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

/**
 * Método para mostrar un diálogo para crear un Capitán.
 */
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
        int numSoldados;

        try {
            numSoldados = Integer.parseInt(txtNumSoldados.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El número de soldados debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Soldado nuevoSoldado = new Capitan(soldados.size() + 1, nombre, identificacion, Nivel_militar.CAPITAN, numSoldados);
        soldados.add(nuevoSoldado);
        listModel.addElement(nuevoSoldado.toString());
        actualizarListaGrafica();
    }
}
    
    /**
 * Método para inicializar los soldados por defecto.
 */
private void inicializarSoldadosPorDefecto() {
    Soldado soldado1 = new SoldadoRaso(1, "Juan", "001", Nivel_militar.SOLDADO_RASO);
    Soldado soldado2 = new Teniente(2, "Pedro", "002", Nivel_militar.TENIENTE, "Unidad A");
    Soldado soldado3 = new Capitan(3, "Luis", "003", Nivel_militar.CAPITAN, 50);
    Soldado soldado4 = new Coronel(4, "Carlos", "004", Nivel_militar.CORONEL, "Estrategia X");

    soldados.add(soldado1);
    soldados.add(soldado2);
    soldados.add(soldado3);
    soldados.add(soldado4);

    for (Soldado soldado : soldados) {
        listModel.addElement(soldado.toString());
    }

    actualizarListaGrafica();
}

/**
 * Método para mostrar un diálogo para actualizar un soldado.
 *
 * @param soldado El soldado a actualizar.
 * @param index El índice del soldado en la lista.
 */
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

/**
 * Método para actualizar la lista gráfica.
 */
private void actualizarListaGrafica() {
    listModel.clear(); // Limpia el modelo actual
    for (Soldado soldado : soldados) {
        listModel.addElement(soldado.toString()); // Agrega cada soldado actualizado
    }
    gui.getjListSoldados().setModel(listModel); // Asegúrate de que la JList use el modelo actualizado
}
        
}