/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import Modelo.Conexion;
import Modelo.Usuario;
import Modelo.consultaUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author vanessa
 */
public class login extends javax.swing.JFrame {
    private int limite=10;
    public Usuario mod;
    public consultaUsuario cons;
    /**
     * Creates new form login
     */
    public login() {
        
        initComponents();
        this.setTitle("Login");
        this.setLocationRelativeTo(null);
        
        txtTipo.setVisible(false);
    }

    public void limpiar(){
        txtPassword.setText("");
        txtUser.setText("");
        txtTipo.setText("");
    }
    
    public boolean buscarUsuarioLog(String user, String psw) throws SQLException{
    
        String tipo="";
        
        //PreparedStatement ps= null;
       
        Conexion conn= new Conexion();
        Connection con = conn.getConexion();
        String sql ="SELECT * FROM Usuario WHERE nombreUsuario='"+user+"' and passw='"+psw+"'";  
        
        Statement ps= con.createStatement();
         ResultSet rs = ps.executeQuery(sql);
            
            while(rs.next()){
                //user.setIdUsuario(Integer.parseInt(rs.getString("idUsuario")));
                //user.setNombreUsuario(rs.getString("nombreUsuario"));
                //user.setPassw(rs.getString("passw"));
               tipo=rs.getString("tipoUsuario");
               return true;
            }
            return false;
           /* if(tipo.equals("administrador")){
                    
                    MenuPrincipalAdmin menu = new MenuPrincipalAdmin();
                    menu.setVisible(true);
                    this.setVisible(false);
                    menu.txtTipoMenu.setText(tipo);
                  
            }else{
                    MenuPrincipal menuprin = new MenuPrincipal();
                    menuprin.setVisible(true);
                    this.setVisible(false);
                    menuprin.txtTipoMenu1.setText(tipo);
            }*/
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
        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtTipo = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("INICIO DE SESION");

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel2.setText("Usuario:");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel3.setText("Password:");
        jLabel3.setToolTipText("");

        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserKeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel1)
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPassword)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(255, Short.MAX_VALUE)
                .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String usuario =txtUser.getText();
        String pass = txtPassword.getText();
        
        if(usuario.trim().length()==0 && pass.trim().length()==0 ){

            JOptionPane.showMessageDialog(null, "Campos vacios");
            limpiar();

        }else{
            try{
                if(buscarUsuarioLog(usuario, pass) == true){
                    MenuPrincipalAdmin menu = new MenuPrincipalAdmin();
                    menu.setVisible(true);
                    this.setVisible(false);
                    //menu.txtTipoMenu.setText(tipo);                    
                } else{
                    JOptionPane.showMessageDialog(null, "Usuario no valido");
                    limpiar();
                }           
            }catch(SQLException e){
                 JOptionPane.showMessageDialog(null, e);
            }
        }
       /* if(txtUser.getText().length() == 0 & txtPass.getText().length() == 0){

            JOptionPane.showMessageDialog(null, "Campos vacios");

        }else{
            String usuario =txtUser.getText();
            String pass = txtPass.getText();
            System.out.println(""+usuario);
            
            System.out.println(""+pass);
            
            mod.setNombreUsuario(usuario);
            mod.setPassw(pass);
              System.out.println(""+usuario);
             if(cons.buscarUsuarioLog(mod)){
                 
                  txtTipo.setText(mod.getTipoUsuario());
                String tipo  = txtTipo.getText();
                if("administrador".equals(tipo)){
                    
                    MenuPrincipalAdmin menu = new MenuPrincipalAdmin();
                    menu.setVisible(true);
                    this.setVisible(false);
                
                }else{
                    MenuPrincipal menuprin = new MenuPrincipal();
                    menuprin.setVisible(true);
                    this.setVisible(false);
                }
  
             }else{
                 JOptionPane.showMessageDialog(null, "Usuario no encontrado");
                 limpiar();
                
             }

            
        }*/
        
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
    if(txtUser.getText().length()== limite){
        JOptionPane.showMessageDialog(null, "Exedio limite permitido");
        limpiar();
        evt.consume();
        
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserKeyTyped

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
 if(txtPassword.getText().length()== limite){
     JOptionPane.showMessageDialog(null, "Exedio limite permitido");
        limpiar();
        evt.consume();
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordKeyTyped

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
