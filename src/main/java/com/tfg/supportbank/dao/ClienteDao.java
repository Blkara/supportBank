package com.tfg.supportbank.dao;


import com.tfg.supportbank.connection.sql.ConnectionSqlBdPfgBanco;
import com.tfg.supportbank.dos.ClienteDo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
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

        try {          
         PreparedStatement preparedStatement = connection.prepareStatement(sql);   
         
         
         preparedStatement.setString(1, clienteDo.getNombre());
         preparedStatement.setString(2, clienteDo.getApellido1());
         preparedStatement.setString(3, clienteDo.getApellido2());
         preparedStatement.setString(4, clienteDo.getDireccion());
         preparedStatement.setInt(5, clienteDo.getTelefono());
         preparedStatement.setString(6, clienteDo.getEmail());
         preparedStatement.setString(7, clienteDo.getEstadoCivil());
         preparedStatement.setFloat(8, clienteDo.getIngresos());
         preparedStatement.setString(9, clienteDo.getEmpresa());
         preparedStatement.setInt(10, clienteDo.getPuntosDataCredito());
         preparedStatement.setInt(11, clienteDo.getCedula());
         
         preparedStatement.executeUpdate();
         preparedStatement.close();
         conex.desconectar();
         JOptionPane.showMessageDialog(null, "Cliente Modificado");

        } catch (SQLException e) {
         System.out.println(e.getMessage());
         JOptionPane.showMessageDialog(null, "Error al buscar clientes " + e.getMessage(), "Error",
           JOptionPane.ERROR_MESSAGE);

        }
    }    

    public void eliminarCliente(String sql, String cedula) {
        try {          
         PreparedStatement eliminar = connection.prepareStatement(sql);    
         
         eliminar.setString(1, cedula);
         
         //ResultSet rs = buscar.executeQuery();
         eliminar.executeUpdate();
         
         
         eliminar.close();
         conex.desconectar();
         JOptionPane.showMessageDialog(null, "Cliente Elimiado");

        } catch (SQLException e) {
         System.out.println(e.getMessage());
         JOptionPane.showMessageDialog(null, "Error al eliminar cliente " + e.getMessage(), "Error",
           JOptionPane.ERROR_MESSAGE);

        }
    }

    public void updateFechaLlamar(int cedula, Date time, String hora) {
        try {          
         String sql = "UPDATE CLIENTE SET fecha_llamar = ?, hora_llamar = ?  WHERE  cedula = ?";
         PreparedStatement preparedStatement = connection.prepareStatement(sql);   
         
         SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
         String fechaLlamar = formatoFecha.format(time);
         
         
        /*String fecha = "to_date('"+ fechaLlamar +"', 'yyyy-MM-dd HH:mm:ss') ";
            final java.sql.Date sqlDate = new java.sql.Date(time.getTime());*/
            /*sqlDate.setHours(9);
            sqlDate.setHours(30);*/
         
         //preparedStatement.setString(1, fecha);
         //preparedStatement.setDate(1, java.sql.Date.valueOf(fechaLlamar));
         preparedStatement.setString(1, fechaLlamar);
         preparedStatement.setString(2, hora);
        // ps.setDate(2, java.sql.Date.valueOf("2013-09-04"));
         preparedStatement.setInt(3, cedula);
         
         preparedStatement.executeUpdate();
         preparedStatement.close();
         conex.desconectar();
         //JOptionPane.showMessageDialog(null, "Cliente Modificado: " + new java.sql.Date(time);

        } catch (SQLException e) {
         System.out.println(e.getMessage());
         JOptionPane.showMessageDialog(null, "Error al buscar clientes " + e.getMessage(), "Error",
           JOptionPane.ERROR_MESSAGE);

        }
    }

 
}
