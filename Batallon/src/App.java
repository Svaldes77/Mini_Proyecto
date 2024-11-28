
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList; 
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import rangos.Nivel_militar;
import soldados.Capitan;
import soldados.Coronel;
import soldados.Soldado;
import soldados.SoldadoRaso;
import soldados.Teniente;

        public class App extends Frame {


            public App() {
                initComponents();
                inicializarSoldadosPorDefecto();

            }
            
            private void initComponents() { // se inicializan los componentes de la interfaz

                buttonGroupAcciones = new ButtonGroup(); // se crea un grupo de botones
                //se inicializan los label para la interfaz
                jLabel1 = new JLabel();
                jLabel2 = new JLabel();
                jPanel1 = new JPanel();
                jLabel3 = new JLabel();
                //jScrollPane1 = new JScrollPane();
                jPanel2 = new JPanel();
                botonCrearSoldado = new JButton();
                jLabel4 = new JLabel();
                buttonReportarEstado = new JRadioButton();
                JRadioButtonRealizarAccion = new JRadioButton();
                JCheckboxAsignarMision = new JCheckBox();
                jCheckBox2 = new JCheckBox();
                jRadioButtonPatrullar = new JRadioButton();
                jRadioButtonSaludar = new JRadioButton();
                JCheckbocAnunciarEstrategia = new JCheckBox();
                label1 = new Label();
                label2 = new Label();
                label3 = new Label();
                label4 = new Label();
                label5 = new Label();
                label6 = new Label();
                JCheckbocAnunciarsoldadosBajo = new JCheckBox();
                jCheckBoxReganar = new JCheckBox();
                jLabel5 = new JLabel();
                jButton1 = new JButton();
                botonCrearSoldado = new JButton();
                jPanel1 = new JPanel();
                jScrollPaneSoldados = new JScrollPane();
                listModel = new DefaultListModel<>(); // ListModel es una clase que implementa la interfaz ListModel y que se utiliza para almacenar elementos de una lista
                jListSoldados = new JList<>(listModel); // se crea una lista de soldados
                jScrollPaneSoldados.setViewportView(jListSoldados);// se agrega la lista de soldados al scrollpane
        

            //se inicializan los componentes de la interfaz, mas que todo los botones y los labels
                setBackground(Color.white);
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                setLocation(new Point(100, 100));
                setMaximumSize(new Dimension(800, 600));
                setMinimumSize(new Dimension(800, 600));
                setPreferredSize(new Dimension(1130, 710));
                setResizable(false);
                setSize(new Dimension(0, 0));
                setTitle("Gestión de Rangos ");
                setType(Window.Type.UTILITY);
                addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent evt) {
                        exitForm(evt);
                    }
                });

                jListSoldados.addListSelectionListener(new ListSelectionListener() { //se añade un listener a la lista de soldados
                      public void valueChanged(ListSelectionEvent evt) {
                        soldadoSeleccionadoChanged(evt);//se llama al metodo soldadoSeleccionadoChanged
                    }
                });

        
                jLabel1.setFont(new Font("Segoe UI Emoji", 1, 70)); // NOI18N
                jLabel1.setText("Gestión de Soldados");
        
                jLabel2.setIcon(new ImageIcon(getClass().getResource("icon.png"))); // NOI18N
                jLabel2.setToolTipText("");


        
                jPanel1.setBackground(new Color(204, 204, 204));
        
                jLabel3.setFont(new Font("Segoe UI Emoji", 1, 18)); // NOI18N
                jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
                jLabel3.setText("Lista de soldados");
                jLabel3.setToolTipText("");
        
                GroupLayout jPanel1Layout = new GroupLayout(jPanel1); //se crea un layout para el panel 1
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                    jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)//se crea un grupo de layout
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPaneSoldados)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)
                        .addContainerGap(46, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                    jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPaneSoldados, GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                );
        
                //jScrollPane1.getAccessibleContext().setAccessibleName("Listainterna");
                
                botonCrearSoldado.setBackground(new Color(51, 51, 51));
                botonCrearSoldado.setFont(new Font("Segoe UI Emoji", 1, 14)); // NOI18N
                botonCrearSoldado.setForeground(new Color(255, 255, 255));
                botonCrearSoldado.setText("Soldado Nuevo");
                botonCrearSoldado.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                botonCrearSoldado.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        botonCrearSoldadoActionPerformed(evt);
                    }
                });

                jLabel4.setFont(new Font("Segoe UI Emoji", 1, 18)); // NOI18N
                
                buttonGroupAcciones.add(buttonReportarEstado);
                buttonReportarEstado.setText("Reportar estado ");
                buttonReportarEstado.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        RadioButtonReportarEstado(evt);
                    }
                });


        
                buttonGroupAcciones.add(JRadioButtonRealizarAccion);
                JRadioButtonRealizarAccion.setText("Realizar acción ");
                JRadioButtonRealizarAccion.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        RadioButtonRealizarAccion(evt);
                    }
                });
        
                buttonGroupAcciones.add(JCheckboxAsignarMision);
                JCheckboxAsignarMision.setText("Asignar misión");
                JCheckboxAsignarMision.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        jCheckBoxAsignarMision(evt);
                    }
                });
        
                buttonGroupAcciones.add(jCheckBox2);
                jCheckBox2.setText("Anunciar Unidad");
                jCheckBox2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        jCheckBoxAnunciarUnidad(evt);
                    }
                });


        
                buttonGroupAcciones.add(jRadioButtonPatrullar);
                jRadioButtonPatrullar.setText("Patrullar");
                jRadioButtonPatrullar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        RadioButtonPatrullar(evt);
                    }
                });

        
                buttonGroupAcciones.add(jRadioButtonSaludar);
                jRadioButtonSaludar.setText("Saludar");
                jRadioButtonSaludar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        jRadioButtonSaludar(evt);
                    }
                });
        
                buttonGroupAcciones.add(JCheckbocAnunciarEstrategia);
                JCheckbocAnunciarEstrategia.setText("Anunciar estrategia");
                JCheckbocAnunciarEstrategia.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        jCheckBoxAnunciarEstrategia(evt);
                    }
                });
        
                label1.setFont(new Font("Corbel", 1, 14)); // NOI18N
                label1.setText("Acción solo para Coronel");
                label1.setVisible(false);
        
                label2.setFont(new Font("Corbel", 1, 14)); // NOI18N
                label2.setText("Acciones de todos los soldados");
        
                label3.setFont(new Font("Corbel", 1, 14)); // NOI18N
                label3.setText("Acciones de todos los soldados excepto los soldados raso");
        
                label4.setFont(new Font("Corbel", 1, 14)); // NOI18N
                label4.setText("Acción solo para Teniente");
        
                label5.setFont(new Font("Corbel", 1, 14)); // NOI18N
                label5.setText("Acción solo para Coronel");
        
                label6.setFont(new Font("Corbel", 1, 14)); // NOI18N
                label6.setText("Acción solo para Capitan");
        
                buttonGroupAcciones.add(JCheckbocAnunciarsoldadosBajo);
                JCheckbocAnunciarsoldadosBajo.setText("Anunciar Numero de soldados bajo mando");
                JCheckbocAnunciarsoldadosBajo.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        jCheckBoxNumeroSoldadosEnMando(evt);
                    }
                });
        
                buttonGroupAcciones.add(jCheckBoxReganar);
                
                jCheckBoxReganar.setText("Regañar");

                //Evento para la funcionalidad del checkbox regañar
                jCheckBoxReganar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        CheckBoxReganar(evt);
                    }
                });
        

                jLabel5.setFont(new Font("Segoe UI Emoji", 1, 18)); // NOI18N
                jLabel5.setText("Botón para crear Soldados      ------>");
        
                GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                    jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(592, 592, 592))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(JCheckbocAnunciarsoldadosBajo)
                                    .addComponent(jCheckBox2))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JCheckboxAsignarMision)
                                    .addComponent(label5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(JCheckbocAnunciarEstrategia)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBoxReganar))
                                    .addComponent(label4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(262, 262, 262)
                                                .addComponent(jRadioButtonPatrullar, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(buttonReportarEstado)
                                                .addGap(18, 18, 18)
                                                .addComponent(JRadioButtonRealizarAccion))
                                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(botonCrearSoldado, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4)) 
                                            .addComponent(jRadioButtonSaludar, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                );
                jPanel2Layout.setVerticalGroup(
                    jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(botonCrearSoldado, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonReportarEstado)
                            .addComponent(JRadioButtonRealizarAccion)
                            .addComponent(jRadioButtonPatrullar)
                            .addComponent(jRadioButtonSaludar))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(JCheckboxAsignarMision)
                        .addGap(1, 1, 1)
                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(JCheckbocAnunciarEstrategia)
                            .addComponent(jCheckBoxReganar))
                        .addGap(1, 1, 1)
                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JCheckbocAnunciarsoldadosBajo)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGap(70, 70, 70))
                );
        
                botonCrearSoldado.getAccessibleContext().setAccessibleName("botonCrearSoldado");
                jLabel4.getAccessibleContext().setAccessibleName("subtituloLabel");
                label1.getAccessibleContext().setAccessibleName("Acción solo para Teniente");
        
                jButton1.setBackground(new Color(51, 51, 51));
                jButton1.setFont(new Font("Segoe UI Emoji", 1, 14)); // NOI18N
                jButton1.setForeground(new Color(255, 255, 255));
                jButton1.setText("Reset app");
                jButton1.setActionCommand("Resetear ");
                jButton1.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                jButton1.setHorizontalTextPosition(SwingConstants.CENTER);
                jButton1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                    }
                });
        
                GroupLayout layout = new GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 616, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel1)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel2)))
                        .addContainerGap(175, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(74, Short.MAX_VALUE))
                );
        
                jLabel1.getAccessibleContext().setAccessibleName("titulo");
                jLabel2.getAccessibleContext().setAccessibleName("imagentitulo");
                jPanel1.getAccessibleContext().setAccessibleName("panelLista");
        
                getAccessibleContext().setAccessibleName("Form");
        
                pack();
            }                    

            private void exitForm(WindowEvent evt) {                          
                System.exit(0);
            }                         

            private void soldadoSeleccionadoChanged(ListSelectionEvent evt) {//meotodo para el evento de seleccionar un soldado
                if (!evt.getValueIsAdjusting()) {
                    String soldadoSeleccionado = jListSoldados.getSelectedValue();
                    if (soldadoSeleccionado != null) {
            
                    }
                 }
            }
        
            private void jButton1ActionPerformed(ActionEvent evt) {
                // Limpia la lista de soldados en la interfaz, excepto las primeras cuatro posiciones
                DefaultListModel<String> model = (DefaultListModel<String>) jListSoldados.getModel();
                for (int i = model.getSize() - 1; i >= 4; i--) {
                    model.remove(i);
                }
            
                // También puedes limpiar cualquier selección en el JListdd
                jListSoldados.clearSelection();
            
                JOptionPane.showMessageDialog(this, "La lista ha sido limpiada, excepto los primeros cuatro soldados.", "Operación Exitosa :P", JOptionPane.INFORMATION_MESSAGE);
            }
                                                   

            private void botonCrearSoldadoActionPerformed(ActionEvent evt) {
                mostrarDialogoCrearSoldado();
                                                                
            }

            private void CheckBoxReganar(ActionEvent evt) {
                // Verifica si el checkbox está seleccionado
                if (jCheckBoxReganar.isSelected()) {
                    // Verifica que haya un elemento seleccionado en la lista
                    int selectedIndex = jListSoldados.getSelectedIndex();
                    if (selectedIndex != -1) {
                        // Obtiene el soldado seleccionado
                        String soldadoSeleccionadoNombre = jListSoldados.getSelectedValue();
                        Soldado soldadoSeleccionado = null;
            
                        // Busca el soldado en la lista de soldados
                        for (Soldado soldado : listaSoldados) {
                            if (soldado.toString().equals(soldadoSeleccionadoNombre)) {
                                soldadoSeleccionado = soldado;
                                break;
                            }
                        }
            
                        if (soldadoSeleccionado != null) {
                            // Llama al método regañado del soldado
                            soldadoSeleccionado.regañado(listaSoldados);

                            actualizarListaGrafica();
            
                            // Actualiza el modelo de la lista
                            if (soldadoSeleccionado.getNivel() > 0) {
                                listModel.setElementAt(soldadoSeleccionado.toString(), selectedIndex);
                                JOptionPane.showMessageDialog(this, 
                                    "El nivel del soldado " + soldadoSeleccionado.getNombre() + " ha sido reducido a " + soldadoSeleccionado.getNivel() + ".", 
                                    "Regañado", JOptionPane.INFORMATION_MESSAGE);
                                    jListSoldados.clearSelection();      // Limpia la selección de la lista
                                    buttonGroupAcciones.clearSelection(); // Limpia la selección del grupo de botones
                    
                                       
                            } else {
                                listModel.removeElementAt(selectedIndex);
                                JOptionPane.showMessageDialog(this, 
                                    "El soldado " + soldadoSeleccionado.getNombre() + " ha sido expulsado por alcanzar el nivel más bajo.", 
                                    "Expulsión", JOptionPane.INFORMATION_MESSAGE);
                                    jListSoldados.clearSelection();      // Limpia la selección de la lista
                                    buttonGroupAcciones.clearSelection(); // Limpia la selección del grupo de botones
                    
                            }
                            
                        } else {
                            JOptionPane.showMessageDialog(this, 
                                "No se pudo encontrar el soldado seleccionado.", 
                                "Error", JOptionPane.ERROR_MESSAGE);
                                jListSoldados.clearSelection();      // Limpia la selección de la lista
                                buttonGroupAcciones.clearSelection(); // Limpia la selección del grupo de botones
                    
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, 
                            "Por favor, selecciona un soldado de la lista para regañar.", 
                            "Advertencia", JOptionPane.WARNING_MESSAGE);
                        }
                        // Limpia las selecciones y actualiza la interfaz
                        jCheckBoxReganar.setSelected(false); // Desmarca el checkbox
                        jListSoldados.clearSelection();      // Limpia la selección de la lista
                        buttonGroupAcciones.clearSelection(); // Limpia la selección del grupo de botones
                    
                    }
                }
                
            private void RadioButtonReportarEstado(ActionEvent evt) {//metodo para el evento de reportar estado
                String soldadoSeleccionado = jListSoldados.getSelectedValue(); //busca el soldado seleccionado  
                if (soldadoSeleccionado != null) { //si el soldado seleccionado no es nulo
                    Soldado soldado = null;
            
                    // Buscar el soldado seleccionado en la lista de soldados
                    for (Soldado s : listaSoldados) {
                        if (s.toString().equals(soldadoSeleccionado)) {
                            soldado = s;
                            break;
                        }
                    }
            
                    if (soldado != null) {
                        soldado.reportarEstado();
                        jListSoldados.clearSelection(); 
                        buttonGroupAcciones.clearSelection();  
                    } else {
                        JOptionPane.showMessageDialog(this, "Soldado no encontrado.");
                        jListSoldados.clearSelection(); 
                        buttonGroupAcciones.clearSelection(); 
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor, seleccione un soldado.");
                        jListSoldados.clearSelection(); 
                        buttonGroupAcciones.clearSelection(); 
                }
                
            }

            private void actualizarListaGrafica() {
                listModel.clear(); // Limpia el modelo actual
                for (Soldado soldado : listaSoldados) {
                    listModel.addElement(soldado.toString()); // Agrega cada soldado actualizado
                }
            }
            
            private void jCheckBoxAnunciarEstrategia(ActionEvent evt) {   
                // Verifica si el checkbox está seleccionado
                if (JCheckbocAnunciarEstrategia.isSelected()) {
                    // Verifica que haya un elemento seleccionado en la lista
                    int selectedIndex = jListSoldados.getSelectedIndex();
                    if (selectedIndex != -1) {
                        // Obtiene el nombre del soldado seleccionado
                        String soldadoSeleccionadoNombre = jListSoldados.getSelectedValue();
                        Soldado soldadoSeleccionado = null;

                        // Busca el soldado en la lista interna de soldados
                        for (Soldado soldado : listaSoldados) {
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
                                    JOptionPane.showMessageDialog(this, 
                                        "Estrategia del Coronel " + soldadoSeleccionado.getNombre() + ": " + estrategia,
                                        "Estrategia Asignada",
                                        JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    JOptionPane.showMessageDialog(this, 
                                        "El Coronel " + soldadoSeleccionado.getNombre() + " no tiene una estrategia asignada.", 
                                        "Sin Estrategia", 
                                        JOptionPane.WARNING_MESSAGE);
                                }
                            } else {
                                // Si el soldado no es Coronel, muestra un mensaje
                                JOptionPane.showMessageDialog(this, 
                                    "Solo un Coronel puede tener una estrategia.", 
                                    "Operación No Permitida", 
                                    JOptionPane.WARNING_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, 
                                "No se pudo encontrar el soldado seleccionado.", 
                                "Error", 
                                JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, 
                            "Por favor, selecciona un soldado de la lista para ver la estrategia.", 
                            "Advertencia", 
                            JOptionPane.WARNING_MESSAGE);
                    }

                    // Limpia la selección del checkbox y del JList
                    JCheckbocAnunciarEstrategia.setSelected(false);
                    jListSoldados.clearSelection();
                    buttonGroupAcciones.clearSelection();
                }
            }

            private void jCheckBoxNumeroSoldadosEnMando(ActionEvent evt) {
                Capitan capitan = null; // Inicializa el Capitán
                String soldadoSeleccionado = jListSoldados.getSelectedValue(); //busca el soldado seleccionado
                if (soldadoSeleccionado != null) {//si el soldado seleccionado no es nulo
                    for (Soldado s : listaSoldados) {
                        if (s.toString().equals(soldadoSeleccionado)) { //si el soldado que escogimos es igual al soldado al de la lista
                            if (s instanceof Capitan) { 
                                capitan = (Capitan) s;
                                break;
                            }
                        }
                    }
            
                    if (capitan != null) {
                        // Muestra un mensaje con la cantidad de soldados bajo su mando
                        JOptionPane.showMessageDialog(this, "El Capitán " + capitan.getNombre() + " tiene " + capitan.getCantidadSoldadosBajoSuMando() + " soldados bajo su mando.");
                        jListSoldados.clearSelection(); // Limpia la selección de la lista
                        buttonGroupAcciones.clearSelection();  // Limpia la selección de los botones
                    } else {
                        JOptionPane.showMessageDialog(this, "El soldado seleccionado no es un Capitán.");
                        jListSoldados.clearSelection(); 
                        buttonGroupAcciones.clearSelection(); 
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor, seleccione un soldado.");
                        jListSoldados.clearSelection(); 
                        buttonGroupAcciones.clearSelection(); 
                }                    
            }                                          
    
            private void jCheckBoxAnunciarUnidad(ActionEvent evt) {   
                Teniente teniente = null;
                String soldadoSeleccionado = jListSoldados.getSelectedValue();//busca el soldado dentro de la lista
                if (soldadoSeleccionado != null) {
                    // Buscar el soldado seleccionado en la lista de soldados
                    for (Soldado s : listaSoldados) {
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
                        jListSoldados.clearSelection(); 
                        buttonGroupAcciones.clearSelection();  //limpia la seleción de los botones
                    } else {
                        JOptionPane.showMessageDialog(this, "El soldado seleccionado no es un Teniente.");
                        jListSoldados.clearSelection(); 
                        buttonGroupAcciones.clearSelection(); 
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor, seleccione un soldado.");
                        jListSoldados.clearSelection(); 
                        buttonGroupAcciones.clearSelection(); 
                }
                
                
            }                                          

            private void jCheckBoxAsignarMision(ActionEvent evt) {
                // Verifica si el checkbox está seleccionado
                if (JCheckboxAsignarMision.isSelected()) {
                    // Verifica que haya un elemento seleccionado en la lista
                    int selectedIndex = jListSoldados.getSelectedIndex();
                    if (selectedIndex != -1) {
                        // Obtiene el nombre del soldado seleccionado en el JList
                        String soldadoSeleccionadoNombre = jListSoldados.getSelectedValue();
                        Soldado soldadoSeleccionado = null;
            
                        // Busca el soldado en la lista interna
                        for (Soldado soldado : listaSoldados) {
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
                                    mision = JOptionPane.showInputDialog(this,
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
            
                                JOptionPane.showMessageDialog(this,
                                    "Misión asignada exitosamente al " + soldadoSeleccionado.getRango() + " " + soldadoSeleccionado.getNombre() + ".\n" +
                                    "Misión: " + mision,
                                    "Asignación Exitosa",
                                    JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(this,
                                    "El soldado seleccionado no puede recibir misiones. Solo Tenientes, Capitanes y Coroneles pueden ser asignados.",
                                    "Operación No Permitida",
                                    JOptionPane.WARNING_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(this,
                                "No se pudo encontrar el soldado seleccionado.",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this,
                            "Por favor, selecciona un soldado de la lista para asignar una misión.",
                            "Advertencia",
                            JOptionPane.WARNING_MESSAGE);
                    }
            
                    // Limpia la selección del checkbox y del JList
                    JCheckboxAsignarMision.setSelected(false);
                    jListSoldados.clearSelection();
                    buttonGroupAcciones.clearSelection();
                }
            }
            
        
            private void RadioButtonRealizarAccion(ActionEvent evt) {
                String soldadoSeleccionado = jListSoldados.getSelectedValue();
                if (soldadoSeleccionado != null) {
                    Soldado soldado = null;
            
                    // Buscar el soldado seleccionado en la lista de soldados
                    for (Soldado s : listaSoldados) {
                        if (s.toString().equals(soldadoSeleccionado)) {
                            soldado = s;
                            break;
                        }
                    }
            
                    if (soldado != null) {
                        soldado.realizarAccion();
                        jListSoldados.clearSelection(); 
                        buttonGroupAcciones.clearSelection();  
                    } else {
                        JOptionPane.showMessageDialog(this, "Soldado no encontrado.");
                        jListSoldados.clearSelection(); 
                        buttonGroupAcciones.clearSelection(); 
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor, seleccione un soldado.");
                        jListSoldados.clearSelection(); 
                        buttonGroupAcciones.clearSelection(); 
                }                                      

                                                              

            }                                             
                          
            private void RadioButtonPatrullar(ActionEvent evt) {
                String soldadoSeleccionado = jListSoldados.getSelectedValue();
                if (soldadoSeleccionado != null) {
                    Soldado soldado = null;
            
                    // Buscar el soldado seleccionado en la lista de soldados
                    for (Soldado s : listaSoldados) {
                        if (s.toString().equals(soldadoSeleccionado)) {
                            soldado = s;
                            break;
                        }
                    }
            
                    if (soldado != null) {
                        soldado.patrullar();
                        jListSoldados.clearSelection(); 
                        buttonGroupAcciones.clearSelection();  
                    } else {
                        JOptionPane.showMessageDialog(this, "Soldado no encontrado.");
                        jListSoldados.clearSelection(); 
                        buttonGroupAcciones.clearSelection(); 
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor, seleccione un soldado.");
                        jListSoldados.clearSelection(); 
                        buttonGroupAcciones.clearSelection(); 
                }                                             

                
            }
                          
            private void jRadioButtonSaludar(ActionEvent evt){
                String soldadoSeleccionado = jListSoldados.getSelectedValue();
                if (soldadoSeleccionado != null) {
                    Soldado soldado = null;
            
                    // Buscar el soldado seleccionado en la lista de soldados
                    for (Soldado s : listaSoldados) {
                        if (s.toString().equals(soldadoSeleccionado)) {
                            soldado = s;
                            break;
                        }
                    }
            
                    if (soldado != null) {
                        soldado.saludar();
                        jListSoldados.clearSelection(); 
                        buttonGroupAcciones.clearSelection();  
                    } else {
                        JOptionPane.showMessageDialog(this, "Soldado no encontrado.");
                        jListSoldados.clearSelection(); 
                        buttonGroupAcciones.clearSelection(); 
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor, seleccione un soldado.");
                        jListSoldados.clearSelection(); 
                        buttonGroupAcciones.clearSelection(); 
                }
            }
                                                  
        
 
            public static void main(String args[]) {
                EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new App().setVisible(true);
                    }
                });
            }
        
            // Variables declaration - do not modify                     
            private ButtonGroup buttonGroupAcciones;
            private JButton jButton1;
            private JButton botonCrearSoldado;
            private JCheckBox JCheckboxAsignarMision;
            private JCheckBox jCheckBox2;
            private JCheckBox JCheckbocAnunciarEstrategia;
            private JCheckBox JCheckbocAnunciarsoldadosBajo;
            private JCheckBox jCheckBoxReganar;
            private JLabel jLabel1;
            private JLabel jLabel2;
            private JLabel jLabel3;
            private JLabel jLabel4;
            private JLabel jLabel5;
            private JPanel jPanel1;
            private JPanel jPanel2;
            private JRadioButton jRadioButtonPatrullar;
            private JRadioButton buttonReportarEstado;
            private JRadioButton JRadioButtonRealizarAccion;
            private JRadioButton jRadioButtonSaludar;

            private Label label1;
            private Label label2;
            private Label label3;
            private Label label4;
            private Label label5;
            private Label label6;
            private java.util.List<Soldado> listaSoldados = new ArrayList<>();
            private DefaultListModel<String> listModel = new DefaultListModel<>();
            private JList<String> jListSoldados = new JList<>(listModel);
            private JScrollPane jScrollPaneSoldados = new JScrollPane(jListSoldados);

            // End of variables declaration         
     
     //este metodo se encarga de mostrar un dialogo para crear un soldado
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

            Soldado nuevoSoldado = new SoldadoRaso(listaSoldados.size() + 1, nombre, identificacion, Nivel_militar.SOLDADO_RASO);
            listaSoldados.add(nuevoSoldado);
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

            Soldado nuevoSoldado = new Teniente(listaSoldados.size() + 1, nombre, identificacion, Nivel_militar.TENIENTE, unidad);
            listaSoldados.add(nuevoSoldado);
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

            Soldado nuevoSoldado = new Coronel(listaSoldados.size() + 1, nombre, identificacion, Nivel_militar.CORONEL, estrategia);
            listaSoldados.add(nuevoSoldado);
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

            Soldado nuevoSoldado = new Capitan(listaSoldados.size() + 1, nombre, identificacion, Nivel_militar.CAPITAN, numSoldados);
            listaSoldados.add(nuevoSoldado);
            listModel.addElement(nuevoSoldado.toString());
        }
    }
    
    // Método para inicializar los soldados por defecto en la lista
    private void inicializarSoldadosPorDefecto() {
        Soldado soldado1 = new SoldadoRaso(1, "Juan", "001", Nivel_militar.SOLDADO_RASO);
        Soldado soldado2 = new Teniente(2, "Pedro", "002", Nivel_militar.TENIENTE, "Unidad A");
        Soldado soldado3 = new Capitan(3, "Luis", "003", Nivel_militar.CAPITAN, 50);
        Soldado soldado4 = new Coronel(4, "Carlos", "004", Nivel_militar.CORONEL, "Estrategia X");

        listaSoldados.add(soldado1);
        listaSoldados.add(soldado2);
        listaSoldados.add(soldado3);
        listaSoldados.add(soldado4);

        for (Soldado soldado : listaSoldados) {
            listModel.addElement(soldado.toString());
        }
    }
        
}          
            


            
 
