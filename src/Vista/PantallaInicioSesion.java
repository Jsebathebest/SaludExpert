package Vista;

import Modelo.IniciarSesionDAO;
import Controlador.ControladorUsuario;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import org.mindrot.jbcrypt.BCrypt;

public class PantallaInicioSesion extends javax.swing.JFrame {

    public PantallaInicioSesion() {

        setIconImage(new ImageIcon(getClass().getResource("/SXP_Logo.png")).getImage());
        setUndecorated(true);
        setLocationRelativeTo(null);
        initComponents();

        txtCorreo.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingrese su Email");
        //lblEmail.putClientProperty("JComponent.roundRect", true);
        txtCorreo.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txtContraseña.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingrese su contraseña");
        // lblContraseña.putClientProperty("JComponent.roundRect", true);
        txtContraseña.putClientProperty(FlatClientProperties.STYLE, "showRevealButton:true");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        inicio2 = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        Degradado = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(930, 670));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(930, 670));
        jPanel1.setMinimumSize(new java.awt.Dimension(930, 670));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonregistrarse.setBackground(new java.awt.Color(255, 255, 255));
        botonregistrarse.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        botonregistrarse.setForeground(new java.awt.Color(255, 128, 255));
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
        jPanel1.add(botonregistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 530, 80, 20));

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

        inicio2.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        inicio2.setForeground(new java.awt.Color(83, 121, 235));
        inicio2.setText("Inicia sesión ");
        jPanel1.add(inicio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 320, 60));

        lblSalir.setBackground(new java.awt.Color(255, 255, 255));
        lblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalir.setIcon(new FlatSVGIcon("Vista/imagenes/cerrar.svg"));
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
        jPanel1.add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 50, 40));

        Degradado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/fondo.png"))); // NOI18N
        Degradado.setMaximumSize(new java.awt.Dimension(430, 670));
        Degradado.setMinimumSize(new java.awt.Dimension(430, 670));
        Degradado.setPreferredSize(new java.awt.Dimension(430, 670));
        jPanel1.add(Degradado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 670));

        txtCorreo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(51, 51, 51));
        txtCorreo.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 350, 60));

        txtContraseña.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(51, 51, 51));
        txtContraseña.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 350, 60));

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
        // Código que permite el login y la validación
        IniciarSesionDAO login = new IniciarSesionDAO();
        ControladorUsuario control = new ControladorUsuario();

        String correo = txtCorreo.getText().trim();
        String contraseñaIngresada = txtContraseña.getText().trim();

        // Verificar si el correo existe y obtener la contraseña encriptada
        String contraseñaEncriptada = login.obtenerContraseñaEncriptada(correo);

        if (contraseñaEncriptada == null) {
            // El correo no existe
            JOptionPane.showMessageDialog(this, "El correo ingresado no está registrado.", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (BCrypt.checkpw(contraseñaIngresada, contraseñaEncriptada)) {
            // La contraseña es correcta
            JOptionPane.showMessageDialog(this, "¡Inicio de sesión exitoso!");

            // Redirigir a la pantalla correspondiente según el dominio del correo
            if (correo.endsWith("@doctor.saludxpert.com")) {
                new PantallaDoctores().setVisible(true);
            } else if (correo.endsWith("@recepcionista.saludxpert.com")) {
                new PantallaRecepcionista().setVisible(true);
            } else if (correo.endsWith("@admin.saludxpert.com")) {
                new PantallaAdministrador().setVisible(true);
            } else {
                new PantallaPaciente().setVisible(true);
            }
            this.dispose(); // Cerrar ventana actual
        } else {
            // La contraseña es incorrecta
            JOptionPane.showMessageDialog(this, "Contraseña incorrecta. Intente nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botoninicioActionPerformed

    private void botoninicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoninicioMouseEntered
        botoninicio.setBackground(new Color(0, 102, 204));
    }//GEN-LAST:event_botoninicioMouseEntered

    private void botoninicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoninicioMouseExited
        botoninicio.setBackground(new Color(83, 121, 235));
    }//GEN-LAST:event_botoninicioMouseExited

    private void botonregistrarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonregistrarseMouseEntered
        botonregistrarse.setForeground(new Color(153, 0, 153));
    }//GEN-LAST:event_botonregistrarseMouseEntered

    private void botonregistrarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonregistrarseMouseExited
        botonregistrarse.setForeground(new Color(255, 51, 255));
    }//GEN-LAST:event_botonregistrarseMouseExited

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseEntered
        lblSalir.setBackground(new Color(255, 51, 102));
    }//GEN-LAST:event_lblSalirMouseEntered

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        lblSalir.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_lblSalirMouseExited

    public static void main(String args[]) {
        try {

            FlatLightLaf.setup();
            UIManager.put("Component.innerFocusWidth", 2);
//            UIManager.put("TextComponent.arc", 999);

        } catch (Exception ex) {
            System.err.println("No se pudo cargar el tema FlatLaf MacOS Light.");
            ex.printStackTrace();
        }
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
