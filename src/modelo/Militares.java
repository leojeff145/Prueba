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
public class Militares extends Cliente{
    private String codMilitar;
    private String estadoMilitar;
    private String gradoMilitar;

    public Militares(String codMilitar, String estadoMilitar, String gradoMilitar, String nombre, String apellido, long cI, long telefono) {
        super(nombre, apellido, cI, telefono);
        this.codMilitar = codMilitar;
        this.estadoMilitar = estadoMilitar;
        this.gradoMilitar = gradoMilitar;
    }

    public Militares() {
    }
    

    public String getCodMilitar() {
        return codMilitar;
    }

    public void setCodMilitar(String codMilitar) {
        this.codMilitar = codMilitar;
    }

    public String getEstadoMilitar() {
        return estadoMilitar;
    }

    public void setEstadoMilitar(String estadoMilitar) {
        this.estadoMilitar = estadoMilitar;
    }

    public String getGradoMilitar() {
        return gradoMilitar;
    }

    public void setGradoMilitar(String gradoMilitar) {
        this.gradoMilitar = gradoMilitar;
    }

    @Override
    public void registrarCliente(Cliente c) {
        c = new Militares();
        Registro.getRegistroClientes().getListCliente().add(c);
    }

    @Override
    public void eliminarCliente(Cliente c) {
        c = new Militares();
        Registro.getRegistroClientes().getListCliente().remove(c);
    }
    
    

    
    
}
