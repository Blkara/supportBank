/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.tfg.supportbank.vistas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Kara
 */
public class JFileChooserTest extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form JFileChooserTest
     */
  
    
        private JTextField txt;
    private JButton btn;

    public JFileChooserTest() {
        super("JFileChooser Test");
        setLayout(new FlowLayout());

        txt = new JTextField(30);
        add(txt);

        btn = new JButton("Buscar...");
        btn.addActionListener(this);
        add(btn);
    }

    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(JFileChooserTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFileChooserTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFileChooserTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFileChooserTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        JFileChooserTest test = new JFileChooserTest();
        test.setDefaultCloseOperation(EXIT_ON_CLOSE);
        test.setSize(400, 110);
        test.setVisible(true);
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFileChooserTest().setVisible(true);
            }
        });
    }
    
    


    //@Override
    //public void actionPerformed(ActionEvent e) { ... }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*
            JFileChooser fileChooser = new JFileChooser();
    fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
    
    FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("documents", "pdf", "txt"); 
    fileChooser.setFileFilter(imgFilter);

    // muestras el cuadro, al presionar aceptar o cerrar se cierra la ventana    
    int result = fileChooser.showOpenDialog(this);
    //int result = fileChooser.showSaveDialog(this); //para guardar el archivo
    //Si no se ha pulsado el boton cancelar
    if (result != JFileChooser.CANCEL_OPTION) {

        // obtener el objeto File que se ha seleccionado
        File fileName = fileChooser.getSelectedFile();

        if ((fileName == null) || (fileName.getName().equals(""))) {
            txt.setText("...");
        } else {
            txt.setText(fileName.getAbsolutePath());
        }
    }
        */
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
