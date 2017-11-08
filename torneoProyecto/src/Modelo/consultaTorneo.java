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
public class consultaTorneo extends Conexion{
    
    public boolean registrarTorneo(Torneo torneo){
    
        PreparedStatement ps= null;
        Connection con = getConexion();
        String sql ="INSERT INTO Torneo (nombreTorneo) VALUES(?)";  
        
        try{
        
            ps= con.prepareStatement(sql);
            
            ps.setString(1, torneo.getNombreTorneo());
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
    
    public boolean actualizarUsuario(Torneo torneo){
    
        PreparedStatement ps= null;
        Connection con = getConexion();
        String sql ="UPDATE torneo SET nombreTorneo=? , estadoTorneo=?, campeonTorneo=?  WHERE idUsuario=?";  
        
        try{
        
            ps= con.prepareStatement(sql);
            
            ps.setString(1, torneo.getNombreTorneo());
            ps.setBoolean(2, torneo.getEstadoTorneo());
            ps.setString(3, torneo.getCampeonTorneo());
            ps.setInt(4, torneo.getIdTorneo());
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
    
       
    public boolean buscarTorneo(Torneo torneo){
    
        PreparedStatement ps= null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql ="SELECT * FROM torneo WHERE nombreTorneo=?";  
        
        try{
        
            ps= con.prepareStatement(sql);
            
            ps.setString(1, torneo.getNombreTorneo());
            rs = ps.executeQuery();
            
            if(rs.next()){
                torneo.setIdTorneo(Integer.parseInt(rs.getString("idUsuario")));
                torneo.setNombreTorneo(rs.getString("nombreUsuario"));
               
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
    
    public boolean buscarUsuarioLog(Usuario user){
    
        PreparedStatement ps= null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql ="SELECT * FROM Usuario WHERE nombreUsuario=? and passw=?";  
        
        try{
        
            ps= con.prepareStatement(sql);
            
            ps.setString(1, user.getNombreUsuario());
            ps.setString(2, user.getPassw());
            rs = ps.executeQuery();
            
            if(rs.next()){
                //user.setIdUsuario(Integer.parseInt(rs.getString("idUsuario")));
                //user.setNombreUsuario(rs.getString("nombreUsuario"));
                //user.setPassw(rs.getString("passw"));
                user.setTipoUsuario(rs.getString("tipoUsuario"));
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
