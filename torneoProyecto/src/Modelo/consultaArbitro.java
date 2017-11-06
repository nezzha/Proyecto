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
public class consultaArbitro extends Conexion{
    public boolean registrarArbitro(Arbitro arbitro){
    
        PreparedStatement ps= null;
        Connection con = getConexion();
        String sql ="INSERT INTO Arbitro (nombreArbitro,apellidoArbitro) VALUES(?,?)";  
        
        try{
        
            ps= con.prepareStatement(sql);
            
            ps.setString(1, arbitro.getNombreArbitro());
            ps.setString(2, arbitro.getApellidoArbitro());
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
    
    public boolean actualizarArbitro(Arbitro arbitro){
    
        PreparedStatement ps= null;
        Connection con = getConexion();
        String sql ="UPDATE Arbitro SET nombreArbitro=? , apellidoArbitro=? WHERE idArbitro=?";  
        
        try{
        
            ps= con.prepareStatement(sql);
            
            ps.setString(1, arbitro.getNombreArbitro());
            ps.setString(2, arbitro.getApellidoArbitro());
            ps.setInt(3, arbitro.getIdArbitro());
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
    
    public boolean eliminarArbitro(Arbitro arbitro){
    
        PreparedStatement ps= null;
        Connection con = getConexion();
        String sql ="DELETE FROM Arbitro WHERE idArbitro=?";  
        
        try{
        
            ps= con.prepareStatement(sql);
            
            ps.setInt(1, arbitro.getIdArbitro());
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
    
    public boolean buscarArbitro(Arbitro arbitro){
    
        PreparedStatement ps= null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql ="SELECT * FROM Arbitro WHERE nombreArbitro=?";  
        
        try{
        
            ps= con.prepareStatement(sql);
            
            ps.setString(1, arbitro.getNombreArbitro());
            rs = ps.executeQuery();
            
            if(rs.next()){
                arbitro.setIdArbitro(Integer.parseInt(rs.getString("idArbitro")));
                arbitro.setNombreArbitro(rs.getString("nombreArbitro"));
                arbitro.setApellidoArbitro(rs.getString("apellidoArbitro"));
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
