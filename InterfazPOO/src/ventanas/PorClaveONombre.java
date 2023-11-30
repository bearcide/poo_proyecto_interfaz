/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

/**
 *
 * @author migue
 */
public class PorClaveONombre extends javax.swing.JFrame {

    /**
     * Creates new form Materia
     */
    public PorClaveONombre() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelBuscarMateria = new javax.swing.JLabel();
        jLabelMMateria = new javax.swing.JLabel();
        jTextClave = new javax.swing.JTextField();
        jTextNombreMateria = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabelFFFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBuscarMateria.setFont(new java.awt.Font("Arial", 1, 78)); // NOI18N
        jLabelBuscarMateria.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBuscarMateria.setText("Guadar Materia");
        getContentPane().add(jLabelBuscarMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        jLabelMMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MateriaM.png"))); // NOI18N
        getContentPane().add(jLabelMMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jTextClave.setBackground(new java.awt.Color(153, 153, 153));
        jTextClave.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextClave.setForeground(new java.awt.Color(255, 255, 255));
        jTextClave.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clave", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(jTextClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 430, -1));

        jTextNombreMateria.setBackground(new java.awt.Color(153, 153, 153));
        jTextNombreMateria.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextNombreMateria.setForeground(new java.awt.Color(255, 255, 255));
        jTextNombreMateria.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre de la materia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jTextNombreMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreMateriaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextNombreMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 430, -1));

        jButton1.setBackground(new java.awt.Color(0, 204, 153));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 204, 153));
        jButton2.setFont(new java.awt.Font("Arial", 1, 70)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 320, -1));

        jLabelFFFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/muro.jpg"))); // NOI18N
        jLabelFFFondo.setText("jLabel1");
        getContentPane().add(jLabelFFFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 657));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNombreMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreMateriaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PorClaveONombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PorClaveONombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PorClaveONombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PorClaveONombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PorClaveONombre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabelBuscarMateria;
    private javax.swing.JLabel jLabelFFFondo;
    private javax.swing.JLabel jLabelMMateria;
    private javax.swing.JTextField jTextClave;
    private javax.swing.JTextField jTextNombreMateria;
    // End of variables declaration//GEN-END:variables
}