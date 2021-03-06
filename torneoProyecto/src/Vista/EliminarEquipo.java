/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vanessa
 */
public class EliminarEquipo extends javax.swing.JFrame {
    DefaultTableModel modelo;
    int limite=45;
    /**
     * Creates new form EliminarEquipo
     */
    public EliminarEquipo() {
        initComponents();
        
        llenarFiltro("");
         Deshabilitar();
    }
    public void Deshabilitar(){
        txtNombreEq.setEditable(false);
        txtTorneo.setEditable(false);
        
    }
    
    public void limpiar(){
    txtNombreEq.setText("");
    txtTorneo.setText("");
    }
    
    public void llenar(){
        try {
            Conexion conn= new Conexion();
            Connection con = conn.getConexion();
           
            String[] titulos={"Id Equipo","Nombre Equipo","Nombre Torneo"};
            //String sql ="SELECT e.idEquipo, e.nombreEquipo, t.idTorneo, t.nombreTorneo FROM Equipo e, Torneo t WHERE  t.idTorneo = e.TorneoIdTorneo ";
            String sql ="SELECT e.idEquipo, e.nombreEquipo, t.nombreTorneo FROM Equipo e INNER JOIN Torneo t ON t.idTorneo = e.Torneo_IdTorneo ";
            modelo = new DefaultTableModel(null,titulos);
            Statement ps= con.createStatement();
            ResultSet rs = ps.executeQuery(sql);
            String[] fila =  new String[3];
            while(rs.next()){
                fila[0]=rs.getString("idEquipo");
                fila[1]=rs.getString("nombreEquipo");
                fila[2]=rs.getString("nombreTorneo");
                
                modelo.addRow(fila);
            }
            jTable1.setModel(modelo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    
     public void llenarFiltro(String filtro){
        try {
            Conexion conn= new Conexion();
            Connection con = conn.getConexion();
           
            String[] titulos={"Id Equipo","Nombre Equipo","Nombre Torneo"};
            //String sql ="SELECT e.idEquipo, e.nombreEquipo, t.idTorneo, t.nombreTorneo FROM Equipo e, Torneo t WHERE  t.idTorneo = e.TorneoIdTorneo ";
            String sql ="SELECT e.idEquipo, e.nombreEquipo, t.nombreTorneo FROM Equipo e, Torneo t WHERE t.idTorneo = e.Torneo_IdTorneo AND nombreEquipo LIKE '%"+ filtro + "%'";            
            modelo = new DefaultTableModel(null,titulos);
            Statement ps= con.createStatement();
            ResultSet rs = ps.executeQuery(sql);
            String[] fila =  new String[3];
            while(rs.next()){
                fila[0]=rs.getString("idEquipo");
                fila[1]=rs.getString("nombreEquipo");
                fila[2]=rs.getString("nombreTorneo");
                
                modelo.addRow(fila);
            }
            jTable1.setModel(modelo);
        } catch (Exception e) {
            e.printStackTrace();
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
        txtNombreEq = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columIndex){
                return false;
            }
        };
        txtTorneo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtBusqueda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("EQUIPO");

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel2.setText("Nombre del Equipo:");

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

        jLabel3.setText("Nombe del Torneo");

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyTyped(evt);
            }
        });

        jLabel4.setText("Buscar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(190, 190, 190))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombreEq, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(txtTorneo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addComponent(btnEliminar)))))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombreEq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnEliminar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        if(evt.getButton()== 1){
            int fila= jTable1.getSelectedRow();
            try {
                
                Conexion conn= new Conexion();
                Connection con = conn.getConexion();
                String sql="SELECT e.idEquipo, e.nombreEquipo, t.nombreTorneo FROM Equipo e, Torneo t WHERE  t.idTorneo = e.Torneo_IdTorneo AND idEquipo="+ jTable1.getValueAt(fila, 0);
                Statement ps= con.createStatement();
                ResultSet rs = ps.executeQuery(sql);
                rs.next();
                   txtNombreEq.setText(rs.getString("nombreEquipo"));
                   txtTorneo.setText(rs.getString("nombreTorneo"));
                  
                  
            } catch (Exception e) {
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        try {
            int fila= jTable1.getSelectedRow();
            Conexion conn= new Conexion();
            Connection con = conn.getConexion();
            String sql="DELETE FROM Equipo WHERE idEquipo="+ jTable1.getValueAt(fila, 0);
            Statement ps= con.createStatement();
            int n = ps.executeUpdate(sql);
            if(n>0){
                llenar();
                JOptionPane.showMessageDialog(null,"Usuario eliminado");
                limpiar();
            } 
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al eliminar usuario");
            limpiar();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        MenuEquipo equipo = new MenuEquipo();
        equipo.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        llenarFiltro(txtBusqueda.getText());
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaKeyReleased

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
            java.util.logging.Logger.getLogger(EliminarEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarEquipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBusqueda;
    public javax.swing.JTextField txtNombreEq;
    private javax.swing.JTextField txtTorneo;
    // End of variables declaration//GEN-END:variables
}
