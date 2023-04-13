
package com.tfg.supportbank.connection.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ConnectionSqlBdPfgBanco {
    
    Connection conexion = null;
    
    public Connection conectar (){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"/*"com.mysql.jdbc.Driver"*/);
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pfgbanco","root","");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e + "No fue posible establecer la conexion");
        }
        return conexion;
    }
    
    /**Permite retornar la conexión*/
    public Connection getConnection(){
      return conexion;
    }

    public void desconectar(){
      conexion = null;
    }
    
}
