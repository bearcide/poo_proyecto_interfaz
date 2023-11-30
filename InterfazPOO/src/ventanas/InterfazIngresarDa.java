/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author brayan
 */
public class InterfazIngresarDa extends javax.swing.JFrame {

    /**
     * Creates new form InterfazIngresarDa
     */
    public InterfazIngresarDa() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
     public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icono.jpg"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JButtonSalir = new javax.swing.JButton();
        JButtonRegresar = new javax.swing.JButton();
        JButtonAnadirAlu = new javax.swing.JButton();
        JButtonBorrarAlu = new javax.swing.JButton();
        JButtonEditarAlu = new javax.swing.JButton();
        JLabelCrearAlu = new javax.swing.JLabel();
        JLabelIcono = new javax.swing.JLabel();
        JLabelRespuesta = new javax.swing.JLabel();
        JLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JButtonSalir.setBackground(new java.awt.Color(249, 248, 248));
        JButtonSalir.setFont(new java.awt.Font("Bodoni MT", 3, 18)); // NOI18N
        JButtonSalir.setText("Salir");
        JButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 120, 30));

        JButtonRegresar.setBackground(new java.awt.Color(249, 248, 248));
        JButtonRegresar.setFont(new java.awt.Font("Bodoni MT", 3, 18)); // NOI18N
        JButtonRegresar.setText("Regresar");
        JButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 30));

        JButtonAnadirAlu.setBackground(new java.awt.Color(249, 248, 248));
        JButtonAnadirAlu.setFont(new java.awt.Font("Bodoni MT", 3, 18)); // NOI18N
        JButtonAnadirAlu.setText("Añadir alumno");
        JButtonAnadirAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAnadirAluActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonAnadirAlu, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 170, 50));

        JButtonBorrarAlu.setBackground(new java.awt.Color(249, 248, 248));
        JButtonBorrarAlu.setFont(new java.awt.Font("Bodoni MT", 3, 18)); // NOI18N
        JButtonBorrarAlu.setText("Borrar alumno");
        JButtonBorrarAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonBorrarAluActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonBorrarAlu, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 170, 50));

        JButtonEditarAlu.setBackground(new java.awt.Color(249, 248, 248));
        JButtonEditarAlu.setFont(new java.awt.Font("Bodoni MT", 3, 18)); // NOI18N
        JButtonEditarAlu.setText("Editar alumno");
        JButtonEditarAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonEditarAluActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonEditarAlu, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 170, 50));

        JLabelCrearAlu.setFont(new java.awt.Font("Bodoni MT", 3, 36)); // NOI18N
        JLabelCrearAlu.setForeground(new java.awt.Color(255, 255, 255));
        JLabelCrearAlu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelCrearAlu.setText("Elija opción:");
        getContentPane().add(JLabelCrearAlu, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 270, 70));

        JLabelIcono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/meterDatos.png"))); // NOI18N
        getContentPane().add(JLabelIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 440, 520));

        JLabelRespuesta.setFont(new java.awt.Font("Bodoni MT", 1, 20)); // NOI18N
        JLabelRespuesta.setForeground(new java.awt.Color(153, 255, 0));
        JLabelRespuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(JLabelRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 270, 50));

        JLabelFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoRI.jpg"))); // NOI18N
        JLabelFondo.setText("jLabel1");
        JLabelFondo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        getContentPane().add(JLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 860, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JButtonSalirActionPerformed

    private void JButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonRegresarActionPerformed
        this.setVisible(false);
        InterfazMenu interfazMenu = new InterfazMenu();
        interfazMenu.setVisible(true);
    }//GEN-LAST:event_JButtonRegresarActionPerformed

    private void JButtonAnadirAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAnadirAluActionPerformed
        //alumnado.addAlumnoManual(planMadre);
        JLabelRespuesta.setText("Se añadió al alumno");
    }//GEN-LAST:event_JButtonAnadirAluActionPerformed

    private void JButtonBorrarAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonBorrarAluActionPerformed
        //alumnado.delete(alumnado);
    }//GEN-LAST:event_JButtonBorrarAluActionPerformed

    private void JButtonEditarAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonEditarAluActionPerformed
        //alumnado.edit(alumnado);
    }//GEN-LAST:event_JButtonEditarAluActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(InterfazIngresarDa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazIngresarDa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazIngresarDa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazIngresarDa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazIngresarDa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonAnadirAlu;
    private javax.swing.JButton JButtonBorrarAlu;
    private javax.swing.JButton JButtonEditarAlu;
    private javax.swing.JButton JButtonRegresar;
    private javax.swing.JButton JButtonSalir;
    private javax.swing.JLabel JLabelCrearAlu;
    private javax.swing.JLabel JLabelFondo;
    private javax.swing.JLabel JLabelIcono;
    private javax.swing.JLabel JLabelRespuesta;
    // End of variables declaration//GEN-END:variables
}
