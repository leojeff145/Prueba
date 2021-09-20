/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Archivo;
import modelo.Coorporativos;
import vista.FrmRegistrarCoorporativo;

/**
 *
 * @author Leonardo Obando
 */
public class ControladorCorporativo implements ActionListener {
    
    Archivo arch = new Archivo();
    FrmRegistrarCoorporativo objVista= new FrmRegistrarCoorporativo();
    Coorporativos corp = new Coorporativos();
    
    public ControladorCorporativo(FrmRegistrarCoorporativo v)
    {
        this.objVista=v;
        this.objVista.btnRegistrarC.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        agregarCorporativoAr();
        
    }
    
    public void agregarCorporativoAr(){
        corp.setNombre(objVista.txtNombreC.getText());
        corp.setApellido(objVista.txtApellidoC.getText());
        corp.setTelefono(Long.parseLong(objVista.txtTelfC.getText()));
        corp.setcI(Long.parseLong(objVista.txtCIC.getText()));
        corp.setiD(objVista.txtIDEmpresa.getText());
        corp.registrarCliente(corp);
        arch.guardarArchivoCorportativo(corp);        
    }
    
    
}
