
package Vista;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.basic.BasicProgressBarUI;

/**
 *
 * @author o.o
 */
public class PantallaInicio extends javax.swing.JFrame {

    pbThead t1;
    
    public PantallaInicio() {
        
      // setIconImage(null);  
       setUndecorated(true);  
       setLocationRelativeTo(null);

       initComponents();
        
       BarraInicio.setBackground(new Color(91, 121, 235));
        BarraInicio.setUI(new BasicProgressBarUI() {
            @Override
            protected Color getSelectionBackground() {
                return new Color(91, 121, 235);
            }
        });
        BarraInicio.setForeground(new Color(255,255,255)); 
   
        
        t1 = new pbThead((JProgressBar) BarraInicio);
        t1.start();
    }
    
    class pbThead extends Thread {

        JProgressBar pbar;

        pbThead(JProgressBar pbar) {
            this.pbar = pbar;
        }

        @Override
        public void run() {
            int max = 100;
            pbar.setMaximum(max);
            pbar.setValue(0);

            for (int i = 0; i <= max; i++) {
                pbar.setValue(i);
                valores.setText(i + "%");
                

                if (i == 5) {
                    mensaje.setText("Iniciando el proceso...");
                } else if (i == 10) {
                    mensaje.setText("Cargando los datos...");
                } else if (i == 20) {
                    mensaje.setText("Verificando información...");
                } else if (i == 30) {
                    mensaje.setText("Revisando configuraciones...");
                } else if (i == 40) {
                    mensaje.setText("Ajustando detalles finales...");
                } else if (i == 50) {
                    mensaje.setText("Estamos casi listos...");
                } else if (i == 60) {
                    mensaje.setText("Realizando últimos ajustes...");
                }  else if (i == 70) {
                    mensaje.setText("Estamos terminando...");
                } else if (i == 80) {
                    mensaje.setText("Solo un paso más...");
                }else if (i == 90) {
                    mensaje.setText("Gracias por la espera!"); 
                }
                
                else if(i == 100){
                    try {
                        sleep(700);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(PantallaInicio.class.getName()).log(Level.SEVERE, null, ex);
                    }
                dispose();
                PantallaInicioSesion inicio = new PantallaInicioSesion();
                inicio.setVisible(true);
                
                
                
                }

                try {
                    sleep(100); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            
            
            
        }
    }

 
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPantallaInicio = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        eslogan = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        valores = new javax.swing.JLabel();
        BarraInicio = new javax.swing.JProgressBar();
        FondoDegradado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(730, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgPantallaInicio.setBackground(new java.awt.Color(255, 255, 255));
        bgPantallaInicio.setMaximumSize(new java.awt.Dimension(730, 500));
        bgPantallaInicio.setMinimumSize(new java.awt.Dimension(730, 500));
        bgPantallaInicio.setPreferredSize(new java.awt.Dimension(730, 500));
        bgPantallaInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 100)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SaludXpert");
        bgPantallaInicio.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 590, 120));

        eslogan.setFont(new java.awt.Font("Dialog", 3, 21)); // NOI18N
        eslogan.setForeground(new java.awt.Color(255, 255, 255));
        eslogan.setText("Citas rápidas, salud eficiente. ");
        bgPantallaInicio.add(eslogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, 70));

        mensaje.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        mensaje.setForeground(new java.awt.Color(255, 255, 255));
        mensaje.setText("Espere un momento.....");
        bgPantallaInicio.add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 290, 40));

        valores.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        valores.setForeground(new java.awt.Color(255, 255, 255));
        valores.setText("0%");
        bgPantallaInicio.add(valores, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 50, 40));

        BarraInicio.setBackground(new java.awt.Color(255, 255, 255));
        BarraInicio.setForeground(new java.awt.Color(102, 102, 255));
        BarraInicio.setBorder(null);
        BarraInicio.setString("");
        bgPantallaInicio.add(BarraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 490, 770, 10));

        FondoDegradado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/fondo.png"))); // NOI18N
        FondoDegradado.setMaximumSize(new java.awt.Dimension(730, 500));
        FondoDegradado.setMinimumSize(new java.awt.Dimension(730, 500));
        FondoDegradado.setPreferredSize(new java.awt.Dimension(730, 500));
        bgPantallaInicio.add(FondoDegradado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 500));

        getContentPane().add(bgPantallaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 

    public static void main(String args[]) {
        try {
            // Establecer el tema MacOS Light
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("No se pudo cargar el tema FlatLaf MacOS Light.");
            ex.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(() -> {
            new PantallaInicio().setVisible(true);
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar BarraInicio;
    private javax.swing.JLabel FondoDegradado;
    private javax.swing.JPanel bgPantallaInicio;
    private javax.swing.JLabel eslogan;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel mensaje;
    private javax.swing.JLabel valores;
    // End of variables declaration//GEN-END:variables
}
