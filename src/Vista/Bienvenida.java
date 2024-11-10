
package Vista;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JProgressBar;


public class Bienvenida extends javax.swing.JFrame {
    
    pbThead t1;
    private Component jProgressBar;
    //private JProgressBar pbar;
    
    public Bienvenida() {
        initComponents();
        
     
     
        bgBienvenida.setSize(800, 600);
        bgBienvenida.setLocation(0, 0);
        
        
        t1 = new pbThead((JProgressBar) barra);
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
                InicioSesion inicio = new InicioSesion();
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

        bgBienvenida = new javax.swing.JPanel();
        eslogan = new javax.swing.JLabel();
        valores = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        barra = new javax.swing.JProgressBar();
        logo2 = new javax.swing.JLabel();
        logo3 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));

        bgBienvenida.setBackground(new java.awt.Color(98, 46, 136));
        bgBienvenida.setMaximumSize(new java.awt.Dimension(800, 600));
        bgBienvenida.setMinimumSize(new java.awt.Dimension(800, 600));
        bgBienvenida.setPreferredSize(new java.awt.Dimension(800, 600));
        bgBienvenida.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eslogan.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        eslogan.setForeground(new java.awt.Color(255, 255, 255));
        eslogan.setText("Citas rápidas, salud eficiente. ");
        bgBienvenida.add(eslogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

        valores.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        valores.setForeground(new java.awt.Color(255, 255, 255));
        valores.setText("0%");
        bgBienvenida.add(valores, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 540, 50, 40));

        mensaje.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        mensaje.setForeground(new java.awt.Color(255, 255, 255));
        mensaje.setText("Espere un momento.....");
        bgBienvenida.add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 180, 20));

        barra.setBackground(new java.awt.Color(204, 204, 204));
        barra.setForeground(new java.awt.Color(153, 204, 255));
        barra.setAlignmentX(1.0F);
        barra.setAlignmentY(1.0F);
        barra.setBorder(null);
        barra.setBorderPainted(false);
        barra.setString("");
        barra.setStringPainted(true);
        bgBienvenida.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 580, 830, 40));

        logo2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 100)); // NOI18N
        logo2.setForeground(new java.awt.Color(255, 255, 255));
        logo2.setText("ert");
        bgBienvenida.add(logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 150, -1));

        logo3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 100)); // NOI18N
        logo3.setForeground(new java.awt.Color(255, 255, 255));
        logo3.setText("SaludX");
        bgBienvenida.add(logo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 390, 140));

        logo.setFont(new java.awt.Font("Segoe UI Emoji", 1, 100)); // NOI18N
        logo.setForeground(new java.awt.Color(255, 255, 255));
        logo.setText("p");
        bgBienvenida.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 70, 100));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/saludxpert/imagenes/fondo.png"))); // NOI18N
        bgBienvenida.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgBienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgBienvenida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Bienvenida().setVisible(true);
        });
    }

   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barra;
    private javax.swing.JPanel bgBienvenida;
    private javax.swing.JLabel eslogan;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo2;
    private javax.swing.JLabel logo3;
    private javax.swing.JLabel mensaje;
    private javax.swing.JLabel valores;
    // End of variables declaration//GEN-END:variables
}
