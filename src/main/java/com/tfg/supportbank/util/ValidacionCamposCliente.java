package com.tfg.supportbank.util;

import java.util.List;
import javax.swing.JTextField;

public class ValidacionCamposCliente {

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
            return Float.valueOf(campo.getText());
        } else {
            listCamposNotNull.add(campo);
            return 0;
        }
    }

    public int validarCamposFormInteger(JTextField campo, List<JTextField> listCamposNotNull) {
        if (null != campo && !campo.getText().isEmpty()) {
            return Integer.valueOf(campo.getText());
        } else {
            listCamposNotNull.add(campo);
            return 0;
        }
    }
    
}
