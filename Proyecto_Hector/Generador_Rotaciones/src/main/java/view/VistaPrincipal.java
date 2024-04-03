
package main.java.view;

public class VistaPrincipal extends javax.swing.JFrame {

    int xMouse, yMouse;
    public VistaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonGenerar = new javax.swing.JButton();
        botonRegistro = new javax.swing.JButton();
        botonTrabajador = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        botonCerrar = new javax.swing.JButton();
        botonLogout = new javax.swing.JButton();
        cajaR1P1 = new javax.swing.JTextField();
        cajaR1P2 = new javax.swing.JTextField();
        cajaR1P3 = new javax.swing.JTextField();
        cajaR1P4 = new javax.swing.JTextField();
        cajaR1P5 = new javax.swing.JTextField();
        cajaR2P1 = new javax.swing.JTextField();
        cajaR2P2 = new javax.swing.JTextField();
        cajaR2P3 = new javax.swing.JTextField();
        cajaR2P4 = new javax.swing.JTextField();
        cajaR2P5 = new javax.swing.JTextField();
        cajaR3P1 = new javax.swing.JTextField();
        cajaR3P2 = new javax.swing.JTextField();
        cajaR3P3 = new javax.swing.JTextField();
        cajaR3P4 = new javax.swing.JTextField();
        cajaR3P5 = new javax.swing.JTextField();
        cajaR4P1 = new javax.swing.JTextField();
        cajaR4P2 = new javax.swing.JTextField();
        cajaR4P3 = new javax.swing.JTextField();
        cajaR4P4 = new javax.swing.JTextField();
        cajaR4P5 = new javax.swing.JTextField();
        cajaR5P1 = new javax.swing.JTextField();
        cajaR5P2 = new javax.swing.JTextField();
        cajaR5P3 = new javax.swing.JTextField();
        cajaR5P4 = new javax.swing.JTextField();
        cajaR5P5 = new javax.swing.JTextField();
        cajaAlias = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        cabecera = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jCoord = new javax.swing.JLabel();
        jEquipo = new javax.swing.JLabel();
        cajaEquipo = new javax.swing.JTextField();
        cajaCoord = new javax.swing.JTextField();
        cajaFecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(204, 204, 204));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(96, 116, 190));
        jLabel1.setText("DISEÑADOR DE ROTACIONES");
        jLabel1.setOpaque(true);
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 270, 30));

        botonGenerar.setBackground(new java.awt.Color(36, 56, 130));
        botonGenerar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonGenerar.setForeground(new java.awt.Color(255, 255, 255));
        botonGenerar.setText("GENERAR");
        botonGenerar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botonGenerar.setBorderPainted(false);
        botonGenerar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGenerar.setFocusable(false);
        botonGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGenerarActionPerformed(evt);
            }
        });
        bg.add(botonGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 240, 50));

        botonRegistro.setBackground(new java.awt.Color(36, 56, 130));
        botonRegistro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonRegistro.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistro.setText("REGISTRO");
        botonRegistro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botonRegistro.setBorderPainted(false);
        botonRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegistro.setFocusable(false);
        bg.add(botonRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 240, 50));

        botonTrabajador.setBackground(new java.awt.Color(36, 56, 130));
        botonTrabajador.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonTrabajador.setForeground(new java.awt.Color(255, 255, 255));
        botonTrabajador.setText("TRABAJADOR");
        botonTrabajador.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botonTrabajador.setBorderPainted(false);
        botonTrabajador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonTrabajador.setFocusable(false);
        bg.add(botonTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 240, 50));

        botonGuardar.setBackground(new java.awt.Color(36, 56, 130));
        botonGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        botonGuardar.setText("GUARDAR");
        botonGuardar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botonGuardar.setBorderPainted(false);
        botonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGuardar.setFocusable(false);
        bg.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, 120, 30));

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
        bg.add(botonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 30, 30));

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
        bg.add(botonLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 30, 30));

        cajaR1P1.setEditable(false);
        cajaR1P1.setBackground(new java.awt.Color(255, 255, 255));
        cajaR1P1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cajaR1P1.setForeground(new java.awt.Color(16, 36, 110));
        cajaR1P1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaR1P1.setBorder(null);
        bg.add(cajaR1P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 70, 30));

        cajaR1P2.setEditable(false);
        cajaR1P2.setBackground(new java.awt.Color(255, 255, 255));
        cajaR1P2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cajaR1P2.setForeground(new java.awt.Color(16, 36, 110));
        cajaR1P2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaR1P2.setBorder(null);
        bg.add(cajaR1P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 70, 30));

        cajaR1P3.setEditable(false);
        cajaR1P3.setBackground(new java.awt.Color(255, 255, 255));
        cajaR1P3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cajaR1P3.setForeground(new java.awt.Color(16, 36, 110));
        cajaR1P3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaR1P3.setBorder(null);
        bg.add(cajaR1P3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 70, 30));

        cajaR1P4.setEditable(false);
        cajaR1P4.setBackground(new java.awt.Color(255, 255, 255));
        cajaR1P4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cajaR1P4.setForeground(new java.awt.Color(16, 36, 110));
        cajaR1P4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaR1P4.setBorder(null);
        bg.add(cajaR1P4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 70, 30));

        cajaR1P5.setEditable(false);
        cajaR1P5.setBackground(new java.awt.Color(255, 255, 255));
        cajaR1P5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cajaR1P5.setForeground(new java.awt.Color(16, 36, 110));
        cajaR1P5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaR1P5.setBorder(null);
        bg.add(cajaR1P5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 70, 30));

        cajaR2P1.setEditable(false);
        cajaR2P1.setBackground(new java.awt.Color(225, 225, 235));
        cajaR2P1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cajaR2P1.setForeground(new java.awt.Color(16, 36, 110));
        cajaR2P1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaR2P1.setBorder(null);
        bg.add(cajaR2P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 70, 30));

        cajaR2P2.setEditable(false);
        cajaR2P2.setBackground(new java.awt.Color(225, 225, 235));
        cajaR2P2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cajaR2P2.setForeground(new java.awt.Color(16, 36, 110));
        cajaR2P2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaR2P2.setBorder(null);
        bg.add(cajaR2P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 70, 30));

        cajaR2P3.setEditable(false);
        cajaR2P3.setBackground(new java.awt.Color(225, 225, 235));
        cajaR2P3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cajaR2P3.setForeground(new java.awt.Color(16, 36, 110));
        cajaR2P3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaR2P3.setBorder(null);
        bg.add(cajaR2P3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 70, 30));

        cajaR2P4.setEditable(false);
        cajaR2P4.setBackground(new java.awt.Color(225, 225, 235));
        cajaR2P4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cajaR2P4.setForeground(new java.awt.Color(16, 36, 110));
        cajaR2P4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaR2P4.setBorder(null);
        bg.add(cajaR2P4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 70, 30));

        cajaR2P5.setEditable(false);
        cajaR2P5.setBackground(new java.awt.Color(225, 225, 235));
        cajaR2P5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cajaR2P5.setForeground(new java.awt.Color(16, 36, 110));
        cajaR2P5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaR2P5.setBorder(null);
        bg.add(cajaR2P5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 70, 30));

        cajaR3P1.setEditable(false);
        cajaR3P1.setBackground(new java.awt.Color(255, 255, 255));
        cajaR3P1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cajaR3P1.setForeground(new java.awt.Color(16, 36, 110));
        cajaR3P1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaR3P1.setBorder(null);
        bg.add(cajaR3P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 70, 30));

        cajaR3P2.setEditable(false);
        cajaR3P2.setBackground(new java.awt.Color(255, 255, 255));
        cajaR3P2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cajaR3P2.setForeground(new java.awt.Color(16, 36, 110));
        cajaR3P2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaR3P2.setBorder(null);
        bg.add(cajaR3P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 70, 30));

        cajaR3P3.setEditable(false);
        cajaR3P3.setBackground(new java.awt.Color(255, 255, 255));
        cajaR3P3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cajaR3P3.setForeground(new java.awt.Color(16, 36, 110));
        cajaR3P3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaR3P3.setBorder(null);
        bg.add(cajaR3P3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 70, 30));

        cajaR3P4.setEditable(false);
        cajaR3P4.setBackground(new java.awt.Color(255, 255, 255));
        cajaR3P4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cajaR3P4.setForeground(new java.awt.Color(16, 36, 110));
        cajaR3P4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaR3P4.setBorder(null);
        bg.add(cajaR3P4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 70, 30));

        cajaR3P5.setEditable(false);
        cajaR3P5.setBackground(new java.awt.Color(255, 255, 255));
        cajaR3P5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cajaR3P5.setForeground(new java.awt.Color(16, 36, 110));
        cajaR3P5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaR3P5.setBorder(null);
        bg.add(cajaR3P5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 70, 30));

        cajaR4P1.setEditable(false);
        cajaR4P1.setBackground(new java.awt.Color(225, 225, 235));
        cajaR4P1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cajaR4P1.setForeground(new java.awt.Color(16, 36, 110));
        cajaR4P1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaR4P1.setBorder(null);
        bg.add(cajaR4P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 70, 30));

        cajaR4P2.setEditable(false);
        cajaR4P2.setBackground(new java.awt.Color(225, 225, 235));
        cajaR4P2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cajaR4P2.setForeground(new java.awt.Color(16, 36, 110));
        cajaR4P2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaR4P2.setBorder(null);
        bg.add(cajaR4P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 70, 30));

        cajaR4P3.setEditable(false);
        cajaR4P3.setBackground(new java.awt.Color(225, 225, 235));
        cajaR4P3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cajaR4P3.setForeground(new java.awt.Color(16, 36, 110));
        cajaR4P3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaR4P3.setBorder(null);
        bg.add(cajaR4P3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 70, 30));

        cajaR4P4.setEditable(false);
        cajaR4P4.setBackground(new java.awt.Color(225, 225, 235));
        cajaR4P4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cajaR4P4.setForeground(new java.awt.Color(16, 36, 110));
        cajaR4P4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaR4P4.setBorder(null);
        bg.add(cajaR4P4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 70, 30));

        cajaR4P5.setEditable(false);
        cajaR4P5.setBackground(new java.awt.Color(225, 225, 235));
        cajaR4P5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cajaR4P5.setForeground(new java.awt.Color(16, 36, 110));
        cajaR4P5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaR4P5.setBorder(null);
        bg.add(cajaR4P5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 70, 30));

        cajaR5P1.setEditable(false);
        cajaR5P1.setBackground(new java.awt.Color(255, 255, 255));
        cajaR5P1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cajaR5P1.setForeground(new java.awt.Color(16, 36, 110));
        cajaR5P1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaR5P1.setBorder(null);
        bg.add(cajaR5P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 70, 30));

        cajaR5P2.setEditable(false);
        cajaR5P2.setBackground(new java.awt.Color(255, 255, 255));
        cajaR5P2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cajaR5P2.setForeground(new java.awt.Color(16, 36, 110));
        cajaR5P2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaR5P2.setBorder(null);
        bg.add(cajaR5P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 70, 30));

        cajaR5P3.setEditable(false);
        cajaR5P3.setBackground(new java.awt.Color(255, 255, 255));
        cajaR5P3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cajaR5P3.setForeground(new java.awt.Color(16, 36, 110));
        cajaR5P3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaR5P3.setBorder(null);
        bg.add(cajaR5P3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, 70, 30));

        cajaR5P4.setEditable(false);
        cajaR5P4.setBackground(new java.awt.Color(255, 255, 255));
        cajaR5P4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cajaR5P4.setForeground(new java.awt.Color(16, 36, 110));
        cajaR5P4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaR5P4.setBorder(null);
        bg.add(cajaR5P4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, 70, 30));

        cajaR5P5.setEditable(false);
        cajaR5P5.setBackground(new java.awt.Color(255, 255, 255));
        cajaR5P5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cajaR5P5.setForeground(new java.awt.Color(16, 36, 110));
        cajaR5P5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaR5P5.setBorder(null);
        bg.add(cajaR5P5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 70, 30));

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
        bg.add(cajaAlias, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 75, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(36, 56, 130));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("P5");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 30, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(36, 56, 130));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("R5");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, 30, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(36, 56, 130));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("P2");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 30, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(36, 56, 130));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("P3");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 30, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(36, 56, 130));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("P4");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 30, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(36, 56, 130));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("P1");
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 30, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(36, 56, 130));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("R1");
        bg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 30, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(36, 56, 130));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("R2");
        bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 30, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(36, 56, 130));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("R3");
        bg.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 30, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(36, 56, 130));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("R4");
        bg.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 30, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/img/logoBlanco.png"))); // NOI18N
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 230, 90));

        jSeparator3.setForeground(new java.awt.Color(36, 56, 130));
        bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 470, 10));

        jSeparator4.setForeground(new java.awt.Color(36, 56, 130));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 470, 10));

        jSeparator5.setForeground(new java.awt.Color(36, 56, 130));
        bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 470, 10));

        jSeparator6.setForeground(new java.awt.Color(36, 56, 130));
        bg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 470, 10));

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

        bg.add(cabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        jPanel1.setBackground(new java.awt.Color(36, 56, 130));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 510));

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

        bg.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 540, 2));

        jPanel5.setBackground(new java.awt.Color(225, 225, 235));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        bg.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 90, 280));

        jPanel7.setBackground(new java.awt.Color(225, 225, 235));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        bg.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 90, 280));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(36, 56, 130)));

        jCoord.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jCoord.setForeground(new java.awt.Color(36, 56, 130));
        jCoord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCoord.setText("Coordinador");

        jEquipo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jEquipo.setForeground(new java.awt.Color(36, 56, 130));
        jEquipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jEquipo.setText("Equipo");

        cajaEquipo.setEditable(false);
        cajaEquipo.setBackground(new java.awt.Color(255, 255, 255));
        cajaEquipo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cajaEquipo.setForeground(new java.awt.Color(36, 56, 130));
        cajaEquipo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaEquipo.setBorder(null);
        cajaEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaEquipoActionPerformed(evt);
            }
        });

        cajaCoord.setEditable(false);
        cajaCoord.setBackground(new java.awt.Color(255, 255, 255));
        cajaCoord.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cajaCoord.setForeground(new java.awt.Color(36, 56, 130));
        cajaCoord.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaCoord.setBorder(null);
        cajaCoord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaCoordActionPerformed(evt);
            }
        });

        cajaFecha.setBackground(new java.awt.Color(255, 255, 255));
        cajaFecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaFecha.setForeground(new java.awt.Color(36, 56, 130));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jCoord, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cajaCoord, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cajaEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(cajaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(415, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cajaEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cajaCoord, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCoord, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(cajaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGenerarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonGenerarActionPerformed

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed

    }//GEN-LAST:event_botonCerrarActionPerformed

    private void cabeceraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cabeceraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_cabeceraMouseDragged

    private void cabeceraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cabeceraMousePressed
        xMouse = evt.getX();
        yMouse= evt.getY();
    }//GEN-LAST:event_cabeceraMousePressed

    private void cajaAliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaAliasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaAliasActionPerformed

    private void cajaEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaEquipoActionPerformed

    private void cajaCoordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaCoordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaCoordActionPerformed

    private void botonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonLogoutActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    public javax.swing.JButton botonCerrar;
    public javax.swing.JButton botonGenerar;
    public javax.swing.JButton botonGuardar;
    public javax.swing.JButton botonLogout;
    public javax.swing.JButton botonRegistro;
    public javax.swing.JButton botonTrabajador;
    public javax.swing.JPanel cabecera;
    public javax.swing.JTextField cajaAlias;
    public javax.swing.JTextField cajaCoord;
    public javax.swing.JTextField cajaEquipo;
    public javax.swing.JLabel cajaFecha;
    public javax.swing.JTextField cajaR1P1;
    public javax.swing.JTextField cajaR1P2;
    public javax.swing.JTextField cajaR1P3;
    public javax.swing.JTextField cajaR1P4;
    public javax.swing.JTextField cajaR1P5;
    public javax.swing.JTextField cajaR2P1;
    public javax.swing.JTextField cajaR2P2;
    public javax.swing.JTextField cajaR2P3;
    public javax.swing.JTextField cajaR2P4;
    public javax.swing.JTextField cajaR2P5;
    public javax.swing.JTextField cajaR3P1;
    public javax.swing.JTextField cajaR3P2;
    public javax.swing.JTextField cajaR3P3;
    public javax.swing.JTextField cajaR3P4;
    public javax.swing.JTextField cajaR3P5;
    public javax.swing.JTextField cajaR4P1;
    public javax.swing.JTextField cajaR4P2;
    public javax.swing.JTextField cajaR4P3;
    public javax.swing.JTextField cajaR4P4;
    public javax.swing.JTextField cajaR4P5;
    public javax.swing.JTextField cajaR5P1;
    public javax.swing.JTextField cajaR5P2;
    public javax.swing.JTextField cajaR5P3;
    public javax.swing.JTextField cajaR5P4;
    public javax.swing.JTextField cajaR5P5;
    public javax.swing.JLabel jCoord;
    public javax.swing.JLabel jEquipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables
}
