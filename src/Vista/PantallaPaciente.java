
package Vista;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Color;
import java.awt.Insets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author o.o
 */
public class PantallaPaciente extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPaciente
     */
    public PantallaPaciente() {
        
       setIconImage(new ImageIcon(getClass().getResource("/SXP_Logo.png")).getImage());  
       setLocationRelativeTo(null);

        initComponents();
        Buscador.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Buscar...");
        Buscador.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        lblFechaActual.setText("Fecha: " + fechaActual());
        BuscarDoctor.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "¿Buscas un doctor en específico?");
        BuscarDoctor.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        BuscareEspe.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "¿Buscas una especialidad en específico?");
        BuscareEspe.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        
        lblBienvenida.setBorder(new EmptyBorder(10,30,10,10));
        lblMisCitas.setBorder(new EmptyBorder(10,30,10,10));
        lblHistorial.setBorder(new EmptyBorder(10,30,10,10));
        lblEspecialidades.setBorder(new EmptyBorder(10,30,10,10));
        lblDoctores.setBorder(new EmptyBorder(10,30,10,10));
        lblAyuda.setBorder(new EmptyBorder(10,30,10,10));
        lblInformacionSistema.setBorder(new EmptyBorder(10,30,10,10));
        lblSalir.setBorder(new EmptyBorder(10,30,10,10));
                 
               
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FormularioCita = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel26 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        botonAgendar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        Confirmacion = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        botonOk = new javax.swing.JButton();
        Cancelar = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        icono = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        abandonar = new javax.swing.JButton();
        continuar = new javax.swing.JButton();
        EditarPerfil = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Editar1 = new javax.swing.JLabel();
        CodigoEditado = new javax.swing.JTextField();
        boxSeguros = new javax.swing.JComboBox<>();
        BoxTipoSangre = new javax.swing.JComboBox<>();
        PesoEditado = new javax.swing.JTextField();
        NumeroEditado = new javax.swing.JTextField();
        DireccionEditada = new javax.swing.JTextField();
        AlturaEditado = new javax.swing.JTextField();
        GuardarEdicion = new javax.swing.JButton();
        bg = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        lblBienvenida = new javax.swing.JLabel();
        lblHistorial = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        lblEspecialidades = new javax.swing.JLabel();
        lblMisCitas = new javax.swing.JLabel();
        lblInformacionSistema = new javax.swing.JLabel();
        lblDoctores = new javax.swing.JLabel();
        lblAyuda = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        LupaBuscador = new javax.swing.JLabel();
        Buscador = new javax.swing.JTextField();
        LupaBuscador1 = new javax.swing.JLabel();
        avatar = new javax.swing.JLabel();
        puntocorreo = new javax.swing.JLabel();
        Correoicon = new javax.swing.JLabel();
        NotificacionIcon = new javax.swing.JLabel();
        NombrePaciente2 = new javax.swing.JLabel();
        Pantallas = new javax.swing.JTabbedPane();
        pBienvenida2 = new javax.swing.JPanel();
        infoPacienteAzul = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        SexoPaciente = new javax.swing.JLabel();
        EdadPaciente = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PesoPaciente = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        TipodeSangre = new javax.swing.JLabel();
        AlturaPaciente = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        NombrePaciente1 = new javax.swing.JLabel();
        infoPacienteBlanco = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        CedulaPaciente = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        SeguroPaciente = new javax.swing.JLabel();
        CorreoPaciente = new javax.swing.JLabel();
        TelefonoPaciente = new javax.swing.JLabel();
        Editar = new javax.swing.JLabel();
        bgBlanco = new javax.swing.JPanel();
        CalendarioPaciente = new com.toedter.calendar.JCalendar();
        lblFechaActual = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ApuntesPaciente = new javax.swing.JTextArea();
        NombrePaciente = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pHistorial = new javax.swing.JPanel();
        Citastab = new javax.swing.JTabbedPane();
        pHistoCompleto = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tablaCanceladas1 = new javax.swing.JTable();
        pCanceladas = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablaCanceladas = new javax.swing.JTable();
        pPendientes = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        tablaPendiente = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        pReprogramadas = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaReprogramadas = new javax.swing.JTable();
        pAyuda = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane9 = new javax.swing.JScrollPane();
        Correo = new javax.swing.JTextArea();
        jLabel39 = new javax.swing.JLabel();
        EnviarCorreo = new javax.swing.JButton();
        Borrar = new javax.swing.JLabel();
        pDoctores = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        LupaBuscador2 = new javax.swing.JLabel();
        BuscarDoctor = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        pCitas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtEstado = new javax.swing.JTextField();
        txtNomPaciente = new javax.swing.JTextField();
        txtMotivo = new javax.swing.JTextField();
        txtNombreDoctor = new javax.swing.JTextField();
        txtEspecialidad = new javax.swing.JTextField();
        botonAgendarCita = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pEspecialidades = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        LupaBuscador3 = new javax.swing.JLabel();
        BuscareEspe = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        pInfoSistema = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();

        FormularioCita.setModal(true);
        FormularioCita.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setBackground(new java.awt.Color(51, 153, 255));
        jLabel21.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Formulario para agendar cita");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 400, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 90));

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setText("Paciente");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jTextField1.setOpaque(false);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 290, 50));

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel24.setText("Hora");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, -1, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 280, 50));

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setText("Fecha");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 60, 50));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 290, 50));

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setText("Doctor");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 150, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 270, 60));

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setText("Motivo");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 270, 50));

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setText("Especialidad");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 290, 50));

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel29.setText("Consultorio");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 630, 120));

        botonAgendar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        botonAgendar.setForeground(new java.awt.Color(255, 255, 255));
        botonAgendar.setText("Agendar Cita");
        botonAgendar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAgendarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAgendarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAgendarMouseExited(evt);
            }
        });
        botonAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgendarActionPerformed(evt);
            }
        });
        jPanel1.add(botonAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 590, 150, 50));

        botonCancelar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        botonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        botonCancelar.setText("Cancelar ");
        botonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCancelarMouseExited(evt);
            }
        });
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 590, 140, 50));

        FormularioCita.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 740));

        Confirmacion.setModal(true);
        Confirmacion.setUndecorated(true);
        Confirmacion.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 5, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new FlatSVGIcon("Vista/imagenes/feliz.svg"));
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 130, 80));

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 102, 102));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Tu cita ha sido programada con éxito.");
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 450, 30));

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 204, 51));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("¡Excelente!");
        jPanel3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 230, 30));

        botonOk.setText("OK");
        botonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOkActionPerformed(evt);
            }
        });
        jPanel3.add(botonOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 70, -1));

        Confirmacion.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 240));

        Cancelar.setModal(true);
        Cancelar.setUndecorated(true);
        Cancelar.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 102), 5, true));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono.setIcon(new FlatSVGIcon("Vista/imagenes/sad.svg"));
        jPanel5.add(icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 130, 80));

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(102, 102, 102));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("¿Estás seguro de que deseas abandonar?");
        jPanel5.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 350, 30));

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 0, 102));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("¡Qué mal!");
        jPanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 230, 30));

        jLabel38.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(102, 102, 102));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Si sales ahora, los datos ingresados se perderán.");
        jPanel5.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 450, 30));

        abandonar.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        abandonar.setForeground(new java.awt.Color(255, 255, 255));
        abandonar.setText("Sí, abandonar");
        abandonar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abandonarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                abandonarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                abandonarMouseExited(evt);
            }
        });
        abandonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abandonarActionPerformed(evt);
            }
        });
        jPanel5.add(abandonar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 110, 30));

        continuar.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        continuar.setForeground(new java.awt.Color(255, 255, 255));
        continuar.setText("No, continuar");
        continuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continuarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                continuarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                continuarMouseExited(evt);
            }
        });
        continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarActionPerformed(evt);
            }
        });
        jPanel5.add(continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 120, 30));

        Cancelar.getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 240));

        EditarPerfil.setMaximumSize(new java.awt.Dimension(487, 437));
        EditarPerfil.setMinimumSize(new java.awt.Dimension(487, 437));
        EditarPerfil.setModal(true);
        EditarPerfil.setPreferredSize(new java.awt.Dimension(487, 437));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Editar Perfil");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 140, 20));

        jLabel1.setBackground(new java.awt.Color(51, 153, 255));
        jLabel1.setOpaque(true);
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, -5, 500, 60));

        Editar1.setIcon(new FlatSVGIcon("Vista/imagenes/lapiz.svg"));
        Editar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Editar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Editar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Editar1MouseExited(evt);
            }
        });
        jPanel4.add(Editar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 40, 40));

        CodigoEditado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoEditadoActionPerformed(evt);
            }
        });
        jPanel4.add(CodigoEditado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 200, 60));

        boxSeguros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar Seguro-", "Senasa", "ARS salud seguros", "Humano Seguros", "Futuro ARS", "ASSPN", "Mapfre Salud", "ADR", "Seguros Reserva", "SEMMA", "ARS Universal", "N/A" }));
        boxSeguros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxSegurosActionPerformed(evt);
            }
        });
        jPanel4.add(boxSeguros, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 190, 60));

        BoxTipoSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Tipo de sangre-", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        BoxTipoSangre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxTipoSangreActionPerformed(evt);
            }
        });
        jPanel4.add(BoxTipoSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 190, 60));
        jPanel4.add(PesoEditado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 200, 60));

        NumeroEditado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroEditadoActionPerformed(evt);
            }
        });
        jPanel4.add(NumeroEditado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 200, 60));

        DireccionEditada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DireccionEditadaActionPerformed(evt);
            }
        });
        jPanel4.add(DireccionEditada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 420, 60));
        jPanel4.add(AlturaEditado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 190, 60));

        GuardarEdicion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        GuardarEdicion.setText("Guardar");
        GuardarEdicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarEdicionActionPerformed(evt);
            }
        });
        jPanel4.add(GuardarEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 140, 50));

        EditarPerfil.getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMaximumSize(new java.awt.Dimension(1350, 785));
        bg.setMinimumSize(new java.awt.Dimension(1350, 785));
        bg.setPreferredSize(new java.awt.Dimension(1350, 785));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(83, 121, 235));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBienvenida.setBackground(new java.awt.Color(83, 121, 235));
        lblBienvenida.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBienvenida.setIcon(new FlatSVGIcon("Vista/imagenes/home.svg"));
        lblBienvenida.setText("Bienvenida");
        lblBienvenida.setToolTipText("");
        lblBienvenida.setOpaque(true);
        lblBienvenida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBienvenidaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBienvenidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBienvenidaMouseExited(evt);
            }
        });
        Menu.add(lblBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 200, 40));

        lblHistorial.setBackground(new java.awt.Color(83, 121, 235));
        lblHistorial.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblHistorial.setForeground(new java.awt.Color(255, 255, 255));
        lblHistorial.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHistorial.setIcon(new FlatSVGIcon("Vista/imagenes/personacorazon.svg"));
        lblHistorial.setText("Historial");
        lblHistorial.setMaximumSize(new java.awt.Dimension(91, 18));
        lblHistorial.setMinimumSize(new java.awt.Dimension(91, 18));
        lblHistorial.setOpaque(true);
        lblHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHistorialMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHistorialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHistorialMouseExited(evt);
            }
        });
        Menu.add(lblHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 200, 40));

        lblSalir.setBackground(new java.awt.Color(83, 121, 235));
        lblSalir.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(255, 255, 255));
        lblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalir.setIcon(new FlatSVGIcon("Vista/imagenes/saliraplicacion.svg"));
        lblSalir.setText("Salir");
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
        Menu.add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 200, 60));

        lblEspecialidades.setBackground(new java.awt.Color(83, 121, 235));
        lblEspecialidades.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblEspecialidades.setForeground(new java.awt.Color(255, 255, 255));
        lblEspecialidades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEspecialidades.setIcon(new FlatSVGIcon("Vista/imagenes/herramienta.svg"));
        lblEspecialidades.setText("Especialidades");
        lblEspecialidades.setOpaque(true);
        lblEspecialidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEspecialidadesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEspecialidadesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEspecialidadesMouseExited(evt);
            }
        });
        Menu.add(lblEspecialidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 40));

        lblMisCitas.setBackground(new java.awt.Color(83, 121, 235));
        lblMisCitas.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblMisCitas.setForeground(new java.awt.Color(255, 255, 255));
        lblMisCitas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMisCitas.setIcon(new FlatSVGIcon("Vista/imagenes/calendario.svg"));
        lblMisCitas.setText("Mis citas");
        lblMisCitas.setOpaque(true);
        lblMisCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMisCitasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMisCitasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMisCitasMouseExited(evt);
            }
        });
        Menu.add(lblMisCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 200, 40));

        lblInformacionSistema.setBackground(new java.awt.Color(83, 121, 235));
        lblInformacionSistema.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblInformacionSistema.setForeground(new java.awt.Color(255, 255, 255));
        lblInformacionSistema.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblInformacionSistema.setIcon(new FlatSVGIcon("Vista/imagenes/informacion.svg"));
        lblInformacionSistema.setText("Sobre el Sistema");
        lblInformacionSistema.setOpaque(true);
        lblInformacionSistema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInformacionSistemaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInformacionSistemaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInformacionSistemaMouseExited(evt);
            }
        });
        Menu.add(lblInformacionSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 200, 40));

        lblDoctores.setBackground(new java.awt.Color(83, 121, 235));
        lblDoctores.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblDoctores.setForeground(new java.awt.Color(255, 255, 255));
        lblDoctores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDoctores.setIcon(new FlatSVGIcon("Vista/imagenes/coracon+.svg"));
        lblDoctores.setText("Doctores");
        lblDoctores.setMaximumSize(new java.awt.Dimension(91, 18));
        lblDoctores.setMinimumSize(new java.awt.Dimension(91, 18));
        lblDoctores.setOpaque(true);
        lblDoctores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDoctoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDoctoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDoctoresMouseExited(evt);
            }
        });
        Menu.add(lblDoctores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 200, 50));

        lblAyuda.setBackground(new java.awt.Color(83, 121, 235));
        lblAyuda.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblAyuda.setForeground(new java.awt.Color(255, 255, 255));
        lblAyuda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAyuda.setIcon(new FlatSVGIcon("Vista/imagenes/ayuda.svg"));
        lblAyuda.setText("Ayuda");
        lblAyuda.setToolTipText("");
        lblAyuda.setOpaque(true);
        lblAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAyudaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAyudaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAyudaMouseExited(evt);
            }
        });
        Menu.add(lblAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 200, 40));

        bg.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 790));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LupaBuscador.setBackground(new java.awt.Color(204, 204, 204));
        LupaBuscador.setIcon(new FlatSVGIcon("Vista/imagenes/buscar.svg"));
        header.add(LupaBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 40, 40));

        Buscador.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Buscador.setMargin(new java.awt.Insets(0, 40, 0, 20));
        Buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscadorActionPerformed(evt);
            }
        });
        header.add(Buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 520, 40));

        LupaBuscador1.setBackground(new java.awt.Color(204, 204, 204));
        LupaBuscador1.setIcon(new FlatSVGIcon("Vista/imagenes/buscar.svg"));
        header.add(LupaBuscador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 40, 40));

        avatar.setIcon(new FlatSVGIcon("Vista/imagenes/paciente.svg"));
        header.add(avatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, 110, 90));

        puntocorreo.setIcon(new FlatSVGIcon("Vista/imagenes/punto.svg"));
        header.add(puntocorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, 20, 20));

        Correoicon.setIcon(new FlatSVGIcon("Vista/imagenes/correo.svg"));
        header.add(Correoicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 40, 50, 40));

        NotificacionIcon.setIcon(new FlatSVGIcon("Vista/imagenes/notificacion.svg"));
        header.add(NotificacionIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 40, 50, 40));

        NombrePaciente2.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        NombrePaciente2.setForeground(new java.awt.Color(102, 102, 102));
        NombrePaciente2.setText("Awilka Jerome Puente");
        header.add(NombrePaciente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 50, 150, -1));

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 1310, 100));

        pBienvenida2.setBackground(new java.awt.Color(242, 242, 242));
        pBienvenida2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        infoPacienteAzul.setBackground(new java.awt.Color(83, 121, 235));
        infoPacienteAzul.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo de Sangre");
        infoPacienteAzul.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 90, -1));

        SexoPaciente.setIcon(new FlatSVGIcon("Vista/imagenes/mujer.svg"));
        infoPacienteAzul.add(SexoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 110, 180));

        EdadPaciente.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        EdadPaciente.setForeground(new java.awt.Color(255, 255, 255));
        EdadPaciente.setText("19 años");
        infoPacienteAzul.add(EdadPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 80, -1));

        jLabel11.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Peso");
        infoPacienteAzul.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 40, -1));

        PesoPaciente.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        PesoPaciente.setForeground(new java.awt.Color(255, 255, 255));
        PesoPaciente.setText("XD");
        infoPacienteAzul.add(PesoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 30, -1));

        jLabel13.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Altura");
        infoPacienteAzul.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 50, -1));

        TipodeSangre.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        TipodeSangre.setForeground(new java.awt.Color(255, 255, 255));
        TipodeSangre.setText("A+");
        infoPacienteAzul.add(TipodeSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 40, -1));

        AlturaPaciente.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        AlturaPaciente.setForeground(new java.awt.Color(255, 255, 255));
        AlturaPaciente.setText("173");
        infoPacienteAzul.add(AlturaPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 30, -1));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        infoPacienteAzul.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 20, 40));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        infoPacienteAzul.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 30, 40));

        NombrePaciente1.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        NombrePaciente1.setForeground(new java.awt.Color(255, 255, 255));
        NombrePaciente1.setText("Awilka Jerome Puente");
        infoPacienteAzul.add(NombrePaciente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 190, -1));

        pBienvenida2.add(infoPacienteAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 290, 180));

        infoPacienteBlanco.setBackground(new java.awt.Color(255, 255, 255));
        infoPacienteBlanco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Cedula");
        infoPacienteBlanco.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 70, -1));

        CedulaPaciente.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        CedulaPaciente.setForeground(new java.awt.Color(102, 102, 102));
        CedulaPaciente.setText("000-000000000-0");
        infoPacienteBlanco.add(CedulaPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 130, -1));

        jLabel18.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Seguro");
        infoPacienteBlanco.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 70, -1));

        jLabel19.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Telefono");
        infoPacienteBlanco.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 70, -1));

        jLabel20.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Correo");
        infoPacienteBlanco.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 70, -1));

        SeguroPaciente.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        SeguroPaciente.setForeground(new java.awt.Color(102, 102, 102));
        SeguroPaciente.setText("ARS Semma");
        infoPacienteBlanco.add(SeguroPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 160, 20));

        CorreoPaciente.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        CorreoPaciente.setForeground(new java.awt.Color(102, 102, 102));
        CorreoPaciente.setText("Ajeromepuente@gmail.com");
        infoPacienteBlanco.add(CorreoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 160, 20));

        TelefonoPaciente.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        TelefonoPaciente.setForeground(new java.awt.Color(102, 102, 102));
        TelefonoPaciente.setText("(829) 555-5555");
        infoPacienteBlanco.add(TelefonoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 160, 20));

        Editar.setIcon(new FlatSVGIcon("Vista/imagenes/lapiz.svg"));
        Editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EditarMouseExited(evt);
            }
        });
        infoPacienteBlanco.add(Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 40, 30));

        pBienvenida2.add(infoPacienteBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 540, 210));

        bgBlanco.setBackground(new java.awt.Color(255, 255, 255));
        bgBlanco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CalendarioPaciente.setBackground(new java.awt.Color(102, 153, 255));
        bgBlanco.add(CalendarioPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 23, 300, 220));

        lblFechaActual.setBackground(new java.awt.Color(83, 121, 235));
        lblFechaActual.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblFechaActual.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaActual.setText("Fecha:");
        lblFechaActual.setOpaque(true);
        bgBlanco.add(lblFechaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 240, 50));

        ApuntesPaciente.setColumns(20);
        ApuntesPaciente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ApuntesPaciente.setLineWrap(true);
        ApuntesPaciente.setRows(5);
        ApuntesPaciente.setAutoscrolls(false);
        ApuntesPaciente.setMargin(new java.awt.Insets(10, 10, 10, 10));
        ApuntesPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApuntesPacienteMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(ApuntesPaciente);

        bgBlanco.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 280, 250));

        NombrePaciente.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        NombrePaciente.setForeground(new java.awt.Color(102, 102, 102));
        NombrePaciente.setText("Mis apuntes");
        bgBlanco.add(NombrePaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 150, -1));

        mensaje.setForeground(new java.awt.Color(255, 51, 102));
        bgBlanco.add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, 260, -1));

        pBienvenida2.add(bgBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 80, 330, 650));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        pBienvenida2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 760, 370));

        Pantallas.addTab("tab6", pBienvenida2);

        pHistorial.setBackground(new java.awt.Color(242, 242, 242));
        pHistorial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pHistoCompleto.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        pHistoCompleto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Tabla Historial completo");
        pHistoCompleto.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 720, 190));

        tablaCanceladas1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane10.setViewportView(tablaCanceladas1);

        pHistoCompleto.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 650));

        Citastab.addTab("Historial Completo", pHistoCompleto);

        pCanceladas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Tabla citas canceladas");
        pCanceladas.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 720, 190));

        tablaCanceladas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(tablaCanceladas);

        pCanceladas.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 650));

        Citastab.addTab("Citas Canceladas", pCanceladas);

        pPendientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Tabla citas pendientes");
        pPendientes.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 720, 190));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaPendiente.setViewportView(jTable5);

        pPendientes.add(tablaPendiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 650));

        Citastab.addTab("Citas Pendientes", pPendientes);

        pReprogramadas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Tabla citas Reprogramadas");
        pReprogramadas.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 720, 190));

        tablaReprogramadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(tablaReprogramadas);

        pReprogramadas.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 640));

        Citastab.addTab("Citas Reprogramadas", pReprogramadas);

        pHistorial.add(Citastab, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 1160, 670));

        Pantallas.addTab("tab7", pHistorial);

        pAyuda.setBackground(new java.awt.Color(242, 242, 242));
        pAyuda.setForeground(new java.awt.Color(102, 102, 102));
        pAyuda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 102, 102));
        jLabel31.setText("¿Necesitas ayuda?");
        pAyuda.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Nuestro equipo de soporte está listo para asistirte.");
        pAyuda.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 510, 70));

        jLabel34.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 102, 102));
        jLabel34.setText("Si tienes alguna pregunta o encuentras algún problema");
        pAyuda.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 510, 70));

        jLabel35.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 102, 102));
        jLabel35.setText("no dudes en escribirnos.");
        pAyuda.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 510, 70));
        pAyuda.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 340, -1));

        Correo.setColumns(20);
        Correo.setLineWrap(true);
        Correo.setRows(5);
        jScrollPane9.setViewportView(Correo);

        pAyuda.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 520, 260));

        jLabel39.setIcon(new FlatSVGIcon("Vista/imagenes/pregunta.svg"));
        pAyuda.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 180, 540, 560));

        EnviarCorreo.setBackground(new java.awt.Color(51, 153, 255));
        EnviarCorreo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        EnviarCorreo.setForeground(new java.awt.Color(255, 255, 255));
        EnviarCorreo.setText("Enviar");
        EnviarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarCorreoActionPerformed(evt);
            }
        });
        pAyuda.add(EnviarCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 650, 100, 30));

        Borrar.setIcon(new FlatSVGIcon("Vista/imagenes/b.svg"));
        Borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BorrarMouseClicked(evt);
            }
        });
        pAyuda.add(Borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 640, 50, 50));

        Pantallas.addTab("tab6", pAyuda);

        pDoctores.setBackground(new java.awt.Color(242, 242, 242));
        pDoctores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        pDoctores.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 1020, 520));

        LupaBuscador2.setBackground(new java.awt.Color(204, 204, 204));
        LupaBuscador2.setIcon(new FlatSVGIcon("Vista/imagenes/buscar.svg"));
        pDoctores.add(LupaBuscador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 50, 50));

        BuscarDoctor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        BuscarDoctor.setMargin(new java.awt.Insets(0, 40, 0, 20));
        BuscarDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarDoctorActionPerformed(evt);
            }
        });
        pDoctores.add(BuscarDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 340, 50));

        jButton2.setBackground(new java.awt.Color(83, 121, 235));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new FlatSVGIcon("Vista/imagenes/añadircreo.svg"));
        jButton2.setText("Agendar ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        pDoctores.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 120, 180, 40));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar por Especialidad", "Item 2", "Item 3", "Item 4" }));
        pDoctores.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 300, 50));

        Pantallas.addTab("tab6", pDoctores);

        pCitas.setBackground(new java.awt.Color(242, 242, 242));
        pCitas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        pCitas.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 311, 1000, 400));

        txtEstado.setEditable(false);
        txtEstado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtEstado.setForeground(new java.awt.Color(51, 51, 51));
        txtEstado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pCitas.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 110, 160, 50));

        txtNomPaciente.setEditable(false);
        txtNomPaciente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNomPaciente.setForeground(new java.awt.Color(51, 51, 51));
        txtNomPaciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pCitas.add(txtNomPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 290, 50));

        txtMotivo.setEditable(false);
        txtMotivo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtMotivo.setForeground(new java.awt.Color(51, 51, 51));
        txtMotivo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pCitas.add(txtMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 290, 50));

        txtNombreDoctor.setEditable(false);
        txtNombreDoctor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNombreDoctor.setForeground(new java.awt.Color(51, 51, 51));
        txtNombreDoctor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pCitas.add(txtNombreDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 290, 50));

        txtEspecialidad.setEditable(false);
        txtEspecialidad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtEspecialidad.setForeground(new java.awt.Color(51, 51, 51));
        txtEspecialidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pCitas.add(txtEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 290, 50));

        botonAgendarCita.setBackground(new java.awt.Color(83, 121, 235));
        botonAgendarCita.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonAgendarCita.setForeground(new java.awt.Color(255, 255, 255));
        botonAgendarCita.setIcon(new FlatSVGIcon("Vista/imagenes/añadircreo.svg"));
        botonAgendarCita.setText("Agendar cita");
        botonAgendarCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAgendarCitaMouseClicked(evt);
            }
        });
        botonAgendarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgendarCitaActionPerformed(evt);
            }
        });
        pCitas.add(botonAgendarCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 210, 220, 60));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Estado de la consulta");
        pCitas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 90, 140, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Nombre Paciente");
        pCitas.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Motivo de la consulta");
        pCitas.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 140, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Nombre del Doctor");
        pCitas.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 140, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Especialidad ");
        pCitas.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 140, -1));

        Pantallas.addTab("tab6", pCitas);

        pEspecialidades.setBackground(new java.awt.Color(242, 242, 242));
        pEspecialidades.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable4);

        pEspecialidades.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 980, 460));

        LupaBuscador3.setBackground(new java.awt.Color(204, 204, 204));
        LupaBuscador3.setIcon(new FlatSVGIcon("Vista/imagenes/buscar.svg"));
        pEspecialidades.add(LupaBuscador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 40, 50));

        BuscareEspe.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        BuscareEspe.setMargin(new java.awt.Insets(0, 40, 0, 20));
        BuscareEspe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscareEspeActionPerformed(evt);
            }
        });
        pEspecialidades.add(BuscareEspe, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 420, 50));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane6.setViewportView(jTextArea1);

        pEspecialidades.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 500, 100));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Descripcion ");
        pEspecialidades.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, 190, -1));

        Pantallas.addTab("tab6", pEspecialidades);

        pInfoSistema.setBackground(new java.awt.Color(242, 242, 242));
        pInfoSistema.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Acerca del Sistema: Salud Xpert");
        pInfoSistema.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 400, 90));
        pInfoSistema.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 390, -1));

        jLabel40.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(102, 102, 102));
        jLabel40.setText("Descripción:");
        pInfoSistema.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 340, 60));

        jLabel41.setForeground(new java.awt.Color(153, 153, 153));
        jLabel41.setText("Versión: 1.0");
        pInfoSistema.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 120, 40));

        jLabel42.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(102, 102, 102));
        jLabel42.setText("Fecha de creación: 28 de noviembre de 2024");
        pInfoSistema.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 340, 60));

        jLabel43.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(102, 102, 102));
        jLabel43.setText("Desarrollado por: J.S.A.B.F Technology");
        pInfoSistema.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 340, 60));

        jLabel44.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(102, 102, 102));
        jLabel44.setText("Salud Xpert es un sistema de gestión de citas médicas");
        pInfoSistema.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 420, 60));

        jLabel45.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(102, 102, 102));
        jLabel45.setText("diseñado para optimizar el tiempo de los doctores");
        pInfoSistema.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 340, 60));

        jLabel46.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(102, 102, 102));
        jLabel46.setText("y mejorar la experiencia de los pacientes.");
        pInfoSistema.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 340, 60));

        jLabel47.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(102, 102, 102));
        jLabel47.setText("Desarrollado por: J.S.A.B.F Technology");
        pInfoSistema.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 340, 60));

        jLabel48.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(102, 102, 102));
        jLabel48.setText("Gestión dinámica de citas con sobreventa de turnos.");
        pInfoSistema.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 420, 60));

        jLabel49.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(102, 102, 102));
        jLabel49.setText("Actualización en tiempo real del estado de las citas.");
        pInfoSistema.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 340, 60));

        jLabel50.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(102, 102, 102));
        jLabel50.setText("seguridad y una experiencia intuitiva para los usuarios.");
        pInfoSistema.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 600, 580, 60));

        jLabel51.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(102, 102, 102));
        jLabel51.setText("Desarrollado en Java, Java Swing y MySQL, Salud Xpert garantiza eficiencia");
        pInfoSistema.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, 580, 60));

        Pantallas.addTab("tab6", pInfoSistema);

        bg.add(Pantallas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 785));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 785));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBienvenidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBienvenidaMouseClicked
        Pantallas.setSelectedIndex(0);
    }//GEN-LAST:event_lblBienvenidaMouseClicked

    private void lblBienvenidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBienvenidaMouseEntered
        lblBienvenida.setBackground(new Color(42,72,161));
         

    }//GEN-LAST:event_lblBienvenidaMouseEntered

    private void lblBienvenidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBienvenidaMouseExited
        lblBienvenida.setBackground(new Color(83,121,235));
    }//GEN-LAST:event_lblBienvenidaMouseExited

    private void lblHistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHistorialMouseClicked
        Pantallas.setSelectedIndex(1);
    }//GEN-LAST:event_lblHistorialMouseClicked

    private void lblHistorialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHistorialMouseEntered
        lblHistorial.setBackground(new Color(42,72,161));
    }//GEN-LAST:event_lblHistorialMouseEntered

    private void lblHistorialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHistorialMouseExited
        lblHistorial.setBackground(new Color(83,121,235));
    }//GEN-LAST:event_lblHistorialMouseExited

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        lblSalir.setBackground(new Color(42,72,161));
        PantallaInicioSesion inicio = new PantallaInicioSesion();
        inicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseEntered
        lblSalir.setBackground(new Color(42,72,161));
    }//GEN-LAST:event_lblSalirMouseEntered

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        lblSalir.setBackground(new Color(83,121,235));
    }//GEN-LAST:event_lblSalirMouseExited

    private void lblEspecialidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEspecialidadesMouseClicked
        Pantallas.setSelectedIndex(3);
    }//GEN-LAST:event_lblEspecialidadesMouseClicked

    private void lblEspecialidadesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEspecialidadesMouseEntered
        lblEspecialidades.setBackground(new Color(42,72,161));
    }//GEN-LAST:event_lblEspecialidadesMouseEntered

    private void lblEspecialidadesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEspecialidadesMouseExited
        lblEspecialidades.setBackground(new Color(83,121,235));
    }//GEN-LAST:event_lblEspecialidadesMouseExited

    private void lblMisCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCitasMouseClicked
        Pantallas.setSelectedIndex(5);
    }//GEN-LAST:event_lblMisCitasMouseClicked

    private void lblMisCitasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCitasMouseEntered
        lblMisCitas.setBackground(new Color(42,72,161));
    }//GEN-LAST:event_lblMisCitasMouseEntered

    private void lblMisCitasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCitasMouseExited
        lblMisCitas.setBackground(new Color(83,121,235));
    }//GEN-LAST:event_lblMisCitasMouseExited

    private void lblInformacionSistemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInformacionSistemaMouseClicked
        Pantallas.setSelectedIndex(6);
    }//GEN-LAST:event_lblInformacionSistemaMouseClicked

    private void lblInformacionSistemaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInformacionSistemaMouseEntered
        lblInformacionSistema.setBackground(new Color(42,72,161));
    }//GEN-LAST:event_lblInformacionSistemaMouseEntered

    private void lblInformacionSistemaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInformacionSistemaMouseExited
        lblInformacionSistema.setBackground(new Color(83,121,235));
    }//GEN-LAST:event_lblInformacionSistemaMouseExited

    private void lblDoctoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDoctoresMouseClicked
       Pantallas.setSelectedIndex(4);
    }//GEN-LAST:event_lblDoctoresMouseClicked

    private void lblDoctoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDoctoresMouseEntered
       lblDoctores.setBackground(new Color(42,72,161));
    }//GEN-LAST:event_lblDoctoresMouseEntered

    private void lblDoctoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDoctoresMouseExited
        lblDoctores.setBackground(new Color(83,121,235));
    }//GEN-LAST:event_lblDoctoresMouseExited

    private void lblAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAyudaMouseClicked
        Pantallas.setSelectedIndex(2);
    }//GEN-LAST:event_lblAyudaMouseClicked

    private void lblAyudaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAyudaMouseEntered
      lblAyuda.setBackground(new Color(42,72,161));
    }//GEN-LAST:event_lblAyudaMouseEntered

    private void lblAyudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAyudaMouseExited
         lblAyuda.setBackground(new Color(83,121,235));
    }//GEN-LAST:event_lblAyudaMouseExited

    private void BuscarDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarDoctorActionPerformed

    private void BuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscadorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botonAgendarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgendarCitaActionPerformed
         FormularioCita.setSize(773, 734);
        FormularioCita.setLocationRelativeTo(null);
        FormularioCita.setVisible(true);
    }//GEN-LAST:event_botonAgendarCitaActionPerformed

    private void BuscareEspeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscareEspeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscareEspeActionPerformed

    private void botonAgendarCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgendarCitaMouseClicked
        FormularioCita.setSize(773, 734);
        FormularioCita.setLocationRelativeTo(null);
        FormularioCita.setVisible(true);
    }//GEN-LAST:event_botonAgendarCitaMouseClicked

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void botonAgendarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgendarMouseEntered
        botonAgendar.setBackground(new Color(0,204,102));
        botonAgendar.setForeground(Color.WHITE);
    }//GEN-LAST:event_botonAgendarMouseEntered

    private void botonAgendarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgendarMouseExited
       botonAgendar.setBackground(Color.WHITE);
       botonAgendar.setForeground(Color.BLACK);
    }//GEN-LAST:event_botonAgendarMouseExited

    private void botonCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarMouseEntered
      botonCancelar.setBackground(new Color(255,51,102));
      botonCancelar.setForeground(Color.WHITE);
    }//GEN-LAST:event_botonCancelarMouseEntered

    private void botonCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarMouseExited
       botonCancelar.setBackground(Color.WHITE);
       botonCancelar.setForeground(Color.BLACK);
    }//GEN-LAST:event_botonCancelarMouseExited

    private void botonAgendarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgendarMouseClicked
        FormularioCita.setVisible(false);
        Confirmacion.setVisible(true);
         Confirmacion.setSize(499, 236);
         Confirmacion.setLocationRelativeTo(null);
    }//GEN-LAST:event_botonAgendarMouseClicked

    private void botonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarMouseClicked
        FormularioCita.setVisible(false);
        Cancelar.setVisible(true);
        Cancelar.setSize(500, 240);
        Cancelar.setLocationRelativeTo(null);
    }//GEN-LAST:event_botonCancelarMouseClicked

    private void botonAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgendarActionPerformed
      FormularioCita.setVisible(false);
      Confirmacion.setSize(500, 240);
         Confirmacion.setLocationRelativeTo(null);
        Confirmacion.setVisible(true);
         
    }//GEN-LAST:event_botonAgendarActionPerformed

    private void botonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOkActionPerformed
              Confirmacion.setVisible(false);
              FormularioCita.setVisible(false);
    }//GEN-LAST:event_botonOkActionPerformed

    private void abandonarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abandonarMouseClicked
      Cancelar.setVisible(false);
      FormularioCita.setVisible(false);
    }//GEN-LAST:event_abandonarMouseClicked

    private void abandonarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abandonarMouseEntered
        abandonar.setBackground(new Color(255,51,102));
      abandonar.setForeground(Color.WHITE);
    }//GEN-LAST:event_abandonarMouseEntered

    private void abandonarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abandonarMouseExited
         abandonar.setBackground(Color.WHITE);
       abandonar.setForeground(Color.BLACK);
    }//GEN-LAST:event_abandonarMouseExited

    private void continuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuarMouseClicked
        
        Cancelar.setVisible(false);
        FormularioCita.setVisible(true);
   
    }//GEN-LAST:event_continuarMouseClicked

    private void continuarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuarMouseEntered
         continuar.setBackground(new Color(0,204,102));
        continuar.setForeground(Color.WHITE);
    }//GEN-LAST:event_continuarMouseEntered

    private void continuarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuarMouseExited
        continuar.setBackground(Color.WHITE);
       continuar.setForeground(Color.BLACK);
    }//GEN-LAST:event_continuarMouseExited

    private void continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarActionPerformed
        Cancelar.setVisible(false);
        FormularioCita.setVisible(true);
    }//GEN-LAST:event_continuarActionPerformed

    private void abandonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abandonarActionPerformed
        Cancelar.setVisible(false);
        FormularioCita.setVisible(false);
    }//GEN-LAST:event_abandonarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
         FormularioCita.setVisible(false);
         Cancelar.setSize(500, 240);
        Cancelar.setLocationRelativeTo(null);
        Cancelar.setVisible(true);
        
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void EditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarMouseEntered
      
    }//GEN-LAST:event_EditarMouseEntered

    private void EditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarMouseExited
        
    }//GEN-LAST:event_EditarMouseExited

    private void EditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarMouseClicked
        EditarPerfil.setSize(461, 510);
        EditarPerfil.setLocationRelativeTo(null);
        EditarPerfil.setVisible(true);
    }//GEN-LAST:event_EditarMouseClicked

    private void Editar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Editar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Editar1MouseClicked

    private void Editar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Editar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Editar1MouseEntered

    private void Editar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Editar1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Editar1MouseExited

    private void CodigoEditadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoEditadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoEditadoActionPerformed

    private void boxSegurosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxSegurosActionPerformed
        if (boxSeguros.getSelectedIndex() == 0) {
            // Mostrar un mensaje de error si se seleccionó el primer item
            JOptionPane.showMessageDialog(null, "¡Debe seleccionar un item válido!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_boxSegurosActionPerformed

    private void BoxTipoSangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxTipoSangreActionPerformed
        if (BoxTipoSangre.getSelectedIndex() == 0) {
            // Mostrar un mensaje de error si se seleccionó el primer item
            JOptionPane.showMessageDialog(null, "¡Debe seleccionar un item válido!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BoxTipoSangreActionPerformed

    private void NumeroEditadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroEditadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumeroEditadoActionPerformed

    private void DireccionEditadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DireccionEditadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DireccionEditadaActionPerformed

    private void GuardarEdicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarEdicionActionPerformed
        JOptionPane.showMessageDialog(null, "Los cambios que realizaste han sido guardados.");
    }//GEN-LAST:event_GuardarEdicionActionPerformed

    private void EnviarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarCorreoActionPerformed
       String contenido = Correo.getText().trim();
        if (contenido.isEmpty()) {
             JOptionPane.showMessageDialog(null, "¡No se puede enviar en blanco!", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
          
             JOptionPane.showMessageDialog(null, "Tu correo ha sido enviado");
        
        }
        
       
    }//GEN-LAST:event_EnviarCorreoActionPerformed

    private void BorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrarMouseClicked
       Correo.setText("");
    }//GEN-LAST:event_BorrarMouseClicked

    private void ApuntesPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApuntesPacienteMouseClicked
       mensaje.setForeground(Color.red);
        mensaje.setText("Lo que escribas aqui se borrara cuando salgas");
       
    }//GEN-LAST:event_ApuntesPacienteMouseClicked

  
     public static String fechaActual() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd / MM / YYYY");

        return formatoFecha.format(fecha);
    }
    public static void main(String args[]) {
       try {
            
          FlatLightLaf.setup();
          UIManager.put("Component.innerFocusWidth", 2);
          //UIManager.put("TextComponent.arc", 999);
           
        } catch (Exception ex) {
            System.err.println("No se pudo cargar el tema FlatLaf MacOS Light.");
            ex.printStackTrace();
        }
       
       UIManager.put("TabbedPane.tabInsets", new Insets(10, 20, 10, 20)); 
        UIManager.put("TabbedPane.tabAreaInsets", new Insets(10, 10, 10, 10));
         
        java.awt.EventQueue.invokeLater(() -> {
            new PantallaPaciente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AlturaEditado;
    private javax.swing.JLabel AlturaPaciente;
    private javax.swing.JTextArea ApuntesPaciente;
    private javax.swing.JLabel Borrar;
    private javax.swing.JComboBox<String> BoxTipoSangre;
    private javax.swing.JTextField Buscador;
    private javax.swing.JTextField BuscarDoctor;
    private javax.swing.JTextField BuscareEspe;
    private com.toedter.calendar.JCalendar CalendarioPaciente;
    private javax.swing.JDialog Cancelar;
    private javax.swing.JLabel CedulaPaciente;
    private javax.swing.JTabbedPane Citastab;
    private javax.swing.JTextField CodigoEditado;
    private javax.swing.JDialog Confirmacion;
    private javax.swing.JTextArea Correo;
    private javax.swing.JLabel CorreoPaciente;
    private javax.swing.JLabel Correoicon;
    private javax.swing.JTextField DireccionEditada;
    private javax.swing.JLabel EdadPaciente;
    private javax.swing.JLabel Editar;
    private javax.swing.JLabel Editar1;
    private javax.swing.JDialog EditarPerfil;
    private javax.swing.JButton EnviarCorreo;
    private javax.swing.JDialog FormularioCita;
    private javax.swing.JButton GuardarEdicion;
    private javax.swing.JLabel LupaBuscador;
    private javax.swing.JLabel LupaBuscador1;
    private javax.swing.JLabel LupaBuscador2;
    private javax.swing.JLabel LupaBuscador3;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel NombrePaciente;
    private javax.swing.JLabel NombrePaciente1;
    private javax.swing.JLabel NombrePaciente2;
    private javax.swing.JLabel NotificacionIcon;
    private javax.swing.JTextField NumeroEditado;
    private javax.swing.JTabbedPane Pantallas;
    private javax.swing.JTextField PesoEditado;
    private javax.swing.JLabel PesoPaciente;
    private javax.swing.JLabel SeguroPaciente;
    private javax.swing.JLabel SexoPaciente;
    private javax.swing.JLabel TelefonoPaciente;
    private javax.swing.JLabel TipodeSangre;
    private javax.swing.JButton abandonar;
    private javax.swing.JLabel avatar;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bgBlanco;
    private javax.swing.JButton botonAgendar;
    private javax.swing.JButton botonAgendarCita;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonOk;
    private javax.swing.JComboBox<String> boxSeguros;
    private javax.swing.JButton continuar;
    private javax.swing.JPanel header;
    private javax.swing.JLabel icono;
    private javax.swing.JPanel infoPacienteAzul;
    private javax.swing.JPanel infoPacienteBlanco;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lblAyuda;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblDoctores;
    private javax.swing.JLabel lblEspecialidades;
    private javax.swing.JLabel lblFechaActual;
    private javax.swing.JLabel lblHistorial;
    private javax.swing.JLabel lblInformacionSistema;
    private javax.swing.JLabel lblMisCitas;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel mensaje;
    private javax.swing.JPanel pAyuda;
    private javax.swing.JPanel pBienvenida2;
    private javax.swing.JPanel pCanceladas;
    private javax.swing.JPanel pCitas;
    private javax.swing.JPanel pDoctores;
    private javax.swing.JPanel pEspecialidades;
    private javax.swing.JPanel pHistoCompleto;
    private javax.swing.JPanel pHistorial;
    private javax.swing.JPanel pInfoSistema;
    private javax.swing.JPanel pPendientes;
    private javax.swing.JPanel pReprogramadas;
    private javax.swing.JLabel puntocorreo;
    private javax.swing.JTable tablaCanceladas;
    private javax.swing.JTable tablaCanceladas1;
    private javax.swing.JScrollPane tablaPendiente;
    private javax.swing.JTable tablaReprogramadas;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtMotivo;
    private javax.swing.JTextField txtNomPaciente;
    private javax.swing.JTextField txtNombreDoctor;
    // End of variables declaration//GEN-END:variables
}
