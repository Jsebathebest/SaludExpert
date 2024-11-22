package Vista;

import Modelo.IniciarSesionDAO;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;

public class PantallaInicioSesion extends javax.swing.JFrame {
    

    public PantallaInicioSesion() {
        
       setUndecorated(true);  
       setLocationRelativeTo(null);
        initComponents();
        
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botonregistrarse = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        botoninicio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Doctoresimg = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        eslogan = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JTextField();
        inicio2 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JTextField();
        lblSalir = new javax.swing.JLabel();
        Degradado = new javax.swing.JLabel();

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/circulo2.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/circulo2.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(930, 670));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(930, 670));
        jPanel1.setMinimumSize(new java.awt.Dimension(930, 670));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonregistrarse.setBackground(new java.awt.Color(255, 255, 255));
        botonregistrarse.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        botonregistrarse.setForeground(new java.awt.Color(255, 51, 255));
        botonregistrarse.setText("Regístrate");
        botonregistrarse.setBorder(null);
        botonregistrarse.setBorderPainted(false);
        botonregistrarse.setContentAreaFilled(false);
        botonregistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonregistrarseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonregistrarseMouseExited(evt);
            }
        });
        botonregistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonregistrarseActionPerformed(evt);
            }
        });
        jPanel1.add(botonregistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 530, 80, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("¿Aún no tienes una cuenta?  ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 530, -1, 20));

        botoninicio.setBackground(new java.awt.Color(83, 121, 235));
        botoninicio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botoninicio.setForeground(new java.awt.Color(255, 255, 255));
        botoninicio.setText(" Iniciar sesión");
        botoninicio.setBorder(null);
        botoninicio.setBorderPainted(false);
        botoninicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botoninicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botoninicioMouseExited(evt);
            }
        });
        botoninicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoninicioActionPerformed(evt);
            }
        });
        jPanel1.add(botoninicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, 240, 60));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("una atención eficiente.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 230, 40));

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 32)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("¡La salud no espera!");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ingresa ahora para brindar  ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 270, 50));

        Doctoresimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/doctoresprueb.png"))); // NOI18N
        jPanel1.add(Doctoresimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 410, 240));

        Logo.setFont(new java.awt.Font("Segoe UI Emoji", 1, 55)); // NOI18N
        Logo.setForeground(new java.awt.Color(255, 255, 255));
        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setText("SaludXpert");
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 70));

        eslogan.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        eslogan.setForeground(new java.awt.Color(255, 255, 255));
        eslogan.setText("Citas rápidas, salud eficiente. ");
        jPanel1.add(eslogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 70));

        lblContraseña.setBackground(new java.awt.Color(255, 255, 255));
        lblContraseña.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(51, 51, 51));
        lblContraseña.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(83, 121, 235), 4, true), "Contraseña ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(83, 121, 235))); // NOI18N
        lblContraseña.setMargin(new java.awt.Insets(10, 35, 10, 10));
        lblContraseña.setMaximumSize(new java.awt.Dimension(15, 24));
        lblContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblContraseñaFocusLost(evt);
            }
        });
        lblContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblContraseñaMouseClicked(evt);
            }
        });
        lblContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 400, 70));

        inicio2.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        inicio2.setForeground(new java.awt.Color(83, 121, 235));
        inicio2.setText("Inicia sesión ");
        jPanel1.add(inicio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 320, 60));

        lblEmail.setBackground(new java.awt.Color(255, 255, 255));
        lblEmail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(51, 51, 51));
        lblEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(83, 121, 235), 4, true), "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(83, 121, 235))); // NOI18N
        lblEmail.setMargin(new java.awt.Insets(0, 35, 0, 0));
        lblEmail.setMaximumSize(new java.awt.Dimension(15, 24));
        lblEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblEmailFocusLost(evt);
            }
        });
        lblEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEmailMouseClicked(evt);
            }
        });
        lblEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblEmailActionPerformed(evt);
            }
        });
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 400, 70));

        lblSalir.setBackground(new java.awt.Color(255, 255, 255));
        lblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/salirnegro.png"))); // NOI18N
        lblSalir.setOpaque(true);
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSalirMouseExited(evt);
            }
        });
        jPanel1.add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 40, 30));

        Degradado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/fondo.png"))); // NOI18N
        Degradado.setMaximumSize(new java.awt.Dimension(430, 670));
        Degradado.setMinimumSize(new java.awt.Dimension(430, 670));
        Degradado.setPreferredSize(new java.awt.Dimension(430, 670));
        jPanel1.add(Degradado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void botoninicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoninicioActionPerformed

        // codigo que permite el login y la validacion 
        IniciarSesionDAO login = new IniciarSesionDAO();
//        Usuarios u = new Usuarios();
//        login.addActionListener(iniciarSesion);
        String correo = lblEmail.getText();
        String contraseña = lblContraseña.getText();
        login.iniciarSesion(correo, contraseña);

//    botoninicio.addActionListener(e -> {
//    String correo = lblCorreo.getText();
//    String contraseña = lblContraseña.getText();
//
//    // Instnacamos desde la capa modelo a UsuarioDB
//    IniciarSesionDAO usuarioDAO = new IniciarSesionDAO();
    boolean esValido = login.iniciarSesion(correo, contraseña);
//
    if (esValido) {
        JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso.");
        dispose(); 
        
        PantallaPaciente paciente = new PantallaPaciente(); 
        paciente.setVisible(true);
        
        
    } else {
        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
          lblEmail.setText ("");
          lblContraseña.setText ("");
    }
//});
//         try {
//             Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/RecetasElectronicas1?useSSL=false","JSABF","noretiren2024"); 
//            
//            String usuario = Usuario.getText();
//            String contrasena = Contrasena.getText();
//            
//            Statement stm = con.createStatement();
//            
//            //esta es el query SQL p
//            String sql =  " select * from usuario where usuario = '" +usuario+"' and contrasena= '"+contrasena+"'";
//            ResultSet rs = stm.executeQuery(sql);
//            
//            if (rs.next()){
//            // validacion por si el user y el password no son corretos pero si es true que vaya al home page
//            
//            dispose ();
//            Homepage hpage = new Homepage();
//            hpage.show();
//            
//            } else {
//            JOptionPane.showMessageDialog(this, " Usuario o contraseña incorrecto.....");
//            Usuario.setText (" ");
//            Contrasena.setText (" ");
//            
//            }
//            
//            con.close();
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//          
//        }
    }//GEN-LAST:event_botoninicioActionPerformed

    private void lblContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblContraseñaMouseClicked
        TitledBorder border = (TitledBorder) lblContraseña.getBorder(); 
        border.setTitleColor(new Color(0,51,153));
       border.setBorder(BorderFactory.createLineBorder(new Color(0,51,153), 4)); 
        lblContraseña.repaint();
    }//GEN-LAST:event_lblContraseñaMouseClicked

    private void lblContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblContraseñaActionPerformed

    private void lblEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEmailMouseClicked
        TitledBorder border = (TitledBorder) lblEmail.getBorder(); 
        border.setTitleColor(new Color(0,51,153));
       border.setBorder(BorderFactory.createLineBorder(new Color(0,51,153), 4)); 
        lblEmail.repaint();
    }//GEN-LAST:event_lblEmailMouseClicked

    private void lblEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblEmailActionPerformed

    private void lblEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblEmailFocusLost
        TitledBorder border = (TitledBorder) lblEmail.getBorder(); 
        border.setTitleColor(new Color(83,121,235)); 
        border.setBorder(BorderFactory.createLineBorder(new Color(83,121,235), 4)); 
        lblEmail.repaint();
    }//GEN-LAST:event_lblEmailFocusLost

    private void lblContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblContraseñaFocusLost
        TitledBorder border = (TitledBorder) lblContraseña.getBorder(); 
        border.setTitleColor(new Color(83,121,235)); 
        border.setBorder(BorderFactory.createLineBorder(new Color(83,121,235), 4)); 
        lblContraseña.repaint();
    }//GEN-LAST:event_lblContraseñaFocusLost

    private void botoninicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoninicioMouseEntered
        botoninicio.setBackground(new Color(0,102,204));
    }//GEN-LAST:event_botoninicioMouseEntered

    private void botoninicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoninicioMouseExited
         botoninicio.setBackground(new Color(83,121,235));
    }//GEN-LAST:event_botoninicioMouseExited

    private void botonregistrarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonregistrarseMouseEntered
        botonregistrarse.setForeground(new Color(153,0,153));
    }//GEN-LAST:event_botonregistrarseMouseEntered

    private void botonregistrarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonregistrarseMouseExited
        botonregistrarse.setForeground(new Color(255,51,255));
    }//GEN-LAST:event_botonregistrarseMouseExited

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseEntered
        lblSalir.setBackground(new Color(255,51,102));
    }//GEN-LAST:event_lblSalirMouseEntered

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        lblSalir.setBackground(new Color (255,255,255));
    }//GEN-LAST:event_lblSalirMouseExited

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
            java.awt.EventQueue.invokeLater(() -> {
          ;
             new PantallaInicioSesion().setVisible(true);
        });
            }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Degradado;
    private javax.swing.JLabel Doctoresimg;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton botoninicio;
    private javax.swing.JButton botonregistrarse;
    private javax.swing.JLabel eslogan;
    private javax.swing.JLabel inicio2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lblContraseña;
    private javax.swing.JTextField lblEmail;
    private javax.swing.JLabel lblSalir;
    // End of variables declaration//GEN-END:variables
}
