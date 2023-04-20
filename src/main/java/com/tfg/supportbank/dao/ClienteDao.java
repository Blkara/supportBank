package com.tfg.supportbank.dao;


import com.tfg.supportbank.connection.sql.ConnectionSqlBdPfgBanco;
import com.tfg.supportbank.dos.ClienteDo;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
    ConnectionSqlBdPfgBanco conex;
    
    public ClienteDao(){
        conex = new ConnectionSqlBdPfgBanco();
        Connection conexionSql = conex.conectar();
        connection = conex.getConnection();
        probarConexionSql();
           /*ConnectionSqlBdPfgBanco sqlConnection = new ConnectionSqlBdPfgBanco();
    Connection conexionSql = sqlConnection.conectar();*/
    }
    
    public List<ClienteDo> findAllClientes() {
        List<ClienteDo> listaClientes = new ArrayList();
        ClienteDo clienteDo;
        try { 
         Statement statement = connection.createStatement();
         ResultSet rs = statement.executeQuery("SELECT * FROM Cliente ");

         while (rs.next()) {
          clienteDo = new ClienteDo();
          clientetoDo(clienteDo, rs);
          listaClientes.add(clienteDo);       
         }
         rs.close();
         statement.close();
         conex.desconectar();

        } catch (SQLException e) {
         System.out.println(e.getMessage());
         JOptionPane.showMessageDialog(null, "Error al consultar clientes " + e.getMessage(), "Error",
           JOptionPane.ERROR_MESSAGE);

        }
        return listaClientes;
    }
    
    public void addCliente (String sql, ClienteDo clienteDo){
        
        //Statement statement = connection.createStatement();
        try{
            
            PreparedStatement guardar = connection.prepareStatement(sql);
            
            guardar.setInt(1, clienteDo.getCedula());
            guardar.setString(2, clienteDo.getNombre());
            guardar.setString(3, clienteDo.getApellido1());
            guardar.setString(4, clienteDo.getApellido2());
            guardar.setString(5, clienteDo.getDireccion());
            guardar.setInt(6, clienteDo.getTelefono());
            guardar.setString(7, clienteDo.getEmail());
            guardar.setString(8, clienteDo.getEstadoCivil());
            guardar.setFloat(9, clienteDo.getIngresos());
            guardar.setString(10, clienteDo.getEmpresa());
            guardar.setString(11, clienteDo.getReFamiliar());
            guardar.setString(12, clienteDo.getRefPersonal());
            //guardar.setDate(13, clienteDo.getFechaEntradaEmpresa());
            guardar.setInt(13, clienteDo.getPuntosDataCredito());
            //guardar.setDate(15, clienteDo.getFechaLlamar());
            guardar.setInt(14, Integer.valueOf(clienteDo.getIdAsesor()));
           // guardar.setDate(12, "DATE '"+clienteDo.getFechaLlamar()+"'");
            
            
            guardar.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente Registrado");
            guardar.close();
            conex.desconectar();
            
        } catch (SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al agregar cliente " + e.getMessage(), "Error",
           JOptionPane.ERROR_MESSAGE);
        }
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
        
    public ClienteDo findClienteByCedula(String sql, Integer cedula) {
        ClienteDo clienteDo = null;
        try { 
         //PreparedStatement buscar = connection.prepareStatement("SELECT * from cliente WHERE  cedula = '11111111'");
         //buscar.setInt(1, cedula);
         //ResultSet rs = buscar.executeQuery(sql);
         //buscar.executeUpdate();
         /*Statement buscar = connection.createStatement();
         ResultSet rs = buscar.executeQuery("SELECT * from cliente WHERE  cedula = ?");*/
         
         PreparedStatement buscar = connection.prepareStatement(sql);            
         buscar.setInt(1, cedula);
         
         ResultSet rs = buscar.executeQuery();
         while (rs.next()) {
          clienteDo = new ClienteDo();
          clientetoDo(clienteDo, rs);     
         }
         rs.close();
         buscar.close();
         conex.desconectar();
         JOptionPane.showMessageDialog(null, "Cliente encontrado");

        } catch (SQLException e) {
         System.out.println(e.getMessage());
         JOptionPane.showMessageDialog(null, "Error al buscar clientes " + e.getMessage(), "Error",
           JOptionPane.ERROR_MESSAGE);

        }
        return clienteDo;
    }

    public void updateCliente(String sql, ClienteDo clienteDo) {
        /**
         * String sql = "UPDATE CLIENTE SET " +
        " nombre = ?,apellido1 = ?,apellido2 = ?,direccion = ?,telefono = ?,email = ?,"
        + "estado_civil = ?,ingresos = ?,empresa = ?,"
        + "puntos_data_credito = ?,) "
        + " WHERE cedula = ?"
        ; 
         */
    }    

 
}
