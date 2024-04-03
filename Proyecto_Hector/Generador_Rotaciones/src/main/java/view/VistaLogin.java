
package main.java.view;

public class VistaLogin extends javax.swing.JFrame {

    int xMouse, yMouse;
    public VistaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        botonCambiarContrasena = new javax.swing.JButton();
        botonInscribirse = new javax.swing.JButton();
        botonCerrar = new javax.swing.JButton();
        botonIniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cajaUsuario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPasswordF = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cabecera = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(204, 204, 204));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonCambiarContrasena.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonCambiarContrasena.setForeground(new java.awt.Color(36, 56, 130));
        botonCambiarContrasena.setText("Olvidaste la contraseña?");
        botonCambiarContrasena.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botonCambiarContrasena.setBorderPainted(false);
        botonCambiarContrasena.setContentAreaFilled(false);
        botonCambiarContrasena.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCambiarContrasena.setFocusable(false);
        botonCambiarContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarContrasenaActionPerformed(evt);
            }
        });
        bg.add(botonCambiarContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 150, 20));

        botonInscribirse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonInscribirse.setForeground(new java.awt.Color(36, 56, 130));
        botonInscribirse.setText("Inscribirse");
        botonInscribirse.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botonInscribirse.setBorderPainted(false);
        botonInscribirse.setContentAreaFilled(false);
        botonInscribirse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonInscribirse.setFocusable(false);
        botonInscribirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInscribirseActionPerformed(evt);
            }
        });
        bg.add(botonInscribirse, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 70, 15));

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

        botonIniciar.setBackground(new java.awt.Color(36, 56, 130));
        botonIniciar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonIniciar.setForeground(new java.awt.Color(255, 255, 255));
        botonIniciar.setText("INICIAR");
        botonIniciar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botonIniciar.setBorderPainted(false);
        botonIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonIniciar.setFocusable(false);
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });
        bg.add(botonIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 280, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(36, 56, 130));
        jLabel1.setText("Usuario");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 69, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(36, 56, 130));
        jLabel3.setText("Contraseña");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));

        cajaUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaUsuario.setForeground(new java.awt.Color(16, 36, 110));
        cajaUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cajaUsuario.setBorder(null);
        bg.add(cajaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 190, 30));

        jSeparator2.setForeground(new java.awt.Color(36, 56, 130));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 190, 10));

        jPasswordF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordF.setForeground(new java.awt.Color(16, 36, 110));
        jPasswordF.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPasswordF.setBorder(null);
        bg.add(jPasswordF, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 190, 30));

        jSeparator3.setForeground(new java.awt.Color(36, 56, 130));
        bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 190, 10));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(36, 56, 130));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("No tienes cuenta?");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 135, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/img/logoAzul.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(375, Short.MAX_VALUE))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 340, 510));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/img/coche_portada..jpg"))); // NOI18N
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 510));

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

    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonIniciarActionPerformed

    private void botonInscribirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInscribirseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonInscribirseActionPerformed

    private void botonCambiarContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCambiarContrasenaActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    public javax.swing.JButton botonCambiarContrasena;
    public javax.swing.JButton botonCerrar;
    public javax.swing.JButton botonIniciar;
    public javax.swing.JButton botonInscribirse;
    public javax.swing.JPanel cabecera;
    public javax.swing.JTextField cajaUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPasswordField jPasswordF;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
