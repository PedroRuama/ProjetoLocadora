package Telas;

import Classes.Usuario;
import Util.UsuarioDAO;
import javax.swing.JFrame;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelUsuario = new javax.swing.JLabel();
        campologin = new javax.swing.JTextPane();
        labelsenha = new javax.swing.JLabel();
        camposenha = new javax.swing.JPasswordField();
        botaoEntrar = new javax.swing.JButton();
        LOGO_LG = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPasswordField1.setText("jPasswordField1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Company MCqueen");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 210));
        jPanel1.setToolTipText("retwet");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelUsuario.setText("Usuário:");
        jPanel1.add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 70, 30));

        campologin.setBorder(null);
        campologin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campologin.setToolTipText("");
        jPanel1.add(campologin, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 122, 178, 27));

        labelsenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelsenha.setForeground(new java.awt.Color(255, 255, 255));
        labelsenha.setText("Senha:");
        jPanel1.add(labelsenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 66, -1));

        camposenha.setBorder(null);
        camposenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camposenhaActionPerformed(evt);
            }
        });
        jPanel1.add(camposenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 185, 178, 27));

        botaoEntrar.setBackground(new java.awt.Color(204, 204, 204));
        botaoEntrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoEntrar.setText("Entrar");
        botaoEntrar.setToolTipText("");
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(botaoEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 73, 32));

        LOGO_LG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/img/logo_1lg.png"))); // NOI18N
        LOGO_LG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGO_LGMouseClicked(evt);
            }
        });
        jPanel1.add(LOGO_LG, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 210, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 310));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/img/camaro.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void camposenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camposenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camposenhaActionPerformed

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed

        String login = campologin.getText();
        String senha = String.valueOf(camposenha.getPassword());

        Usuario usuarioatual = new Usuario(login, senha);

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.VerificarUsuario(usuarioatual.getLogin(login), usuarioatual.getSenha(senha));
        
        JFrame inicio = new inicio();
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
        inicio.setResizable(false);
        //inicio.setExtendedState(JFrame.MAXIMIZED_BOTH);
        dispose();
        

    }//GEN-LAST:event_botaoEntrarActionPerformed

    private void LOGO_LGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGO_LGMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LOGO_LGMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LOGO_LG;
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JTextPane campologin;
    private javax.swing.JPasswordField camposenha;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JLabel labelsenha;
    // End of variables declaration//GEN-END:variables
}
