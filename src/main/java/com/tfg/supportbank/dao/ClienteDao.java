package com.tfg.supportbank.dao;


import com.tfg.supportbank.connection.sql.ConnectionSqlBdPfgBanco;
import com.tfg.supportbank.dos.ClienteDo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Clase que permite el acceso a la base de datos
 * 
 * 
 */
public class ClienteDao {
    
    private Connection connection;
    
    public ClienteDao(){
        ConnectionSqlBdPfgBanco conex = new ConnectionSqlBdPfgBanco();
        Connection conexionSql = conex.conectar();
        connection = conex.getConnection();
        probarConexionSql();
           /*ConnectionSqlBdPfgBanco sqlConnection = new ConnectionSqlBdPfgBanco();
    Connection conexionSql = sqlConnection.conectar();*/
    }
    
    public List<ClienteDo> buscarClientesMatriz() {
        List<ClienteDo> listaClientes = new ArrayList();
        ClienteDo clienteDo;
        try {
              final 
         Statement statement = connection.createStatement();
         ResultSet rs = statement.executeQuery("SELECT * FROM Cliente ");

         while (rs.next()) {
          clienteDo = new ClienteDo();
          clientetoDo(clienteDo, rs);
          listaClientes.add(clienteDo);       
         }
         rs.close();
         statement.close();
         //conex.desconectar();

        } catch (SQLException e) {
         System.out.println(e.getMessage());
         JOptionPane.showMessageDialog(null, "Error al consultar" + e.getMessage(), "Error",
           JOptionPane.ERROR_MESSAGE);

        }
        return listaClientes;
    }

    private void clientetoDo(ClienteDo clienteDo, ResultSet rs) throws SQLException {
        clienteDo.setIdCliente(rs.getInt("id_cliente"));
        clienteDo.setCedula(rs.getInt("cedula"));
        clienteDo.setNombre(rs.getString("nombre"));
        clienteDo.setApellido1(rs.getString("apellido1"));
        clienteDo.setApellido2(rs.getString("apellido2"));
        clienteDo.setDireccion(rs.getString("direccion"));
        clienteDo.setTelefono(rs.getInt("telefono"));
        clienteDo.setEmail(rs.getString("email"));
        clienteDo.setEstadoCivil(rs.getString("estado_civil"));
        clienteDo.setIngresos(rs.getFloat("ingresos"));
        clienteDo.setEmpresa(rs.getString("empresa"));
        clienteDo.setReFamiliar(rs.getString("ref_familiar"));
        clienteDo.setRefPersonal(rs.getString("ref_personal"));
        clienteDo.setFechaEntradaEmpresa( rs.getDate("fecha_entrada_empresa"));
        clienteDo.setPuntosDataCredito(rs.getInt("puntos_data_credito"));
        clienteDo.setFechaLlamar(rs.getDate("fecha_llamar"));
        clienteDo.setIdAsesor(rs.getInt("idAsesor"));
    }
    
        public void probarConexionSql(){
        /*ConnectionSqlBdPfgBanco conex = new ConnectionSqlBdPfgBanco();*/
        //Connection conexionSql = this.getConnection();
         
       /* ConnectionSqlBdPfgBanco sqlConnection = new ConnectionSqlBdPfgBanco();
    Connection conexionSql = sqlConnection.conectar();*/
        
        if (null == connection){
            JOptionPane.showMessageDialog(null,"No se ha realizado la conexion a la bbdd sql");
        } else {
            JOptionPane.showMessageDialog(null,"Conexion a la bbdd sql OK");
        }
    }
    
}
