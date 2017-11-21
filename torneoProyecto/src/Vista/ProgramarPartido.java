/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Conexion;
import Modelo.Equipo;
import Modelo.Torneo;
import Modelo.Arbitro;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vanessa
 */
public class ProgramarPartido extends javax.swing.JFrame {
    DateFormat df = DateFormat.getDateInstance();
    DefaultTableModel modelo;
    
    /**
     * Creates new form ProgramarPartido
     */
    public ProgramarPartido() throws SQLException {
        initComponents();
         this.setLocationRelativeTo(null);
        torneo();
        //Equipo();
        //EquipoDos();
        Arbitro();
    }
    public void limpiar(){
    txtHora.setText("");
    jdFecha.setDate(new Date());
    }
    public void torneo() throws SQLException{
    
        Conexion conn= new Conexion();
        Connection con = conn.getConexion();
        
        String sql ="SELECT * FROM Torneo WHERE estadoTorneo=1";   
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        
         while(rs.next()){
                Torneo torneo = new Torneo();
                torneo.setNombreTorneo(rs.getString("nombreTorneo"));
                torneo.setIdTorneo(rs.getInt("idTorneo"));
                cmbTorneo.addItem(torneo);
            }
  
       
    }
    
     public void Arbitro() throws SQLException{
    
        Conexion conn= new Conexion();
        Connection con = conn.getConexion();
        
        String sql ="SELECT * FROM Arbitro";   
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        
         while(rs.next()){
                Arbitro arbitro = new Arbitro();
                arbitro.setNombreArbitro(rs.getString("nombreArbitro"));
                arbitro.setIdArbitro(rs.getInt("idArbitro"));
                cmArbitro.addItem(arbitro);
            }
       
    }
    
     
     public void Equipo() throws SQLException{
     //int eq1=(cmbTorneo.getSelectedIndex()).getIdTorneo();
        Conexion conn= new Conexion();
        Connection con = conn.getConexion();
        
        String sql ="SELECT * FROM Equipo where Torneo_idTorneo="+cmbTorneo.getItemAt(cmbTorneo.getSelectedIndex()).getIdTorneo();   
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        
         while(rs.next()){
                Equipo equipo = new Equipo();
                equipo.setNombreEquipo(rs.getString("nombreEquipo"));
                equipo.setIdEquipo(rs.getInt("idEquipo"));
                cmbEquipoUno.addItem(equipo);
            }
       
    }
     
     public void EquipoDos() throws SQLException{
    
        Conexion conn= new Conexion();
        Connection con = conn.getConexion();
        
        String sql ="SELECT * FROM Equipo where Torneo_idTorneo="+cmbTorneo.getItemAt(cmbTorneo.getSelectedIndex()).getIdTorneo();   
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        
         while(rs.next()){
                Equipo equipo = new Equipo();
                equipo.setNombreEquipo(rs.getString("nombreEquipo"));
                equipo.setIdEquipo(rs.getInt("idEquipo"));
                cmbEquipoDos.addItem(equipo);
                
            }
       
    }
     
     public void itemStateChanged (ItemEvent evt) throws SQLException {
    if (evt.getStateChange () == ItemEvent.SELECTED) {
        
        Equipo();
        EquipoDos();
       
        //cmbEquipoUno.removeAllItems();
        //cmbEquipoDos.removeAllItems();
        //cmbEquipoUno.setSelectedItem("Seleccione");
        //cmbEquipoDos.setSelectedItem("Seleccione");
    }     
     else {
        
    }
}
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbTorneo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbEquipoUno = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbEquipoDos = new javax.swing.JComboBox<>();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmArbitro = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("PROGRAMAR PARTIDO");

        jLabel2.setText("Nombre de Torneo:");

        cmbTorneo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTorneoItemStateChanged(evt);
            }
        });

        jLabel3.setText("Equipo 1:");

        jLabel4.setText("VS");

        jLabel5.setText("Equipo 2:");

        jdFecha.setDateFormatString("dd-MM-yyyy");

        jLabel6.setText("Fecha:");

        jButton1.setText("Porogramar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Hora:");

        jLabel8.setText("Arbitro:");

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(34, 34, 34)
                                .addComponent(cmbTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cmbEquipoUno, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel4))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(106, 106, 106))))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbEquipoDos, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(268, 268, 268))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbEquipoUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(cmbEquipoDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(cmArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addComponent(jButton1)))))
                .addGap(68, 68, 68)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int e1=cmbEquipoUno.getItemAt(cmbEquipoUno.getSelectedIndex()).getIdEquipo();
        int e2=cmbEquipoDos.getItemAt(cmbEquipoDos.getSelectedIndex()).getIdEquipo();
        if(e1 != e2 ){
        
            Conexion conn= new Conexion();
            Connection con = conn.getConexion();
            Date fecha= new Date();
            fecha=jdFecha.getDate();

            //SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");

            int id= cmbTorneo.getItemAt(cmbTorneo.getSelectedIndex()).getIdTorneo();
            System.out.println(id);
            try{
                String sql ="INSERT INTO Partido (fechaPartido,horaPartido,Equipo_idEquipo1,Equipo_idEquipo2,Arbitro_idArbitro) VALUES(?,?,?,?,?)";  
                PreparedStatement ps= con.prepareCall(sql);
                ps.setDate(1, new java.sql.Date(fecha.getTime()));
                ps.setString(2, txtHora.getText());
                ps.setInt(3, cmbEquipoUno.getItemAt(cmbEquipoUno.getSelectedIndex()).getIdEquipo());
                ps.setInt(4, cmbEquipoDos.getItemAt(cmbEquipoDos.getSelectedIndex()).getIdEquipo());  
                ps.setInt(5, cmArbitro.getItemAt(cmArbitro.getSelectedIndex()).getIdArbitro());

             int n = ps.executeUpdate();
             if(n>0){

                 JOptionPane.showMessageDialog(null, "Datos guardados");
                 limpiar();
             }

            }catch(SQLException e){
                System.err.println(e);
                limpiar();
                

            }
        
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese Equipos diferentes");
            
            
        }
        
        

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MenuPartido menu = new MenuPartido();
        menu.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmbTorneoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTorneoItemStateChanged
        try {
            cmbEquipoUno.removeAllItems();
            cmbEquipoDos.removeAllItems();
            itemStateChanged(evt);  
           /* if(c>2){
            
            cmbEquipoUno.removeAllItems();
            cmbEquipoDos.removeAllItems();
             itemStateChanged(evt);  
            }*/
            
            
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(ProgramarPartido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbTorneoItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProgramarPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgramarPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgramarPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgramarPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ProgramarPartido().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ProgramarPartido.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Arbitro> cmArbitro;
    private javax.swing.JComboBox<Equipo> cmbEquipoDos;
    private javax.swing.JComboBox<Equipo> cmbEquipoUno;
    private javax.swing.JComboBox<Torneo> cmbTorneo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JTextField txtHora;
    // End of variables declaration//GEN-END:variables
}
