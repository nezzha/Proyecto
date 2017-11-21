package Controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Modelo.Usuario;
import Modelo.consultaUsuario;
import Vista.RegistrarUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Vanessa
 */
public class ctrlUsuarioAlta implements ActionListener {
    private Usuario usuario;
    private consultaUsuario consulta;
    private RegistrarUsuario frmRegistro;
    
     public void iniciarAlta(){
        frmRegistro.setTitle("Registro de Usuario");
        frmRegistro.setLocationRelativeTo(null);
     //   frmAlta.txtIdEq.setVisible(false);
    }

    public ctrlUsuarioAlta(Usuario usuario, consultaUsuario consulta, RegistrarUsuario frmRegistro) {
        this.usuario = usuario;
        this.consulta = consulta;
        this.frmRegistro = frmRegistro;
        this.frmRegistro.btnGuardar.addActionListener(this);
    }
    
     @Override
    public void actionPerformed(ActionEvent e){
    
        if(e.getSource() == frmRegistro.btnGuardar){
            if(frmRegistro.txtUsuario.getText().equals("") ||frmRegistro.txtPswd.getText().equals("") ){
                   JOptionPane.showMessageDialog(null, "Falntan campos por llenar");
            }
            else{
                usuario.setNombreUsuario(frmRegistro.txtUsuario.getText());
                usuario.setPassw(frmRegistro.txtPswd.getText());
                usuario.setTipoUsuario(frmRegistro.cmbTipoUser.getSelectedItem().toString());
                //JOptionPane.showMessageDialog(null, ""+ frmRegistro.cmbTipoUser.getSelectedItem().toString());
                if(consulta.registrarUsuario(usuario)){
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
    frmRegistro.txtUsuario.setText("");
    frmRegistro.txtPswd.setText("");
    }  
    
}
