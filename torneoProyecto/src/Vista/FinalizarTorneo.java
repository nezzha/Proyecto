/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Conexion;
import Modelo.Equipo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vanessa
 */
public class FinalizarTorneo extends javax.swing.JFrame {
    DefaultTableModel modelo;
    int limite=45;

    /**
     * Creates new form FinalizarTorneo
     */
    public FinalizarTorneo() {
        initComponents();
        llenarFiltro("");
        txtId.setVisible(false);
        txtNombreTorneo.setEditable(false);
    }
    
    public void limpiar(){
        txtCampeon.setText("");
        txtNombreTorneo.setText("");
        txtBusqueda.setText("");
    }
    
     public void llenarFiltro(String filtro){
        try {
            Conexion conn= new Conexion();
            Connection con = conn.getConexion();
           
            String[] titulos={"idTorneo","nombreTorneo","estadoTorneo"};
            String sql ="SELECT * FROM Torneo  where estadoTorneo=1 AND nombreTorneo LIKE '%"+ filtro + "%'";
            modelo = new DefaultTableModel(null,titulos);
            Statement ps= con.createStatement();
            ResultSet rs = ps.executeQuery(sql);
            String[] fila =  new String[3];
            while(rs.next()){
                fila[0]=rs.getString("idTorneo");
                fila[1]=rs.getString("nombreTorneo");
                fila[2]=rs.getString("estadoTorneo");
                
                modelo.addRow(fila);
            }
            jTable1.setModel(modelo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    
     public void actualizarEquipo(String campeon, boolean valor,int id){
         Conexion conn= new Conexion();
         Connection con = conn.getConexion();
        PreparedStatement ps= null;
        
        String sql ="UPDATE Torneo SET estadoTorneo=? , campeonTorneo=? WHERE idTorneo=?";  
        
        try{
        
            ps= con.prepareStatement(sql);
            
            ps.setBoolean(1, valor);
            ps.setString(2,campeon );
            ps.setInt(3, id);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Torneo Finalizado");
            limpiar();
            //return true;
        }catch(SQLException e){
            System.err.println(e);
            limpiar();
      
            //return false;
        
        }finally{
            try{
                con.close();
            
            }catch(SQLException e){
             System.err.println(e);
            }
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
        txtNombreTorneo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columIndex){
                return false;
            }
        };
        jButton1 = new javax.swing.JButton();
        txtCampeon = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("FINALIZAR TORNEO");

        jLabel2.setText("Nombre Torneo:");

        txtNombreTorneo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreTorneoKeyTyped(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setFocusable(false);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtCampeon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCampeonKeyTyped(evt);
            }
        });

        jLabel3.setText("Nombre del Campeon:");

        jLabel4.setText("Buscar:");

        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyTyped(evt);
            }
        });

        jButton2.setText("Finalizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(32, 32, 32)
                        .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombreTorneo)
                                .addComponent(txtCampeon, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtId)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombreTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCampeon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MenuTorneo torneo = new MenuTorneo();
        torneo.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased

        llenarFiltro(txtBusqueda.getText());
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if(evt.getButton()== 1){
            int fila= jTable1.getSelectedRow();
            try {
                 //Deshabilitar();
                Conexion conn= new Conexion();
                Connection con = conn.getConexion();
                String sql="SELECT * FROM Torneo WHERE idTorneo="+ jTable1.getValueAt(fila, 0);
                Statement ps= con.createStatement();
                ResultSet rs = ps.executeQuery(sql);
                rs.next();
                   txtId.setText(String.valueOf(rs.getInt("idTorneo")));
                   txtNombreTorneo.setText(rs.getString("nombreTorneo"));
                   txtNombreTorneo.setEditable(false);
                  
            } catch (Exception e) {
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String str = "false" ;
        boolean bvar2 = Boolean . parseBoolean ( str );
        
       // System.out.print("estado"+bvar2+"Campeon"+txtCampeon.getText()+ " " +v);
       // actualizarEquipo(txtCampeon.getText(), bvar2, v);
        if(txtCampeon.getText().trim().length()==0){
            JOptionPane.showMessageDialog(null, "Campo de Campeon vacio");
                
        }else{
        
         try {
            
            Conexion conn= new Conexion();
            Connection con = conn.getConexion();
            String sql ="UPDATE Torneo SET estadoTorneo=? , campeonTorneo=? WHERE idTorneo=?";  
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setBoolean(1, bvar2);
            ps.setString(2,txtCampeon.getText());
            ps.setInt(3, Integer.parseInt(txtId.getText()));
            System.out.print("estado "+bvar2+"  Campeon "+txtCampeon.getText()+ " " +txtId.getText());
            int n= ps.executeUpdate();
           if(n>0){
               llenarFiltro("");
               JOptionPane.showMessageDialog(null, "Datos modificados");
               limpiar();
           
           }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al eliminar usuario");
            limpiar();
        }
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtNombreTorneoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreTorneoKeyTyped
        if(txtNombreTorneo.getText().length()== limite){
        JOptionPane.showMessageDialog(null, "Exedio limite permitido");
        limpiar();
        evt.consume();        
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreTorneoKeyTyped

    private void txtCampeonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCampeonKeyTyped
        if(txtCampeon.getText().length()== limite){
        JOptionPane.showMessageDialog(null, "Excedio limite permitido");
        limpiar();
        evt.consume();        
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCampeonKeyTyped

    private void txtBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyTyped
        if(txtBusqueda.getText().length()== limite){
        JOptionPane.showMessageDialog(null, "Excedio limite permitido");
        limpiar();
        evt.consume();        
        } 
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaKeyTyped

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
            java.util.logging.Logger.getLogger(FinalizarTorneo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalizarTorneo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalizarTorneo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalizarTorneo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalizarTorneo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtCampeon;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombreTorneo;
    // End of variables declaration//GEN-END:variables
}
