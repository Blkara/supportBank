/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.tfg.supportbank.vistas;

import com.tfg.supportbank.dao.AsesorDao;
import com.tfg.supportbank.dos.AsesorDo;
import com.tfg.supportbank.util.Encode;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Kara
 */
public class RecuperacionPass extends javax.swing.JFrame {
    
    private String user;
    AsesorDo datosSeguridad;
    private String userRespuesta;

    /**
     * Creates new form RecuperacionPass
     */
    
    public RecuperacionPass() {
        initComponents();
    }
    
    public RecuperacionPass(String user) {
        this.user = user;
        initComponents();
        setDatosFormRecuperar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void setDatosFormRecuperar(){
        //RECUPERAR PREGUNTA y RESUESTA DE BASE DE DATOS DE USUARIO
            AsesorDao asesorDao = new AsesorDao();
            datosSeguridad = asesorDao.findByUser(user);
            
            if (null != datosSeguridad){
                TxtPregunta.setText(datosSeguridad.getPregunta());
                userRespuesta = datosSeguridad.getRespuesta();
            }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TxtRespuesta = new javax.swing.JTextField();
        jLblPregunta = new javax.swing.JLabel();
        btnRecuperarPass = new javax.swing.JButton();
        TxtPregunta = new javax.swing.JTextField();
        jLblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtRespuestaActionPerformed(evt);
            }
        });
        jPanel1.add(TxtRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 210, -1));

        jLblPregunta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLblPregunta.setForeground(new java.awt.Color(255, 255, 255));
        jLblPregunta.setText("Escriba la respuesta a su pregunta de seguridad");
        jPanel1.add(jLblPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 380, 30));

        btnRecuperarPass.setText("Recuperar Contraseña");
        btnRecuperarPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuperarPassActionPerformed(evt);
            }
        });
        jPanel1.add(btnRecuperarPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 200, -1));

        TxtPregunta.setForeground(new java.awt.Color(0, 0, 0));
        TxtPregunta.setEnabled(false);
        jPanel1.add(TxtPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 210, 30));

        jLblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login2.png"))); // NOI18N
        jLblFondo.setText("jLabel1");
        jPanel1.add(jLblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 995, 609));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecuperarPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperarPassActionPerformed
     
        //Si la respuesta del formulario es igual a la respuesta recuperada de la base de datos
        if (TxtRespuesta.getText().equals(userRespuesta)){
            FormNewPass ventanaFormNewPass = new FormNewPass(user);
            ventanaFormNewPass.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null,"Respuesta incorrecta");
            //Se cierra la ventana
            this.dispose();
        }        
    }//GEN-LAST:event_btnRecuperarPassActionPerformed

    private void TxtRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtRespuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtRespuestaActionPerformed

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
            java.util.logging.Logger.getLogger(RecuperacionPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecuperacionPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecuperacionPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecuperacionPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtPregunta;
    private javax.swing.JTextField TxtRespuesta;
    private javax.swing.JButton btnRecuperarPass;
    private javax.swing.JLabel jLblFondo;
    private javax.swing.JLabel jLblPregunta;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}