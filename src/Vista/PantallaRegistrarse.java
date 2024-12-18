package Vista;

import Controlador.ControladorAdmin;
import Controlador.ControladorRegistroPaciente;
import Modelo.Doctores;
import Modelo.AdminDAO;
import Modelo.DatabaseConnection;
import Modelo.Especialidades;
import Modelo.Paciente;
import Modelo.PacienteDAO;
import Modelo.Recepcionista;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import javax.swing.JTextField;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author o.o
 */
public class PantallaRegistrarse extends javax.swing.JFrame {

    private PacienteDAO pacienteModelo;

    /**
     * Creates new form PantallaRegistrarse
     */
    public PantallaRegistrarse() {

        setUndecorated(true);
        setIconImage(new ImageIcon(getClass().getResource("/SXP_Logo.png")).getImage());
        setLocationRelativeTo(null);

        initComponents();

        cmbListaEnfermedades.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        cmbListaEnfermedades.addListSelectionListener((ListSelectionEvent e) -> {
            if (!e.getValueIsAdjusting()) {
                
                java.util.List<String> seleccionados = cmbListaEnfermedades.getSelectedValuesList();
                System.out.println("Seleccionaste: " + seleccionados);
            }
        });

        {
            txtnombre.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingrese su Nombre");
            txtapellido.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingrese su Apellido");
            txtcorreo.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingrese su Email");
            txttelefono.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingrese su Numero telefonico");
            txtcedula.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingrese su Cedula");
            txtcontraseña.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingrese su contraseña");
            txtpeso.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingrese su peso en libras");
            txtAltura.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingrese su altura en cm");

            txtdireccion.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingrese su Numero direccion");
            txtSeguro.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingrese su seguro");
            txtotrasenfermedades.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Antedecentes medicos");

            txtdireccion.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
            txtSeguro.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);

            txtnombre.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
            txtapellido.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
            txtcorreo.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
            txttelefono.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
            txtcontraseña.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);

