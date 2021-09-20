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
public abstract class Cliente {
    protected String nombre;
    protected String apellido;
    protected long cI;
    protected long telefono;

    public Cliente(String nombre, String apellido, long cI, long telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cI = cI;
        this.telefono = telefono;
    }

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getcI() {
        return cI;
    }

    public void setcI(long cI) {
        this.cI = cI;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
    
    
    //Metodos Abstractos
    public abstract void registrarCliente(Cliente c);
    public abstract void eliminarCliente(Cliente c);
    
}
