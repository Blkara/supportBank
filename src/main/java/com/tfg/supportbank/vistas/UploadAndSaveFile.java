package com.tfg.supportbank.vistas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class UploadAndSaveFile extends javax.swing.JFrame {  
    
    private JPanel contentPane;
    private JTextField textField;
    private JTextArea textArea;
    

    /**
     * Creates new form EjemploJFileChooser
     */
    public UploadAndSaveFile() {        
        guardarArchivo();
    }

    /**
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
            java.util.logging.Logger.getLogger(UploadAndSaveFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UploadAndSaveFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UploadAndSaveFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UploadAndSaveFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UploadAndSaveFile frame = new UploadAndSaveFile();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UploadAndSaveFile().setVisible(true);
            }
        });
    }
    
    private void guardarArchivo() {
        try {
            String nombre="";
            JFileChooser file=new JFileChooser();
            //Creamos el filtro
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("documents", "pdf", "txt");
            //FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("documents", "pdf", "txt"); 

            //Le indicamos el filtro
            file.setFileFilter(filtro);
            
            file.showSaveDialog(this);
            File origenFichero =file.getSelectedFile();
           
            
            File archivo = new File("C://ficheroSupportBank//"+origenFichero.getName());
            // Obtenemos un objeto File para la carpeta contenedora
            File carpeta = archivo.getParentFile();
            // Creamos los directorios solo si no existen
            if (!carpeta.exists()){
                carpeta.mkdirs();
            }
            
            String pathNew = archivo.getAbsolutePath();            
            File destinoFichero = new File(pathNew); //Carpeta donde se guardan los archivos           

            if(origenFichero !=null){
                 FileInputStream input;
                 FileOutputStream output;
                 byte[] b;
                 File fileInput,fileOutput;
                //try{               
                    input = new FileInputStream (origenFichero);
                    output = new FileOutputStream(destinoFichero);               
                                    
                    b = new byte[(int)origenFichero.length()];
                    input.read(b);                
                    output.write(b);                
                    input.close();               
                    output.close();               
                 /*JOptionPane.showMessageDialog(null,
                   "El archivo se a guardado Exitosamente",
                       "Información",JOptionPane.INFORMATION_MESSAGE);*/
                this.dispose();
            }
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null,
                 "Su archivo no se ha guardado",
                    "Advertencia",JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null,
                 ex,
                    "Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}