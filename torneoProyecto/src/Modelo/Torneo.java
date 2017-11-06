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
public class Torneo {
    private int idTorneo;
     private String nombreTorneo;
     private Boolean estadoTorneo;
     private String campeonTorneo;

    public Torneo() {
    }

    public Torneo(String nombreTorneo, Boolean estadoTorneo, String campeonTorneo) {
       this.nombreTorneo = nombreTorneo;
       this.estadoTorneo = estadoTorneo;
       this.campeonTorneo = campeonTorneo;
    }
    
    public Torneo(String nombreTorneo, Boolean estadoTorneo) {
       this.nombreTorneo = nombreTorneo;
       this.estadoTorneo = estadoTorneo;
    }
   
    public int getIdTorneo() {
        return this.idTorneo;
    }
    
    public void setIdTorneo(int idTorneo) {
        this.idTorneo = idTorneo;
    }
    public String getNombreTorneo() {
        return this.nombreTorneo;
    }
    
    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }
    public Boolean getEstadoTorneo() {
        return this.estadoTorneo;
    }
    
    public void setEstadoTorneo(Boolean estadoTorneo) {
        this.estadoTorneo = estadoTorneo;
    }
    public String getCampeonTorneo() {
        return this.campeonTorneo;
    }
    
    public void setCampeonTorneo(String campeonTorneo) {
        this.campeonTorneo = campeonTorneo;
    }

    @Override
    public String toString() {
        return  nombreTorneo ;
    }
    
    
}
