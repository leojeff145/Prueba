/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Leonardo Obando
 */
public class Registro {
    
    private static Registro registroClientes= new Registro();  
    private ArrayList <Cliente> listCliente = new ArrayList();

    private Registro() {
    }

    public static Registro getRegistroClientes() {
        return registroClientes;
    }    

    public ArrayList<Cliente> getListCliente() {
        return listCliente;
    }

    public void setListCliente(ArrayList<Cliente> listCliente) {
        this.listCliente = listCliente;
    }

    
    
}
