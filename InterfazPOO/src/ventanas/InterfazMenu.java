/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author brayan
 */
public class InterfazMenu extends javax.swing.JFrame {

    /**
     * Creates new form InterfazDos
     */
    public InterfazMenu() {
        initComponents();
        JButtonContinuar.setVisible(false);
        JButtonContinuarAux.setVisible(false);
        this.setLocationRelativeTo(null);
        
        InterfazLogin interfazLogin = new InterfazLogin();
        interfazLogin.setVisible(false);
        this.setVisible(true);
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

        JButtonRegresar = new javax.swing.JButton();
        JLabelCantidad = new javax.swing.JLabel();
        JComboBoxMenu = new javax.swing.JComboBox<>();
        JButtonContinuar = new javax.swing.JButton();
        JLabelRespuestaBtt = new javax.swing.JLabel();
        JButtonSalir = new javax.swing.JButton();
        JButtonContinuarAux = new javax.swing.JButton();
        JLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
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
        getContentPane().add(JButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 30));
        JButtonRegresar.getAccessibleContext().setAccessibleName("Regresa");

        JLabelCantidad.setBackground(new java.awt.Color(0, 0, 0));
        JLabelCantidad.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        JLabelCantidad.setForeground(new java.awt.Color(255, 255, 255));
        JLabelCantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelCantidad.setText("MENU DE OPCIONES");
        JLabelCantidad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(JLabelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 330, 50));

        JComboBoxMenu.setFont(new java.awt.Font("Bodoni MT", 2, 18)); // NOI18N
        JComboBoxMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Crear alumnado", "Generar número de inscripción", "Ingresar datos manualmente", "Búscar alumnado", "Guardar alumnado", "Cargar CSV del alumnado", "Imprimir alumnado" }));
        JComboBoxMenu.setAlignmentX(1.0F);
        JComboBoxMenu.setAlignmentY(5.0F);
        JComboBoxMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBoxMenuActionPerformed(evt);
            }
        });
        getContentPane().add(JComboBoxMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 270, 30));

        JButtonContinuar.setBackground(new java.awt.Color(249, 248, 248));
        JButtonContinuar.setFont(new java.awt.Font("Bodoni MT", 3, 18)); // NOI18N
        JButtonContinuar.setText("Continuar");
        JButtonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 120, 30));

        JLabelRespuestaBtt.setBackground(new java.awt.Color(255, 255, 255));
        JLabelRespuestaBtt.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        JLabelRespuestaBtt.setForeground(new java.awt.Color(153, 255, 0));
        JLabelRespuestaBtt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(JLabelRespuestaBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 330, 30));

        JButtonSalir.setBackground(new java.awt.Color(249, 248, 248));
        JButtonSalir.setFont(new java.awt.Font("Bodoni MT", 3, 18)); // NOI18N
        JButtonSalir.setText("Salir");
        JButtonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JButtonSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JButtonSalirMouseEntered(evt);
            }
        });
        JButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSalirActionPerformed(evt);
            }
        });
        JButtonSalir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JButtonSalirKeyPressed(evt);
            }
        });
        getContentPane().add(JButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 120, 30));

        JButtonContinuarAux.setBackground(new java.awt.Color(249, 248, 248));
        JButtonContinuarAux.setFont(new java.awt.Font("Bodoni MT", 3, 18)); // NOI18N
        JButtonContinuarAux.setText("Continuar");
        JButtonContinuarAux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonContinuarAuxActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonContinuarAux, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 120, 30));

        JLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(JLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonRegresarActionPerformed

        this.setVisible(false);
        InterfazLogin interfazLogin = new InterfazLogin();
        interfazLogin.setVisible(true);
    }//GEN-LAST:event_JButtonRegresarActionPerformed

    private void JComboBoxMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxMenuActionPerformed
        String op = (String) JComboBoxMenu.getSelectedItem();
        switch(op){
            case "Crear alumnado":
                systemSleep();
                this.setVisible(false);

                InterfazCrearAlu crearAlu = new InterfazCrearAlu();
                crearAlu.setVisible(true);
                break;

            case "Generar número de inscripción":
                systemSleep();
                JButtonContinuar.setVisible(true);
                break;
            case "Ingresar datos manualmente":
                systemSleep();
                this.setVisible(false);
                
                InterfazIngresarDa ingresarDa = new InterfazIngresarDa();
                ingresarDa.setVisible(true);
                break;
            case "Búscar alumnado":
                systemSleep();
                JButtonContinuarAux.setVisible(true);
                break; 
             case "Guardar alumnado":
                systemSleep();
                this.setVisible(false);

                InterfazGuardarAlu guardarAlu = new InterfazGuardarAlu();
                guardarAlu.setVisible(true);
                break; 
            case "Cargar CSV del alumnado":
                systemSleep();
                //alumnado.fromCsv(planMadre);
                JOptionPane.showMessageDialog(null, "Se cargo exitosamente el CSV");
                break;   
            case "Imprimir alumnado":
                systemSleep();
                //alumnado.print();
                break;   
        }
    }//GEN-LAST:event_JComboBoxMenuActionPerformed

    private void JButtonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonContinuarActionPerformed
        systemSleep();
        //alumnado.sortAlumnado();
        JLabelRespuestaBtt.setText("Ya se generó el número de inscripción");
 
        JButtonContinuar.setVisible(false);
    }//GEN-LAST:event_JButtonContinuarActionPerformed

    private void JButtonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonSalirMouseClicked

    }//GEN-LAST:event_JButtonSalirMouseClicked

    private void JButtonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonSalirMouseEntered

    }//GEN-LAST:event_JButtonSalirMouseEntered

    private void JButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JButtonSalirActionPerformed

    private void JButtonSalirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JButtonSalirKeyPressed

    }//GEN-LAST:event_JButtonSalirKeyPressed

    private void JButtonContinuarAuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonContinuarAuxActionPerformed
        systemSleep();
        //int res = alumnado.buscar(alumnado);
        int res=1; //Prueba
        
        if(res==-1){
            JOptionPane.showMessageDialog(null,"No se encontro");
        }else{
            JOptionPane.showMessageDialog(null,"Si está en el sistema");
        }
        JButtonContinuarAux.setVisible(false);
    }//GEN-LAST:event_JButtonContinuarAuxActionPerformed

    private void systemSleep(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ex) {
            Logger.getLogger(InterfazMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
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
            java.util.logging.Logger.getLogger(InterfazMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonContinuar;
    private javax.swing.JButton JButtonContinuarAux;
    private javax.swing.JButton JButtonRegresar;
    private javax.swing.JButton JButtonSalir;
    private javax.swing.JComboBox<String> JComboBoxMenu;
    private javax.swing.JLabel JLabelCantidad;
    private javax.swing.JLabel JLabelFondo;
    private javax.swing.JLabel JLabelRespuestaBtt;
    // End of variables declaration//GEN-END:variables
}
