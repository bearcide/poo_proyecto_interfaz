/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author brayan
 */
public class InterfazCrearAlu extends javax.swing.JFrame {

    /**
     * Creates new form InterfazCrearAlu
     */
    public InterfazCrearAlu() {
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

        jComboBox1 = new javax.swing.JComboBox<>();
        JButtonRegresar = new javax.swing.JButton();
        JSpinnerCantidad = new javax.swing.JSpinner();
        JLabelCrearAlu = new javax.swing.JLabel();
        JButtonContinuar = new javax.swing.JButton();
        JLabelRespuesta = new javax.swing.JLabel();
        JLabelRespuestaC = new javax.swing.JLabel();
        JButtonSalir = new javax.swing.JButton();
        JLabelFondo = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JButtonRegresar.setBackground(new java.awt.Color(249, 248, 248));
        JButtonRegresar.setFont(new java.awt.Font("Bodoni MT", 3, 18)); // NOI18N
        JButtonRegresar.setText("Regresar");
        JButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 120, 30));

        JSpinnerCantidad.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        JSpinnerCantidad.setModel(new javax.swing.SpinnerNumberModel(0L, null, null, 1L));
        JSpinnerCantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JSpinnerCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JSpinnerCantidadMouseClicked(evt);
            }
        });
        getContentPane().add(JSpinnerCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 160, -1));

        JLabelCrearAlu.setFont(new java.awt.Font("Bodoni MT", 0, 17)); // NOI18N
        JLabelCrearAlu.setForeground(new java.awt.Color(255, 255, 255));
        JLabelCrearAlu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelCrearAlu.setText("¿Cuántos alumnos desea crear?");
        getContentPane().add(JLabelCrearAlu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        JButtonContinuar.setBackground(new java.awt.Color(249, 248, 248));
        JButtonContinuar.setFont(new java.awt.Font("Bodoni MT", 3, 18)); // NOI18N
        JButtonContinuar.setText("Continuar");
        JButtonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 120, 30));

        JLabelRespuesta.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        JLabelRespuesta.setForeground(new java.awt.Color(153, 255, 0));
        JLabelRespuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(JLabelRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 270, 40));

        JLabelRespuestaC.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        JLabelRespuestaC.setForeground(new java.awt.Color(153, 255, 0));
        JLabelRespuestaC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(JLabelRespuestaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 270, 40));

        JButtonSalir.setBackground(new java.awt.Color(249, 248, 248));
        JButtonSalir.setFont(new java.awt.Font("Bodoni MT", 3, 18)); // NOI18N
        JButtonSalir.setText("Salir");
        JButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 120, 30));

        JLabelFondo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoRI.jpg"))); // NOI18N
        JLabelFondo.setText("jLabel1");
        JLabelFondo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        getContentPane().add(JLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 300, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonRegresarActionPerformed
        this.setVisible(false);
        InterfazMenu interfazMenu = new InterfazMenu();
        interfazMenu.setVisible(true);
    }//GEN-LAST:event_JButtonRegresarActionPerformed

    private void JButtonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonContinuarActionPerformed
        if((long) JSpinnerCantidad.getValue()>0) {
            //alumnado.innit(JSpinnerCantidad.getValue(), nombres, apellidos, ubicaciones, creditosNecesarios, planMadre);
            this.JLabelRespuesta.setVisible(true);
            JLabelRespuesta.setText("Se crearon " + JSpinnerCantidad.getValue() + " alumno(s)");
            JLabelRespuestaC.setText("exitosamente");
        }
        else {
            this.JLabelRespuesta.setVisible(false);
            JOptionPane.showMessageDialog(null,"Se debe crear por lo menos un alumno");
        }
    }//GEN-LAST:event_JButtonContinuarActionPerformed

    private void JButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JButtonSalirActionPerformed

    private void JSpinnerCantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JSpinnerCantidadMouseClicked

    }//GEN-LAST:event_JSpinnerCantidadMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(InterfazMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazCrearAlu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonContinuar;
    private javax.swing.JButton JButtonRegresar;
    private javax.swing.JButton JButtonSalir;
    private javax.swing.JLabel JLabelCrearAlu;
    private javax.swing.JLabel JLabelFondo;
    private javax.swing.JLabel JLabelRespuesta;
    private javax.swing.JLabel JLabelRespuestaC;
    private javax.swing.JSpinner JSpinnerCantidad;
    private javax.swing.JComboBox<String> jComboBox1;
    // End of variables declaration//GEN-END:variables
}