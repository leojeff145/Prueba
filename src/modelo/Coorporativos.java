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
public class Coorporativos extends Cliente {
    private String iD;

    public Coorporativos(String iD, String nombre, String apellido, long cI, long telefono) {
        super(nombre, apellido, cI, telefono);
        this.iD = iD;
    }

    public Coorporativos() {
    }
    

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    @Override
    public void registrarCliente(Cliente c) {
        c = new Coorporativos();
        Registro.getRegistroClientes().getListCliente().add(c);
    }

    @Override
    public void eliminarCliente(Cliente c) {
        c = new Coorporativos();
        Registro.getRegistroClientes().getListCliente().remove(c);
    }
    
    

    
}
