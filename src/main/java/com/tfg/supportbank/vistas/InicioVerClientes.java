package com.tfg.supportbank.vistas;

import com.tfg.supportbank.connection.sql.ConnectionSqlBdPfgBanco;
import com.tfg.supportbank.dao.AsesorDao;
import com.tfg.supportbank.dao.ClienteDao;
import com.tfg.supportbank.dos.AsesorDo;
import com.tfg.supportbank.dos.ClienteDo;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class InicioVerClientes extends javax.swing.JFrame {
    
    /*ConnectionSqlBdPfgBanco sqlConnection = new ConnectionSqlBdPfgBanco();
    Connection conexionSql = sqlConnection.conectar();*/

    /**
     * Creates new form VerCliente
     */
    public InicioVerClientes() {
        initComponents();
        //probarConexionSql();
        mostrarClientes();
        probarLogin();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelIniVerCliente = new javax.swing.JPanel();
        lblListadoClientes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientesLlamar = new javax.swing.JTable();
        btnMenuClientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listado Clientes");

        panelIniVerCliente.setBackground(new java.awt.Color(0, 51, 102));
        panelIniVerCliente.setForeground(new java.awt.Color(0, 0, 153));
        panelIniVerCliente.setToolTipText("");

        lblListadoClientes.setBackground(new java.awt.Color(0, 0, 153));
        lblListadoClientes.setForeground(new java.awt.Color(255, 255, 255));
        lblListadoClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblListadoClientes.setText("LISTADO DE CLIENTES A LLAMAR");

        tablaClientesLlamar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaClientesLlamar);

        btnMenuClientes.setText("VER CLINTES");
        btnMenuClientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMenuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIniVerClienteLayout = new javax.swing.GroupLayout(panelIniVerCliente);
        panelIniVerCliente.setLayout(panelIniVerClienteLayout);
        panelIniVerClienteLayout.setHorizontalGroup(
            panelIniVerClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIniVerClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMenuClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
            .addGroup(panelIniVerClienteLayout.createSequentialGroup()
                .addGroup(panelIniVerClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIniVerClienteLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelIniVerClienteLayout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(lblListadoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        panelIniVerClienteLayout.setVerticalGroup(
            panelIniVerClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIniVerClienteLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblListadoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnMenuClientes)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelIniVerCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelIniVerCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuClientesActionPerformed
        MenuCliente ventanaMenuCliente = new MenuCliente();
        ventanaMenuCliente.setVisible(true);
    }//GEN-LAST:event_btnMenuClientesActionPerformed

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
            java.util.logging.Logger.getLogger(InicioVerClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioVerClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioVerClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioVerClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioVerClientes().setVisible(true);
            }
        });
    }
    
    private void mostrarClientes(){
        DefaultTableModel tClientes = new DefaultTableModel();
        String datos[] = new String [4];
        //setNombre  setApellido1 setApellido2 setTelefono
        tClientes.addColumn("Nombre");
        tClientes.addColumn("Apellido");
        tClientes.addColumn(" ");
        tClientes.addColumn("Telefono");
        
        tablaClientesLlamar.setModel(tClientes);
        setRowsDatos(datos,tClientes);
        tablaClientesLlamar.setModel(tClientes);        
    }
    
    private void setRowsDatos(String[] datos, DefaultTableModel tClientes) {
        ClienteDao clienteDao = new ClienteDao();
        List<ClienteDo> clientes = clienteDao.findAllClientes();
        
        for (ClienteDo cliente: clientes){
            datos[0] = cliente.getNombre();
            datos[1] = cliente.getApellido1();
            datos[2] = cliente.getApellido2();
            datos[3] = String.valueOf(cliente.getTelefono()); 
            tClientes.addRow(datos);
        }
    }
    
    public void probarConexionSql(){
        /*ConnectionSqlBdPfgBanco conex = new ConnectionSqlBdPfgBanco();
        Connection conexionSql = conex.getConnection();*/
         
       /* ConnectionSqlBdPfgBanco sqlConnection = new ConnectionSqlBdPfgBanco();
    Connection conexionSql = sqlConnection.conectar();*/
        
       /* if (null == conexionSql){
            JOptionPane.showMessageDialog(null,"No se ha realizado la conexion a la bbdd sql");
        } else {
            JOptionPane.showMessageDialog(null,"Conexion a la bbdd sql OK");
        }*/
    }

  //  private String[][] obtenerMatriz() {
  
        //ClienteDao clienteDao = new ClienteDao();
        //ArrayList listaClientes = clienteDao.findAllClientes();

        //String matrizInfo[][]=new String[listaClientes.size()][3];

        //for (int i = 0; i < listaClientes.size(); i++) {
        // matrizInfo[i][0] = listaClientes.get(i).toString();  //get+"";  
        /* matrizInfo[i][2]=listaClientes.get(i).getProfesionPersona()+"";
         matrizInfo[i][3]=listaClientes.get(i).getEdadPersona()+"";
         matrizInfo[i][4]=listaClientes.get(i).getTelefonoPersona()+"";*/
       // }

      //  return matrizInfo;
   // }
    
    private void construirTabla() {
       // String titulos[]={ "Codigo", "Nombre", "Edad", "Profesión","Telefono" };
      //  String informacion[][]=obtenerMatriz();

      //  miTabla1=new JTable(informacion,titulos);
       // tablaClientesLlamar.set
      //  mibarra1.setViewportView(miTabla1);

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenuClientes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblListadoClientes;
    private javax.swing.JPanel panelIniVerCliente;
    private javax.swing.JTable tablaClientesLlamar;
    // End of variables declaration//GEN-END:variables

    private void probarLogin() {
        LoginForm ventanaLogin = new LoginForm();
        ventanaLogin.setVisible(true);
    }


}
