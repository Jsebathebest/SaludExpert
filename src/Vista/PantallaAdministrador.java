package Vista;

import Controlador.ControladorAdmin;
import Modelo.Doctores;
import Modelo.AdminDAO;
import Modelo.DatabaseConnection;
import Modelo.Especialidades;
import Modelo.Recepcionista;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.awt.Insets;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import org.mindrot.jbcrypt.BCrypt;

/**
 * Esta clase representa la interfaz gráfica de la pantalla principal del
 * Administrador. Permite la gestión de doctores, recepcionistas y
 * especialidades. Además, inicializa los eventos y componentes de la UI
 * necesarios para la interacción con el sistema.
 */
public class PantallaAdministrador extends javax.swing.JFrame {

    private ControladorAdmin controladorAdmin;
    DatabaseConnection con = new DatabaseConnection();
    Connection cn = con.conectar();

    /**
     * Constructor de la clase PantallaAdministrador. Inicializa los componentes
     * de la interfaz gráfica, los eventos asociados y carga la información de
     * los doctores y recepcionistas.
     */
    public PantallaAdministrador() {
        setIconImage(new ImageIcon(getClass().getResource("/SXP_Logo.png")).getImage());
        setLocationRelativeTo(null);
        initComponents();
        controladorAdmin = new ControladorAdmin(this);
        agregarEventos(controladorAdmin);
        mostrarDatosRecepcionistas();
        // Establece los textos de los campos de entrada como marcadores de posición.
        {
            txtNombreD.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Nombre");
            txtApellidoD.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Apellido");
            txtCorreoD.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Correo");
            txtTelefonoD.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Telefono");
            txtCedulaD.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Cedula");
            txtPasswordD.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Contraseña");
            spfEdadD.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Edad");
            cmbEspecialidad.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Especialidad");

            txtNombreR.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Nombre");
            txtApellidoR.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Apellido");
            txtCorreoR.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Correo");
            txtTelefonoR.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Telefono");
            txtCedulaR.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Cedula");
            txtPasswordR.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Contraseña");
            spfEdadR.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Edad");

            txtNombreE.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Nombre");
            txtDescripcion.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Descripcion");

            txtNombre.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Nombre");
            txtApellido.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Apellido");
            txtCorreo.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Correo");
            txtTelefono.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Telefono");
            txtCedula.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Cedula");
            txtEspecialidad.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Especialidad");

            // Configura los botones de borrar para los campos de texto
            txtNombreD.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
            txtApellidoD.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
            txtCorreoD.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
            txtTelefonoD.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
            txtPasswordD.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
            spfEdadD.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
            cmbEspecialidad.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);

            txtNombreR.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
            txtApellidoR.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
            txtCorreoR.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
            txtTelefonoR.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
            txtTelefonoR.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
            spfEdadR.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);

