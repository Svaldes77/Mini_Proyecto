package vista;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import modelo.soldados.Soldado;
import modelo.soldados.*;
import modelo.rangos.Nivel_militar.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

// funcion para inicializar la interfaz grafica

//                 initComponents();
//                 inicializarSoldadosPorDefecto();

//             }
     
    //   // Método main para iniciar la aplicación
    // public static void main(String[] args) {
    //     Gui gui = new Gui();  // Crear la instancia de Gui
    // }       
    //         public Gui() {
    //     initComponentes(); // Llamar a initComponentes desde el constructor
    // }

public class Gui extends Frame {
    public Gui() {
        initComponentes();
    } 

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
    }); 
    }

    // // Método para establecer el controlador
    // public void setControlador(controlador controlador) {
    //     this.controlador = controlador;
    // }

    private void initComponentes(){
            buttonGroupAcciones = new ButtonGroup(); // se crea un grupo de botones
            //se inicializan los label para la interfaz
            jLabel1 = new JLabel();
            jLabel2 = new JLabel();
            jPanel1 = new JPanel();
            jLabel3 = new JLabel();
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
            popMenu = new JPopupMenu(); //se crea un menu emergente
            menuItemEliminar = new JMenuItem(); //se crea un item para el menu emergente
            menuItemAgregar = new JMenuItem(); //se crea un item para el menu emergente 
            menuItemActualizar = new JMenuItem(); //se crea un item para el menu emergente

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
    
            jLabel2.setIcon(new ImageIcon(getClass().getResource("./icon.png"))); // NOI18N
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
            
            botonCrearSoldado.setBackground(new Color(51, 51, 51));
            botonCrearSoldado.setFont(new Font("Segoe UI Emoji", 1, 14)); // NOI18N
            botonCrearSoldado.setForeground(new Color(255, 255, 255));
            botonCrearSoldado.setText("Soldado Nuevo");
            botonCrearSoldado.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            botonCrearSoldado.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    botonCrearSoldado(evt);
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
                    CheckBoxAsignarMision(evt);
                }
            });
    
            buttonGroupAcciones.add(jCheckBox2);
            jCheckBox2.setText("Anunciar Unidad");
            jCheckBox2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    CheckBoxAnunciarUnidad(evt);
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
                    RadioButtonSaludar(evt);
                }
            });
    
            buttonGroupAcciones.add(JCheckbocAnunciarEstrategia);
            JCheckbocAnunciarEstrategia.setText("Anunciar estrategia");
            JCheckbocAnunciarEstrategia.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    CheckBoxAnunciarEstrategia(evt);
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
                    CheckBoxNumeroSoldadosEnMando(evt);
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
            //se añaden los items al menu emergente
            menuItemEliminar.setText("Eliminar Soldado"); 
            popMenu.add(menuItemEliminar);
            jListSoldados.setComponentPopupMenu(popMenu); 
            menuItemAgregar.setText("Agregar Soldado"); 
            popMenu.add(menuItemAgregar); 
            jListSoldados.setComponentPopupMenu(popMenu);
            menuItemActualizar.setText("Actualizar Soldado");
            popMenu.add(menuItemActualizar); 

    
            jLabel1.getAccessibleContext().setAccessibleName("titulo");
            jLabel2.getAccessibleContext().setAccessibleName("imagentitulo");
            jPanel1.getAccessibleContext().setAccessibleName("panelLista");
    
            getAccessibleContext().setAccessibleName("Form");
    
            pack();
        }    
        private ButtonGroup buttonGroupAcciones ;
        private JButton jButton1 ;
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
        private JPopupMenu popMenu;
        private JMenuItem menuItemEliminar;
        private JMenuItem menuItemAgregar; 
        private JMenuItem menuItemActualizar; 

        


        private void botonCrearSoldado(ActionEvent evt) {
            // Método vacío para ser implementado en el controlador
        }
    
        private void RadioButtonReportarEstado(ActionEvent evt) {
            // Método vacío para ser implementado en el controlador
        }
    
        private void RadioButtonRealizarAccion(ActionEvent evt) {
            // Método vacío para ser implementado en el controlador
        }
    
        private void CheckBoxAsignarMision(ActionEvent evt) {
            // Método vacío para ser implementado en el controlador
        }
    
        private void CheckBoxAnunciarUnidad(ActionEvent evt) {
            // Método vacío para ser implementado en el controlador
        }
    
        private void RadioButtonPatrullar(ActionEvent evt) {
            // Método vacío para ser implementado en el controlador
        }
    
        private void RadioButtonSaludar(ActionEvent evt) {
            // Método vacío para ser implementado en el controlador
        }
    
        private void CheckBoxAnunciarEstrategia(ActionEvent evt) {
            // Método vacío para ser implementado en el controlador
        }
    
        private void CheckBoxNumeroSoldadosEnMando(ActionEvent evt) {
            // Método vacío para ser implementado en el controlador
        }
    
        private void CheckBoxReganar(ActionEvent evt) {
            // Método vacío para ser implementado en el controlador
        }
    
        private void jButton1ActionPerformed(ActionEvent evt) {
            // Método vacío para ser implementado en el controlador
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




        public ButtonGroup getbuttonGroupAcciones() {
            return buttonGroupAcciones;
        }

        


        public JButton getjButton1() {
            return jButton1;
        }

        public JMenuItem getMenuItemEliminar() {
            return menuItemEliminar; 
        }
    
        public JMenuItem getMenuItemAgregar() {
            return menuItemAgregar;
        }
        public JMenuItem getMenuItemActualizar() {
            return menuItemActualizar;
        }



        public JButton getBotonCrearSoldado() {
            return botonCrearSoldado;
        }




        public JCheckBox getJCheckboxAsignarMision() {
            return JCheckboxAsignarMision;
        }




        public JCheckBox getjCheckBox2() {
            return jCheckBox2;
        }




        public JCheckBox getJCheckbocAnunciarEstrategia() {
            return JCheckbocAnunciarEstrategia;
        }




        public JCheckBox getJCheckbocAnunciarsoldadosBajo() {
            return JCheckbocAnunciarsoldadosBajo;
        }




        public JCheckBox getjCheckBoxReganar() {
            return jCheckBoxReganar;
        }









        public JRadioButton getjRadioButtonPatrullar() {
            return jRadioButtonPatrullar;
        }




        public JRadioButton getButtonReportarEstado() {
            return buttonReportarEstado;
        }




        public JRadioButton getJRadioButtonRealizarAccion() {
            return JRadioButtonRealizarAccion;
        }




        public JRadioButton getjRadioButtonSaludar() {
            return jRadioButtonSaludar;
        }
  
        public java.util.List<Soldado> getListaSoldados() {
            return listaSoldados;
        }




        public DefaultListModel<String> getListModel() {
            return listModel;
        }




        public JList<String> getjListSoldados() {
            return jListSoldados;
        }




        public JScrollPane getjScrollPaneSoldados() {
            return jScrollPaneSoldados;
        }

        


    }

    





    

    