            cmbListaEnfermedades.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

//        lblContraseña.putClientProperty("JComponent.roundRect", true);
            txtcontraseña.putClientProperty(FlatClientProperties.STYLE, "showRevealButton:true");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngGenero = new javax.swing.ButtonGroup();
        plBackground = new javax.swing.JPanel();
        lblMensaje1 = new javax.swing.JLabel();
        lblMensaje2 = new javax.swing.JLabel();
        lblMensaje3 = new javax.swing.JLabel();
        lblDoctoresImg = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        eslogan = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        PantallasRegistro = new javax.swing.JTabbedPane();
        pRegristro1 = new javax.swing.JPanel();
        txtAltura = new javax.swing.JTextField();
        lblNombrePantalla = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtcedula = new javax.swing.JTextField();
        lblGenero = new javax.swing.JLabel();
        rbtnFemenino = new javax.swing.JRadioButton();
        rbtnMasculino = new javax.swing.JRadioButton();
        lblMensaje4 = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        botonSiguiente = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JPasswordField();
        txtnombre = new javax.swing.JTextField();
        txtpeso = new javax.swing.JTextField();
        lblMensaje5 = new javax.swing.JLabel();
        btnIniciarSesion1 = new javax.swing.JButton();
        pRegistro2 = new javax.swing.JPanel();
        btnRegistrarse = new javax.swing.JButton();
        txtSeguro = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        cmbseguros = new javax.swing.JComboBox<>();
        txtfechanacimiento = new com.toedter.calendar.JDateChooser();
        cmbtipodesangre = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        cmbListaEnfermedades = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtotrasenfermedades = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        Aviso = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        btngGenero.add(rbtnFemenino);
        btngGenero.add(rbtnMasculino);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(930, 670));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        plBackground.setBackground(new java.awt.Color(255, 255, 255));
        plBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMensaje1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 35)); // NOI18N
        lblMensaje1.setForeground(new java.awt.Color(255, 255, 255));
        lblMensaje1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMensaje1.setText("¡Crea tu cuenta!");
        plBackground.add(lblMensaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, -1, 50));

        lblMensaje2.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        lblMensaje2.setForeground(new java.awt.Color(255, 255, 255));
        lblMensaje2.setText("y organiza citas eficientes");
        plBackground.add(lblMensaje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 520, 270, 50));

        lblMensaje3.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        lblMensaje3.setForeground(new java.awt.Color(255, 255, 255));
        lblMensaje3.setText("desde el primer momento.");
        plBackground.add(lblMensaje3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, 290, 40));

        lblDoctoresImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/doctoresprueb.png"))); // NOI18N
        plBackground.add(lblDoctoresImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 380, 250));

        Logo.setFont(new java.awt.Font("Segoe UI Emoji", 1, 55)); // NOI18N
        Logo.setForeground(new java.awt.Color(255, 255, 255));
        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setText("SaludXpert");
        plBackground.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, -1, 70));

        eslogan.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        eslogan.setForeground(new java.awt.Color(255, 255, 255));
        eslogan.setText("Citas rápidas, salud eficiente. ");
        plBackground.add(eslogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, -1, 70));

        lblSalir.setBackground(new java.awt.Color(164, 112, 231));
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
        plBackground.add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 60, 50));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/fondo2.png"))); // NOI18N
        Fondo.setMaximumSize(new java.awt.Dimension(410, 670));
        Fondo.setMinimumSize(new java.awt.Dimension(410, 670));
        Fondo.setPreferredSize(new java.awt.Dimension(410, 670));
        plBackground.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 410, 680));

        pRegristro1.setBackground(new java.awt.Color(255, 255, 255));
        pRegristro1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pRegristro1.add(txtAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 220, 60));

        lblNombrePantalla.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        lblNombrePantalla.setForeground(new java.awt.Color(83, 121, 235));
        lblNombrePantalla.setText("Regístrate");
        pRegristro1.add(lblNombrePantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 190, 60));
        pRegristro1.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 210, 60));
        pRegristro1.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 450, 60));
        pRegristro1.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 210, 60));
        pRegristro1.add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 210, 60));

        lblGenero.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(102, 102, 102));
        lblGenero.setText("Género");
        pRegristro1.add(lblGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 120, 30));

        rbtnFemenino.setBackground(new java.awt.Color(255, 255, 255));
        rbtnFemenino.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        rbtnFemenino.setForeground(new java.awt.Color(102, 102, 102));
        rbtnFemenino.setText("Femenino");
        rbtnFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnFemeninoActionPerformed(evt);
            }
        });
        pRegristro1.add(rbtnFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 90, 40));

        rbtnMasculino.setBackground(new java.awt.Color(255, 255, 255));
        rbtnMasculino.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        rbtnMasculino.setForeground(new java.awt.Color(102, 102, 102));
        rbtnMasculino.setText("Masculino");
        rbtnMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMasculinoActionPerformed(evt);
            }
        });
        pRegristro1.add(rbtnMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, -1, 40));

        lblMensaje4.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lblMensaje4.setForeground(new java.awt.Color(153, 153, 153));
        lblMensaje4.setText("¿Ya tienes una cuenta? ");
        pRegristro1.add(lblMensaje4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 570, -1, 20));

        btnIniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(59, 105, 240));
        btnIniciarSesion.setText(" Iniciar sesión");
        btnIniciarSesion.setBorder(null);
        btnIniciarSesion.setBorderPainted(false);
        btnIniciarSesion.setContentAreaFilled(false);
        btnIniciarSesion.setFocusable(false);
        btnIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseExited(evt);
            }
        });
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        pRegristro1.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, 80, 40));

        botonSiguiente.setText("Siguiente");
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });
        pRegristro1.add(botonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 560, 110, 30));

        jLabel6.setText("1/2");
        pRegristro1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        pRegristro1.add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 210, 60));
        pRegristro1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 210, 60));
        pRegristro1.add(txtpeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 200, 60));

        lblMensaje5.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lblMensaje5.setForeground(new java.awt.Color(153, 153, 153));
        lblMensaje5.setText("¿Ya tienes una cuenta? ");
        pRegristro1.add(lblMensaje5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 570, -1, 20));

        btnIniciarSesion1.setBackground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnIniciarSesion1.setForeground(new java.awt.Color(59, 105, 240));
        btnIniciarSesion1.setText(" Iniciar sesión");
        btnIniciarSesion1.setBorder(null);
        btnIniciarSesion1.setBorderPainted(false);
        btnIniciarSesion1.setContentAreaFilled(false);
        btnIniciarSesion1.setFocusable(false);
        btnIniciarSesion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIniciarSesion1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIniciarSesion1MouseExited(evt);
            }
        });
        btnIniciarSesion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesion1ActionPerformed(evt);
            }
        });
        pRegristro1.add(btnIniciarSesion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, 80, 40));

        PantallasRegistro.addTab("tab1", pRegristro1);

        pRegistro2.setBackground(new java.awt.Color(255, 255, 255));
        pRegistro2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrarse.setBackground(new java.awt.Color(204, 51, 255));
        btnRegistrarse.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.setBorder(null);
        btnRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarseMouseExited(evt);
            }
        });
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        pRegistro2.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 570, 190, 60));
        pRegistro2.add(txtSeguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 230, 60));

        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });
        pRegistro2.add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 450, 60));

        cmbseguros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar Seguro-", "Senasa", "ARS salud seguros", "Humano Seguros", "Futuro ARS", "ASSPN", "Mapfre Salud", "ADR", "Seguros Reserva", "SEMMA", "ARS Universal", "N/A" }));
        cmbseguros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsegurosActionPerformed(evt);
            }
        });
        pRegistro2.add(cmbseguros, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 190, 60));
        pRegistro2.add(txtfechanacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 220, 50));

        cmbtipodesangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Tipo de sangre-", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        cmbtipodesangre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbtipodesangreActionPerformed(evt);
            }
        });
        pRegistro2.add(cmbtipodesangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 190, 50));

        cmbListaEnfermedades.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Resfriado Comun", "Hipertension", "Diabetes tipo 2", "Enfermedad Cardiovascular", "Insuficienci Cardiaca", "Asma", "Artritis", "Cancer", "Gastritis", "Calculos Renales ", "Infecciones del tracto urinario", "Enfermedad pulmonar obstructiva cronica", "Osteoporosis", "Neumonia", "Cataratas", "Migraña", "Hernia discal", "Migraña", "Hepatitis ", "Sindrome de intestino irritable" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(cmbListaEnfermedades);

        pRegistro2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 250, 160));

        txtotrasenfermedades.setColumns(20);
        txtotrasenfermedades.setLineWrap(true);
        txtotrasenfermedades.setRows(5);
        jScrollPane2.setViewportView(txtotrasenfermedades);

        pRegistro2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 210, 160));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        pRegistro2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        pRegistro2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 130, 40));

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        pRegistro2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 130, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Fecha de nacimiento ");
        pRegistro2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        Aviso.setText("Si lo que buscas no está en la lista, por favor indícalo en el siguiente cuadro.");
        pRegistro2.add(Aviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 460, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Antecedentes Médicos");
        pRegistro2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 319, -1, 30));

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });
        pRegistro2.add(botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 594, 100, 30));

        jLabel1.setText("2/2");
        pRegistro2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        PantallasRegistro.addTab("tab2", pRegistro2);

        plBackground.add(PantallasRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 530, 700));

        getContentPane().add(plBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 930, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed

        PantallaInicioSesion inicio = new PantallaInicioSesion();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        Paciente paciente = new Paciente();
        PacienteDAO pacienteDAO = new PacienteDAO();

        ControladorRegistroPaciente controlador = new ControladorRegistroPaciente(pacienteDAO);

        Date fechaSeleccionada = txtfechanacimiento.getDate();

        String nombre = txtnombre.getText();
        String apellido = txtapellido.getText();
        String correo = txtcorreo.getText().trim();
        String numeroTelefono = txttelefono.getText().trim();
        String cedula = txtcedula.getText().trim();
        String contraseña = txtcontraseña.getText().trim();
        String nombreSeguro = (String) cmbseguros.getSelectedItem();
        String enfermedades = (String) cmbListaEnfermedades.getSelectedValue();
        String antecedentesMedicos = txtotrasenfermedades.getText().trim();
        String tipoSangre = (String) cmbtipodesangre.getSelectedItem();
        String fechaNacimiento = (fechaSeleccionada != null)
                ? new SimpleDateFormat("yyyy-MM-dd").format(fechaSeleccionada)
                : null;
        String genero = rbtnFemenino.isSelected() ? "Femenino" : "Masculino";
        double peso = Double.parseDouble(txtpeso.getText());
        int estatura = Integer.parseInt(txtAltura.getText());
        String direccion = txtdireccion.getText().trim();

        if (!controlador.validarCampos(nombre, apellido, correo, numeroTelefono, cedula, contraseña, genero)) {
            return; 
        }
        String contraseñaEncriptada = BCrypt.hashpw(contraseña, BCrypt.gensalt());

        paciente.setNombre(nombre);
        paciente.setApellido(apellido);
        paciente.setCorreo(correo);
        paciente.setNumeroTelefono(numeroTelefono);
        paciente.setCedula(cedula);
        paciente.setContraseña(contraseñaEncriptada);
        paciente.setNombreSeguro(nombreSeguro);
        paciente.setEnfermedades(enfermedades);
        paciente.setAntecedentesMedicos(antecedentesMedicos);
        paciente.setTipoSangre(tipoSangre);
        paciente.setFechaNacimiento(fechaNacimiento);
        paciente.setGenero(genero);
        paciente.setPeso(peso);
        paciente.setEstatura(estatura);
        paciente.setDireccionFisica(direccion);

        controlador.guardarPaciente(paciente);
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void rbtnFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnFemeninoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnFemeninoActionPerformed

    private void btnIniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseEntered
        btnIniciarSesion.setForeground(new Color(0, 0, 153));
    }//GEN-LAST:event_btnIniciarSesionMouseEntered

    private void btnIniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseExited
        btnIniciarSesion.setForeground(new Color(59, 105, 240));
    }//GEN-LAST:event_btnIniciarSesionMouseExited

    private void btnRegistrarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarseMouseExited
        btnRegistrarse.setBackground(new Color(204, 51, 255));
    }//GEN-LAST:event_btnRegistrarseMouseExited

    private void btnRegistrarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarseMouseEntered
        btnRegistrarse.setBackground(new Color(153, 0, 153));
    }//GEN-LAST:event_btnRegistrarseMouseEntered

    private void lblSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseEntered
        lblSalir.setBackground(new Color(255, 51, 102));
    }//GEN-LAST:event_lblSalirMouseEntered

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        lblSalir.setBackground(new Color(164, 112, 231));
    }//GEN-LAST:event_lblSalirMouseExited

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblSalirMouseClicked

    private void rbtnMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnMasculinoActionPerformed

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed
        PantallasRegistro.setSelectedIndex(1);
    }//GEN-LAST:event_botonSiguienteActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        PantallasRegistro.setSelectedIndex(0);
    }//GEN-LAST:event_botonVolverActionPerformed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void cmbsegurosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsegurosActionPerformed
        if (cmbseguros.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "¡Debe seleccionar un item válido!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmbsegurosActionPerformed

    private void cmbtipodesangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbtipodesangreActionPerformed
        if (cmbtipodesangre.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "¡Debe seleccionar un item válido!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmbtipodesangreActionPerformed

    private void btnIniciarSesion1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesion1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIniciarSesion1MouseEntered

    private void btnIniciarSesion1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesion1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIniciarSesion1MouseExited

    private void btnIniciarSesion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIniciarSesion1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            FlatLightLaf.setup();

            UIManager.put("Component.innerFocusWidth", 2);
        } catch (Exception ex) {
            System.err.println("No se pudo cargar el tema FlatLaf MacOS Light.");
            ex.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaRegistrarse().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Aviso;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Logo;
    private javax.swing.JTabbedPane PantallasRegistro;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JButton botonVolver;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnIniciarSesion1;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.ButtonGroup btngGenero;
    private javax.swing.JList<String> cmbListaEnfermedades;
    private javax.swing.JComboBox<String> cmbseguros;
    private javax.swing.JComboBox<String> cmbtipodesangre;
    private javax.swing.JLabel eslogan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblDoctoresImg;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblMensaje1;
    private javax.swing.JLabel lblMensaje2;
    private javax.swing.JLabel lblMensaje3;
    private javax.swing.JLabel lblMensaje4;
    private javax.swing.JLabel lblMensaje5;
    private javax.swing.JLabel lblNombrePantalla;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JPanel pRegistro2;
    private javax.swing.JPanel pRegristro1;
    private javax.swing.JPanel plBackground;
    private javax.swing.JRadioButton rbtnFemenino;
    private javax.swing.JRadioButton rbtnMasculino;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtSeguro;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdireccion;
    private com.toedter.calendar.JDateChooser txtfechanacimiento;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextArea txtotrasenfermedades;
    private javax.swing.JTextField txtpeso;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