            txtNombreE.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
            txtDescripcion.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);

            txtNombre.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
            txtApellido.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
            txtCorreo.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
            txtTelefono.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
            txtCedula.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
            txtEspecialidad.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        }
        // Carga las especialidades y muestra los datos de doctores y recepcionistas
        ControladorAdmin.cargarEspecialidades(cmbEspecialidad);
        mostrarDatosDoctores();
        mostrarDatosRecepcionistas();
    }

    /**
     * Este método es llamado dentro del constructor para inicializar los
     * componentes del formulario. ADVERTENCIA: No modifique este código. El
     * contenido de este método siempre será regenerado por el Editor de
     * Formularios de la IDE.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        lblBienvenida = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        lblRegistrar = new javax.swing.JLabel();
        lblInformacion1 = new javax.swing.JLabel();
        plBarraSuperior = new javax.swing.JPanel();
        LupaBuscador = new javax.swing.JLabel();
        Buscador = new javax.swing.JTextField();
        Pantallas = new javax.swing.JTabbedPane();
        pBienvenida = new javax.swing.JPanel();
        tabbeDyR = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaDoctores = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaRecep = new javax.swing.JTable();
        btnActualizarD = new javax.swing.JButton();
        btnEliminarD = new javax.swing.JButton();
        btnCancelarD = new javax.swing.JButton();
        btnEditarD = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtEspecialidad = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnEliminarR = new javax.swing.JButton();
        btnEditarR = new javax.swing.JButton();
        btnActualizarR = new javax.swing.JButton();
        btnCancelarR = new javax.swing.JButton();
        pRegistrar = new javax.swing.JPanel();
        Doctor = new javax.swing.JTabbedPane();
        plDoctor = new javax.swing.JPanel();
        txtNombreD = new javax.swing.JTextField();
        txtCorreoD = new javax.swing.JTextField();
        txtTelefonoD = new javax.swing.JFormattedTextField();
        txtCedulaD = new javax.swing.JTextField();
        txtPasswordD = new javax.swing.JPasswordField();
        lblGenero = new javax.swing.JLabel();
        rbtnFemeninoD = new javax.swing.JRadioButton();
        rbtnMasculinoD = new javax.swing.JRadioButton();
        btnRegistrarD = new javax.swing.JButton();
        lblNombrePantalla = new javax.swing.JLabel();
        txtApellidoD = new javax.swing.JTextField();
        jDateChooserD = new com.toedter.calendar.JDateChooser();
        spfEdadD = new com.toedter.components.JSpinField();
        cmbEspecialidad = new javax.swing.JComboBox<>();
        plRecepcionista = new javax.swing.JPanel();
        lblNombrePantalla1 = new javax.swing.JLabel();
        txtNombreR = new javax.swing.JTextField();
        txtCorreoR = new javax.swing.JTextField();
        txtTelefonoR = new javax.swing.JFormattedTextField();
        txtCedulaR = new javax.swing.JTextField();
        txtApellidoR = new javax.swing.JTextField();
        jDateChooserR = new com.toedter.calendar.JDateChooser();
        spfEdadR = new com.toedter.components.JSpinField();
        lblGenero1 = new javax.swing.JLabel();
        rbtnFemeninoR = new javax.swing.JRadioButton();
        rbtnMasculinoR = new javax.swing.JRadioButton();
        btnRegistrarR = new javax.swing.JButton();
        txtPasswordR = new javax.swing.JPasswordField();
        plEspecialidad = new javax.swing.JPanel();
        btnRegistrarE = new javax.swing.JButton();
        lblNombrePantalla2 = new javax.swing.JLabel();
        txtNombreE = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        pSistema = new javax.swing.JPanel();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(242, 242, 242));
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
        lblBienvenida.setText("Panel Principal");
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
        Menu.add(lblBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 70));

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
        Menu.add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 200, 60));

        lblRegistrar.setBackground(new java.awt.Color(83, 121, 235));
        lblRegistrar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrar.setIcon(new FlatSVGIcon("Vista/imagenes/compu.svg"));
        lblRegistrar.setText("Registro");
        lblRegistrar.setOpaque(true);
        lblRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegistrarMouseExited(evt);
            }
        });
        Menu.add(lblRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 200, 70));

        lblInformacion1.setBackground(new java.awt.Color(83, 121, 235));
        lblInformacion1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblInformacion1.setForeground(new java.awt.Color(255, 255, 255));
        lblInformacion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInformacion1.setIcon(new FlatSVGIcon("Vista/imagenes/informacion.svg"));
        lblInformacion1.setText("Sistema");
        lblInformacion1.setOpaque(true);
        lblInformacion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInformacion1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInformacion1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInformacion1MouseExited(evt);
            }
        });
        Menu.add(lblInformacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 200, 60));

        bg.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 790));

        plBarraSuperior.setBackground(new java.awt.Color(255, 255, 255));
        plBarraSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LupaBuscador.setBackground(new java.awt.Color(204, 204, 204));
        LupaBuscador.setIcon(new FlatSVGIcon("Vista/imagenes/buscar.svg"));
        plBarraSuperior.add(LupaBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, 50));

        Buscador.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Buscador.setMargin(new java.awt.Insets(0, 40, 0, 20));
        Buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscadorActionPerformed(evt);
            }
        });
        plBarraSuperior.add(Buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 520, 50));

        bg.add(plBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1150, 140));

        Pantallas.setBackground(new java.awt.Color(242, 242, 242));
        Pantallas.setMaximumSize(new java.awt.Dimension(1350, 785));
        Pantallas.setMinimumSize(new java.awt.Dimension(1350, 785));
        Pantallas.setPreferredSize(new java.awt.Dimension(1350, 785));

        pBienvenida.setBackground(new java.awt.Color(255, 255, 255));
        pBienvenida.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabbeDyR.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaDoctores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaDoctores.getTableHeader().setReorderingAllowed(false);
        tablaDoctores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDoctoresMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaDoctores);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 660));

        tabbeDyR.addTab("Ver Doctores", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaRecep.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaRecep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaRecepMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaRecep);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 660));

        tabbeDyR.addTab("Ver recepcionista ", jPanel3);

        pBienvenida.add(tabbeDyR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 1150, 380));

        btnActualizarD.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        btnActualizarD.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnActualizarD.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarD.setText("Actualizar");
        btnActualizarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDActionPerformed(evt);
            }
        });
        pBienvenida.add(btnActualizarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 190, 50));

        btnEliminarD.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminarD.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnEliminarD.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarD.setText("Eliminar");
        btnEliminarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDActionPerformed(evt);
            }
        });
        pBienvenida.add(btnEliminarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 190, 50));

        btnCancelarD.setBackground(java.awt.Color.orange);
        btnCancelarD.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnCancelarD.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarD.setText("Cancelar");
        btnCancelarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarDActionPerformed(evt);
            }
        });
        pBienvenida.add(btnCancelarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, 190, 50));

        btnEditarD.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        btnEditarD.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnEditarD.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarD.setText("Editar");
        btnEditarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarDActionPerformed(evt);
            }
        });
        pBienvenida.add(btnEditarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 190, 50));

        txtNombre.setToolTipText("Nombre");
        pBienvenida.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 250, 60));

        txtApellido.setToolTipText("Apellido");
        pBienvenida.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 300, 60));

        txtCorreo.setToolTipText("Correo");
        pBienvenida.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 400, 60));

        txtEspecialidad.setToolTipText("Especialidad");
        pBienvenida.add(txtEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, 250, 60));

        txtCedula.setToolTipText("Cedula");
        pBienvenida.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 200, 60));

        txtTelefono.setToolTipText("Telefono");
        pBienvenida.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 200, 60));

        btnEliminarR.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminarR.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnEliminarR.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarR.setText("Eliminar");
        btnEliminarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRActionPerformed(evt);
            }
        });
        pBienvenida.add(btnEliminarR, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 190, 50));

        btnEditarR.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        btnEditarR.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnEditarR.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarR.setText("Editar");
        btnEditarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarRActionPerformed(evt);
            }
        });
        pBienvenida.add(btnEditarR, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 190, 50));

        btnActualizarR.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        btnActualizarR.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnActualizarR.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarR.setText("Actualizar");
        btnActualizarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarRActionPerformed(evt);
            }
        });
        pBienvenida.add(btnActualizarR, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 190, 50));

        btnCancelarR.setBackground(java.awt.Color.orange);
        btnCancelarR.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnCancelarR.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarR.setText("Cancelar");
        btnCancelarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarRActionPerformed(evt);
            }
        });
        pBienvenida.add(btnCancelarR, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, 190, 50));

        Pantallas.addTab("bienvenida", pBienvenida);

        pRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        pRegistrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        plDoctor.setBackground(new java.awt.Color(242, 242, 242));
        plDoctor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombreD.setToolTipText("Nombre");
        txtNombreD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreDActionPerformed(evt);
            }
        });
        plDoctor.add(txtNombreD, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 250, 60));

        txtCorreoD.setToolTipText("Correo");
        plDoctor.add(txtCorreoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 560, 60));

        txtTelefonoD.setToolTipText("Telefono");
        plDoctor.add(txtTelefonoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 240, 60));
        //try {
            //    MaskFormatter mf = new MaskFormatter("(###) ### - ####");
            //    mf.setPlaceholderCharacter('_');
            //    txtTelefonoD.setFormatterFactory(new DefaultFormatterFactory(mf));
            //} catch (ParseException pex) {
            //    System.out.println(pex);
            //}

        txtCedulaD.setToolTipText("Cedula");
        txtCedulaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaDActionPerformed(evt);
            }
        });
        plDoctor.add(txtCedulaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 260, 60));

        txtPasswordD.setToolTipText("Contraseña");
        plDoctor.add(txtPasswordD, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 240, 60));

        lblGenero.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(102, 102, 102));
        lblGenero.setText("Género");
        plDoctor.add(lblGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 120, 30));

        rbtnFemeninoD.setBackground(new java.awt.Color(255, 255, 255));
        rbtnFemeninoD.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        rbtnFemeninoD.setForeground(new java.awt.Color(102, 102, 102));
        rbtnFemeninoD.setText("Femenino");
        rbtnFemeninoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnFemeninoDActionPerformed(evt);
            }
        });
        plDoctor.add(rbtnFemeninoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 90, 40));

        rbtnMasculinoD.setBackground(new java.awt.Color(255, 255, 255));
        rbtnMasculinoD.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        rbtnMasculinoD.setForeground(new java.awt.Color(102, 102, 102));
        rbtnMasculinoD.setText("Masculino");
        rbtnMasculinoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMasculinoDActionPerformed(evt);
            }
        });
        plDoctor.add(rbtnMasculinoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 90, 40));

        btnRegistrarD.setBackground(new java.awt.Color(204, 51, 255));
        btnRegistrarD.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRegistrarD.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarD.setText("Registrar");
        btnRegistrarD.setBorder(null);
        btnRegistrarD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarDMouseExited(evt);
            }
        });
        btnRegistrarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDActionPerformed(evt);
            }
        });
        plDoctor.add(btnRegistrarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 200, 60));

        lblNombrePantalla.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        lblNombrePantalla.setForeground(new java.awt.Color(83, 121, 235));
        lblNombrePantalla.setText("Formulario de registro");
        plDoctor.add(lblNombrePantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 410, 60));

        txtApellidoD.setToolTipText("Apellido");
        plDoctor.add(txtApellidoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 270, 60));

        jDateChooserD.setToolTipText("Fecha de registro");
        plDoctor.add(jDateChooserD, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 220, 60));

        spfEdadD.setToolTipText("Edad");
        plDoctor.add(spfEdadD, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 90, 50));

        cmbEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        plDoctor.add(cmbEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 230, 60));

        Doctor.addTab("Doctor", plDoctor);

        plRecepcionista.setBackground(new java.awt.Color(242, 242, 242));
        plRecepcionista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombrePantalla1.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        lblNombrePantalla1.setForeground(new java.awt.Color(83, 121, 235));
        lblNombrePantalla1.setText("Formulario de registro");
        plRecepcionista.add(lblNombrePantalla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 410, 60));

        txtNombreR.setToolTipText("Nombre");
        txtNombreR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreRActionPerformed(evt);
            }
        });
        plRecepcionista.add(txtNombreR, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 250, 60));

        txtCorreoR.setToolTipText("Correo");
        plRecepcionista.add(txtCorreoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 560, 60));

        txtTelefonoR.setToolTipText("Telefono");
        plRecepcionista.add(txtTelefonoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 240, 60));
        //try {
            //    MaskFormatter mf = new MaskFormatter("(###) ### - ####");
            //    mf.setPlaceholderCharacter('_');
            //    txtTelefonoR.setFormatterFactory(new DefaultFormatterFactory(mf));
            //} catch (ParseException pex) {
            //    System.out.println(pex);
            //}

        txtCedulaR.setToolTipText("Cedula");
        txtCedulaR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaRActionPerformed(evt);
            }
        });
        plRecepcionista.add(txtCedulaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 260, 60));

        txtApellidoR.setToolTipText("Apellido");
        plRecepcionista.add(txtApellidoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 270, 60));

        jDateChooserR.setToolTipText("Fecha de registro");
        plRecepcionista.add(jDateChooserR, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 220, 60));

        spfEdadR.setToolTipText("Edad");
        plRecepcionista.add(spfEdadR, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 90, 60));

        lblGenero1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblGenero1.setForeground(new java.awt.Color(102, 102, 102));
        lblGenero1.setText("Género");
        plRecepcionista.add(lblGenero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 120, 30));

        rbtnFemeninoR.setBackground(new java.awt.Color(255, 255, 255));
        rbtnFemeninoR.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        rbtnFemeninoR.setForeground(new java.awt.Color(102, 102, 102));
        rbtnFemeninoR.setText("Femenino");
        rbtnFemeninoR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnFemeninoRActionPerformed(evt);
            }
        });
        plRecepcionista.add(rbtnFemeninoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 90, 40));

        rbtnMasculinoR.setBackground(new java.awt.Color(255, 255, 255));
        rbtnMasculinoR.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        rbtnMasculinoR.setForeground(new java.awt.Color(102, 102, 102));
        rbtnMasculinoR.setText("Masculino");
        rbtnMasculinoR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMasculinoRActionPerformed(evt);
            }
        });
        plRecepcionista.add(rbtnMasculinoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 90, 40));

        btnRegistrarR.setBackground(new java.awt.Color(204, 51, 255));
        btnRegistrarR.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRegistrarR.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarR.setText("Registrar");
        btnRegistrarR.setBorder(null);
        btnRegistrarR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarRMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarRMouseExited(evt);
            }
        });
        btnRegistrarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarRActionPerformed(evt);
            }
        });
        plRecepcionista.add(btnRegistrarR, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 200, 60));

        txtPasswordR.setToolTipText("Contraseña");
        plRecepcionista.add(txtPasswordR, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 240, 60));

        Doctor.addTab("Recepcionista", plRecepcionista);

        plEspecialidad.setBackground(new java.awt.Color(242, 242, 242));
        plEspecialidad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrarE.setBackground(new java.awt.Color(204, 51, 255));
        btnRegistrarE.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRegistrarE.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarE.setText("Registrar");
        btnRegistrarE.setBorder(null);
        btnRegistrarE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarEMouseExited(evt);
            }
        });
        btnRegistrarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEActionPerformed(evt);
            }
        });
        plEspecialidad.add(btnRegistrarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 200, 60));

        lblNombrePantalla2.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        lblNombrePantalla2.setForeground(new java.awt.Color(83, 121, 235));
        lblNombrePantalla2.setText("Formulario de registro");
        plEspecialidad.add(lblNombrePantalla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 410, 60));

        txtNombreE.setToolTipText("Nombre de especialidad");
        txtNombreE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEActionPerformed(evt);
            }
        });
        plEspecialidad.add(txtNombreE, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 340, 60));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        txtDescripcion.setToolTipText("Escribe una descripcion para la especialidad");
        jScrollPane1.setViewportView(txtDescripcion);

        plEspecialidad.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 540, 270));

        Doctor.addTab("Especialidad", plEspecialidad);

        pRegistrar.add(Doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1150, 640));

        Pantallas.addTab("sistema", pRegistrar);

        pSistema.setBackground(new java.awt.Color(255, 255, 255));
        pSistema.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Acerca del Sistema: Salud Xpert \n\nVersión: 1.0 \n\nFecha de creación: 28 de noviembre de 2024 \n\nDesarrollado por: J.S.A.B.F Technology  \n\nDescripción: Salud Xpert es un sistema de gestión de citas médicas diseñado para optimizar el tiempo de los doctores y mejorar la \nexperiencia de los pacientes. \n\nEntre sus funciones destacan:  Gestión dinámica de citas con sobreventa de turnos. Actualización en tiempo real del estado de las citas. \nAlmacenamiento seguro de historiales médicos. Recordatorios automáticos por correo electrónico. Desarrollado en Java, Java Swing y \nMySQL, Salud Xpert garantiza eficiencia, seguridad y una experiencia intuitiva para los usuarios.");
        pSistema.add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1150, 620));
        pSistema.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        Pantallas.addTab("docto", pSistema);

        bg.add(Pantallas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 1150, 700));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 790));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Maneja el clic en el label "Bienvenida". Muestra el panel de bienvenida y
     * cambia el índice de la pestaña a la primera. También muestra el buscador
     * y actualiza los datos de doctores y recepcionistas.
     */
    private void lblBienvenidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBienvenidaMouseClicked
        pBienvenida.setVisible(true);
        Pantallas.setSelectedIndex(0);
        LupaBuscador.setVisible(true);
        Buscador.setVisible(true);
        mostrarDatosDoctores();
        mostrarDatosRecepcionistas();
    }//GEN-LAST:event_lblBienvenidaMouseClicked

    /**
     * Cambia el fondo del label "Bienvenida" cuando el ratón entra en él.
     */
    private void lblBienvenidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBienvenidaMouseEntered
        lblBienvenida.setBackground(new Color(42, 72, 161));
    }//GEN-LAST:event_lblBienvenidaMouseEntered

    /**
     * Cambia el fondo del label "Bienvenida" cuando el ratón sale de él.
     */
    private void lblBienvenidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBienvenidaMouseExited
        lblBienvenida.setBackground(new Color(83, 121, 235));
    }//GEN-LAST:event_lblBienvenidaMouseExited

    /**
     * Maneja el clic en el label "Salir". Muestra la pantalla de inicio de
     * sesión y cierra la ventana actual.
     */
    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        lblSalir.setBackground(new Color(42, 72, 161));
        PantallaInicioSesion inicio = new PantallaInicioSesion();
        inicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblSalirMouseClicked

    /**
     * Cambia el fondo del label "Salir" cuando el ratón entra en él.
     */
    private void lblSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseEntered
        lblSalir.setBackground(new Color(42, 72, 161));
    }//GEN-LAST:event_lblSalirMouseEntered

    /**
     * Cambia el fondo del label "Salir" cuando el ratón sale de él.
     */
    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        lblSalir.setBackground(new Color(83, 121, 235));
    }//GEN-LAST:event_lblSalirMouseExited

    /**
     * Maneja el clic en el label "Registrar". Muestra el panel de registro y
     * cambia el índice de la pestaña a la segunda. También oculta el buscador y
     * actualiza los datos de doctores y recepcionistas.
     */
    private void lblRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarMouseClicked
        pRegistrar.setVisible(true);
        Pantallas.setSelectedIndex(1);
        LupaBuscador.setVisible(false);
        Buscador.setVisible(false);
        mostrarDatosDoctores();
        mostrarDatosRecepcionistas();
    }//GEN-LAST:event_lblRegistrarMouseClicked

    /**
     * Cambia el fondo del label "Registrar" cuando el ratón entra en él.
     */
    private void lblRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarMouseEntered
        lblRegistrar.setBackground(new Color(42, 72, 161));
    }//GEN-LAST:event_lblRegistrarMouseEntered

    /**
     * Cambia el fondo del label "Registrar" cuando el ratón sale de él.
     */
    private void lblRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarMouseExited
        lblRegistrar.setBackground(new Color(83, 121, 235));
    }//GEN-LAST:event_lblRegistrarMouseExited

    /**
     * Maneja el clic en el label "Información". Muestra el panel del sistema y
     * cambia el índice de la pestaña a la tercera. También oculta el buscador y
     * actualiza los datos de doctores y recepcionistas.
     */
    private void lblInformacion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInformacion1MouseClicked
        Pantallas.setSelectedIndex(2);
        pSistema.setVisible(true);
        LupaBuscador.setVisible(false);
        Buscador.setVisible(false);
        mostrarDatosDoctores();
        mostrarDatosRecepcionistas();
    }//GEN-LAST:event_lblInformacion1MouseClicked

    /**
     * Cambia el fondo del label "Información" cuando el ratón entra en él.
     */
    private void lblInformacion1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInformacion1MouseEntered
        lblInformacion1.setBackground(new Color(42, 72, 161));
    }//GEN-LAST:event_lblInformacion1MouseEntered

    /**
     * Cambia el fondo del label "Información" cuando el ratón sale de él.
     */
    private void lblInformacion1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInformacion1MouseExited
        lblInformacion1.setBackground(new Color(83, 121, 235));
    }//GEN-LAST:event_lblInformacion1MouseExited

    /**
     * Ejecuta la búsqueda de doctores y recepcionistas cuando se realiza una
     * acción en el buscador.
     */
    private void BuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscadorActionPerformed
        // TODO add your handling code here:
        mostrarDatosDoctores();
        mostrarDatosRecepcionistas();
    }//GEN-LAST:event_BuscadorActionPerformed

    private void rbtnFemeninoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnFemeninoDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnFemeninoDActionPerformed

    private void rbtnMasculinoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMasculinoDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnMasculinoDActionPerformed

    private void btnRegistrarDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarDMouseEntered
        btnRegistrarD.setBackground(new Color(153, 0, 153));
    }//GEN-LAST:event_btnRegistrarDMouseEntered

    private void btnRegistrarDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarDMouseExited
        btnRegistrarD.setBackground(new Color(204, 51, 255));
    }//GEN-LAST:event_btnRegistrarDMouseExited

    /**
     * Maneja la acción de registrar un nuevo doctor. Obtiene los datos del
     * formulario, los valida, encripta la contraseña y guarda el doctor en la
     * base de datos. También muestra un mensaje de confirmación y actualiza los
     * datos mostrados.
     */
    private void btnRegistrarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarDActionPerformed
        Doctores doctor = new Doctores();
        AdminDAO adminDAO = new AdminDAO();
        ControladorAdmin control = new ControladorAdmin();

        Date fechaSeleccionada = jDateChooserD.getDate();

        String nombre = txtNombreD.getText().trim();
        String apellido = txtApellidoD.getText().trim();
        String especialidad = (String) cmbEspecialidad.getSelectedItem();
        String numero_telefono = txtTelefonoD.getText().trim();
        String correo = txtCorreoD.getText().trim();
        String fechaRegistro = (fechaSeleccionada != null)
                ? new SimpleDateFormat("yyyy-MM-dd").format(fechaSeleccionada)
                : null;
        int edad = spfEdadD.getValue();
        String genero = rbtnFemeninoD.isSelected() ? "Femenino" : "Masculino";
        String cedula = txtCedulaD.getText().trim();
        String contraseña = txtPasswordD.getText().trim();

        String contraseñaEncriptada = BCrypt.hashpw(contraseña, BCrypt.gensalt());

        doctor.setNombres(nombre);
        doctor.setApellidos(apellido);
        doctor.setEspecialidad(especialidad);
        doctor.setTelefono(numero_telefono);
        doctor.setCorreoElectronico(correo);
        doctor.setFechaRegistro(fechaRegistro);
        doctor.setEdad(edad);
        doctor.setGenero(genero);
        doctor.setCedula(cedula);
        doctor.setContraseña(contraseñaEncriptada);

        adminDAO.agregarDoctor(doctor);

        JOptionPane.showMessageDialog(null,
                "¡Datos de " + doctor.getNombres() + " capturados exitosamente!",
                "Confirmación",
                JOptionPane.INFORMATION_MESSAGE);
        mostrarDatosDoctores();
        mostrarDatosRecepcionistas();
    }//GEN-LAST:event_btnRegistrarDActionPerformed

    private void txtNombreDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreDActionPerformed

    private void txtCedulaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaDActionPerformed

    private void txtNombreRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreRActionPerformed

    private void txtCedulaRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaRActionPerformed

    private void rbtnFemeninoRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnFemeninoRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnFemeninoRActionPerformed

    private void rbtnMasculinoRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMasculinoRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnMasculinoRActionPerformed

    private void btnRegistrarRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarRMouseEntered
        // TODO add your handling code here:
        mostrarDatosDoctores();
        mostrarDatosRecepcionistas();
    }//GEN-LAST:event_btnRegistrarRMouseEntered

    private void btnRegistrarRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarRMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarRMouseExited

    /**
     * Maneja la acción de registrar un nuevo recepcionista. Obtiene los datos
     * del formulario, los valida, encripta la contraseña y guarda el
     * recepcionista en la base de datos. También muestra un mensaje de
     * confirmación y actualiza los datos mostrados.
     */
    private void btnRegistrarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarRActionPerformed
        Recepcionista recep = new Recepcionista();
        AdminDAO adminDAO = new AdminDAO();

        Date fechaSeleccionadaR = jDateChooserR.getDate();

        String nombre = txtNombreR.getText().trim();
        String apellido = txtApellidoR.getText().trim();
        String numero_telefono = txtTelefonoR.getText().trim();
        String correo = txtCorreoR.getText().trim();
        String fechaRegistro = (fechaSeleccionadaR != null)
                ? new SimpleDateFormat("yyyy-MM-dd").format(fechaSeleccionadaR)
                : null;
        int edad = spfEdadR.getValue();
        String genero = rbtnFemeninoR.isSelected() ? "Femenino" : "Masculino";
        String cedula = txtCedulaR.getText().trim();
        String contraseña = txtTelefonoR.getText().trim();

        String contraseñaEncriptada = BCrypt.hashpw(contraseña, BCrypt.gensalt());

        recep.setNombres(nombre);
        recep.setApellidos(apellido);
        recep.setTelefono(numero_telefono);
        recep.setCorreoElectronico(correo);
        recep.setFechaRegistro(fechaRegistro);
        recep.setEdad(edad);
        recep.setGenero(genero);
        recep.setCedula(cedula);
        recep.setContraseña(contraseñaEncriptada);

        adminDAO.agregarRecepcionista(recep);

        JOptionPane.showMessageDialog(null,
                "¡Datos de " + recep.getNombres() + " capturados exitosamente!",
                "Confirmación",
                JOptionPane.INFORMATION_MESSAGE);
        mostrarDatosDoctores();
        mostrarDatosRecepcionistas();
    }//GEN-LAST:event_btnRegistrarRActionPerformed

    private void txtNombreEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEActionPerformed

    private void btnRegistrarEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarEMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarEMouseEntered

    private void btnRegistrarEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarEMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarEMouseExited

    /**
     * Maneja la acción de registrar una nueva especialidad. Obtiene los datos
     * del formulario y los guarda en la base de datos. También muestra un
     * mensaje de confirmación.
     */
    private void btnRegistrarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEActionPerformed
        Especialidades esp = new Especialidades();
        AdminDAO adminDAO = new AdminDAO();

        String nombre = txtNombreE.getText().trim();
        String descripcion = txtDescripcion.getText().trim();

        esp.setNombre(nombre);
        esp.setDescripcion(descripcion);

        adminDAO.agregarEspecialidad(esp);

        JOptionPane.showMessageDialog(null,
                "¡Especialidad:  " + esp.getNombre() + " agregada exitosamente!",
                "Confirmación",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnRegistrarEActionPerformed

    /**
     * Elimina un doctor seleccionado de la tabla. Muestra un mensaje de
     * confirmación antes de proceder con la eliminación. Actualiza la tabla con
     * los datos actualizados.
     */
    private void btnEliminarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDActionPerformed
        int filaSeleccionada = tablaDoctores.getSelectedRow();

        if (filaSeleccionada != -1) {
            int idDoctor = Integer.parseInt(tablaDoctores.getValueAt(filaSeleccionada, 0).toString());

            int confirmacion = JOptionPane.showConfirmDialog(
                    this,
                    "¿Estás seguro de que deseas eliminar este doctor?",
                    "Confirmar eliminación",
                    JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {

                int resultado = controladorAdmin.eliminarDoctor(idDoctor);

                if (resultado > 0) {
                    JOptionPane.showMessageDialog(this,
                            "¡Doctor eliminado con éxito!",
                            "Éxito",
                            JOptionPane.INFORMATION_MESSAGE);

                    // Actualizar la tabla para reflejar los cambios
                    mostrarDatosDoctores();
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Hubo un error al intentar eliminar el doctor.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "Debes seleccionar un doctor en la tabla para eliminarlo.",
                    "Advertencia",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarDActionPerformed

    /**
     * Muestra los botones de acción para el doctor seleccionado en la tabla.
     * Oculta los botones para las recepcionistas.
     */
    private void tablaDoctoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDoctoresMouseClicked
        btnEliminarD.setVisible(true);
        btnEditarD.setVisible(true);
        btnActualizarD.setVisible(true);
        btnCancelarD.setVisible(true);

        btnEliminarR.setVisible(false);
        btnEditarR.setVisible(false);
        btnActualizarR.setVisible(false);
        btnCancelarR.setVisible(false);
    }//GEN-LAST:event_tablaDoctoresMouseClicked

    /**
     * Maneja la acción de actualizar los datos de un doctor. Obtiene los datos
     * del formulario y los envía al controlador para actualizar el doctor en la
     * base de datos.
     */
    private void btnActualizarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDActionPerformed
        String nombre = txtNombre.getText().trim();
        String apellido = txtApellido.getText().trim();
        String especialidad = txtEspecialidad.getText().trim();
        String telefono = txtTelefono.getText().trim();
        String correo = txtCorreo.getText().trim();
        String cedula = txtCedula.getText().trim();

        controladorAdmin.actualizarDoctor(nombre, apellido, especialidad, telefono, correo, cedula);
    }//GEN-LAST:event_btnActualizarDActionPerformed

    /**
     * Maneja la acción de editar un doctor seleccionado en la tabla. Muestra el
     * formulario de edición con los datos del doctor seleccionado.
     */
    private void btnEditarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarDActionPerformed
        int filaSeleccionada = tablaDoctores.getSelectedRow();

        if (filaSeleccionada != -1) {

            int id = Integer.parseInt(tablaDoctores.getValueAt(filaSeleccionada, 0).toString());

            controladorAdmin.editarDoctor(id);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un doctor para editar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarDActionPerformed

    /**
     * Cancela la edición o registro de un doctor, limpiando los campos del
     * formulario y deseleccionando la tabla.
     */
    private void btnCancelarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarDActionPerformed
        txtNombre.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        txtCedula.setText("");
        txtEspecialidad.setText("");

        tablaDoctores.clearSelection();
    }//GEN-LAST:event_btnCancelarDActionPerformed

    /**
     * Elimina una recepcionista seleccionada de la tabla. Muestra un mensaje de
     * confirmación antes de proceder con la eliminación. Actualiza los datos de
     * recepcionistas en la tabla.
     */
    private void btnEliminarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRActionPerformed
        int filaSeleccionada = tablaRecep.getSelectedRow();

        if (filaSeleccionada != -1) {
            int idRecepcionista = Integer.parseInt(tablaRecep.getValueAt(filaSeleccionada, 0).toString());

            int confirmacion = JOptionPane.showConfirmDialog(
                    this,
                    "¿Estás seguro de que deseas eliminar esta recepcionista?",
                    "Confirmar eliminación",
                    JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {

                int resultado = controladorAdmin.eliminarRecepcionistas(idRecepcionista);

                if (resultado > 0) { // Verificar si se eliminó correctamente
                    JOptionPane.showMessageDialog(this,
                            "¡Recepcionista eliminado con éxito!",
                            "Éxito",
                            JOptionPane.INFORMATION_MESSAGE);

                    mostrarDatosDoctores();
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Hubo un error al intentar eliminar la recepcionista.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "Debes seleccionar una recepcionista en la tabla para eliminarla.",
                    "Advertencia",
                    JOptionPane.WARNING_MESSAGE);
        }
        mostrarDatosRecepcionistas();
    }//GEN-LAST:event_btnEliminarRActionPerformed

    /**
     * Acción que se ejecuta cuando se presiona el botón "Editar Recepcionista".
     * Verifica si hay una fila seleccionada en la tabla y, si es así, llama al
     * método para editar los datos del recepcionista correspondiente.
     *
     * @param evt El evento que genera la acción.
     */
    private void btnEditarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarRActionPerformed
        int filaSeleccionada = tablaRecep.getSelectedRow();

        if (filaSeleccionada != -1) {

            int id = Integer.parseInt(tablaRecep.getValueAt(filaSeleccionada, 0).toString());

            controladorAdmin.editarRecepcionista(id);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una recepcionista para editar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarRActionPerformed

    /**
     * Acción que se ejecuta cuando se presiona el botón "Actualizar
     * Recepcionista". Recoge los datos ingresados en los campos de texto y
     * llama al método para actualizar la información del recepcionista en la
     * base de datos. Luego, actualiza la tabla con los datos más recientes.
     *
     * @param evt El evento que genera la acción.
     */
    private void btnActualizarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarRActionPerformed
        String nombre = txtNombre.getText().trim();
        String apellido = txtApellido.getText().trim();
        String telefono = txtTelefono.getText().trim();
        String correo = txtCorreo.getText().trim();
        String cedula = txtCedula.getText().trim();

        controladorAdmin.actualizarRecepcionista(nombre, apellido, telefono, correo, cedula);
        mostrarDatosRecepcionistas();
    }//GEN-LAST:event_btnActualizarRActionPerformed

    /**
     * Acción que se ejecuta cuando se presiona el botón "Cancelar
     * Recepcionista". Limpia los campos de texto y deselecciona cualquier fila
     * seleccionada en la tabla.
     *
     * @param evt El evento que genera la acción.
     */
    private void btnCancelarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRActionPerformed
        txtNombre.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        txtCedula.setText("");
        txtEspecialidad.setText("");

        tablaRecep.clearSelection();
    }//GEN-LAST:event_btnCancelarRActionPerformed

    /**
     * Acción que se ejecuta cuando se hace clic en una fila de la tabla de
     * recepcionistas. Muestra los botones de edición, actualización,
     * cancelación y eliminación correspondientes al recepcionista seleccionado.
     *
     * @param evt El evento que genera la acción.
     */
    private void tablaRecepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaRecepMouseClicked
        btnEliminarD.setVisible(false);
        btnEditarD.setVisible(false);
        btnActualizarD.setVisible(false);
        btnCancelarD.setVisible(false);

        btnEliminarR.setVisible(true);
        btnEditarR.setVisible(true);
        btnActualizarR.setVisible(true);
        btnCancelarR.setVisible(true);
    }//GEN-LAST:event_tablaRecepMouseClicked

    /**
     * Obtiene la fecha actual en formato dd/MM/YYYY.
     *
     * @return La fecha actual en formato de cadena (String).
     */
    public static String fechaActual() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");

        return formatoFecha.format(fecha);
    }

    /**
     * Muestra los datos de los doctores en la tabla. Recupera la lista de
     * doctores desde la base de datos y agrega sus datos a la tabla de la
     * interfaz gráfica.
     */
    public void mostrarDatosDoctores() {
        // Crear el modelo para la tabla
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        modelo.addColumn("ID");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Especialidad");
        modelo.addColumn("Telefono");
        modelo.addColumn("Correo");
        modelo.addColumn("Cedula");

        tablaDoctores.setModel(modelo);

        AdminDAO dao = new AdminDAO();
        List<Doctores> doctores = dao.listarDoctores();

        for (Doctores doctor : doctores) {
            String[] data = new String[7];
            data[0] = String.valueOf(doctor.getIdDoctor());
            data[1] = doctor.getNombres();
            data[2] = doctor.getApellidos();
            data[3] = doctor.getEspecialidad();
            data[4] = doctor.getTelefono();
            data[5] = doctor.getCorreoElectronico();
            data[6] = doctor.getCedula();

            modelo.addRow(data);
        }
    }

    /**
     * Muestra los datos de los recepcionistas en la tabla. Recupera la lista de
     * recepcionistas desde la base de datos y agrega sus datos a la tabla de la
     * interfaz gráfica.
     */
    private void mostrarDatosRecepcionistas() {
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        modelo.addColumn("ID");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Correo");
        modelo.addColumn("Telefono");
        modelo.addColumn("Cedula");

        tablaRecep.setModel(modelo);

        AdminDAO dao = new AdminDAO();
        List<Recepcionista> receps = dao.listarRecepcionistas();

        for (Recepcionista recep : receps) {
            String[] data = new String[6];
            data[0] = String.valueOf(recep.getIdRecepcionista());
            data[1] = recep.getNombres();
            data[2] = recep.getApellidos();
            data[3] = recep.getCorreoElectronico();
            data[4] = recep.getTelefono();
            data[5] = recep.getCedula();

            modelo.addRow(data);
        }
    }

    /**
     * Agrega los eventos necesarios para la búsqueda y actualización de la
     * tabla cuando el texto del campo de búsqueda cambia.
     *
     * @param controladorAdmin El controlador que maneja la lógica de búsqueda y
     * actualización.
     */
    private void agregarEventos(ControladorAdmin controladorAdmin) {
        Buscador.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                controladorAdmin.buscarYActualizarTabla(Buscador.getText().trim());
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                controladorAdmin.buscarYActualizarTabla(Buscador.getText().trim());
            }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                controladorAdmin.buscarYActualizarTabla(Buscador.getText().trim());
            }
        });
    }

    /**
     * Método principal que inicia la aplicación. Configura el tema visual de la
     * interfaz de usuario utilizando FlatLaf y realiza algunas
     * personalizaciones en la apariencia de los componentes. En caso de un
     * error al cargar el tema, muestra un mensaje de error en la consola.
     * Luego, inicia la ventana principal de la aplicación
     * (PantallaAdministrador).
     *
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String args[]) {
        try {

            FlatLightLaf.setup();
            UIManager.put("Component.innerFocusWidth", 3);

            UIManager.put("TabbedPane.tabInsets", new Insets(10, 20, 10, 20));
            UIManager.put("TabbedPane.tabAreaInsets", new Insets(10, 10, 10, 10));

        } catch (Exception ex) {
            System.err.println("No se pudo cargar el tema FlatLaf MacOS Light.");
            ex.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Buscador;
    private javax.swing.JTabbedPane Doctor;
    private javax.swing.JLabel LupaBuscador;
    private javax.swing.JPanel Menu;
    private javax.swing.JTabbedPane Pantallas;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnActualizarD;
    private javax.swing.JButton btnActualizarR;
    private javax.swing.JButton btnCancelarD;
    private javax.swing.JButton btnCancelarR;
    private javax.swing.JButton btnEditarD;
    private javax.swing.JButton btnEditarR;
    private javax.swing.JButton btnEliminarD;
    private javax.swing.JButton btnEliminarR;
    private javax.swing.JButton btnRegistrarD;
    private javax.swing.JButton btnRegistrarE;
    private javax.swing.JButton btnRegistrarR;
    private javax.swing.JComboBox<String> cmbEspecialidad;
    private com.toedter.calendar.JDateChooser jDateChooserD;
    private com.toedter.calendar.JDateChooser jDateChooserR;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblGenero1;
    private javax.swing.JLabel lblInformacion1;
    private javax.swing.JLabel lblNombrePantalla;
    private javax.swing.JLabel lblNombrePantalla1;
    private javax.swing.JLabel lblNombrePantalla2;
    private javax.swing.JLabel lblRegistrar;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JPanel pBienvenida;
    private javax.swing.JPanel pRegistrar;
    private javax.swing.JPanel pSistema;
    private javax.swing.JPanel plBarraSuperior;
    private javax.swing.JPanel plDoctor;
    private javax.swing.JPanel plEspecialidad;
    private javax.swing.JPanel plRecepcionista;
    private javax.swing.JRadioButton rbtnFemeninoD;
    private javax.swing.JRadioButton rbtnFemeninoR;
    private javax.swing.JRadioButton rbtnMasculinoD;
    private javax.swing.JRadioButton rbtnMasculinoR;
    private com.toedter.components.JSpinField spfEdadD;
    private com.toedter.components.JSpinField spfEdadR;
    private javax.swing.JTabbedPane tabbeDyR;
    public javax.swing.JTable tablaDoctores;
    public javax.swing.JTable tablaRecep;
    public javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellidoD;
    private javax.swing.JTextField txtApellidoR;
    public javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCedulaD;
    private javax.swing.JTextField txtCedulaR;
    public javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCorreoD;
    private javax.swing.JTextField txtCorreoR;
    private javax.swing.JTextArea txtDescripcion;
    public javax.swing.JTextField txtEspecialidad;
    public javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreD;
    private javax.swing.JTextField txtNombreE;
    private javax.swing.JTextField txtNombreR;
    private javax.swing.JPasswordField txtPasswordD;
    private javax.swing.JPasswordField txtPasswordR;
    public javax.swing.JTextField txtTelefono;
    private javax.swing.JFormattedTextField txtTelefonoD;
    private javax.swing.JFormattedTextField txtTelefonoR;
    // End of variables declaration//GEN-END:variables
}
