package com.tfg.supportbank.dao;

import com.tfg.supportbank.connection.sql.ConnectionSqlBdPfgBanco;
import com.tfg.supportbank.dos.AsesorDo;
import com.tfg.supportbank.dos.ClienteDo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class AsesorDao {
    
    private Connection connection;
    ConnectionSqlBdPfgBanco conex;
    
    public AsesorDao(){
        conex = new ConnectionSqlBdPfgBanco();
        Connection conexionSql = conex.conectar();
        connection = conex.getConnection();
    }

    public AsesorDo findByUserAndPass(String user, String passSha) {
        String sql = "SELECT * FROM ASESOR WHERE usuario = ? AND password = ?";
        AsesorDo asesorDo = null;
        try {          
         PreparedStatement buscar = connection.prepareStatement(sql);            
         buscar.setString(1, user);
         buscar.setString(2, passSha);
         
         ResultSet rs = buscar.executeQuery();
         while (rs.next()) {
            asesorDo = new AsesorDo();
            toAsesorDo(asesorDo, rs);     
            //JOptionPane.showMessageDialog(null, "Login Asesor encontrado");
         }
         rs.close();
         buscar.close();
         conex.desconectar();
         

        } catch (SQLException e) {
         System.out.println(e.getMessage());
         JOptionPane.showMessageDialog(null, "Error Login " + e.getMessage(), "Error",
           JOptionPane.ERROR_MESSAGE);

        }
        return asesorDo;
    }
    
    public void probarConexionSql(){
        
        if (null == connection){
            JOptionPane.showMessageDialog(null,"No se ha realizado la conexion a la bbdd sql");
        } else {
            JOptionPane.showMessageDialog(null,"Conexion a la bbdd sql OK");
        }
    }        

    private void toAsesorDo(AsesorDo asesorDo, ResultSet rs) throws SQLException {
        asesorDo.setIdAsesor(rs.getInt("id_asesor"));
        asesorDo.setCedula(rs.getInt("cedula"));
        asesorDo.setNombre(rs.getString("nombre"));
        asesorDo.setUsuario(rs.getString("usuario"));
        asesorDo.setPassword(rs.getString("password"));        
        asesorDo.setPregunta(rs.getString("pregunta_seguridad"));        
        asesorDo.setRespuesta(rs.getString("respuesta_seguridad"));        
    }

    public AsesorDo findByUser(String user) {
        String sql = "SELECT * FROM ASESOR WHERE usuario = ?";
        AsesorDo asesorDo = null;
        try {          
         PreparedStatement buscar = connection.prepareStatement(sql);            
         buscar.setString(1, user);
         
         ResultSet rs = buscar.executeQuery();
         while (rs.next()) {
            asesorDo = new AsesorDo();
            toAsesorDo(asesorDo, rs);     
            //JOptionPane.showMessageDialog(null, " Asesor encontrado");
         }
         rs.close();
         buscar.close();
         conex.desconectar();
         

        } catch (SQLException e) {
         System.out.println(e.getMessage());
         JOptionPane.showMessageDialog(null, "Error Busqueda  " + e.getMessage(), "Error",
           JOptionPane.ERROR_MESSAGE);

        }
        return asesorDo;
    }

    public void updatePass(int cedula, String password) {
        String sql = "UPDATE ASESOR SET " +
        " password = ? "
        + " WHERE cedula = ?"
        ; 

        try {          
         PreparedStatement preparedStatement = connection.prepareStatement(sql);   
         
         
         preparedStatement.setString(1, password);
         preparedStatement.setInt(2, cedula);
         
         preparedStatement.executeUpdate();
         preparedStatement.close();
         conex.desconectar();
         JOptionPane.showMessageDialog(null, "Contraseña Modificada");

        } catch (SQLException e) {
         System.out.println(e.getMessage());
         JOptionPane.showMessageDialog(null, "Error al modificar contraseña " + e.getMessage(), "Error",
           JOptionPane.ERROR_MESSAGE);

        }
    }
    
}
