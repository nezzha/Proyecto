/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Vanessa
 */
public class Usuario {
    private int idUsuario;
     private String nombreUsuario;
     private String passw;
     private String tipoUsuario;

    public Usuario() {
    }

    public Usuario(String nombreUsuario, String passw, String tipoUsuario) {
       this.nombreUsuario = nombreUsuario;
       this.passw = passw;
       this.tipoUsuario = tipoUsuario;
    }
   
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getPassw() {
        return this.passw;
    }
    
    public void setPassw(String passw) {
        this.passw = passw;
    }
    public String getTipoUsuario() {
        return this.tipoUsuario;
    }
    
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }


}
