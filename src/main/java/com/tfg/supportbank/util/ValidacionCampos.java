package com.tfg.supportbank.util;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ValidacionCampos {

    public String validarCamposFormString(JTextField campo, List<JTextField> listCamposNotNull) {
        if (null != campo && !campo.getText().isEmpty()) {
            return campo.getText();
        } else {
            listCamposNotNull.add(campo);
            return "";
        }
    }

    public float validarCamposFormFloat(JTextField campo, List<JTextField> listCamposNotNull) {
        if (null != campo && !campo.getText().isEmpty()) {
            boolean isNum = isReal(campo.getText().trim());
            if (isNum){
            return Float.valueOf(campo.getText().trim());
            } else {
                JOptionPane.showMessageDialog(null, campo.getText().trim()+" debe ser numerico, formato: '.' separa la parte decimal. Ejemplo: 1000.65");
                listCamposNotNull.add(campo);
                return 0;
            }
        } else {
            listCamposNotNull.add(campo);
            return 0;
        }
    }
    
    public float validarCamposFloat(JTextField campo, List<JTextField> listCamposNotNull) {
        if (null != campo && !campo.getText().isEmpty()) {
            boolean isNum = isNum(campo.getText().trim());
            if (isNum){
            return Float.valueOf(campo.getText().trim());
            } else {
                JOptionPane.showMessageDialog(null, campo.getText().trim()+" debe ser numerico");
                listCamposNotNull.add(campo);
                return 0;
            }
        } else {
            listCamposNotNull.add(campo);
            return 0;
        }
    }

    public int validarCamposFormInteger(JTextField campo, List<JTextField> listCamposNotNull) {
        if (null != campo && !campo.getText().isEmpty()) {
            boolean isNum = isNum(campo.getText().trim());
            if (isNum){
                return  Integer.valueOf(campo.getText().trim());
            } else {
                JOptionPane.showMessageDialog(null, campo.getText().trim()+" debe ser numerico, no puede contener '.' o ','");
                listCamposNotNull.add(campo);
                return 0; 
            }           
        } else {
            listCamposNotNull.add(campo);
            return 0;
        }
    }
    
    /**
     * date1.compareTo(date2)
     * @param fechaComparar date1
     * @param fechaQueComparar date2
     * @return  fechaComparar MENOR fechaQueComparar, devuelve un valor menor que 0
     *          fechaQueComparar MAYOR fechaComparar, devuelve un valor mayor que 0
     *          fechaComparar = fechaQueComparar, se mostrará un 0
     */
    public int validarCampoFecha (Date fechaComparar, Date fechaQueComparar){
        return fechaComparar.compareTo(fechaQueComparar);
    }
    
    public boolean validarEmail(JTextField email, List<JTextField> listCamposNotNull){
        String expresionEmail = ("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        if (email.getText().trim().matches(expresionEmail)){
            return true;
        } else {
            listCamposNotNull.add(email);
            JOptionPane.showMessageDialog(null, "El formato de email debe ser: abcd@abc.abc");
            return false;
        }
    }
    
    public boolean isNum (String dato){
        if(dato.matches("[0-9]*"))
            return true;
        else 
            return false;
    }
    
    public boolean isReal (String dato){
        if(dato.matches("^[0-9]+([\\.,][0-9]+)?$"))
            return true;
        else 
            return false;
    }
    
}
