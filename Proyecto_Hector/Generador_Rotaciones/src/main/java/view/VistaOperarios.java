
package main.java.view;



public class VistaOperarios extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public VistaOperarios() {
        initComponents();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonActualizar = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        botonIPrincipal = new javax.swing.JButton();
        botonCerrar = new javax.swing.JButton();
        botonLogout = new javax.swing.JButton();
        cajaBuscar = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LabelPuesto = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cajaNumOperario = new javax.swing.JTextField();
        cajaNombre = new javax.swing.JTextField();
        cajaApellidos = new javax.swing.JTextField();
        cajaTelefono = new javax.swing.JTextField();
        caja_ID = new javax.swing.JTextField();
        cajaAlias = new javax.swing.JTextField();
        comboBoxEquipo = new javax.swing.JComboBox<>();
        comboBoxCategoria = new javax.swing.JComboBox<>();
        checkP1 = new javax.swing.JCheckBox();
        checkP2 = new javax.swing.JCheckBox();
        checkP3 = new javax.swing.JCheckBox();
        checkP4 = new javax.swing.JCheckBox();
        checkP5 = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        cabecera = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonActualizar.setBackground(new java.awt.Color(36, 56, 130));
        botonActualizar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonActualizar.setForeground(new java.awt.Color(255, 255, 255));
        botonActualizar.setText("ACTUALIZAR");
        botonActualizar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botonActualizar.setBorderPainted(false);
        botonActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonActualizar.setFocusable(false);
        botonActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonActualizarMouseExited(evt);
            }
        });
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(botonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 240, 50));

        botonBorrar.setBackground(new java.awt.Color(36, 56, 130));
        botonBorrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonBorrar.setForeground(new java.awt.Color(255, 255, 255));
        botonBorrar.setText("BORRAR");
        botonBorrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botonBorrar.setBorderPainted(false);
        botonBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonBorrar.setFocusable(false);
        botonBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonBorrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonBorrarMouseExited(evt);
            }
        });
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(botonBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 240, 50));

        botonBuscar.setBackground(new java.awt.Color(36, 56, 130));
        botonBuscar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscar.setText("BUSCAR");
        botonBuscar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botonBuscar.setBorderPainted(false);
        botonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonBuscar.setFocusable(false);
        botonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonBuscarMouseExited(evt);
            }
        });
        jPanel1.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 240, 50));

        botonLimpiar.setBackground(new java.awt.Color(36, 56, 130));
        botonLimpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        botonLimpiar.setText("LIMPIAR");
        botonLimpiar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botonLimpiar.setBorderPainted(false);
        botonLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonLimpiar.setFocusable(false);
        jPanel1.add(botonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 440, 70, 30));

        botonGuardar.setBackground(new java.awt.Color(36, 56, 130));
        botonGuardar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        botonGuardar.setText("GUARDAR");
        botonGuardar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botonGuardar.setBorderPainted(false);
        botonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGuardar.setFocusable(false);
        botonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonGuardarMouseExited(evt);
            }
        });
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 240, 50));

        botonIPrincipal.setBackground(new java.awt.Color(36, 56, 130));
        botonIPrincipal.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        botonIPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        botonIPrincipal.setText("<<");
        botonIPrincipal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botonIPrincipal.setBorderPainted(false);
        botonIPrincipal.setContentAreaFilled(false);
        botonIPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonIPrincipal.setFocusable(false);
        botonIPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIPrincipalActionPerformed(evt);
            }
        });
        jPanel1.add(botonIPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 40));

        botonCerrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        botonCerrar.setForeground(new java.awt.Color(36, 56, 130));
        botonCerrar.setText("X");
        botonCerrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botonCerrar.setBorderPainted(false);
        botonCerrar.setContentAreaFilled(false);
        botonCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCerrar.setFocusable(false);
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(botonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 30, 30));

        botonLogout.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        botonLogout.setForeground(new java.awt.Color(255, 255, 255));
        botonLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/img/logout.png"))); // NOI18N
        botonLogout.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botonLogout.setBorderPainted(false);
        botonLogout.setContentAreaFilled(false);
        botonLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonLogout.setFocusable(false);
        botonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(botonLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 30, 30));

        cajaBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaBuscar.setForeground(new java.awt.Color(102, 102, 102));
        cajaBuscar.setBorder(null);
        cajaBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(cajaBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 100, 30));

        jPanel4.setBackground(new java.awt.Color(96, 116, 190));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 540, 2));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nº OPERARIO");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 100, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(96, 116, 190));
        jLabel2.setText("TRABAJADOR");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 130, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("NOMBRE");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("APELLIDOS");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, 30));

        LabelPuesto.setBackground(new java.awt.Color(255, 255, 255));
        LabelPuesto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelPuesto.setText("PUESTOS");
        LabelPuesto.setOpaque(true);
        jPanel1.add(LabelPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, -1, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("TELEFONO");
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("CATEGORIA");
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 90, 30));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/img/logoBlanco.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 230, 90));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("EQUIPO");
        jLabel9.setOpaque(true);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 80, 30));

        cajaNumOperario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaNumOperario.setForeground(new java.awt.Color(102, 102, 102));
        cajaNumOperario.setBorder(null);
        jPanel1.add(cajaNumOperario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 240, 30));

        cajaNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaNombre.setForeground(new java.awt.Color(102, 102, 102));
        cajaNombre.setBorder(null);
        cajaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreActionPerformed(evt);
            }
        });
        jPanel1.add(cajaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 240, 30));

        cajaApellidos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaApellidos.setForeground(new java.awt.Color(102, 102, 102));
        cajaApellidos.setBorder(null);
        jPanel1.add(cajaApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 240, 30));

        cajaTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaTelefono.setForeground(new java.awt.Color(102, 102, 102));
        cajaTelefono.setBorder(null);
        cajaTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(cajaTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 240, 30));

        caja_ID.setBorder(null);
        jPanel1.add(caja_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 60, -1));

        cajaAlias.setEditable(false);
        cajaAlias.setBackground(new java.awt.Color(36, 56, 130));
        cajaAlias.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaAlias.setForeground(new java.awt.Color(255, 255, 255));
        cajaAlias.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cajaAlias.setBorder(null);
        cajaAlias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaAliasActionPerformed(evt);
            }
        });
        jPanel1.add(cajaAlias, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 75, -1));

        comboBoxEquipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboBoxEquipo.setForeground(new java.awt.Color(102, 102, 102));
        comboBoxEquipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione equipo", "A01", "A02" }));
        comboBoxEquipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(comboBoxEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 160, 30));

        comboBoxCategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboBoxCategoria.setForeground(new java.awt.Color(102, 102, 102));
        comboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione categoría", "Operario", "Coordinador", " " }));
        comboBoxCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(comboBoxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 160, 30));

        checkP1.setBackground(new java.awt.Color(255, 255, 255));
        checkP1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        checkP1.setText("P1");
        jPanel1.add(checkP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, -1, -1));

        checkP2.setBackground(new java.awt.Color(255, 255, 255));
        checkP2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        checkP2.setText("P2");
        jPanel1.add(checkP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, -1, -1));

        checkP3.setBackground(new java.awt.Color(255, 255, 255));
        checkP3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        checkP3.setText("P3");
        jPanel1.add(checkP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, -1, -1));

        checkP4.setBackground(new java.awt.Color(255, 255, 255));
        checkP4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        checkP4.setText("P4");
        jPanel1.add(checkP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, -1, -1));

        checkP5.setBackground(new java.awt.Color(255, 255, 255));
        checkP5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        checkP5.setText("P5");
        jPanel1.add(checkP5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(36, 56, 130));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 240, 10));

        jSeparator2.setForeground(new java.awt.Color(36, 56, 130));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 240, 10));

        jSeparator3.setForeground(new java.awt.Color(36, 56, 130));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 240, 10));

        jSeparator4.setForeground(new java.awt.Color(36, 56, 130));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 240, 10));

        cabecera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cabecera.setOpaque(false);
        cabecera.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                cabeceraMouseDragged(evt);
            }
        });
        cabecera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cabeceraMousePressed(evt);
            }
        });

        javax.swing.GroupLayout cabeceraLayout = new javax.swing.GroupLayout(cabecera);
        cabecera.setLayout(cabeceraLayout);
        cabeceraLayout.setHorizontalGroup(
            cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        cabeceraLayout.setVerticalGroup(
            cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(cabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        jPanel2.setBackground(new java.awt.Color(36, 56, 130));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 510));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(36, 56, 130)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 798, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonActualizarActionPerformed

    private void cajaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombreActionPerformed

    private void cajaBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaBuscarActionPerformed

    private void cajaTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaTelefonoActionPerformed

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
     
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonIPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIPrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonIPrincipalActionPerformed

    private void cabeceraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cabeceraMousePressed
        xMouse = evt.getX();
        yMouse= evt.getY();
    }//GEN-LAST:event_cabeceraMousePressed

    private void cabeceraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cabeceraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_cabeceraMouseDragged

    private void botonGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGuardarMouseEntered
        
    }//GEN-LAST:event_botonGuardarMouseEntered

    private void botonGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGuardarMouseExited
        
    }//GEN-LAST:event_botonGuardarMouseExited

    private void botonActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActualizarMouseEntered
        
    }//GEN-LAST:event_botonActualizarMouseEntered

    private void botonActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActualizarMouseExited
        
    }//GEN-LAST:event_botonActualizarMouseExited

    private void botonBorrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBorrarMouseEntered
        
    }//GEN-LAST:event_botonBorrarMouseEntered

    private void botonBorrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBorrarMouseExited
        
    }//GEN-LAST:event_botonBorrarMouseExited

    private void botonBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseEntered
        
    }//GEN-LAST:event_botonBuscarMouseEntered

    private void botonBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseExited
       
    }//GEN-LAST:event_botonBuscarMouseExited

    private void cajaAliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaAliasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaAliasActionPerformed

    private void botonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaOperarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaOperarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaOperarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaOperarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaOperarios().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel LabelPuesto;
    public javax.swing.JButton botonActualizar;
    public javax.swing.JButton botonBorrar;
    public javax.swing.JButton botonBuscar;
    public javax.swing.JButton botonCerrar;
    public javax.swing.JButton botonGuardar;
    public javax.swing.JButton botonIPrincipal;
    public javax.swing.JButton botonLimpiar;
    public javax.swing.JButton botonLogout;
    public javax.swing.JPanel cabecera;
    public javax.swing.JTextField cajaAlias;
    public javax.swing.JTextField cajaApellidos;
    public javax.swing.JTextField cajaBuscar;
    public javax.swing.JTextField cajaNombre;
    public javax.swing.JTextField cajaNumOperario;
    public javax.swing.JTextField cajaTelefono;
    public javax.swing.JTextField caja_ID;
    public javax.swing.JCheckBox checkP1;
    public javax.swing.JCheckBox checkP2;
    public javax.swing.JCheckBox checkP3;
    public javax.swing.JCheckBox checkP4;
    public javax.swing.JCheckBox checkP5;
    public javax.swing.JComboBox<String> comboBoxCategoria;
    public javax.swing.JComboBox<String> comboBoxEquipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
