
package Vista;

import javax.swing.JProgressBar;

/**
 *
 * @author o.o
 */
public class PantallaInicio extends javax.swing.JFrame {

    pbThead t1;
    
    public PantallaInicio() {
        initComponents();
        
       
        
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
                

                if (i == 20) {
                    
                    mensaje.setText("Proceso en progreso...");
                } else if (i == 40) {
                    mensaje.setText("Ya casi estamos...");
                } else if (i == 60) {
                    mensaje.setText("Solo un poco mas...");
                } else if (i == 90) {
                    mensaje.setText("Gracias por la espera!");
                }
                
                else if(i == 100){
                
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
        Logo = new javax.swing.JLabel();
        eslogan = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        valores = new javax.swing.JLabel();
        BarraInicio = new javax.swing.JProgressBar();
        FondoDegradado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(930, 670));
        setMinimumSize(new java.awt.Dimension(930, 670));

        bgPantallaInicio.setBackground(new java.awt.Color(255, 255, 255));
        bgPantallaInicio.setMaximumSize(new java.awt.Dimension(930, 670));
        bgPantallaInicio.setMinimumSize(new java.awt.Dimension(930, 670));
        bgPantallaInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setFont(new java.awt.Font("Segoe UI Emoji", 1, 120)); // NOI18N
        Logo.setForeground(new java.awt.Color(255, 255, 255));
        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setText("SaludXpert");
        bgPantallaInicio.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        eslogan.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        eslogan.setForeground(new java.awt.Color(255, 255, 255));
        eslogan.setText("Citas rápidas, salud eficiente. ");
        bgPantallaInicio.add(eslogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, 70));

        mensaje.setFont(new java.awt.Font("Dialog", 3, 16)); // NOI18N
        mensaje.setForeground(new java.awt.Color(255, 255, 255));
        mensaje.setText("Espere un momento.....");
        bgPantallaInicio.add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 180, 20));

        valores.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        valores.setForeground(new java.awt.Color(255, 255, 255));
        valores.setText("0%");
        bgPantallaInicio.add(valores, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 600, 50, 40));

        BarraInicio.setBackground(new java.awt.Color(255, 255, 255));
        BarraInicio.setForeground(new java.awt.Color(102, 102, 255));
        BarraInicio.setBorder(null);
        BarraInicio.setString("");
        bgPantallaInicio.add(BarraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 640, 1000, 40));

        FondoDegradado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/fondo.png"))); // NOI18N
        FondoDegradado.setMaximumSize(new java.awt.Dimension(930, 670));
        FondoDegradado.setMinimumSize(new java.awt.Dimension(930, 670));
        FondoDegradado.setPreferredSize(new java.awt.Dimension(930, 670));
        bgPantallaInicio.add(FondoDegradado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPantallaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPantallaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 

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
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PantallaInicio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar BarraInicio;
    private javax.swing.JLabel FondoDegradado;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel bgPantallaInicio;
    private javax.swing.JLabel eslogan;
    private javax.swing.JLabel mensaje;
    private javax.swing.JLabel valores;
    // End of variables declaration//GEN-END:variables
}
