/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


/**
 *
 * @author vanessa
 */
public class MenuPrincipalAdmin extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipalAdmin
     */
    public MenuPrincipalAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        txtTipoMenu.setVisible(false);
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
        btnArbitro = new javax.swing.JButton();
        btnEstadisticas = new javax.swing.JButton();
        btnJugador = new javax.swing.JButton();
        btnEquipo = new javax.swing.JButton();
        btnTorneo = new javax.swing.JButton();
        btnPartido = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        txtTipoMenu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MENU PINCIPAL ADMINISTRADOR");

        btnArbitro.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btnArbitro.setIcon(new javax.swing.ImageIcon("/home/vanessa/Descargas/arbitro.png")); // NOI18N
        btnArbitro.setText("Arbitro");
        btnArbitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArbitroActionPerformed(evt);
            }
        });

        btnEstadisticas.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btnEstadisticas.setIcon(new javax.swing.ImageIcon("/home/vanessa/Descargas/estadisticas.png")); // NOI18N
        btnEstadisticas.setText("Estadisticas");
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });

        btnJugador.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btnJugador.setIcon(new javax.swing.ImageIcon("/home/vanessa/Descargas/futbolista (1).png")); // NOI18N
        btnJugador.setText("Jugadores");
        btnJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugadorActionPerformed(evt);
            }
        });

        btnEquipo.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btnEquipo.setIcon(new javax.swing.ImageIcon("/home/vanessa/Descargas/camiseta-de-futbol (1).png")); // NOI18N
        btnEquipo.setText("Equipo");
        btnEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquipoActionPerformed(evt);
            }
        });

        btnTorneo.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btnTorneo.setIcon(new javax.swing.ImageIcon("/home/vanessa/Descargas/futbol (2).png")); // NOI18N
        btnTorneo.setText("Torneo");
        btnTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTorneoActionPerformed(evt);
            }
        });

        btnPartido.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btnPartido.setIcon(new javax.swing.ImageIcon("/home/vanessa/Descargas/futbol (4).png")); // NOI18N
        btnPartido.setText("Partido");
        btnPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartidoActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon("/home/vanessa/Descargas/boy.png")); // NOI18N
        jButton7.setText("Usuario");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(488, Short.MAX_VALUE)
                        .addComponent(txtTipoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTorneo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnJugador, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(btnArbitro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnPartido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEstadisticas, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEquipo)
                    .addComponent(btnJugador))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTorneo)
                    .addComponent(btnPartido))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnArbitro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnEstadisticas)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(txtTipoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArbitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArbitroActionPerformed
        MenuArbitro menu = new MenuArbitro();
        menu.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnArbitroActionPerformed

    private void btnJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugadorActionPerformed
        MenuJugador jugador = new MenuJugador();
        jugador.setVisible(true);
        this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnJugadorActionPerformed

    private void btnEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquipoActionPerformed
        MenuEquipo equipo = new MenuEquipo();
        equipo.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnEquipoActionPerformed

    private void btnTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTorneoActionPerformed
        MenuTorneo torneo = new MenuTorneo();
        torneo.setVisible(true);
        this.setVisible(false);
                
    }//GEN-LAST:event_btnTorneoActionPerformed

    private void btnPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartidoActionPerformed
        MenuPartido partido = new MenuPartido();
        partido.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPartidoActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        MenuUsuario usuario = new MenuUsuario();
        usuario.setVisible(true);
        usuario.setLocationRelativeTo(null);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        ExportarTabla export =new ExportarTabla();
        export.setVisible(true);
        this.setVisible(false);
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEstadisticasActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipalAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArbitro;
    private javax.swing.JButton btnEquipo;
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnJugador;
    private javax.swing.JButton btnPartido;
    private javax.swing.JButton btnTorneo;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JTextField txtTipoMenu;
    // End of variables declaration//GEN-END:variables
}
