
package com.tfg.supportbank.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;


public class Encode {
    
    public static String sha2(String password, String salt) {
        try {
            MessageDigest mDigest = MessageDigest.getInstance("SHA-256");
            //String saltValue = salt; // get from property file
            String passWithSalt = password + salt;
            byte[] passBytes = passWithSalt.getBytes();
            byte[] result = mDigest.digest(passBytes);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < result.length; i++) {
                sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
            }
            //JOptionPane.showMessageDialog(null, "pass sha2 + salt user: : " + salt+ " pass: " + sb.toString());
            return sb.toString();
            
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
        
        
        
        
    }
    
}
