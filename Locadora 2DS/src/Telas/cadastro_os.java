/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

/**
 *
 * @author aluno
 */
public class cadastro_os extends javax.swing.JFrame {

    /**
     * Creates new form cadastro_cliente
     */
    public cadastro_os() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        num_os = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kmDevo_os = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_S_os = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        dataDevo_os = new javax.swing.JFormattedTextField();
        btn_CAN_os = new javax.swing.JButton();
        stts_os = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cpfCli_os = new javax.swing.JComboBox();
        PLacaVei_os = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dataRetir_os = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        kmRetir_os = new javax.swing.JTextField();
        MatFunc_os = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(245, 138, 81));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        num_os.setToolTipText("CPF");
        num_os.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_osActionPerformed(evt);
            }
        });
        getContentPane().add(num_os, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 80, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Numero do O.S.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setText("Status");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 90, -1));

        kmDevo_os.setToolTipText("CPF");
        kmDevo_os.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kmDevo_osActionPerformed(evt);
            }
        });
        getContentPane().add(kmDevo_os, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 140, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setText("Km Devocluão");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setText("Data Devolução");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 102, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 379, 10));

        btn_S_os.setBackground(new java.awt.Color(255, 204, 153));
        btn_S_os.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_S_os.setText("Salvar");
        btn_S_os.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_S_osActionPerformed(evt);
            }
        });
        getContentPane().add(btn_S_os, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 100, 30));

        jSeparator2.setBackground(new java.awt.Color(255, 102, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 379, 10));

        jSeparator3.setBackground(new java.awt.Color(255, 102, 0));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 379, -1));

        jLabel1.setBackground(new java.awt.Color(255, 153, 51));
        jLabel1.setFont(new java.awt.Font("SimSun", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ORDEM DE SERVIÇO");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 50));

        try {
            dataDevo_os.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("## - ## - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataDevo_os.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dataDevo_os.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(dataDevo_os, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 120, -1));

        btn_CAN_os.setBackground(new java.awt.Color(255, 204, 153));
        btn_CAN_os.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_CAN_os.setText("Cancelar");
        btn_CAN_os.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CAN_osActionPerformed(evt);
            }
        });
        getContentPane().add(btn_CAN_os, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 100, 30));

        stts_os.setBackground(new java.awt.Color(255, 204, 153));
        stts_os.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        stts_os.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stts_osActionPerformed(evt);
            }
        });
        getContentPane().add(stts_os, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 60, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setText("CPF Cliente");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 150, -1));

        cpfCli_os.setBackground(new java.awt.Color(255, 204, 153));
        cpfCli_os.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(cpfCli_os, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 100, 20));

        PLacaVei_os.setBackground(new java.awt.Color(255, 204, 153));
        PLacaVei_os.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(PLacaVei_os, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 100, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Placa");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel11.setText("Data Retirada");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        try {
            dataRetir_os.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("## - ## - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataRetir_os.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dataRetir_os.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(dataRetir_os, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 120, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel13.setText("Km Retirada");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        kmRetir_os.setToolTipText("CPF");
        kmRetir_os.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kmRetir_osActionPerformed(evt);
            }
        });
        getContentPane().add(kmRetir_os, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 140, -1));

        MatFunc_os.setBackground(new java.awt.Color(255, 204, 153));
        MatFunc_os.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MatFunc_os.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatFunc_osActionPerformed(evt);
            }
        });
        getContentPane().add(MatFunc_os, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 100, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel14.setText("Matricula Funcionario");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 140, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void num_osActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_osActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_osActionPerformed

    private void kmDevo_osActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kmDevo_osActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kmDevo_osActionPerformed

    private void btn_S_osActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_S_osActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_S_osActionPerformed

    private void btn_CAN_osActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CAN_osActionPerformed
        dispose();
    }//GEN-LAST:event_btn_CAN_osActionPerformed

    private void stts_osActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stts_osActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stts_osActionPerformed

    private void kmRetir_osActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kmRetir_osActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kmRetir_osActionPerformed

    private void MatFunc_osActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatFunc_osActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MatFunc_osActionPerformed

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
            java.util.logging.Logger.getLogger(cadastro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastro_cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox MatFunc_os;
    private javax.swing.JComboBox PLacaVei_os;
    private javax.swing.JButton btn_CAN_os;
    private javax.swing.JButton btn_S_os;
    private javax.swing.JComboBox cpfCli_os;
    private javax.swing.JFormattedTextField dataDevo_os;
    private javax.swing.JFormattedTextField dataRetir_os;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField kmDevo_os;
    private javax.swing.JTextField kmRetir_os;
    private javax.swing.JTextField num_os;
    private javax.swing.JComboBox stts_os;
    // End of variables declaration//GEN-END:variables
}