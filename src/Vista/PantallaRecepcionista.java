
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
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

/**
 *
 * @author o.o
 */
public class PantallaRecepcionista extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPaciente
     */
    public PantallaRecepcionista() {
        
       //setUndecorated(true);  
       setLocationRelativeTo(null);
       setIconImage(new ImageIcon(getClass().getResource("/SXP_Logo.png")).getImage());
        initComponents();
        Buscador.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Buscar...");
        Buscador.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        lblFechaActual.setText("Fecha: " + fechaActual());
        BuscarDoctor.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "¿Buscas un doctor en específico?");
        BuscarDoctor.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        BuscareEspe.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "¿Buscas una especialidad en específico?");
        BuscareEspe.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
     
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        puntonoti = new javax.swing.JLabel();
        puntocorreo = new javax.swing.JLabel();
        Correoicon = new javax.swing.JLabel();
        NotificacionIcon = new javax.swing.JLabel();
        Buscador = new javax.swing.JTextField();
        LupaBuscador1 = new javax.swing.JLabel();
        Pantallas = new javax.swing.JTabbedPane();
        pBienvenida2 = new javax.swing.JPanel();
        bgBlanco = new javax.swing.JPanel();
        CalendarioPaciente = new com.toedter.calendar.JCalendar();
        lblFechaActual = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ApuntesPaciente = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
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
        jButton4 = new javax.swing.JButton();
        pPacientes = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        pInfoSistema = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pSolicitudes = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        LupaBuscador2 = new javax.swing.JLabel();
        BuscarDoctor = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        pCitas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtEstado = new javax.swing.JTextField();
        txtNomPaciente = new javax.swing.JTextField();
        txtMotivo = new javax.swing.JTextField();
        txtNombreDoctor = new javax.swing.JTextField();
        txtEspecialidad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pRecordatorios = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        LupaBuscador3 = new javax.swing.JLabel();
        BuscareEspe = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

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
        lblBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
        Menu.add(lblBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 220, 70));

        lblHistorial.setBackground(new java.awt.Color(83, 121, 235));
        lblHistorial.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblHistorial.setForeground(new java.awt.Color(255, 255, 255));
        lblHistorial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHistorial.setIcon(new FlatSVGIcon("Vista/imagenes/personacorazon.svg"));
        lblHistorial.setText("Historial de citas");
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
        Menu.add(lblHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 220, 70));

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
        Menu.add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, 220, 60));

        lblEspecialidades.setBackground(new java.awt.Color(83, 121, 235));
        lblEspecialidades.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblEspecialidades.setForeground(new java.awt.Color(255, 255, 255));
        lblEspecialidades.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEspecialidades.setIcon(new FlatSVGIcon("Vista/imagenes/herramienta.svg"));
        lblEspecialidades.setText("recordatorios");
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
        Menu.add(lblEspecialidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 220, 70));

        lblMisCitas.setBackground(new java.awt.Color(83, 121, 235));
        lblMisCitas.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblMisCitas.setForeground(new java.awt.Color(255, 255, 255));
        lblMisCitas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMisCitas.setIcon(new FlatSVGIcon("Vista/imagenes/calendario.svg"));
        lblMisCitas.setText("citas");
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
        Menu.add(lblMisCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 220, 70));

        lblInformacionSistema.setBackground(new java.awt.Color(83, 121, 235));
        lblInformacionSistema.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblInformacionSistema.setForeground(new java.awt.Color(255, 255, 255));
        lblInformacionSistema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
        Menu.add(lblInformacionSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 220, 60));

        lblDoctores.setBackground(new java.awt.Color(83, 121, 235));
        lblDoctores.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblDoctores.setForeground(new java.awt.Color(255, 255, 255));
        lblDoctores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDoctores.setIcon(new FlatSVGIcon("Vista/imagenes/coracon+.svg"));
        lblDoctores.setText("solicitudes");
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
        Menu.add(lblDoctores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 220, 70));

        lblAyuda.setBackground(new java.awt.Color(83, 121, 235));
        lblAyuda.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblAyuda.setForeground(new java.awt.Color(255, 255, 255));
        lblAyuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAyuda.setIcon(new FlatSVGIcon("Vista/imagenes/ayuda.svg"));
        lblAyuda.setText("pacientes");
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
        Menu.add(lblAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 220, 70));

        bg.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 790));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LupaBuscador.setBackground(new java.awt.Color(204, 204, 204));
        LupaBuscador.setIcon(new FlatSVGIcon("Vista/imagenes/buscar.svg"));
        header.add(LupaBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 40, 40));

        puntonoti.setIcon(new FlatSVGIcon("Vista/imagenes/punto.svg"));
        header.add(puntonoti, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 20, 20, 20));

        puntocorreo.setIcon(new FlatSVGIcon("Vista/imagenes/punto.svg"));
        header.add(puntocorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 20, 20, 20));

        Correoicon.setIcon(new FlatSVGIcon("Vista/imagenes/correo.svg"));
        header.add(Correoicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 20, 40, 40));

        NotificacionIcon.setIcon(new FlatSVGIcon("Vista/imagenes/notificacion.svg"));
        header.add(NotificacionIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 20, 40, 40));

        Buscador.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Buscador.setMargin(new java.awt.Insets(0, 40, 0, 20));
        Buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscadorActionPerformed(evt);
            }
        });
        header.add(Buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 520, 40));

        LupaBuscador1.setBackground(new java.awt.Color(204, 204, 204));
        LupaBuscador1.setIcon(new FlatSVGIcon("Vista/imagenes/buscar.svg"));
        header.add(LupaBuscador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 40, 40));

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 1310, 90));

        pBienvenida2.setBackground(new java.awt.Color(242, 242, 242));
        pBienvenida2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        ApuntesPaciente.setRows(5);
        ApuntesPaciente.setAutoscrolls(false);
        ApuntesPaciente.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jScrollPane3.setViewportView(ApuntesPaciente);

        bgBlanco.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 280, 270));

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

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Holaaa");
        pBienvenida2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 420, 50));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("nombre recepcionista ");
        pBienvenida2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 420, 50));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/fondo.png"))); // NOI18N
        pBienvenida2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 680, 180));

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

        jButton4.setBackground(new java.awt.Color(83, 121, 235));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new FlatSVGIcon("Vista/imagenes/añadircreo.svg"));
        jButton4.setText("Agendar ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        pHistorial.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 60, 180, 40));

        Pantallas.addTab("tab7", pHistorial);

        pPacientes.setBackground(new java.awt.Color(242, 242, 242));
        pPacientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(jTable6);

        pPacientes.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 1060, -1));

        jButton6.setText("agregar");
        pPacientes.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 200, 50));

        jButton7.setText("actualizar");
        pPacientes.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 200, 50));

        jButton8.setText("eliminar");
        pPacientes.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 200, 50));

        Pantallas.addTab("tab6", pPacientes);

        pInfoSistema.setBackground(new java.awt.Color(51, 204, 255));
        pInfoSistema.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sistema");
        pInfoSistema.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 430, 200));

        Pantallas.addTab("tab6", pInfoSistema);

        pSolicitudes.setBackground(new java.awt.Color(242, 242, 242));
        pSolicitudes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        pSolicitudes.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 560, 520));

        LupaBuscador2.setBackground(new java.awt.Color(204, 204, 204));
        LupaBuscador2.setIcon(new FlatSVGIcon("Vista/imagenes/buscar.svg"));
        pSolicitudes.add(LupaBuscador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 50, 50));

        BuscarDoctor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        BuscarDoctor.setMargin(new java.awt.Insets(0, 40, 0, 20));
        BuscarDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarDoctorActionPerformed(evt);
            }
        });
        pSolicitudes.add(BuscarDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 340, 50));

        jButton2.setBackground(new java.awt.Color(83, 121, 235));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new FlatSVGIcon("Vista/imagenes/añadircreo.svg"));
        jButton2.setText("Aceptar solicitud");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        pSolicitudes.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 110, 180, 40));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane9.setViewportView(jTextArea2);

        pSolicitudes.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 240, 420, 460));
        pSolicitudes.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 180, 50));

        jLabel4.setText("Motivo ");
        pSolicitudes.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 210, -1, -1));

        Pantallas.addTab("tab6", pSolicitudes);

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

        jButton1.setBackground(new java.awt.Color(83, 121, 235));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new FlatSVGIcon("Vista/imagenes/añadircreo.svg"));
        jButton1.setText("Agendar cita");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pCitas.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 210, 220, 60));

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

        pRecordatorios.setBackground(new java.awt.Color(242, 242, 242));
        pRecordatorios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        pRecordatorios.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 980, 460));

        LupaBuscador3.setBackground(new java.awt.Color(204, 204, 204));
        LupaBuscador3.setIcon(new FlatSVGIcon("Vista/imagenes/buscar.svg"));
        pRecordatorios.add(LupaBuscador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 40, 50));

        BuscareEspe.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        BuscareEspe.setMargin(new java.awt.Insets(0, 40, 0, 20));
        BuscareEspe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscareEspeActionPerformed(evt);
            }
        });
        pRecordatorios.add(BuscareEspe, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 420, 50));

        jButton5.setText("enviar recordatorio");
        pRecordatorios.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, 240, 60));

        Pantallas.addTab("tab6", pRecordatorios);

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
        Pantallas.setSelectedIndex(6);
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
        Pantallas.setSelectedIndex(3);
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BuscareEspeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscareEspeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscareEspeActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

  
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
            new PantallaRecepcionista().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ApuntesPaciente;
    private javax.swing.JTextField Buscador;
    private javax.swing.JTextField BuscarDoctor;
    private javax.swing.JTextField BuscareEspe;
    private com.toedter.calendar.JCalendar CalendarioPaciente;
    private javax.swing.JTabbedPane Citastab;
    private javax.swing.JLabel Correoicon;
    private javax.swing.JLabel LupaBuscador;
    private javax.swing.JLabel LupaBuscador1;
    private javax.swing.JLabel LupaBuscador2;
    private javax.swing.JLabel LupaBuscador3;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel NotificacionIcon;
    private javax.swing.JTabbedPane Pantallas;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bgBlanco;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lblAyuda;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblDoctores;
    private javax.swing.JLabel lblEspecialidades;
    private javax.swing.JLabel lblFechaActual;
    private javax.swing.JLabel lblHistorial;
    private javax.swing.JLabel lblInformacionSistema;
    private javax.swing.JLabel lblMisCitas;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JPanel pBienvenida2;
    private javax.swing.JPanel pCanceladas;
    private javax.swing.JPanel pCitas;
    private javax.swing.JPanel pHistoCompleto;
    private javax.swing.JPanel pHistorial;
    private javax.swing.JPanel pInfoSistema;
    private javax.swing.JPanel pPacientes;
    private javax.swing.JPanel pPendientes;
    private javax.swing.JPanel pRecordatorios;
    private javax.swing.JPanel pReprogramadas;
    private javax.swing.JPanel pSolicitudes;
    private javax.swing.JLabel puntocorreo;
    private javax.swing.JLabel puntonoti;
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
