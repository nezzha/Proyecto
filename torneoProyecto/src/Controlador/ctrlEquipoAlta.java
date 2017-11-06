/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Equipo;
import Modelo.consultaEquipo;
import Vista.RegistrarEquipo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Vanessa
 */
public class ctrlEquipoAlta implements ActionListener{
    private Equipo equipo;
    private consultaEquipo consulta;
    private RegistrarEquipo frmAltaEq;

    public ctrlEquipoAlta(Equipo equipo, consultaEquipo consulta, RegistrarEquipo frmAltaEq) {
        this.equipo = equipo;
        this.consulta = consulta;
        this.frmAltaEq = frmAltaEq;
    }
       
    public void iniciarAlta(){
        frmAltaEq.setTitle("Alta Jugador");
        frmAltaEq.setLocationRelativeTo(null);
     //   frmAlta.txtIdEq.setVisible(false);
    }
    
     @Override
    public void actionPerformed(ActionEvent e){
    
        if(e.getSource() == frmAltaEq.btnAceptar){
             equipo.setNombreEquipo(frmAltaEq.txtNombreEq.getText());
             if(consulta.registrarEquipo(equipo)){
                 JOptionPane.showMessageDialog(null, "Registro Guardado");
                 limpiar();
             }else{
                 JOptionPane.showMessageDialog(null, "Error al Guardar");
                  limpiar();
             }
        }
       
    }
    
    public void limpiar(){
    frmAltaEq.txtNombreEq.setText("");
    }  
    
}
