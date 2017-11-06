/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Arbitro;
import Modelo.consultaArbitro;
import Vista.RegistrarArbitro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Vanessa
 */
public class ctrlArbitroEliminar implements ActionListener{
    private Arbitro arbitro;
    private consultaArbitro consulta;
    private RegistrarArbitro frmAltaAr;

   
    
     public void iniciarAlta(){
        frmAltaAr.setTitle("Alta Arbitro");
        frmAltaAr.setLocationRelativeTo(null);
     //   frmAlta.txtIdEq.setVisible(false);
    }
    
     @Override
    public void actionPerformed(ActionEvent e){
    
        if(e.getSource() == frmAltaAr.btnRegistrar){
             arbitro.setNombreArbitro(frmAltaAr.txtNombre.getText());
             arbitro.setApellidoArbitro(frmAltaAr.txtApellidos.getText());
             if(consulta.registrarArbitro(arbitro)){
                 JOptionPane.showMessageDialog(null, "Registro Guardado");
                 limpiar();
             }else{
                 JOptionPane.showMessageDialog(null, "Error al Guardar");
                  limpiar();
             }
        }
       
    }
    
    public void limpiar(){
    frmAltaAr.txtNombre.setText("");
    frmAltaAr.txtApellidos.setText("");
    }  
    
    
}
