/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Leonardo Obando
 */
public class Generales extends Cliente{

    public Generales() {
    }
    
    

    @Override
    public void registrarCliente(Cliente c) {
        c = new Generales();
        Registro.getRegistroClientes().getListCliente().add(c);
    }

    @Override
    public void eliminarCliente(Cliente c) {
        c = new Generales();
        Registro.getRegistroClientes().getListCliente().remove(c);
        
    }
    
    

    
    
    
    
}
