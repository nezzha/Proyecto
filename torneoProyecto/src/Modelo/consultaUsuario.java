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
public class consultaUsuario extends Conexion{
    public boolean registrarUsuario(Usuario User){
    
        PreparedStatement ps= null;
        Connection con = getConexion();
        String sql ="INSERT INTO Usuario (nombreUsuario,passw,tipoUsuario) VALUES(?,?,?)";  
        
        try{
        
            ps= con.prepareStatement(sql);
            
            ps.setString(1, User.getNombreUsuario());
            ps.setString(2, User.getPassw());
            ps.setString(3, User.getTipoUsuario());
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
    
    public boolean actualizarUsuario(Usuario user){
    
        PreparedStatement ps= null;
        Connection con = getConexion();
        String sql ="UPDATE Usuario SET nombreUsuario=? , passw=?, tipoUsuario=?  WHERE idUsuario=?";  
        
        try{
        
            ps= con.prepareStatement(sql);
            
            ps.setString(1, user.getNombreUsuario());
            ps.setString(2, user.getPassw());
            ps.setString(3, user.getTipoUsuario());
            ps.setInt(4, user.getIdUsuario());
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
    
    public boolean eliminarUsuario(Usuario user){
    
        PreparedStatement ps= null;
        Connection con = getConexion();
        String sql ="DELETE FROM Usuario WHERE idUsuario=?";  
        
        try{
        
            ps= con.prepareStatement(sql);
            
            ps.setInt(1, user.getIdUsuario());
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
    
    public boolean buscarUsuario(Usuario user){
    
        PreparedStatement ps= null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql ="SELECT * FROM Usuario WHERE nombreUsuario=?";  
        
        try{
        
            ps= con.prepareStatement(sql);
            
            ps.setString(1, user.getNombreUsuario());
            rs = ps.executeQuery();
            
            if(rs.next()){
                user.setIdUsuario(Integer.parseInt(rs.getString("idUsuario")));
                user.setNombreUsuario(rs.getString("nombreUsuario"));
                user.setPassw(rs.getString("passw"));
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
