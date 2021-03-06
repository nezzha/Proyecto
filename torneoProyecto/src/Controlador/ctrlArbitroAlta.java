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
public class ctrlArbitroAlta implements ActionListener {
    private Arbitro arbitro;
    private consultaArbitro consulta;
    private RegistrarArbitro frmAltaAr;

    public ctrlArbitroAlta(Arbitro arbitro, consultaArbitro consulta, RegistrarArbitro frmAltaAr) {
        this.arbitro = arbitro;
        this.consulta = consulta;
        this.frmAltaAr = frmAltaAr;
        this.frmAltaAr.btnRegistrar.addActionListener(this);
    }
    
     public void iniciarAlta(){
        frmAltaAr.setTitle("Alta Arbitro");
        frmAltaAr.setLocationRelativeTo(null);
     //   frmAlta.txtIdEq.setVisible(false);
    }
    
     @Override
    public void actionPerformed(ActionEvent e){
    
        if(e.getSource() == frmAltaAr.btnRegistrar){
            if(frmAltaAr.txtNombre.getText().trim().length()==0 &&  frmAltaAr.txtApellidos.getText().trim().length()==0){
                JOptionPane.showMessageDialog(null, "Faltan campos por rellenar");
                frmAltaAr.txtNombre.setText("");
                frmAltaAr.txtApellidos.setText("");
                //System.out.println("aquiii");
            }else{
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
       
    }
    
    public void limpiar(){
    frmAltaAr.txtNombre.setText("");
    frmAltaAr.txtApellidos.setText("");
    }  
    
    
}
