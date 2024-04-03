
package main.java.view;

public class VistaInscribirse extends javax.swing.JFrame {

    int xMouse, yMouse;
    public VistaInscribirse() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        botonCerrar = new javax.swing.JButton();
        botonInscribirse = new javax.swing.JButton();
        cajaUsuario = new javax.swing.JTextField();
        cajaNumeroTrabajador = new javax.swing.JTextField();
        cajaTelefono = new javax.swing.JTextField();
        jPasswordF = new javax.swing.JPasswordField();
        jPasswordF1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        cabecera = new javax.swing.JPanel();
        botonIPrincipal = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(204, 204, 204));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonCerrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        botonCerrar.setForeground(new java.awt.Color(255, 255, 255));
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

        botonInscribirse.setBackground(new java.awt.Color(36, 56, 130));
        botonInscribirse.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonInscribirse.setForeground(new java.awt.Color(255, 255, 255));
        botonInscribirse.setText("INSCRIBIRSE");
        botonInscribirse.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botonInscribirse.setBorderPainted(false);
        botonInscribirse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonInscribirse.setFocusable(false);
        botonInscribirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInscribirseActionPerformed(evt);
            }
        });
        bg.add(botonInscribirse, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 300, 50));

        cajaUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaUsuario.setForeground(new java.awt.Color(16, 36, 110));
        cajaUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cajaUsuario.setBorder(null);
        bg.add(cajaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 190, 30));

        cajaNumeroTrabajador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaNumeroTrabajador.setForeground(new java.awt.Color(16, 36, 110));
        cajaNumeroTrabajador.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cajaNumeroTrabajador.setBorder(null);
        bg.add(cajaNumeroTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 190, 30));

        cajaTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaTelefono.setForeground(new java.awt.Color(16, 36, 110));
        cajaTelefono.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cajaTelefono.setBorder(null);
        bg.add(cajaTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 190, 30));

        jPasswordF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordF.setForeground(new java.awt.Color(16, 36, 110));
        jPasswordF.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPasswordF.setBorder(null);
        bg.add(jPasswordF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 190, 30));

        jPasswordF1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordF1.setForeground(new java.awt.Color(16, 36, 110));
        jPasswordF1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPasswordF1.setBorder(null);
        bg.add(jPasswordF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 190, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/img/logoAzul.png"))); // NOI18N
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 240, 90));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(36, 56, 130));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nº Trabajador");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 100, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(36, 56, 130));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Telefono");
        bg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 100, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(36, 56, 130));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Usuario");
        bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 100, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(36, 56, 130));
        jLabel3.setText("Contraseña");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(36, 56, 130));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Repetir");
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 80, -1));

        jSeparator2.setForeground(new java.awt.Color(36, 56, 130));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 190, 10));

        jSeparator5.setForeground(new java.awt.Color(36, 56, 130));
        bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 190, 10));

        jSeparator6.setForeground(new java.awt.Color(36, 56, 130));
        bg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 190, 10));

        jSeparator3.setForeground(new java.awt.Color(36, 56, 130));
        bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 190, 10));

        jSeparator4.setForeground(new java.awt.Color(36, 56, 130));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 190, 10));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 510));
        jPanel1.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 460, 510));

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

        javax.swing.GroupLayout cabeceraLayout = new javax.swing.GroupLayout(cabecera);
        cabecera.setLayout(cabeceraLayout);
        cabeceraLayout.setHorizontalGroup(
            cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabeceraLayout.createSequentialGroup()
                .addComponent(botonIPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 740, Short.MAX_VALUE))
        );
        cabeceraLayout.setVerticalGroup(
            cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cabeceraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonIPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(cabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/img/coche_perfil.jpeg"))); // NOI18N
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 510));

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

    private void botonInscribirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInscribirseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonInscribirseActionPerformed

    private void botonIPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIPrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonIPrincipalActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    public javax.swing.JButton botonCerrar;
    public javax.swing.JButton botonIPrincipal;
    public javax.swing.JButton botonInscribirse;
    public javax.swing.JPanel cabecera;
    public javax.swing.JTextField cajaNumeroTrabajador;
    public javax.swing.JTextField cajaTelefono;
    public javax.swing.JTextField cajaUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPasswordField jPasswordF;
    public javax.swing.JPasswordField jPasswordF1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables
}
