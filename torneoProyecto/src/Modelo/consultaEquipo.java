/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Vanessa
 */
public class consultaEquipo extends Conexion{
     public boolean registrarEquipo(Equipo equipo){
    
        PreparedStatement ps= null;
        Connection con = getConexion();
        String sql ="INSERT INTO Equipo (nombreEquipo,Torneo_idTorneo) VALUES(?,?)";  
        
        try{
        
            ps= con.prepareStatement(sql);
            
            ps.setString(1, equipo.getNombreEquipo());
            ps.setInt(2, equipo.getTorneoIdTorneo());
     
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        
        }finally{
            try{
                con.close();
            
            }catch(SQLException e){
             System.err.println(e);
            }
        }
            
    }
    
    public boolean actualizarEquipo(Equipo equipo){
    
        PreparedStatement ps= null;
        Connection con = getConexion();
        String sql ="UPDATE Equipo SET nombreEquipo=? , Torneo_idTorneo=? WHERE idEquipo=?";  
        
        try{
        
            ps= con.prepareStatement(sql);
            
            ps.setString(1, equipo.getNombreEquipo());
            ps.setInt(2, equipo.getTorneoIdTorneo());
            ps.setInt(3, equipo.getIdEquipo());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        
        }finally{
            try{
                con.close();
            
            }catch(SQLException e){
             System.err.println(e);
            }
        }
            
    }
    
    public boolean eliminarEquipo(Equipo equipo){
    
        PreparedStatement ps= null;
        Connection con = getConexion();
        String sql ="DELETE FROM Equipo WHERE idEquipo=?";  
        
        try{
        
            ps= con.prepareStatement(sql);
            
            ps.setInt(1, equipo.getIdEquipo());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        
        }finally{
            try{
                con.close();
            
            }catch(SQLException e){
             System.err.println(e);
            }
        }
            
    }
    
    public boolean buscarEquipo(Equipo equipo){
    
        PreparedStatement ps= null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql ="SELECT * FROM Equipo WHERE nombreEquipo=?";  
        
        try{
        
            ps= con.prepareStatement(sql);
            
            ps.setString(1, equipo.getNombreEquipo());
            rs = ps.executeQuery();
            
            if(rs.next()){
                equipo.setIdEquipo(Integer.parseInt(rs.getString("idEquipo")));
                equipo.setNombreEquipo(rs.getString("nombreEquipo"));
                equipo.setTorneoIdTorneo(Integer.parseInt(rs.getString("Torneo_idTorneo")));
                return true;
            }
            return false;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        
        }finally{
            try{
                con.close();
            
            }catch(SQLException e){
             System.err.println(e);
            }
        }
            
    }
}
