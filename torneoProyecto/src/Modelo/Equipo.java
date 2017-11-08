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
public class Equipo {
     private int idEquipo;
     private String nombreEquipo;
     private int pjEquipo;
     private int pgEquipo;
     private int ppEquipo;
     private int peEquipo;
     private int gfEquipo;
     private int gcEquipo;
     private int difEquipo;
     private int puntosEquipo;
     private Boolean estadoLiguilla;
     private String equipocol;
     private int torneoIdTorneo;

    public Equipo() {
    }

	
    public Equipo(String nombreEquipo, int torneoIdTorneo) {
        this.nombreEquipo = nombreEquipo;
        this.torneoIdTorneo = torneoIdTorneo;
    }
    public Equipo(String nombreEquipo, Integer pjEquipo, Integer pgEquipo, Integer ppEquipo, Integer peEquipo, Integer gfEquipo, Integer gcEquipo, Integer difEquipo, Integer puntosEquipo, Boolean estadoLiguilla, String equipocol, int torneoIdTorneo) {
       this.nombreEquipo = nombreEquipo;
       this.pjEquipo = pjEquipo;
       this.pgEquipo = pgEquipo;
       this.ppEquipo = ppEquipo;
       this.peEquipo = peEquipo;
       this.gfEquipo = gfEquipo;
       this.gcEquipo = gcEquipo;
       this.difEquipo = difEquipo;
       this.puntosEquipo = puntosEquipo;
       this.estadoLiguilla = estadoLiguilla;
       this.equipocol = equipocol;
       this.torneoIdTorneo = torneoIdTorneo;
    }
    
    
   
    public int getIdEquipo() {
        return this.idEquipo;
    }
    
    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }
    public String getNombreEquipo() {
        return this.nombreEquipo;
    }
    
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
    public int getPjEquipo() {
        return this.pjEquipo;
    }
    
    public void setPjEquipo(int pjEquipo) {
        this.pjEquipo = pjEquipo;
    }
    public int getPgEquipo() {
        return this.pgEquipo;
    }
    
    public void setPgEquipo(int pgEquipo) {
        this.pgEquipo = pgEquipo;
    }
    public int getPpEquipo() {
        return this.ppEquipo;
    }
    
    public void setPpEquipo(int ppEquipo) {
        this.ppEquipo = ppEquipo;
    }
    public int getPeEquipo() {
        return this.peEquipo;
    }
    
    public void setPeEquipo(int peEquipo) {
        this.peEquipo = peEquipo;
    }
    public int getGfEquipo() {
        return this.gfEquipo;
    }
    
    public void setGfEquipo(int gfEquipo) {
        this.gfEquipo = gfEquipo;
    }
    public int getGcEquipo() {
        return this.gcEquipo;
    }
    
    public void setGcEquipo(int gcEquipo) {
        this.gcEquipo = gcEquipo;
    }
    public int getDifEquipo() {
        return this.difEquipo;
    }
    
    public void setDifEquipo(int difEquipo) {
        this.difEquipo = difEquipo;
    }
    public int getPuntosEquipo() {
        return this.puntosEquipo;
    }
    
    public void setPuntosEquipo(int puntosEquipo) {
        this.puntosEquipo = puntosEquipo;
    }
    public Boolean getEstadoLiguilla() {
        return this.estadoLiguilla;
    }
    
    public void setEstadoLiguilla(Boolean estadoLiguilla) {
        this.estadoLiguilla = estadoLiguilla;
    }
    public String getEquipocol() {
        return this.equipocol;
    }
    
    public void setEquipocol(String equipocol) {
        this.equipocol = equipocol;
    }
    public int getTorneoIdTorneo() {
        return this.torneoIdTorneo;
    }
    
    public void setTorneoIdTorneo(int torneoIdTorneo) {
        this.torneoIdTorneo = torneoIdTorneo;
    }

    @Override
    public String toString() {
        return nombreEquipo;
    }

}
