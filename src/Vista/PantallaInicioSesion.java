
package Vista;

import java.awt.Insets;


public class PantallaInicioSesion extends javax.swing.JFrame {


    public PantallaInicioSesion() {
        initComponents();
        
       
        
        
      
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonregistrarse = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inicio1 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Recuerdame = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        botoninicio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Doctoresimg = new javax.swing.JLabel();
        OlvidastePassword = new javax.swing.JLabel();
        Degradado = new javax.swing.JLabel();
        OpcionDoctor = new javax.swing.JRadioButton();
        OpcionRecepcionista = new javax.swing.JRadioButton();
        Usuario = new javax.swing.JTextField();
        Contraseña = new javax.swing.JPasswordField();
        Email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(930, 670));
        setMinimumSize(new java.awt.Dimension(930, 670));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(930, 670));
        jPanel1.setMinimumSize(new java.awt.Dimension(930, 670));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonregistrarse.setBackground(new java.awt.Color(204, 51, 255));
        botonregistrarse.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonregistrarse.setForeground(new java.awt.Color(255, 255, 255));
        botonregistrarse.setText("Regístrate");
        botonregistrarse.setBorder(null);
        botonregistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonregistrarseActionPerformed(evt);
            }
        });
        jPanel1.add(botonregistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, 180, 60));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/password.png"))); // NOI18N
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 70, 60));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 130, 20));

        inicio1.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        inicio1.setForeground(new java.awt.Color(83, 121, 235));
        inicio1.setText(" Iniciar sesión");
        jPanel1.add(inicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 300, 60));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/email.png"))); // NOI18N
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 30, 60));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Contraseña");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 130, 20));

        Recuerdame.setBackground(new java.awt.Color(51, 153, 255));
        Recuerdame.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        Recuerdame.setForeground(new java.awt.Color(153, 153, 153));
        Recuerdame.setText("Recuérdame.");
        Recuerdame.setOpaque(false);
        Recuerdame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecuerdameActionPerformed(evt);
            }
        });
        jPanel1.add(Recuerdame, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 140, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("¿Aún no tienes una cuenta?  ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, -1, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/usuario.png"))); // NOI18N
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 30, 60));

        botoninicio.setBackground(new java.awt.Color(51, 102, 255));
        botoninicio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botoninicio.setForeground(new java.awt.Color(255, 255, 255));
        botoninicio.setText(" Iniciar sesión");
        botoninicio.setBorder(null);
        jPanel1.add(botoninicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, 270, 60));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("una atención eficiente.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 230, 40));

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 32)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("¡La salud no espera!");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ingresa ahora para brindar  ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 270, 50));

        Doctoresimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/doctores.png"))); // NOI18N
        jPanel1.add(Doctoresimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 310, 220));

        OlvidastePassword.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        OlvidastePassword.setForeground(new java.awt.Color(153, 153, 153));
        OlvidastePassword.setText("¿Olvidaste tu contraseña?");
        jPanel1.add(OlvidastePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, -1, -1));

        Degradado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/fondo.png"))); // NOI18N
        Degradado.setMaximumSize(new java.awt.Dimension(390, 670));
        Degradado.setMinimumSize(new java.awt.Dimension(390, 670));
        Degradado.setPreferredSize(new java.awt.Dimension(390, 670));
        jPanel1.add(Degradado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 670));

        OpcionDoctor.setBackground(new java.awt.Color(203, 108, 230));
        OpcionDoctor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        OpcionDoctor.setForeground(new java.awt.Color(153, 153, 153));
        OpcionDoctor.setText("Doctor/a");
        jPanel1.add(OpcionDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, 140, 40));

        OpcionRecepcionista.setBackground(new java.awt.Color(203, 108, 230));
        OpcionRecepcionista.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        OpcionRecepcionista.setForeground(new java.awt.Color(153, 153, 153));
        OpcionRecepcionista.setText("Recepcionista");
        OpcionRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionRecepcionistaActionPerformed(evt);
            }
        });
        jPanel1.add(OpcionRecepcionista, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, 140, 40));

        Usuario.setBackground(new java.awt.Color(235, 235, 234));
        Usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 235, 234), 4));
        Usuario.setMargin(new java.awt.Insets(0, 15, 0, 0));
        Usuario.setMaximumSize(new java.awt.Dimension(15, 24));
        jPanel1.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 410, 50));

        Contraseña.setBackground(new java.awt.Color(235, 235, 234));
        Contraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 235, 234), 4));
        Contraseña.setMargin(new java.awt.Insets(0, 15, 0, 0));
        Contraseña.setMaximumSize(new java.awt.Dimension(15, 24));
        Contraseña.setMinimumSize(new java.awt.Dimension(15, 24));
        Contraseña.setPreferredSize(new java.awt.Dimension(15, 24));
        Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 400, 50));

        Email.setBackground(new java.awt.Color(235, 235, 234));
        Email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 235, 234), 4));
        Email.setMargin(new java.awt.Insets(0, 15, 0, 0));
        Email.setMaximumSize(new java.awt.Dimension(15, 24));
        jPanel1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 410, 50));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Email");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 130, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonregistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonregistrarseActionPerformed

        PantallaRegistrarse registrase = new PantallaRegistrarse();
        registrase.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonregistrarseActionPerformed

    private void RecuerdameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecuerdameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RecuerdameActionPerformed

    private void OpcionRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionRecepcionistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpcionRecepcionistaActionPerformed

    private void ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContraseñaActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaInicioSesion().setVisible(true);
            }
        });
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JLabel Degradado;
    private javax.swing.JLabel Doctoresimg;
    private javax.swing.JTextField Email;
    private javax.swing.JLabel OlvidastePassword;
    private javax.swing.JRadioButton OpcionDoctor;
    private javax.swing.JRadioButton OpcionRecepcionista;
    private javax.swing.JCheckBox Recuerdame;
    private javax.swing.JTextField Usuario;
    private javax.swing.JButton botoninicio;
    private javax.swing.JButton botonregistrarse;
    private javax.swing.JLabel inicio1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
