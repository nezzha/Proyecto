/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Vanessa
 */
public class Partido {
     private int idPartido;
     private Date fechaPartido;
     private String horaPartido;
     private int golesEquipo1;
     private int golesEquipo2;
     private Boolean estadoPartido;
     private int equipoIdEquipo2;
     private int equipoIdEquipo1;
     private int arbitroIdArbitro;
     private Boolean liguillaPartido;

    public Partido() {
    }

	
    public Partido(Date fechaPartido, String horaPartido, int equipoIdEquipo2, int equipoIdEquipo1, int arbitroIdArbitro) {
        this.fechaPartido = fechaPartido;
        this.horaPartido = horaPartido;
        this.equipoIdEquipo2 = equipoIdEquipo2;
        this.equipoIdEquipo1 = equipoIdEquipo1;
        this.arbitroIdArbitro = arbitroIdArbitro;
    }
    public Partido(Date fechaPartido, String horaPartido, int golesEquipo1, int golesEquipo2, Boolean estadoPartido, int equipoIdEquipo2, int equipoIdEquipo1, int arbitroIdArbitro, Boolean liguillaPartido) {
       this.fechaPartido = fechaPartido;
       this.horaPartido = horaPartido;
       this.golesEquipo1 = golesEquipo1;
       this.golesEquipo2 = golesEquipo2;
       this.estadoPartido = estadoPartido;
       this.equipoIdEquipo2 = equipoIdEquipo2;
       this.equipoIdEquipo1 = equipoIdEquipo1;
       this.arbitroIdArbitro = arbitroIdArbitro;
       this.liguillaPartido = liguillaPartido;
    }
   
    public int getIdPartido() {
        return this.idPartido;
    }
    
    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }
    public Date getFechaPartido() {
        return this.fechaPartido;
    }
    
    public void setFechaPartido(Date fechaPartido) {
        this.fechaPartido = fechaPartido;
    }
    public String getHoraPartido() {
        return this.horaPartido;
    }
    
    public void setHoraPartido(String horaPartido) {
        this.horaPartido = horaPartido;
    }
    public int getGolesEquipo1() {
        return this.golesEquipo1;
    }
    
    public void setGolesEquipo1(int golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }
    public int getGolesEquipo2() {
        return this.golesEquipo2;
    }
    
    public void setGolesEquipo2(int golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }
    public Boolean getEstadoPartido() {
        return this.estadoPartido;
    }
    
    public void setEstadoPartido(Boolean estadoPartido) {
        this.estadoPartido = estadoPartido;
    }
    public int getEquipoIdEquipo2() {
        return this.equipoIdEquipo2;
    }
    
    public void setEquipoIdEquipo2(int equipoIdEquipo2) {
        this.equipoIdEquipo2 = equipoIdEquipo2;
    }
    public int getEquipoIdEquipo1() {
        return this.equipoIdEquipo1;
    }
    
    public void setEquipoIdEquipo1(int equipoIdEquipo1) {
        this.equipoIdEquipo1 = equipoIdEquipo1;
    }
    public int getArbitroIdArbitro() {
        return this.arbitroIdArbitro;
    }
    
    public void setArbitroIdArbitro(int arbitroIdArbitro) {
        this.arbitroIdArbitro = arbitroIdArbitro;
    }
    public Boolean getLiguillaPartido() {
        return this.liguillaPartido;
    }
    
    public void setLiguillaPartido(Boolean liguillaPartido) {
        this.liguillaPartido = liguillaPartido;
    }


}
