
package com.tfg.supportbank.connection.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ConnectionSqlBdPfgBanco {
    
    Connection conexion = null;
    
    public Connection conectar (){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pfgbanco","root","");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e + "No fue posible establecer la conexion");
        }
        return conexion;
    }
    
}
