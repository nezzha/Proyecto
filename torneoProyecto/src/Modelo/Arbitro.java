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
public class Arbitro {
      private int idArbitro;
     private String nombreArbitro;
     private String apellidoArbitro;

    public Arbitro() {
    }

    public Arbitro(String nombreArbitro, String apellidoArbitro) {
       this.nombreArbitro = nombreArbitro;
       this.apellidoArbitro = apellidoArbitro;
    }
   
    public int getIdArbitro() {
        return this.idArbitro;
    }
    
    public void setIdArbitro(int idArbitro) {
        this.idArbitro = idArbitro;
    }
    public String getNombreArbitro() {
        return this.nombreArbitro;
    }
    
    public void setNombreArbitro(String nombreArbitro) {
        this.nombreArbitro = nombreArbitro;
    }
    public String getApellidoArbitro() {
        return this.apellidoArbitro;
    }
    
    public void setApellidoArbitro(String apellidoArbitro) {
        this.apellidoArbitro = apellidoArbitro;
    }

    @Override
    public String toString() {
        return  nombreArbitro ;
    }


}
