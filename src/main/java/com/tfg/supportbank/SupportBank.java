package com.tfg.supportbank;

import com.tfg.supportbank.vistas.InicioVerClientes;
import com.tfg.supportbank.vistas.LoginFormAux;
import com.tfg.supportbank.vistas.MenuCliente;


public class SupportBank {

    public static void main(String[] args) {
        System.out.println("Hello World!");
       /* MenuCliente inicio = new MenuCliente();
        inicio.setVisible (true);*/
        /*InicioVerClientes iniClientes = new InicioVerClientes();
        iniClientes.setVisible(true);*/
        LoginFormAux ventanLoginAux = new LoginFormAux();
        ventanLoginAux.setVisible(true);
    }
}
