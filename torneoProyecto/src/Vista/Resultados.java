/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Conexion;
import Modelo.Torneo;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vanessa
 */
public class Resultados extends javax.swing.JFrame {
    DateFormat df = DateFormat.getDateInstance();
     DefaultTableModel modelo;
     int p1=0;
       int p2=0;
        int puntos=0,gf=0,gc=0;
        int puntos2=0,gf2=0,gc2=0;
        int pg1=0,pp1=0,pe1=0,pj1=0;
        int pg2=0,pp2=0,pe2=0,pj2=0;
    /**
     * Creates new form Resultados
     */
    public Resultados() {
        initComponents();
        txtEq1.setEditable(false);
        txtEq2.setEditable(false);
    }
    
    public void itemStateChanged (ItemEvent evt) {
    if (evt.getStateChange () == ItemEvent.SELECTED) {
        
          int n =  (int) cmbEquipo1.getSelectedIndex();
       System.out.println(" " + n);
       
       if( n == 0){
           p1=3;
           cmbEqui2.setSelectedIndex(1);
           p2=1;
           System.out.println(" " + p1+ "" + p2);
           /* pg1=pg1 + 1;
            pp1=0;
            pe1=0;
            pj1=pj1;
            
            pg2=0;
            pp2=pp2 + 1;
            pe2=0;
            pj2=pj2 + 1;*/
       }else if(n==1){
           p1=1;
           p2=3;
           cmbEqui2.setSelectedIndex(0);
           System.out.println(" " + p1+ "" + p2);
           
           /* pg1=0;
            pp1=pp1+1;
            pe1=0;
            pj1=pj1+1;
            
            pg2=pg2+1;
            pp2=0;
            pe2=0;
            pj2=pj2 + 1;*/
       }else if(n==2){
           cmbEqui2.setSelectedIndex(2);
           p1=0;
           p2=0;
           System.out.println(" " + p1+ "" + p2);
            /*pg1=0;
            pp1=0;
            pe1=pe1+1;
            pj1=pj1+1;
            
            pg2=0;
            pp2=0;
            pe2=pe2+1;
            pj2=pj2 + 1;*/
       }   
       
    } else {
        
    }
}
    public void insertar(int pju1,int pga1,int ppe1,int ppem1, int golesF,int golesC, int p , int id){
    
    try {
            
            Conexion conn= new Conexion();
            Connection con = conn.getConexion();
            String sql ="UPDATE Equipo SET PJ_Equipo=?,PG_Equipo=?,PP_Equipo=?, PE_Equipo=?, GF_Equipo=?, GC_Equipo=?, Puntos_Equipo=? WHERE idEquipo=?";  
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, pju1);
            ps.setInt(2, pga1 );
            ps.setInt(3, ppe1);
            ps.setInt(4, ppem1);
            ps.setInt(5, golesF);
            ps.setInt(6, golesC );
            ps.setInt(7, p);
            ps.setInt(8, id);
            //System.out.print("estado "+bvar2+"  Campeon "+txtCampeon.getText()+ " " +txtId.getText());
            int n= ps.executeUpdate();
           if(n>0){
               //llenarFiltro("");
               JOptionPane.showMessageDialog(null, "Datos modificados");
        
               
           }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al modificar el equipo");
            limpiar();
        }
    
    
    }
    
    public void insertarEq2(int pju2,int pga2,int ppe2,int ppem2,int golesF,int golesC, int p , int id){
    
    try {
            
            Conexion conn= new Conexion();
            Connection con = conn.getConexion();
            String sql ="UPDATE Equipo SET PJ_Equipo=?,PG_Equipo=?,PP_Equipo=?, PE_Equipo=?, GF_Equipo=?, GC_Equipo=?, Puntos_Equipo=? WHERE idEquipo=?";  
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, pju2);
            ps.setInt(2, pga2 );
            ps.setInt(3, ppe2);
            ps.setInt(4, ppem2 );
            ps.setInt(5, golesF);
            ps.setInt(6, golesC );
            ps.setInt(7, p);
            ps.setInt(8, id);
            //System.out.print("estado "+bvar2+"  Campeon "+txtCampeon.getText()+ " " +txtId.getText());
            int n= ps.executeUpdate();
           if(n>0){
               //llenarFiltro("");
               JOptionPane.showMessageDialog(null, "Datos modificados");
              
               
           }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al modificar el equipo");
            limpiar();
        }
    
    
    }
    
    public void puntos(int id){
    
         try {
            
            Conexion conn= new Conexion();
            Connection con = conn.getConexion();
           
         
            String sql ="select PJ_Equipo,PG_Equipo,PP_Equipo, PE_Equipo, GF_Equipo,GC_Equipo,Puntos_Equipo from Equipo where idEquipo='"+id +"'";
            Statement ps= con.createStatement();
            ResultSet rs = ps.executeQuery(sql);
            String[] fila =  new String[10];
            while(rs.next()){
               pg1=Integer.parseInt(rs.getString("PG_Equipo"));
               pp1=Integer.parseInt(rs.getString("PP_Equipo"));
               pe1=Integer.parseInt(rs.getString("PE_Equipo"));
               pj1=Integer.parseInt(rs.getString("PJ_Equipo"));
               gf= Integer.parseInt(rs.getString("GF_Equipo"));
               gc= Integer.parseInt(rs.getString("GC_Equipo"));
               puntos= Integer.parseInt(rs.getString("Puntos_Equipo"));
            }
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
     public void puntosEq2(int id){
    
         try {
            
            Conexion conn= new Conexion();
            Connection con = conn.getConexion();
           
         
            String sql ="select PJ_Equipo,PG_Equipo,PP_Equipo, PE_Equipo,GF_Equipo,GC_Equipo,Puntos_Equipo from Equipo where idEquipo='"+id +"'";
            Statement ps= con.createStatement();
            ResultSet rs = ps.executeQuery(sql);
 
            while(rs.next()){
               pg2=Integer.parseInt(rs.getString("PG_Equipo"));
               pp2=Integer.parseInt(rs.getString("PP_Equipo"));
               pe2=Integer.parseInt(rs.getString("PE_Equipo"));
               pj2=Integer.parseInt(rs.getString("PJ_Equipo"));
               gf2= Integer.parseInt(rs.getString("GF_Equipo"));
               gc2= Integer.parseInt(rs.getString("GC_Equipo"));
               puntos2= Integer.parseInt(rs.getString("Puntos_Equipo"));
            }
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void limpiar(){
    txtEq1.setText("");
    txtEq2.setText("");
    txtGoles.setText("");
    txtGoles2.setText("");
    txtIdEq1.setText("");
    txtIdEq2.setText("");
    }
   public void llenar(){
       
       Date date=jdFecha.getDate(); 
        SimpleDateFormat format2=new SimpleDateFormat("yyyy-MM-dd"); 
        String fecha;
        // TODO add your handling code here:
        fecha = format2.format(date);
        
        System.out.println(" " + fecha);
        try {
            
            Conexion conn= new Conexion();
            Connection con = conn.getConexion();
           
            String[] titulos={"id Partido","Fecha Partido","Nombre de Equipo Uno","Nombre de Equipo Dos","Hora","Nombre de Arbitro"};
            String sql ="select idPartido, fechaPartido, \n" +
                "(select nombreEquipo from Equipo where Equipo_idEquipo1 = idEquipo) as Equipo1, \n" +
                "(select nombreEquipo from Equipo where Equipo_idEquipo2 = idEquipo) as Equipo2,\n" +
                "horaPartido,nombreArbitro from Partido, Arbitro\n" +
                "where Arbitro.idArbitro= Partido.Arbitro_idArbitro AND fechaPartido = '"+ fecha+"' ";
            modelo = new DefaultTableModel(null,titulos);
            Statement ps= con.createStatement();
            ResultSet rs = ps.executeQuery(sql);
            String[] fila =  new String[10];
            while(rs.next()){
                fila[0]=rs.getString("idPartido");
                fila[1]=rs.getString("fechaPartido");
                fila[2]=rs.getString("Equipo1");
                fila[3]=rs.getString("Equipo2");
                fila[4]=rs.getString("horaPartido");
                fila[5]=rs.getString("nombreArbitro");
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
        jLabel2 = new javax.swing.JLabel();
        txtEq1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEq2 = new javax.swing.JTextField();
        cmbEquipo1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cmbEqui2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columIndex){
                return false;
            }
        };
        jdFecha = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtGoles = new javax.swing.JTextField();
        txtGoles2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtIdEq1 = new javax.swing.JTextField();
        txtIdEq2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("RESULTADOS DE PARTIDOS");

        jLabel2.setText("Equipo 1:");

        jLabel3.setText("Equipo 2:");

        cmbEquipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ganado", "Perdido", "Empatado" }));
        cmbEquipo1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEquipo1ItemStateChanged(evt);
            }
        });

        jLabel4.setText("Resultado");

        cmbEqui2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ganado", "Perdido", "Empatado" }));

        jLabel5.setText("Resultado");

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Guardar Resultados");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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

        jdFecha.setDateFormatString("dd-MM-yyyy");
        jdFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jdFechaMouseClicked(evt);
            }
        });

        jLabel7.setText("Fecha:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtGoles.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGolesKeyTyped(evt);
            }
        });

        txtGoles2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGoles2KeyTyped(evt);
            }
        });

        jLabel6.setText("Goles:");

        jLabel8.setText("Goles:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(157, 157, 157)
                                .addComponent(btnBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(jLabel1)))
                        .addGap(272, 272, 272))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEq1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtGoles, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmbEquipo1, javax.swing.GroupLayout.Alignment.LEADING, 0, 154, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(txtIdEq2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(85, 85, 85))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEq2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtGoles2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbEqui2, javax.swing.GroupLayout.Alignment.LEADING, 0, 154, Short.MAX_VALUE)))
                        .addGap(47, 47, 47))))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtIdEq1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdEq1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdEq2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEq1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtEq2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbEquipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cmbEqui2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGoles2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MenuPartido partido=new MenuPartido();
        partido.setVisible(true);
        this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jdFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdFechaMouseClicked

      
    }//GEN-LAST:event_jdFechaMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        Date date=jdFecha.getDate(); 
        SimpleDateFormat format2=new SimpleDateFormat("yyyy-MM-dd"); 
        String fecha;

        fecha = format2.format(date);
        
        if(evt.getButton()== 1){
            int fila= jTable1.getSelectedRow();
            try {
               
                Conexion conn= new Conexion();
                Connection con = conn.getConexion();
                //String sql ="SELECT j.idJugador, j.nombreJugador, j.apellidosJugador ,e.nombreEquipo FROM Equipo e, Jugador j WHERE e.idEquipo = j.Equipo_idEquipo AND idJugador="+ jTable1.getValueAt(fila, 0);
                String sql ="select idPartido, fechaPartido, \n" +
                    "(select nombreEquipo from Equipo where Equipo_idEquipo1 = idEquipo) as Equipo1, \n" +
                    "(select nombreEquipo from Equipo where Equipo_idEquipo2 = idEquipo) as Equipo2,\n" +
                    "(select idEquipo from Equipo where Equipo_idEquipo1 = idEquipo) as id1,\n" +
                    "(select idEquipo from Equipo where Equipo_idEquipo2 = idEquipo) as id2,\n" +
                    "horaPartido,nombreArbitro from Partido, Arbitro\n" +
                    "where Arbitro.idArbitro= Partido.Arbitro_idArbitro  and fechaPartido = '"+ fecha+"' AND idPartido="+jTable1.getValueAt(fila, 0);
                
                
                Statement ps= con.createStatement();
                ResultSet rs = ps.executeQuery(sql);
                rs.next();
                   txtIdEq1.setText(rs.getString("id1"));
                   txtIdEq2.setText(rs.getString("id2"));
                   txtEq1.setText(rs.getString("Equipo1"));
                   txtEq2.setText(rs.getString("Equipo2"));
                   //txtEquipo.setText(rs.getString("nombreEquipo"));
                  
                  
            } catch (Exception e) {
            }
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
          llenar();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        
        if( txtGoles.getText().trim().length()==0 || txtGoles2.getText().trim().length()==0){
                JOptionPane.showMessageDialog(null, "Campos vacios");
        }else{
             int gol1 = Integer.parseInt(txtGoles.getText());
        int gol2= Integer.parseInt(txtGoles2.getText());
        if(gol1>gol2){
                 p1=3;
                 p2=0;
                
                puntos(Integer.parseInt(txtIdEq1.getText()));
                System.out.println(gf+""+""+gc+""+puntos+"");
                int g1=gf+ Integer.parseInt(txtGoles.getText());
                int g2=gc+ Integer.parseInt(txtGoles2.getText());
                int pe=puntos+ p1;

                puntosEq2(Integer.parseInt(txtIdEq2.getText()));
                int g3=gf2+ Integer.parseInt(txtGoles.getText());
                int g4=gc2+ Integer.parseInt(txtGoles2.getText());
                int pen2=puntos2+ p2;
                
                pg1=pg1 + 1;
                pp1=pp1;
                pe1=pe1;
                pj1=pj1+1;
            
                pg2=pg2;
                pp2=pp2 + 1;
                pe2=pe2;
                pj2=pj2 + 1;
                
                insertar(pj1,pg1,pp1,pe1,g1,g2, pe, Integer.parseInt(txtIdEq1.getText()));
                insertarEq2(pj2,pg2,pp2,pe2,g3,g4,pen2,Integer.parseInt(txtIdEq2.getText()));
                limpiar();
            }else if(gol1<gol2) {
                p1=0;
                p2=3;
                puntos(Integer.parseInt(txtIdEq1.getText()));
                System.out.println(gf+""+""+gc+""+puntos+"");
                int g1=gf+ Integer.parseInt(txtGoles.getText());
                int g2=gc+ Integer.parseInt(txtGoles2.getText());
                int pe=puntos+ p1;
                
                puntosEq2(Integer.parseInt(txtIdEq2.getText()));
                int g3=gf2+ Integer.parseInt(txtGoles.getText());
                int g4=gc2+ Integer.parseInt(txtGoles2.getText());
                int pen2=puntos2+ p2;
                
                pg1=pg1;
                pp1=pp1+1;
                pe1=pe1;
                pj1=pj1+1;

                pg2=pg2+1;
                pp2=pp2;
                pe2=pe2;
                pj2=pj2 + 1;
                
                insertar(pj1,pg1,pp1,pe1,g1,g2, pe, Integer.parseInt(txtIdEq1.getText()));
                insertarEq2(pj2,pg2,pp2,pe2,g3,g4,pen2,Integer.parseInt(txtIdEq2.getText()));
                limpiar();
            }else if(gol1==gol2){
                p1=1;
                p2=1;
                 puntos(Integer.parseInt(txtIdEq1.getText()));
                System.out.println(gf+""+""+gc+""+puntos+"");
                int g1=gf+ Integer.parseInt(txtGoles.getText());
                int g2=gc+ Integer.parseInt(txtGoles2.getText());
                int pe=puntos+ p1;

                puntosEq2(Integer.parseInt(txtIdEq2.getText()));
                int g3=gf2+ Integer.parseInt(txtGoles2.getText());
                int g4=gc2+ Integer.parseInt(txtGoles.getText());
                int pen2=puntos2+ p2;
                
                pg1=pg1;
                pp1=pp1;
                pe1=pe1+1;
                pj1=pj1+1;

                pg2=pg2;
                pp2=pp2;
                pe2=pe2+1;
                pj2=pj2 + 1;
                
                insertar(pj1,pg1,pp1,pe1,g1,g2, pe, Integer.parseInt(txtIdEq1.getText()));
                insertarEq2(pj2,pg2,pp2,pe2,g3,g4,pen2,Integer.parseInt(txtIdEq2.getText()));
                limpiar();
        
            }
        }
        /*}else if(p1==1 && p2==3){
            if(gol1<gol2){
                puntos(Integer.parseInt(txtIdEq1.getText()));
                System.out.println(gf+""+""+gc+""+puntos+"");
                int g1=gf+ Integer.parseInt(txtGoles.getText());
                int g2=gc+ Integer.parseInt(txtGoles2.getText());
                int pe=puntos+ p1;
                
                puntosEq2(Integer.parseInt(txtIdEq2.getText()));
                int g3=gf2+ Integer.parseInt(txtGoles.getText());
                int g4=gc2+ Integer.parseInt(txtGoles2.getText());
                int pen2=puntos2+ p2;
                
                pg1=pg1;
                pp1=pp1+1;
                pe1=pe1;
                pj1=pj1+1;

                pg2=pg2+1;
                pp2=pp2;
                pe2=pe2;
                pj2=pj2 + 1;
                
                insertar(pj1,pg1,pp1,pe1,g1,g2, pe, Integer.parseInt(txtIdEq1.getText()));
                insertarEq2(pj2,pg2,pp2,pe2,g3,g4,pen2,Integer.parseInt(txtIdEq2.getText()));
                limpiar();
        
            
            }else{
            
                JOptionPane.showMessageDialog(null, "Los goles del equipo dos deben ser mas");
            }
        }else if(p1==0 && p2==0){
            if(gol1==gol2){
                puntos(Integer.parseInt(txtIdEq1.getText()));
                System.out.println(gf+""+""+gc+""+puntos+"");
                int g1=gf+ Integer.parseInt(txtGoles.getText());
                int g2=gc+ Integer.parseInt(txtGoles2.getText());
                int pe=puntos+ p1;

                puntosEq2(Integer.parseInt(txtIdEq2.getText()));
                int g3=gf2+ Integer.parseInt(txtGoles2.getText());
                int g4=gc2+ Integer.parseInt(txtGoles.getText());
                int pen2=puntos2+ p2;
                
                pg1=pg1;
                pp1=pp1;
                pe1=pe1+1;
                pj1=pj1+1;

                pg2=pg2;
                pp2=pp2;
                pe2=pe2+1;
                pj2=pj2 + 1;
                
                insertar(pj1,pg1,pp1,pe1,g1,g2, pe, Integer.parseInt(txtIdEq1.getText()));
                insertarEq2(pj2,pg2,pp2,pe2,g3,g4,pen2,Integer.parseInt(txtIdEq2.getText()));
                limpiar();
        
            
            }else{
            
                JOptionPane.showMessageDialog(null, "Los goles del equipo uno y dos deben ser iguales");
            }
         */
        
        
       
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmbEquipo1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEquipo1ItemStateChanged
       itemStateChanged(evt);

        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEquipo1ItemStateChanged

    private void txtGolesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGolesKeyTyped

        char caracter= evt.getKeyChar();
        if(((caracter < '0') || (caracter > '9') && (caracter != '\b'))){
            evt.consume();
        }

// TODO add your handling code here:
    }//GEN-LAST:event_txtGolesKeyTyped

    private void txtGoles2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGoles2KeyTyped
char caracter= evt.getKeyChar();
        if(((caracter < '0') || (caracter > '9') && (caracter != '\b') )){
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGoles2KeyTyped

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
            java.util.logging.Logger.getLogger(Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resultados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cmbEqui2;
    private javax.swing.JComboBox<String> cmbEquipo1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JTextField txtEq1;
    private javax.swing.JTextField txtEq2;
    private javax.swing.JTextField txtGoles;
    private javax.swing.JTextField txtGoles2;
    private javax.swing.JTextField txtIdEq1;
    private javax.swing.JTextField txtIdEq2;
    // End of variables declaration//GEN-END:variables
}
