package Vista;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Color;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 * Clase que representa la ventana principal para la gestión de doctores en la aplicación.
 * Esta clase extiende de JFrame y contiene los componentes visuales y la lógica para 
 * interactuar con la interfaz de usuario.
 * 
 */
public class PantallaDoctores extends javax.swing.JFrame {

    /**
     * Crea una nueva instancia de PantallaDoctores e inicializa los componentes de la interfaz.
     * Establece el ícono de la ventana con una imagen ubicada en el directorio del proyecto.
     */
    public PantallaDoctores() {

        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/SXP_Logo.png")).getImage());
        
    }

    /**
     * Este método es llamado automáticamente por el constructor para inicializar el formulario.
     * WARNING: No modifique este código. El contenido de este método es siempre 
     * regenerado por el editor de formularios.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        lblBienvenida = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        lblRecepcionista = new javax.swing.JLabel();
        pHistorialClinico = new javax.swing.JLabel();
        pSistema = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        LupaBuscador = new javax.swing.JLabel();
        puntonoti = new javax.swing.JLabel();
        puntocorreo = new javax.swing.JLabel();
        Correoicon = new javax.swing.JLabel();
        NotificacionIcon = new javax.swing.JLabel();
        Buscador = new javax.swing.JTextField();
        pantallas = new javax.swing.JTabbedPane();
        pBienvenidaD = new javax.swing.JPanel();
        nombreDoctor = new javax.swing.JLabel();
        BienvenidaDoctor = new javax.swing.JLabel();
        fondodoctor = new javax.swing.JLabel();
        bgBlanco = new javax.swing.JPanel();
        CalendarioPaciente = new com.toedter.calendar.JCalendar();
        lblFechaActual = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ApuntesPaciente = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pGestion = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListadoCitas = new javax.swing.JTable();
        plDatosPaciente = new javax.swing.JPanel();
        lblNombrePaciente = new javax.swing.JLabel();
        lblMotivoCita = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAnotaciones = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtHistMedico = new javax.swing.JTextArea();
        lblTipoSangre = new javax.swing.JLabel();
        lblGeneroPaciente = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtEnfermedades = new javax.swing.JTextArea();
        plActEstado = new javax.swing.JPanel();
        lblActEstado = new javax.swing.JLabel();
        pHistorial = new javax.swing.JPanel();
        LupaBuscador1 = new javax.swing.JLabel();
        Buscador1 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        lblNombrePaciente1 = new javax.swing.JLabel();
        lblMotivoCita1 = new javax.swing.JLabel();
        lblTipoSangre1 = new javax.swing.JLabel();
        lblGeneroPaciente1 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtEnfermedades1 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtHistMedico1 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtAnotaciones1 = new javax.swing.JTextArea();
        pInfoSistema = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        Menu.add(lblBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 200, 70));

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
        Menu.add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 200, 60));

        lblRecepcionista.setBackground(new java.awt.Color(83, 121, 235));
        lblRecepcionista.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblRecepcionista.setForeground(new java.awt.Color(255, 255, 255));
        lblRecepcionista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRecepcionista.setIcon(new FlatSVGIcon("Vista/imagenes/compu.svg"));
        lblRecepcionista.setText("Gestion de citas");
        lblRecepcionista.setOpaque(true);
        lblRecepcionista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRecepcionistaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRecepcionistaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRecepcionistaMouseExited(evt);
            }
        });
        Menu.add(lblRecepcionista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 200, 70));

        pHistorialClinico.setBackground(new java.awt.Color(83, 121, 235));
        pHistorialClinico.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        pHistorialClinico.setForeground(new java.awt.Color(255, 255, 255));
        pHistorialClinico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pHistorialClinico.setIcon(new FlatSVGIcon("Vista/imagenes/informacion.svg"));
        pHistorialClinico.setText("Historial");
        pHistorialClinico.setOpaque(true);
        pHistorialClinico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pHistorialClinicoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pHistorialClinicoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pHistorialClinicoMouseExited(evt);
            }
        });
        Menu.add(pHistorialClinico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 200, 60));

        pSistema.setBackground(new java.awt.Color(83, 121, 235));
        pSistema.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        pSistema.setForeground(new java.awt.Color(255, 255, 255));
        pSistema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pSistema.setIcon(new FlatSVGIcon("Vista/imagenes/informacion.svg"));
        pSistema.setText("Sistema");
        pSistema.setOpaque(true);
        pSistema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pSistemaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pSistemaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pSistemaMouseExited(evt);
            }
        });
        Menu.add(pSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 200, 60));

        jPanel1.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 790));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LupaBuscador.setBackground(new java.awt.Color(204, 204, 204));
        LupaBuscador.setIcon(new FlatSVGIcon("Vista/imagenes/buscar.svg"));
        header.add(LupaBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 40, 40));

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
        header.add(Buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 520, 40));

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 1310, 110));

        pBienvenidaD.setBackground(new java.awt.Color(242, 242, 242));
        pBienvenidaD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreDoctor.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        nombreDoctor.setForeground(new java.awt.Color(255, 255, 255));
        nombreDoctor.setText("nombre del doctor");
        pBienvenidaD.add(nombreDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 370, -1));

        BienvenidaDoctor.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        BienvenidaDoctor.setForeground(new java.awt.Color(255, 255, 255));
        BienvenidaDoctor.setText("Bienvenido");
        pBienvenidaD.add(BienvenidaDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        fondodoctor.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        fondodoctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/fondo.png"))); // NOI18N
        fondodoctor.setText("Bienvenida");
        pBienvenidaD.add(fondodoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 640, 200));

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

        pBienvenidaD.add(bgBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, 330, 660));

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

        pBienvenidaD.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 760, 370));

        pantallas.addTab("tab1", pBienvenidaD);

        pGestion.setBackground(new java.awt.Color(242, 242, 242));
        pGestion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Gestion citas");
        pGestion.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 160, 70));

        tblListadoCitas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblListadoCitas);

        pGestion.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 720, 460));

        plDatosPaciente.setBackground(new java.awt.Color(255, 255, 255));
        plDatosPaciente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombrePaciente.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblNombrePaciente.setForeground(new java.awt.Color(83, 121, 235));
        lblNombrePaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombrePaciente.setText("NombrePaciente");
        plDatosPaciente.add(lblNombrePaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 36, 308, 34));

        lblMotivoCita.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblMotivoCita.setForeground(new java.awt.Color(83, 121, 235));
        lblMotivoCita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMotivoCita.setText("Motivo de Cita: ");
        plDatosPaciente.add(lblMotivoCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 82, 308, -1));

        txtAnotaciones.setColumns(20);
        txtAnotaciones.setRows(4);
        txtAnotaciones.setText("Ejemplo Ejemplo Ejemplo");
        txtAnotaciones.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Anotaciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12))); // NOI18N
        jScrollPane4.setViewportView(txtAnotaciones);

        plDatosPaciente.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 370, -1, -1));

        txtHistMedico.setEditable(false);
        txtHistMedico.setColumns(20);
        txtHistMedico.setRows(5);
        txtHistMedico.setText("Ejemplo Ejemplo Ejemplo");
        txtHistMedico.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Historial Medico", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12))); // NOI18N
        txtHistMedico.setFocusable(false);
        txtHistMedico.setRequestFocusEnabled(false);
        jScrollPane5.setViewportView(txtHistMedico);

        plDatosPaciente.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 246, -1, -1));

        lblTipoSangre.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        lblTipoSangre.setForeground(new java.awt.Color(83, 121, 235));
        lblTipoSangre.setText("Tipo de sangre: A+");
        plDatosPaciente.add(lblTipoSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 113, -1, -1));

        lblGeneroPaciente.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        lblGeneroPaciente.setForeground(new java.awt.Color(83, 121, 235));
        lblGeneroPaciente.setText("Genero: M");
        plDatosPaciente.add(lblGeneroPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 113, -1, -1));

        txtEnfermedades.setEditable(false);
        txtEnfermedades.setColumns(20);
        txtEnfermedades.setRows(3);
        txtEnfermedades.setText("Ejemplo Ejemplo Ejemplo ");
        txtEnfermedades.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Enfermedades", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12))); // NOI18N
        txtEnfermedades.setFocusable(false);
        txtEnfermedades.setRequestFocusEnabled(false);
        jScrollPane6.setViewportView(txtEnfermedades);

        plDatosPaciente.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 154, -1, -1));

        plActEstado.setBackground(new java.awt.Color(255, 255, 255));
        plActEstado.setForeground(new java.awt.Color(99, 47, 136));
        plActEstado.setToolTipText("");

        lblActEstado.setBackground(new java.awt.Color(83, 121, 235));
        lblActEstado.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        lblActEstado.setForeground(new java.awt.Color(99, 47, 136));
        lblActEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblActEstado.setText("Actualizar Estado");
        lblActEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblActEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblActEstadoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout plActEstadoLayout = new javax.swing.GroupLayout(plActEstado);
        plActEstado.setLayout(plActEstadoLayout);
        plActEstadoLayout.setHorizontalGroup(
            plActEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plActEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblActEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addContainerGap())
        );
        plActEstadoLayout.setVerticalGroup(
            plActEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plActEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblActEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        plDatosPaciente.add(plActEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 478, 233, -1));

        pGestion.add(plDatosPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 320, 620));

        pantallas.addTab("tab2", pGestion);

        pHistorial.setBackground(new java.awt.Color(242, 242, 242));
        pHistorial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LupaBuscador1.setBackground(new java.awt.Color(204, 204, 204));
        LupaBuscador1.setIcon(new FlatSVGIcon("Vista/imagenes/buscar.svg"));
        pHistorial.add(LupaBuscador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 40, 50));

        Buscador1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Buscador1.setMargin(new java.awt.Insets(0, 40, 0, 20));
        Buscador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscador1ActionPerformed(evt);
            }
        });
        pHistorial.add(Buscador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 440, 50));
        pHistorial.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 200, 50));

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
        jScrollPane7.setViewportView(jTable2);

        pHistorial.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 820, 550));

        lblNombrePaciente1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblNombrePaciente1.setForeground(new java.awt.Color(83, 121, 235));
        lblNombrePaciente1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombrePaciente1.setText("NombrePaciente");
        pHistorial.add(lblNombrePaciente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 80, 308, 34));

        lblMotivoCita1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblMotivoCita1.setForeground(new java.awt.Color(83, 121, 235));
        lblMotivoCita1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMotivoCita1.setText("Motivo de Cita: ");
        pHistorial.add(lblMotivoCita1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 130, 308, -1));

        lblTipoSangre1.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        lblTipoSangre1.setForeground(new java.awt.Color(83, 121, 235));
        lblTipoSangre1.setText("Tipo de sangre: A+");
        pHistorial.add(lblTipoSangre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 160, -1, -1));

        lblGeneroPaciente1.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        lblGeneroPaciente1.setForeground(new java.awt.Color(83, 121, 235));
        lblGeneroPaciente1.setText("Genero: M");
        pHistorial.add(lblGeneroPaciente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 160, -1, -1));

        txtEnfermedades1.setEditable(false);
        txtEnfermedades1.setColumns(20);
        txtEnfermedades1.setRows(3);
        txtEnfermedades1.setText("Ejemplo Ejemplo Ejemplo ");
        txtEnfermedades1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Enfermedades", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12))); // NOI18N
        txtEnfermedades1.setFocusable(false);
        txtEnfermedades1.setRequestFocusEnabled(false);
        jScrollPane8.setViewportView(txtEnfermedades1);

        pHistorial.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 200, -1, -1));

        txtHistMedico1.setEditable(false);
        txtHistMedico1.setColumns(20);
        txtHistMedico1.setRows(5);
        txtHistMedico1.setText("Ejemplo Ejemplo Ejemplo");
        txtHistMedico1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Historial Medico", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12))); // NOI18N
        txtHistMedico1.setFocusable(false);
        txtHistMedico1.setRequestFocusEnabled(false);
        jScrollPane9.setViewportView(txtHistMedico1);

        pHistorial.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 290, -1, -1));

        txtAnotaciones1.setColumns(20);
        txtAnotaciones1.setRows(4);
        txtAnotaciones1.setText("Ejemplo Ejemplo Ejemplo");
        txtAnotaciones1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Anotaciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12))); // NOI18N
        jScrollPane10.setViewportView(txtAnotaciones1);

        pHistorial.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 420, -1, -1));

        pantallas.addTab("tab3", pHistorial);

        pInfoSistema.setBackground(new java.awt.Color(242, 242, 242));
        pInfoSistema.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5.setText("Info Sistema");
        pInfoSistema.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 116, 314, 229));

        pantallas.addTab("tab5", pInfoSistema);

        jPanel1.add(pantallas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 1150, 730));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 780));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBienvenidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBienvenidaMouseClicked
        pantallas.setSelectedIndex(0);
    }//GEN-LAST:event_lblBienvenidaMouseClicked

    private void lblBienvenidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBienvenidaMouseEntered
        lblBienvenida.setBackground(new Color(42,72,161));
    }//GEN-LAST:event_lblBienvenidaMouseEntered

    private void lblBienvenidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBienvenidaMouseExited
        lblBienvenida.setBackground(new Color(83,121,235));
    }//GEN-LAST:event_lblBienvenidaMouseExited

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

    private void lblRecepcionistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRecepcionistaMouseClicked
        pantallas.setSelectedIndex(1);
    }//GEN-LAST:event_lblRecepcionistaMouseClicked

    private void lblRecepcionistaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRecepcionistaMouseEntered
        lblRecepcionista.setBackground(new Color(42,72,161));
    }//GEN-LAST:event_lblRecepcionistaMouseEntered

    private void lblRecepcionistaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRecepcionistaMouseExited
        lblRecepcionista.setBackground(new Color(83,121,235));
    }//GEN-LAST:event_lblRecepcionistaMouseExited

    private void BuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscadorActionPerformed

    private void pHistorialClinicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pHistorialClinicoMouseClicked
        pantallas.setSelectedIndex(2);
    }//GEN-LAST:event_pHistorialClinicoMouseClicked

    private void pHistorialClinicoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pHistorialClinicoMouseEntered
       pHistorialClinico.setBackground(new Color(42,72,161));
    }//GEN-LAST:event_pHistorialClinicoMouseEntered

    private void pHistorialClinicoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pHistorialClinicoMouseExited
         pHistorialClinico.setBackground(new Color(83,121,235));
    }//GEN-LAST:event_pHistorialClinicoMouseExited

    private void pSistemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pSistemaMouseClicked
        pantallas.setSelectedIndex(3);
    }//GEN-LAST:event_pSistemaMouseClicked

    private void pSistemaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pSistemaMouseEntered
       pSistema.setBackground(new Color(42,72,161));
    }//GEN-LAST:event_pSistemaMouseEntered

    private void pSistemaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pSistemaMouseExited
        pSistema.setBackground(new Color(83,121,235));
    }//GEN-LAST:event_pSistemaMouseExited

    private void lblActEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActEstadoMouseClicked
        // TODO add your handling code here:
        // Verificar si hay una fila seleccionada
        int filaSeleccionada = tblListadoCitas.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una cita para actualizar el estado.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //Opciones del cuadro de dialogo
        String[] opciones = {"Pendiente", "En curso", "Finalizado"};

        // Mostrar el diálogo de selección de estado
        String estadoSeleccionado = (String) JOptionPane.showInputDialog(
            this,
            "Seleccione el nuevo estado:",
            "Actualizar Estado",
            JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            opciones[0]
        );

        // Verificar que se haya seleccionado un estado y mostrarlo
        if (estadoSeleccionado != null) {
            // Aquí puedes actualizar el estado en la base de datos o en la tabla
            tblListadoCitas.setValueAt(estadoSeleccionado, filaSeleccionada, 3);
        }
    }//GEN-LAST:event_lblActEstadoMouseClicked

    private void Buscador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Buscador1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaDoctores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ApuntesPaciente;
    private javax.swing.JLabel BienvenidaDoctor;
    private javax.swing.JTextField Buscador;
    private javax.swing.JTextField Buscador1;
    private com.toedter.calendar.JCalendar CalendarioPaciente;
    private javax.swing.JLabel Correoicon;
    private javax.swing.JLabel LupaBuscador;
    private javax.swing.JLabel LupaBuscador1;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel NotificacionIcon;
    private javax.swing.JPanel bgBlanco;
    private javax.swing.JLabel fondodoctor;
    private javax.swing.JPanel header;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JLabel lblActEstado;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblFechaActual;
    private javax.swing.JLabel lblGeneroPaciente;
    private javax.swing.JLabel lblGeneroPaciente1;
    private javax.swing.JLabel lblMotivoCita;
    private javax.swing.JLabel lblMotivoCita1;
    private javax.swing.JLabel lblNombrePaciente;
    private javax.swing.JLabel lblNombrePaciente1;
    private javax.swing.JLabel lblRecepcionista;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblTipoSangre;
    private javax.swing.JLabel lblTipoSangre1;
    private javax.swing.JLabel nombreDoctor;
    private javax.swing.JPanel pBienvenidaD;
    private javax.swing.JPanel pGestion;
    private javax.swing.JPanel pHistorial;
    private javax.swing.JLabel pHistorialClinico;
    private javax.swing.JPanel pInfoSistema;
    private javax.swing.JLabel pSistema;
    private javax.swing.JTabbedPane pantallas;
    private javax.swing.JPanel plActEstado;
    private javax.swing.JPanel plDatosPaciente;
    private javax.swing.JLabel puntocorreo;
    private javax.swing.JLabel puntonoti;
    private javax.swing.JTable tblListadoCitas;
    private javax.swing.JTextArea txtAnotaciones;
    private javax.swing.JTextArea txtAnotaciones1;
    private javax.swing.JTextArea txtEnfermedades;
    private javax.swing.JTextArea txtEnfermedades1;
    private javax.swing.JTextArea txtHistMedico;
    private javax.swing.JTextArea txtHistMedico1;
    // End of variables declaration//GEN-END:variables
}
