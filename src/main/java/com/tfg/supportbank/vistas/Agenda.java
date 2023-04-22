/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.tfg.supportbank.vistas;

import com.tfg.supportbank.dao.ClienteDao;
import com.tfg.supportbank.dos.ClienteDo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Kara
 */
public class Agenda extends javax.swing.JFrame {

    /**
     * Creates new form Agenda
     */
    public Agenda() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fechaLLamar = new com.toedter.calendar.JCalendar();
        horaLlamar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnAgendarLlamada = new javax.swing.JButton();
        lblCedulaCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 53, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AGENDA");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        horaLlamar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        horaLlamar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        horaLlamar.setText("HH:MM:SS hora llamar");
        horaLlamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaLlamarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Escanear");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAgendarLlamada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAgendarLlamada.setText("Agregar Evento");
        btnAgendarLlamada.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgendarLlamada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarLlamadaActionPerformed(evt);
            }
        });

        lblCedulaCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCedulaCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblCedulaCliente.setText("Ingresar Documento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(fechaLLamar, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(horaLlamar, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(lblCedulaCliente)
                            .addComponent(btnAgendarLlamada, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(horaLlamar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(btnAgendarLlamada, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fechaLLamar, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(159, Short.MAX_VALUE))
        );

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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void horaLlamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaLlamarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaLlamarActionPerformed

    private void btnAgendarLlamadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarLlamadaActionPerformed
        // TODO comprobar cedula
        if (null != lblCedulaCliente && !lblCedulaCliente.getText().isEmpty()){
            //TODO  comprobar que la fecha sea hay fecha seleccionada
            if (null != fechaLLamar && null != fechaLLamar.getDate())
            // TODO comprobar formato horaLLamar
            if (null != horaLlamar && !horaLlamar.getText().isEmpty()){
                String horaLLamar = horaLlamar.getText();
                Pattern p = Pattern.compile("^([01]?[0-9]|2[0-3]):[0-5][0-9]$");
                Matcher matcher = p.matcher(horaLLamar); 
                boolean formatoFechaOk = matcher.matches(); 
                
                if (formatoFechaOk){
                    // TODO buscar cliente0
                    String sql = "SELECT * FROM CLIENTE WHERE cedula = ?";
                    ClienteDao clienteDao = new ClienteDao();
                    Integer ced = Integer.valueOf(lblCedulaCliente.getText());
                    ClienteDo clienteDo = clienteDao.findClienteByCedula(sql, ced);
                    if (null != clienteDo){
                        // TODO agregar hora a la horaLLamar
                        
                        
                        //String myDateString = "13:24:40"; //La hora con forma de String

                        //Creamos la hora con formato del api Java
                        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
                        Date date;
                        try {
                            date = sdf.parse(horaLLamar);
                            
                            JOptionPane.showMessageDialog(null, "hora llamada: " + date.toString());
                            
                            
                            
                            Calendar horallamada = Calendar.getInstance();
                            horallamada.setTime(date);
                            int minutos = horallamada.get(Calendar.MINUTE);
                            int hora = horallamada.get(Calendar.HOUR);
                            
                            
                            
                        
                            //lo que más quieras sumar
                           // Date fechaSalida = calendar.getTime(); //Y ya tienes la horaLLamar sumada.
                           /* Calendar llamarCalendar = fechaLLamar.getCalendar();
                            llamarCalendar.set(Calendar.HOUR_OF_DAY, hora);
                            llamarCalendar.set(Calendar.MINUTE, minutos);*/
                            
                           /* JOptionPane.showMessageDialog(null, "fecha calendar: " + llamarCalendar.getTime());
                            JOptionPane.showMessageDialog(null, "fecha calendar long: " + new  java.sql.Date (llamarCalendar.getTime().getTime()));*/
                            //JOptionPane.showMessageDialog(null, "fecha llamada: " + fechaSalida.toString());                            
                            //clienteDo.setFechaLlamar(llamarCalendar.getTime());
                            
                            clienteDao.updateFechaLlamar(clienteDo.getCedula(),fechaLLamar.getDate(), horaLLamar);
                        } catch (ParseException ex) {
                            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
                            JOptionPane.showMessageDialog(null, "Error en el parseo de hora");
                        }                    
                    } else {
                        JOptionPane.showMessageDialog(null, "El cliente indicado no existe");
                    }
                }  else{//else de hora
                    JOptionPane.showMessageDialog(null, "Debe introducir una hora con formato HH:MM 24 horas");
                }
            } else { //si no introduce hora
                JOptionPane.showMessageDialog(null, "Debe introducir una hora, HH:MM 24 horas");
            }          
        } else {
            JOptionPane.showMessageDialog(null, "Debe introducir un número de Cédula");
        }
        
        
    }//GEN-LAST:event_btnAgendarLlamadaActionPerformed

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendarLlamada;
    private com.toedter.calendar.JCalendar fechaLLamar;
    private javax.swing.JTextField horaLlamar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lblCedulaCliente;
    // End of variables declaration//GEN-END:variables
}
