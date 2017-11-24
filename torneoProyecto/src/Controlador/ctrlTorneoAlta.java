/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Torneo;
import Modelo.consultaTorneo;
import Vista.RegistrarTorneo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Vanessa
 */
public class ctrlTorneoAlta implements ActionListener{
    private Torneo torneo;
    private consultaTorneo consulta;
    private RegistrarTorneo frmTorneo;

    public ctrlTorneoAlta(Torneo torneo, consultaTorneo consulta, RegistrarTorneo frmTorneo) {
        this.torneo = torneo;
        this.consulta = consulta;
        this.frmTorneo = frmTorneo;
        this.frmTorneo.btnGuardar.addActionListener(this);
    }
    
    public void iniciarAlta(){
        frmTorneo.setTitle("Alta Jugador");
        frmTorneo.setLocationRelativeTo(null);
     //   frmAlta.txtIdEq.setVisible(false);
    }
    
     @Override
    public void actionPerformed(ActionEvent e){
    
        if(e.getSource() == frmTorneo.btnGuardar){
            if(frmTorneo.txtNombreTorneo.getText().trim().length()==0){
                        JOptionPane.showMessageDialog(null, "Faltan campo por llenar ");
                        frmTorneo.txtNombreTorneo.setText("");
            }
            else{
                torneo.setNombreTorneo(frmTorneo.txtNombreTorneo.getText());
                if(consulta.registrarTorneo(torneo)){
                    JOptionPane.showMessageDialog(null, "Registro Guardado");
                    limpiar();
                }else{
                    JOptionPane.showMessageDialog(null, "Error al Guardar");
                     limpiar();
                }
            }
        }
        
       
    }
    
    public void limpiar(){
    frmTorneo.txtNombreTorneo.setText("");
    }  
    
    
}
