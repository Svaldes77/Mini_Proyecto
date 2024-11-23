import java.util.ArrayList;
//import java.util.InputMismatchException;
//import java.util.Scanner; 
import rangos.Nivel_militar;
import soldados.Capitan;
import soldados.Coronel;
import soldados.Soldado;
import soldados.SoldadoRaso;
import soldados.Teniente;
import rangos.Nivel_militar;
import rangos.Rango;
import misiones.OperacionesMilitares;




        // // }


        // //Prueba de herencia, metodo mostrarInformacion

        // soldadoRaso1.mostrarInformacion();
        // teniente1.mostrarInformacion();
        // coronel1.mostrarInformacion();
        // capitan1.mostrarInformacion(); 

        // // Mostrar el número de soldados
        // System.out.println("el numero de soldados es: "+ Soldado.getContadorSoldados() );

        //Downcasting 
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
        // System.out.println("Soldados antes de ser regañados:");
        // for (Soldado soldado : lista) {
        //     System.out.println(soldado.getNombre() + " - Nivel: " + soldado.getNivel());
        // }

        // // El Coronel regaña a todos los soldados
        // System.out.println("\nEl Coronel va a regañar a todos los soldados:");
        // coronel1.regañarSoldados(lista);  // El Coronel regaña a todos los soldados

        // // Mostrar la lista de soldados después de ser regañados
        // System.out.println("\nSoldados después de ser regañados:");
        // for (Soldado soldado : lista) {
        //     System.out.println(soldado.getNombre() + " - Nivel: " + soldado.getNivel());
        //         btnAccionSoldado.addActionListener(new ActionListener() {
        //             @Override
        //             public void actionPerformed(ActionEvent e) {
        //                 realizarAccionSoldado();
        //             }
        //         });
        //     }
        
        //     private void mostrarDialogoCrearSoldado() {
        //         JRadioButton rbtnSoldadoRaso = new JRadioButton("Soldado Raso");
        //         JRadioButton rbtnTeniente = new JRadioButton("Teniente");
        //         JRadioButton rbtnCoronel = new JRadioButton("Coronel");
        //         JRadioButton rbtnCapitan = new JRadioButton("Capitán");
        
        //         ButtonGroup group = new ButtonGroup();
        //         group.add(rbtnSoldadoRaso);
        //         group.add(rbtnTeniente);
        //         group.add(rbtnCoronel);
        //         group.add(rbtnCapitan);
        
        //         JPanel panelRangos = new JPanel(new GridLayout(4, 1));
        //         panelRangos.add(rbtnSoldadoRaso);
        //         panelRangos.add(rbtnTeniente);
        //         panelRangos.add(rbtnCoronel);
        //         panelRangos.add(rbtnCapitan);
        
        //         int result = JOptionPane.showConfirmDialog(null, panelRangos, "Seleccionar Rango", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        //         if (result == JOptionPane.OK_OPTION) {
        //             if (rbtnSoldadoRaso.isSelected()) {
        //                 mostrarFormularioSoldadoRaso();
        //             } else if (rbtnTeniente.isSelected()) {
        //                 mostrarFormularioTeniente();
        //             } else if (rbtnCoronel.isSelected()) {
        //                 mostrarFormularioCoronel();
        //             } else if (rbtnCapitan.isSelected()) {
        //                 mostrarFormularioCapitan();
        //             }
        //         }
        //     }
        
        //     private void mostrarFormularioSoldadoRaso() {
        //         JTextField txtNombre = new JTextField();
        //         JTextField txtIdentificacion = new JTextField();
        
        //         JPanel panel = new JPanel(new GridLayout(2, 2));
        //         panel.add(new JLabel("Nombre:"));
        //         panel.add(txtNombre);
        //         panel.add(new JLabel("Identificación:"));
        //         panel.add(txtIdentificacion);
        
        //         int result = JOptionPane.showConfirmDialog(null, panel, "Crear Soldado Raso", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        //         if (result == JOptionPane.OK_OPTION) {
        //             String nombre = txtNombre.getText();
        //             String identificacion = txtIdentificacion.getText();
        
        //             Soldado nuevoSoldado = new SoldadoRaso(listaSoldados.size() + 1, nombre, identificacion, Nivel_militar.SOLDADO_RASO);
        //             listaSoldados.add(nuevoSoldado);
        //             listModel.addElement(nuevoSoldado.toString());
        //         }
        //     }
        
        //     private void mostrarFormularioTeniente() {
        //         JTextField txtNombre = new JTextField();
        //         JTextField txtIdentificacion = new JTextField();
        //         JTextField txtUnidad = new JTextField();
        
        //         JPanel panel = new JPanel(new GridLayout(3, 2));
        //         panel.add(new JLabel("Nombre:"));
        //         panel.add(txtNombre);
        //         panel.add(new JLabel("Identificación:"));
        //         panel.add(txtIdentificacion);
        //         panel.add(new JLabel("Unidad:"));
        //         panel.add(txtUnidad);
        
        //         int result = JOptionPane.showConfirmDialog(null, panel, "Crear Teniente", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        //         if (result == JOptionPane.OK_OPTION) {
        //             String nombre = txtNombre.getText();
        //             String identificacion = txtIdentificacion.getText();
        //             String unidad = txtUnidad.getText();
        
        //             Soldado nuevoSoldado = new Teniente(listaSoldados.size() + 1, nombre, identificacion, Nivel_militar.TENIENTE, unidad);
        //             listaSoldados.add(nuevoSoldado);
        //             listModel.addElement(nuevoSoldado.toString());
        //         }
        //     }
        
        //     private void mostrarFormularioCoronel() {
        //         JTextField txtNombre = new JTextField();
        //         JTextField txtIdentificacion = new JTextField();
        //         JTextField txtEstrategia = new JTextField();
        
        //         JPanel panel = new JPanel(new GridLayout(3, 2));
        //         panel.add(new JLabel("Nombre:"));
        //         panel.add(txtNombre);
        //         panel.add(new JLabel("Identificación:"));
        //         panel.add(txtIdentificacion);
        //         panel.add(new JLabel("Estrategia:"));
        //         panel.add(txtEstrategia);
        
        //         int result = JOptionPane.showConfirmDialog(null, panel, "Crear Coronel", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        //         if (result == JOptionPane.OK_OPTION) {
        //             String nombre = txtNombre.getText();
        //             String identificacion = txtIdentificacion.getText();
        //             String estrategia = txtEstrategia.getText();
        
        //             Soldado nuevoSoldado = new Coronel(listaSoldados.size() + 1, nombre, identificacion, Nivel_militar.CORONEL, estrategia);
        //             listaSoldados.add(nuevoSoldado);
        //             listModel.addElement(nuevoSoldado.toString());
        //         }
        //     }
        
        //     private void mostrarFormularioCapitan() {
        //         JTextField txtNombre = new JTextField();
        //         JTextField txtIdentificacion = new JTextField();
        //         JTextField txtNumSoldados = new JTextField();
        
        //         JPanel panel = new JPanel(new GridLayout(3, 2));
        //         panel.add(new JLabel("Nombre:"));
        //         panel.add(txtNombre);
        //         panel.add(new JLabel("Identificación:"));
        //         panel.add(txtIdentificacion);
        //         panel.add(new JLabel("Número de Soldados:"));
        //         panel.add(txtNumSoldados);
        
        //         int result = JOptionPane.showConfirmDialog(null, panel, "Crear Capitán", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        //         if (result == JOptionPane.OK_OPTION) {
        //             String nombre = txtNombre.getText();
        //             String identificacion = txtIdentificacion.getText();
        //             int numSoldados = Integer.parseInt(txtNumSoldados.getText());
        
        //             Soldado nuevoSoldado = new Capitan(listaSoldados.size() + 1, nombre, identificacion, Nivel_militar.CAPITAN, numSoldados);
        //             listaSoldados.add(nuevoSoldado);
        //             listModel.addElement(nuevoSoldado.toString());
        //         }
        //     }
        
        //     private void realizarAccionSoldado() {
        //         int index = listSoldados.getSelectedIndex();
        //         if (index != -1) {
        //             Soldado soldado = listaSoldados.get(index);
        //             soldado.realizarAccion();
        //             JOptionPane.showMessageDialog(this, "Acción realizada por: " + soldado.getNombre());
        //         } else {
        //             JOptionPane.showMessageDialog(this, "Seleccione un soldado de la lista.");
        //         }
        //     }
        
        //     public static void main(String[] args) {
        //         SwingUtilities.invokeLater(new Runnable() {
        //             @Override
        //             public void run() {
        //                 new App().setVisible(true);
        //             }
        //         });
        //     }
        // }
        
        public class App extends java.awt.Frame {

            /**
             * Creates new form interfaz
             */
            public App() {
                initComponents();
            }
        
            /**
             * This method is called from within the constructor to initialize the form.
             * WARNING: Do NOT modify this code. The content of this method is always
             * regenerated by the Form Editor.
             */
            // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
            private void initComponents() {
        
                buttonGroup1 = new javax.swing.ButtonGroup();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jPanel1 = new javax.swing.JPanel();
                jLabel3 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                jPanel2 = new javax.swing.JPanel();
                jButton2 = new javax.swing.JButton();
                jLabel4 = new javax.swing.JLabel();
                jRadioButton2 = new javax.swing.JRadioButton();
                jRadioButton3 = new javax.swing.JRadioButton();
                jCheckBox1 = new javax.swing.JCheckBox();
                jCheckBox2 = new javax.swing.JCheckBox();
                jRadioButton1 = new javax.swing.JRadioButton();
                jRadioButton4 = new javax.swing.JRadioButton();
                jCheckBox3 = new javax.swing.JCheckBox();
                label1 = new java.awt.Label();
                label2 = new java.awt.Label();
                label3 = new java.awt.Label();
                label5 = new java.awt.Label();
                label6 = new java.awt.Label();
                jCheckBox4 = new javax.swing.JCheckBox();
                jCheckBox5 = new javax.swing.JCheckBox();
                jButton3 = new javax.swing.JButton();
                jLabel5 = new javax.swing.JLabel();
                jButton1 = new javax.swing.JButton();
        
                setBackground(java.awt.Color.white);
                setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                setLocation(new java.awt.Point(100, 100));
                setMaximumSize(new java.awt.Dimension(800, 600));
                setMinimumSize(new java.awt.Dimension(800, 600));
                setPreferredSize(new java.awt.Dimension(900, 710));
                setResizable(false);
                setSize(new java.awt.Dimension(0, 0));
                setTitle("Gestión de Rangos ");
                setType(java.awt.Window.Type.UTILITY);
                addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent evt) {
                        exitForm(evt);
                    }
                });
        
                jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 70)); // NOI18N
                jLabel1.setText("Gestión de Soldados");
        
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icon.png"))); // NOI18N
                jLabel2.setToolTipText("");


        
                jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        
                jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
                jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel3.setText("Lista de soldados");
                jLabel3.setToolTipText("");
        
                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)
                        .addContainerGap(46, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                );
        
                jScrollPane1.getAccessibleContext().setAccessibleName("Listainterna");
        
                jButton2.setBackground(new java.awt.Color(51, 51, 51));
                jButton2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
                jButton2.setForeground(new java.awt.Color(255, 255, 255));
                jButton2.setText("Soldado Nuevo");
                jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        
                jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        
                buttonGroup1.add(jRadioButton2);
                jRadioButton2.setText("Reportar estado ");
        
                buttonGroup1.add(jRadioButton3);
                jRadioButton3.setText("Realizar acción ");
                jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jRadioButton3ActionPerformed(evt);
                    }
                });
        
                buttonGroup1.add(jCheckBox1);
                jCheckBox1.setText("Asignar misión");
                jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jCheckBox1ActionPerformed(evt);
                    }
                });
        
                buttonGroup1.add(jCheckBox2);
                jCheckBox2.setText("Anunciar Unidad");
                jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jCheckBox2ActionPerformed(evt);
                    }
                });
        
                buttonGroup1.add(jRadioButton1);
                jRadioButton1.setText("Patrullar");
        
                buttonGroup1.add(jRadioButton4);
                jRadioButton4.setText("Saludar");
        
                buttonGroup1.add(jCheckBox3);
                jCheckBox3.setText("Anunciar estrategia");
        
                label1.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
                label1.setText("Acción solo para Coronel");
                label1.setVisible(false);
        
                label2.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
                label2.setText("Acciones de todos los soldados");
        
                label3.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
                label3.setText("Acciones de todos los soldados excepto los soldados raso");
        
                label4.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
                label4.setText("Acción solo para Teniente");
        
                label5.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
                label5.setText("Acción solo para Coronel");
        
                label6.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
                label6.setText("Acción solo para Capitan");
        
                buttonGroup1.add(jCheckBox4);
                jCheckBox4.setText("Anunciar Numero de soldados bajo mando");
                jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jCheckBox4ActionPerformed(evt);
                    }
                });
        
                buttonGroup1.add(jCheckBox5);
                jCheckBox5.setText("Regañar");
        
                jButton3.setBackground(new java.awt.Color(51, 51, 51));
                jButton3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
                jButton3.setForeground(new java.awt.Color(255, 255, 255));
                jButton3.setText("Realizar");
                jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton3ActionPerformed(evt);
                    }
                });
        
                jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
                jLabel5.setText("Botón para crear Soldados      ------>");
        
                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(592, 592, 592))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox4)
                                    .addComponent(jCheckBox2))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox1)
                                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jCheckBox3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox5))
                                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(262, 262, 262)
                                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jRadioButton2)
                                                .addGap(18, 18, 18)
                                                .addComponent(jRadioButton3))
                                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4))
                                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                );
                jPanel2Layout.setVerticalGroup(
                    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jCheckBox1)
                        .addGap(1, 1, 1)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox5))
                        .addGap(1, 1, 1)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                );
        
                jButton2.getAccessibleContext().setAccessibleName("botonCrearSoldado");
                jLabel4.getAccessibleContext().setAccessibleName("subtituloLabel");
                label1.getAccessibleContext().setAccessibleName("Acción solo para Teniente");
        
                jButton1.setBackground(new java.awt.Color(51, 51, 51));
                jButton1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
                jButton1.setForeground(new java.awt.Color(255, 255, 255));
                jButton1.setText("Reset app");
                jButton1.setActionCommand("Resetear ");
                jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                    }
                });
        
                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel1)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel2)))
                        .addContainerGap(175, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(74, Short.MAX_VALUE))
                );
        
                jLabel1.getAccessibleContext().setAccessibleName("titulo");
                jLabel2.getAccessibleContext().setAccessibleName("imagentitulo");
                jPanel1.getAccessibleContext().setAccessibleName("panelLista");
        
                getAccessibleContext().setAccessibleName("Form");
        
                pack();
            }// </editor-fold>                        
        
            /**
             * Exit the Application
             */
            private void exitForm(java.awt.event.WindowEvent evt) {                          
                System.exit(0);
            }                         
        
            private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
                // TODO add your handling code here:
            }                                        
        
            private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
                // TODO add your handling code here:
            }                                          
        
            private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
                // TODO add your handling code here:
            }                                          
        
            private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
                // TODO add your handling code here:
            }                                          
        
            private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                              
                
            }                                             
        
            private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
                
            }                                        
        
            /**
             * @param args the command line arguments
             */
            public static void main(String args[]) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new App().setVisible(true);
                    }
                });
            }
        
        
            // Variables declaration - do not modify                     
            private javax.swing.ButtonGroup buttonGroup1;
            private javax.swing.JButton jButton1;
            private javax.swing.JButton jButton2;
            private javax.swing.JButton jButton3;
            private javax.swing.JCheckBox jCheckBox1;
            private javax.swing.JCheckBox jCheckBox2;
            private javax.swing.JCheckBox jCheckBox3;
            private javax.swing.JCheckBox jCheckBox4;
            private javax.swing.JCheckBox jCheckBox5;
            private javax.swing.JLabel jLabel1;
            private javax.swing.JLabel jLabel2;
            private javax.swing.JLabel jLabel3;
            private javax.swing.JLabel jLabel4;
            private javax.swing.JLabel jLabel5;
            private javax.swing.JPanel jPanel1;
            private javax.swing.JPanel jPanel2;
            private javax.swing.JRadioButton jRadioButton1;
            private javax.swing.JRadioButton jRadioButton2;
            private javax.swing.JRadioButton jRadioButton3;
            private javax.swing.JRadioButton jRadioButton4;
            private javax.swing.JScrollPane jScrollPane1;
            private java.awt.Label label1;
            private java.awt.Label label2;
            private java.awt.Label label3;
            private java.awt.Label label4;
            private java.awt.Label label5;
            private java.awt.Label label6;
            // End of variables declaration                   
        }
    