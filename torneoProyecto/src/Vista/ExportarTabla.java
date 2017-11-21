/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Conexion;
import Modelo.Exportar;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vanessa
 */
public class ExportarTabla extends javax.swing.JFrame {
     DefaultTableModel modelo;
    /**
     * Creates new form ExportarTabla
     */
    public ExportarTabla() {
        initComponents();
         this.setLocationRelativeTo(null);
        llenar();
    }
    
    public void llenar(){
        try {
            Conexion conn= new Conexion();
            Connection con = conn.getConexion();
           
            String[] titulos={"nombreEquipo","PJ_Equipo","PG_Equipo","PP_Equipo","PE_Equipo","GF_Equipo","GC_Equipo","Dif_Equipo","Puntos_Equipo"};
            String sql ="SELECT nombreEquipo,PJ_Equipo,PG_Equipo,PP_Equipo,PE_Equipo,GF_Equipo,GC_Equipo,Dif_Equipo,Puntos_Equipo from equipo;";
            modelo = new DefaultTableModel(null,titulos);
            Statement ps= con.createStatement();
            ResultSet rs = ps.executeQuery(sql);
            String[] fila =  new String[10];
            while(rs.next()){
                fila[0]=rs.getString("nombreEquipo");
                fila[1]=rs.getString("PJ_Equipo");
                fila[2]=rs.getString("PG_Equipo");
                fila[3]=rs.getString("PP_Equipo");
                fila[4]=rs.getString("PE_Equipo");
                fila[5]=rs.getString("GF_Equipo");
                fila[6]=rs.getString("GC_Equipo");
                fila[7]=rs.getString("Dif_Equipo");
                fila[8]=rs.getString("Puntos_Equipo");
                
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("EXPORTAR TABLA A EXCEL");

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
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Exportar a Excel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(this.jTable1.getRowCount()==0){
            JOptionPane.showMessageDialog(null, "No hay datos en la tabla para exportar","listo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        JFileChooser choose= new JFileChooser();
        FileNameExtensionFilter filter= new FileNameExtensionFilter("Archivos de excel", "xls");
        choose.setFileFilter(filter);
        choose.setDialogTitle("Guardar archivo");
        choose.setMultiSelectionEnabled(false);
        choose.setAcceptAllFileFilterUsed(false);
        if(choose.showSaveDialog(null)== JFileChooser.APPROVE_OPTION);
            List<JTable> tb= new ArrayList<>();
        List<String>nom= new ArrayList<>();
        tb.add(jTable1);
        nom.add("equipos");
        //nom.add("PJ_Equipo");
        //nom.add("PG_Equipo");
       // System.out.println(""+nom);
        String file=choose.getSelectedFile().toString().concat(".xls");
        try {
            Modelo.Exportar e = new Exportar(new File(file), tb, nom);
            if(e.export()){
                JOptionPane.showMessageDialog(null,"Los datos fueron exportados a excel.","Listo",JOptionPane.INFORMATION_MESSAGE);
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Huboun error" +e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        
            
                    
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MenuPrincipalAdmin admin = new MenuPrincipalAdmin();
        admin.setVisible(true);
        this.setVisible(false );
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ExportarTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExportarTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExportarTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExportarTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExportarTabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
