package com.tfg.supportbank.util;

public class ValidacionFormulario {
    public int validarCamposFormInteger(JTextField campo, List<JTextField> listCamposNotNu) {
        if (null != campo && !campo.getText().isEmpty()) {
            return Integer.valueOf(campo.getText());
        } else {
            listCamposNotNull.add(campo);
            return 0;
        }
    }
}
