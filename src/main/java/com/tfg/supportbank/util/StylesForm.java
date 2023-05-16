package com.tfg.supportbank.util;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class StylesForm {
    
    public void addPlaceHolderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.gray);    
    }
    
    public void removePlaceHolderStyle (JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN|Font.BOLD);
        textField.setFont(font);
        textField.setForeground(Color.black);  
    }

    public void limpiarCampo(JTextField campo) {
        campo.setText("");
    }
}
