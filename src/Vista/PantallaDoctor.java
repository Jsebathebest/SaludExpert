package Vista;

import com.formdev.flatlaf.FlatLightLaf;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author sebas
 */
public class PantallaDoctor extends javax.swing.JFrame {

    /**
     * Creates new form InterfazDoctor
     */
    public PantallaDoctor() {
        
        setLocationRelativeTo(null);
        initComponents();
        
        this.setExtendedState(PantallaDoctor.MAXIMIZED_BOTH);
        lblFechaActual.setText(fechaActual());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plBackground = new javax.swing.JPanel();
        plDatosPaciente = new javax.swing.JPanel();
        lblNombrePaciente = new javax.swing.JLabel();
        lblMotivoCita = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnotaciones = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHistMedico = new javax.swing.JTextArea();
        lblTipoSangre = new javax.swing.JLabel();
        lblGeneroPaciente = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtEnfermedades = new javax.swing.JTextArea();
        plActEstado = new javax.swing.JPanel();
        lblActEstado = new javax.swing.JLabel();
        lblMensajeBienvenida = new javax.swing.JLabel();
        lblFechaActual = new javax.swing.JLabel();
        lblCantidadPacientes = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblListadoCitas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        plBackground.setBackground(new java.awt.Color(255, 255, 255));
        plBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        plDatosPaciente.setBackground(new java.awt.Color(99, 47, 136));

        lblNombrePaciente.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblNombrePaciente.setForeground(new java.awt.Color(255, 255, 255));
        lblNombrePaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombrePaciente.setText("NombrePaciente");

        lblMotivoCita.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblMotivoCita.setForeground(new java.awt.Color(255, 255, 255));
        lblMotivoCita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMotivoCita.setText("Motivo de Cita: ");

        txtAnotaciones.setColumns(20);
        txtAnotaciones.setRows(4);
        txtAnotaciones.setText("Ejemplo Ejemplo Ejemplo");
        txtAnotaciones.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Anotaciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12))); // NOI18N
        jScrollPane2.setViewportView(txtAnotaciones);

        txtHistMedico.setEditable(false);
        txtHistMedico.setColumns(20);
        txtHistMedico.setRows(5);
        txtHistMedico.setText("Ejemplo Ejemplo Ejemplo");
        txtHistMedico.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Historial Medico", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12))); // NOI18N
        txtHistMedico.setFocusable(false);
        txtHistMedico.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(txtHistMedico);

        lblTipoSangre.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        lblTipoSangre.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoSangre.setText("Tipo de sangre: A+");

        lblGeneroPaciente.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        lblGeneroPaciente.setForeground(new java.awt.Color(255, 255, 255));
        lblGeneroPaciente.setText("Genero: M");

        txtEnfermedades.setEditable(false);
        txtEnfermedades.setColumns(20);
        txtEnfermedades.setRows(3);
        txtEnfermedades.setText("Ejemplo Ejemplo Ejemplo ");
        txtEnfermedades.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Enfermedades", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12))); // NOI18N
        txtEnfermedades.setFocusable(false);
        txtEnfermedades.setRequestFocusEnabled(false);
        jScrollPane4.setViewportView(txtEnfermedades);

        plActEstado.setBackground(new java.awt.Color(255, 255, 255));
        plActEstado.setForeground(new java.awt.Color(99, 47, 136));
        plActEstado.setToolTipText("");

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
                .addComponent(lblActEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        plActEstadoLayout.setVerticalGroup(
            plActEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plActEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblActEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout plDatosPacienteLayout = new javax.swing.GroupLayout(plDatosPaciente);
        plDatosPaciente.setLayout(plDatosPacienteLayout);
        plDatosPacienteLayout.setHorizontalGroup(
            plDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plDatosPacienteLayout.createSequentialGroup()
                .addGroup(plDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plDatosPacienteLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(plDatosPacienteLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblMotivoCita, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(plDatosPacienteLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lblTipoSangre)
                        .addGap(75, 75, 75)
                        .addComponent(lblGeneroPaciente))
                    .addGroup(plDatosPacienteLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(plDatosPacienteLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(plDatosPacienteLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(plDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(plActEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))))
                .addContainerGap())
        );
        plDatosPacienteLayout.setVerticalGroup(
            plDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plDatosPacienteLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblMotivoCita)
                .addGap(12, 12, 12)
                .addGroup(plDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipoSangre)
                    .addComponent(lblGeneroPaciente))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(plActEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        plBackground.add(plDatosPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 320, 670));

        lblMensajeBienvenida.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        lblMensajeBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensajeBienvenida.setText("Bienvenido Dr. NombreDoctor");
        plBackground.add(lblMensajeBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 590, 30));

        lblFechaActual.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblFechaActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaActual.setText("Fecha:");
        plBackground.add(lblFechaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 570, -1));

        lblCantidadPacientes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCantidadPacientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantidadPacientes.setText("Pacientes: 3");
        plBackground.add(lblCantidadPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 90, 570, -1));

        tblListadoCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { 1, "Awilka DeTal", "8:00AM", "Finalizado"},
                { 2, "Dianny DeTal", "8:30AM", "En curso"},
                { 3, "Johan DeTal", "9:00AM", "Pendiente"}
            },
            new String [] {
                "ID Paciente", "Nombre", "Hora", "Estado de Cita"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListadoCitas.setSelectionBackground(new java.awt.Color(99, 47, 136));
        tblListadoCitas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tblListadoCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListadoCitasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblListadoCitas);

        plBackground.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 570, -1));

        getContentPane().add(plBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void tblListadoCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListadoCitasMouseClicked
        // TODO add your handling code here:
        // Verifica que haya una fila seleccionada
        int selectedRow = tblListadoCitas.getSelectedRow();
        if (selectedRow != -1) {
            // Obtiene el valor de la primera columna de la fila seleccionada
            String nombrePaciente = (String) tblListadoCitas.getValueAt(selectedRow, 1);
            // Actualiza el lblNombrePaciente con el nombre del paciente seleccionado
            lblNombrePaciente.setText(nombrePaciente);
            lblMotivoCita.setText("Motivo de Cita: ");
            lblTipoSangre.setText("Tipo de Sangre: ");
            lblGeneroPaciente.setText("Genero: ");
        }
    }//GEN-LAST:event_tblListadoCitasMouseClicked

    public static String fechaActual() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");

        return formatoFecha.format(fecha);
    }
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//       try {
//            // Establecer el tema MacOS Light
//            UIManager.setLookAndFeel(new FlatLightLaf());
//        } catch (Exception ex) {
//            System.err.println("No se pudo cargar el tema FlatLaf MacOS Light.");
//            ex.printStackTrace();
//        }
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PantallaDoctor().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblActEstado;
    private javax.swing.JLabel lblCantidadPacientes;
    private javax.swing.JLabel lblFechaActual;
    private javax.swing.JLabel lblGeneroPaciente;
    private javax.swing.JLabel lblMensajeBienvenida;
    private javax.swing.JLabel lblMotivoCita;
    private javax.swing.JLabel lblNombrePaciente;
    private javax.swing.JLabel lblTipoSangre;
    private javax.swing.JPanel plActEstado;
    private javax.swing.JPanel plBackground;
    private javax.swing.JPanel plDatosPaciente;
    private javax.swing.JTable tblListadoCitas;
    private javax.swing.JTextArea txtAnotaciones;
    private javax.swing.JTextArea txtEnfermedades;
    private javax.swing.JTextArea txtHistMedico;
    // End of variables declaration//GEN-END:variables
}
