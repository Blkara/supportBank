package com.tfg.supportbank.vistas;

import com.tfg.supportbank.dao.ClienteDao;
import com.tfg.supportbank.dos.ClienteDo;
import com.tfg.supportbank.util.StylesForm;
import com.tfg.supportbank.util.ValidacionCampos;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Agenda extends javax.swing.JFrame {
    
    private static final String TEXT_HORA = "HH:MM 24 horas";
    private static final String TEXT_CEDULA = "Cedula";
    ValidacionCampos validacion;
    StylesForm styleForm;

    /**
     * Creates new form Agenda
     */
    public Agenda() {
        initComponents();
        validacion = new ValidacionCampos();
        styleForm = new StylesForm();
        styleForm.addPlaceHolderStyle(horaLlamar);
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
        fechaLLamar = new com.toedter.calendar.JCalendar();
        horaLlamar = new javax.swing.JTextField();
        btnAgendarLlamada = new javax.swing.JButton();
        lblCedulaCliente = new javax.swing.JTextField();
        JbtnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 53, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(fechaLLamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 164, 251, 258));

        horaLlamar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        horaLlamar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        horaLlamar.setText("HH:MM 24 horas");
        horaLlamar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                horaLlamarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                horaLlamarFocusLost(evt);
            }
        });
        horaLlamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaLlamarActionPerformed(evt);
            }
        });
        jPanel1.add(horaLlamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 175, 36));

        btnAgendarLlamada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAgendarLlamada.setText("Agregar Evento");
        btnAgendarLlamada.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgendarLlamada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarLlamadaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgendarLlamada, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 171, 46));

        lblCedulaCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCedulaCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblCedulaCliente.setText("Cedula");
        lblCedulaCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblCedulaClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblCedulaClienteFocusLost(evt);
            }
        });
        lblCedulaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblCedulaClienteActionPerformed(evt);
            }
        });
        jPanel1.add(lblCedulaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 175, 36));

        JbtnRegresar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JbtnRegresar.setText("< Regresar");
        JbtnRegresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JbtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(JbtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 400, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agenda.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void horaLlamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaLlamarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaLlamarActionPerformed

    private void btnAgendarLlamadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarLlamadaActionPerformed
        List<JTextField> listCamposNotNull = new ArrayList<>();
        // comprobar cedula
        int cedula = validacion.validarCamposFormInteger(lblCedulaCliente, listCamposNotNull);
        if (0 != cedula){
            // comprobar que la fecha sea hay fecha seleccionada
            if (null != fechaLLamar && null != fechaLLamar.getDate()){
                //Comprobar que la fecha es mayor de la fecha actual
                if (validacion.validarCampoFecha(fechaLLamar.getDate(), new Date()) > 0){                    
                    // comprobar formato horaLLamar
                    if (null != horaLlamar && !horaLlamar.getText().isEmpty()){
                        String horaLLamar = horaLlamar.getText();
                        Pattern p = Pattern.compile("^([01]?[0-9]|2[0-3]):[0-5][0-9]$");
                        Matcher matcher = p.matcher(horaLLamar); 
                        boolean formatoFechaOk = matcher.matches(); 

                        if (formatoFechaOk){
                            // buscar cliente
                            ClienteDao clienteDao = new ClienteDao();
                            Integer ced = Integer.valueOf(lblCedulaCliente.getText().trim());
                            ClienteDo clienteDo = clienteDao.findClienteByCedula(ced);
                            if (null != clienteDo){
                                if (clienteDo.isHabilitado()){
                                    //Creamos la hora con formato del api Java
                                    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
                                    Date date;
                                    try {
                                        date = sdf.parse(horaLLamar);
                                        //JOptionPane.showMessageDialog(null, "hora llamada: " + date.toString());
                                        Calendar horallamada = Calendar.getInstance();
                                        horallamada.setTime(date);
                                        int minutos = horallamada.get(Calendar.MINUTE);
                                        int hora = horallamada.get(Calendar.HOUR);

                                        clienteDao.updateFechaLlamar(clienteDo.getCedula(),fechaLLamar.getDate(), horaLLamar);
                                    } catch (ParseException ex) {
                                        Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
                                        JOptionPane.showMessageDialog(null, "Error en el parseo de hora");
                                    } 
                                } else { // else cliente no habilitado
                                    JOptionPane.showMessageDialog(null, "El cliente no esta habilitado");
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
                } else {// else de si la fecha es mayor a la actual
                    JOptionPane.showMessageDialog(null, "La fecha debe ser posterior a la actual");
                }
            } else { // fin si fecha llamar tiene informacion
                JOptionPane.showMessageDialog(null, "Debe introducir una fecha");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe introducir un número de cedula correcto");
        }
        
        
    }//GEN-LAST:event_btnAgendarLlamadaActionPerformed

    private void horaLlamarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_horaLlamarFocusGained
        
        if (horaLlamar.getText().equalsIgnoreCase(TEXT_HORA)){
            horaLlamar.setText(null);
            horaLlamar.requestFocus();
            styleForm.removePlaceHolderStyle(horaLlamar);
        }
    }//GEN-LAST:event_horaLlamarFocusGained


    private void horaLlamarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_horaLlamarFocusLost
        if(0 == horaLlamar.getText().length()){
            styleForm.addPlaceHolderStyle(horaLlamar);
            horaLlamar.setText(TEXT_HORA);
        }
    }//GEN-LAST:event_horaLlamarFocusLost

    private void lblCedulaClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblCedulaClienteFocusGained
        if (lblCedulaCliente.getText().equalsIgnoreCase(TEXT_CEDULA)){
            lblCedulaCliente.setText(null);
            lblCedulaCliente.requestFocus();
            styleForm.removePlaceHolderStyle(lblCedulaCliente);
        }
    }//GEN-LAST:event_lblCedulaClienteFocusGained

    private void lblCedulaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblCedulaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCedulaClienteActionPerformed

    private void lblCedulaClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblCedulaClienteFocusLost
       if(0 == lblCedulaCliente.getText().length()){
            styleForm.addPlaceHolderStyle(lblCedulaCliente);
            lblCedulaCliente.setText(TEXT_CEDULA);
        }
    }//GEN-LAST:event_lblCedulaClienteFocusLost

    private void JbtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnRegresarActionPerformed
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_JbtnRegresarActionPerformed

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
    private javax.swing.JButton JbtnRegresar;
    private javax.swing.JButton btnAgendarLlamada;
    private com.toedter.calendar.JCalendar fechaLLamar;
    private javax.swing.JTextField horaLlamar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lblCedulaCliente;
    // End of variables declaration//GEN-END:variables
}
