/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Classes.veiculosTemp;
import Tabelas.Categoria;
import Tabelas.Combustivel;
import Util.categoriaDAO;
import Util.combustivelDAO;
import Util.veiculosDAO;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class alterar_veiculos extends javax.swing.JFrame {

    List<Combustivel> combustivel;
    List<Categoria> categoria;

    public alterar_veiculos() {
        initComponents();
        Listacombustivel();
        Listacategoria();
        CarregarVeiculos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ALplaca_vei = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ALcor_vei = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ALcomb_vei = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ALbtn_S_vei = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ALano_vei = new javax.swing.JFormattedTextField();
        ALmarca_vei = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        ALcat_vei = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        ALmodelo_vei = new javax.swing.JTextField();
        ALbtn_ED_vei = new javax.swing.JButton();
        ALbtn_EX_vei = new javax.swing.JButton();
        ALbtn_CAN_vei = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(245, 138, 81));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ALplaca_vei.setToolTipText("CPF");
        ALplaca_vei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALplaca_veiActionPerformed(evt);
            }
        });
        getContentPane().add(ALplaca_vei, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Placa");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setText("Modelo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 110, -1));

        ALcor_vei.setToolTipText("CPF");
        ALcor_vei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALcor_veiActionPerformed(evt);
            }
        });
        getContentPane().add(ALcor_vei, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 70, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setText("Combustível");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 90, -1));

        ALcomb_vei.setBackground(new java.awt.Color(255, 204, 153));
        ALcomb_vei.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ALcomb_vei.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Álcool", "Diesel", "Flex", "Gasolina" }));
        ALcomb_vei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALcomb_veiActionPerformed(evt);
            }
        });
        getContentPane().add(ALcomb_vei, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 110, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setText("Cor");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 102, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 379, 10));

        ALbtn_S_vei.setBackground(new java.awt.Color(255, 204, 153));
        ALbtn_S_vei.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ALbtn_S_vei.setText("Salvar");
        ALbtn_S_vei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALbtn_S_veiActionPerformed(evt);
            }
        });
        getContentPane().add(ALbtn_S_vei, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 90, 30));

        jSeparator3.setBackground(new java.awt.Color(255, 102, 0));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 379, -1));

        jLabel1.setBackground(new java.awt.Color(255, 153, 51));
        jLabel1.setFont(new java.awt.Font("SimSun", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALTERAR VEÍCULOS");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 50));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel11.setText("Marca");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 50, -1));

        try {
            ALano_vei.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ALano_vei.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ALano_vei.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(ALano_vei, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 50, -1));

        ALmarca_vei.setBackground(new java.awt.Color(255, 204, 153));
        ALmarca_vei.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ALmarca_vei.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "VW", "Chevrolet", "Ford", "Porsche", "Fiat" }));
        ALmarca_vei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALmarca_veiActionPerformed(evt);
            }
        });
        getContentPane().add(ALmarca_vei, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 80, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel10.setText("Categoria");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 90, -1));

        ALcat_vei.setBackground(new java.awt.Color(255, 204, 153));
        ALcat_vei.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ALcat_vei.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Básico", "Utilitario", "Luxo", "Especial" }));
        ALcat_vei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALcat_veiActionPerformed(evt);
            }
        });
        getContentPane().add(ALcat_vei, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 110, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel12.setText("Ano");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        ALmodelo_vei.setToolTipText("CPF");
        ALmodelo_vei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALmodelo_veiActionPerformed(evt);
            }
        });
        getContentPane().add(ALmodelo_vei, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 100, -1));

        ALbtn_ED_vei.setBackground(new java.awt.Color(255, 204, 153));
        ALbtn_ED_vei.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ALbtn_ED_vei.setText("Editar");
        ALbtn_ED_vei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALbtn_ED_veiActionPerformed(evt);
            }
        });
        getContentPane().add(ALbtn_ED_vei, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 90, 30));

        ALbtn_EX_vei.setBackground(new java.awt.Color(255, 204, 153));
        ALbtn_EX_vei.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ALbtn_EX_vei.setText("Excluir");
        ALbtn_EX_vei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALbtn_EX_veiActionPerformed(evt);
            }
        });
        getContentPane().add(ALbtn_EX_vei, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 90, 30));

        ALbtn_CAN_vei.setBackground(new java.awt.Color(255, 204, 153));
        ALbtn_CAN_vei.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ALbtn_CAN_vei.setText("Cancelar");
        ALbtn_CAN_vei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALbtn_CAN_veiActionPerformed(evt);
            }
        });
        getContentPane().add(ALbtn_CAN_vei, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 90, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ALplaca_veiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALplaca_veiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ALplaca_veiActionPerformed

    private void ALcor_veiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALcor_veiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ALcor_veiActionPerformed

    private void ALcomb_veiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALcomb_veiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ALcomb_veiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ALmarca_veiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALmarca_veiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ALmarca_veiActionPerformed

    private void ALcat_veiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALcat_veiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ALcat_veiActionPerformed

    private void ALmodelo_veiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALmodelo_veiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ALmodelo_veiActionPerformed

    private void ALbtn_ED_veiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALbtn_ED_veiActionPerformed
        habilitacampos();
    }//GEN-LAST:event_ALbtn_ED_veiActionPerformed

    private void ALbtn_S_veiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALbtn_S_veiActionPerformed
        Tabelas.Veiculos veiculos = new Tabelas.Veiculos();

        Combustivel comb = new Combustivel();
        comb = combustivel.get(ALcomb_vei.getSelectedIndex());

        Categoria cate = new Categoria();
        cate = categoria.get(ALcat_vei.getSelectedIndex());

        veiculos.setCor(ALcor_vei.getText());
        veiculos.setModelo(ALmodelo_vei.getText());
        veiculos.setAno(Integer.valueOf(ALano_vei.getText()));
        veiculos.setMarca(ALmarca_vei.getSelectedItem().toString());
        veiculos.setCat(cate.getCod());
        veiculos.setPlaca(ALplaca_vei.getText());
        veiculos.setComb(comb.getTipo());
        veiculosDAO vDAO = new veiculosDAO();
        vDAO.Salvar(veiculos);
        JOptionPane.showMessageDialog(null, "Alteração bem sucedida. \n clique no botão ATUALIZAR pra ver a alteração.");
        dispose();
    }//GEN-LAST:event_ALbtn_S_veiActionPerformed

    private void ALbtn_EX_veiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALbtn_EX_veiActionPerformed
        Tabelas.Veiculos veiculos = new Tabelas.Veiculos();
        veiculos.setPlaca((ALplaca_vei.getText()));
        veiculosDAO veiDAO = new veiculosDAO();
        veiDAO.Excluir(veiculos);
        JOptionPane.showMessageDialog(null, "Veiculo excluido com sucesso \n clique no botão ATUALIZAR para ver na tabela");
        bloqcampos();
        dispose();
    }//GEN-LAST:event_ALbtn_EX_veiActionPerformed

    private void ALbtn_CAN_veiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALbtn_CAN_veiActionPerformed
        bloqcampos();
        dispose();
    }//GEN-LAST:event_ALbtn_CAN_veiActionPerformed

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
            java.util.logging.Logger.getLogger(alterar_veiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(alterar_veiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(alterar_veiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(alterar_veiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new alterar_veiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField ALano_vei;
    private javax.swing.JButton ALbtn_CAN_vei;
    private javax.swing.JButton ALbtn_ED_vei;
    private javax.swing.JButton ALbtn_EX_vei;
    private javax.swing.JButton ALbtn_S_vei;
    private javax.swing.JComboBox ALcat_vei;
    private javax.swing.JComboBox ALcomb_vei;
    private javax.swing.JTextField ALcor_vei;
    private javax.swing.JComboBox ALmarca_vei;
    private javax.swing.JTextField ALmodelo_vei;
    private javax.swing.JTextField ALplaca_vei;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables

    private void Listacombustivel() {
        ALcomb_vei.removeAllItems();
        combustivelDAO cDAO = new combustivelDAO();
        combustivel = cDAO.ListaCombustivel();

        DefaultComboBoxModel combo = (DefaultComboBoxModel) ALcomb_vei.getModel();
        for (int i = 0; i < combustivel.size(); i++) {
            Combustivel comb = combustivel.get(i);
            combo.addElement(comb.getCombust());
        }

        ALcomb_vei.repaint();
    }

    private void Listacategoria() {
        ALcat_vei.removeAllItems();
        categoriaDAO catDAO = new categoriaDAO();
        categoria = catDAO.ListaCategoria();

        DefaultComboBoxModel combo = (DefaultComboBoxModel) ALcat_vei.getModel();
        for (int i = 0; i < categoria.size(); i++) {
            Categoria cate = categoria.get(i);
            combo.addElement(cate.getCate());
        }

        ALcat_vei.repaint();

    }

    private void habilitacampos() {
        ALplaca_vei.setEnabled(true);
        ALmodelo_vei.setEnabled(true);
        ALmarca_vei.setEnabled(true);
        ALcor_vei.setEnabled(true);
        ALcomb_vei.setEnabled(true);
        ALcat_vei.setEnabled(true);
        ALano_vei.setEnabled(true);
        ALbtn_EX_vei.setEnabled(true);
    }

    private void bloqcampos() {
        ALplaca_vei.setEnabled(false);
        ALmodelo_vei.setEnabled(false);
        ALmarca_vei.setEnabled(false);
        ALcor_vei.setEnabled(false);
        ALcomb_vei.setEnabled(false);
        ALcat_vei.setEnabled(false);
        ALano_vei.setEnabled(false);

    }

    public void CarregarVeiculos() {
        ALplaca_vei.setText(veiculosTemp.getPlaca());
        ALmarca_vei.setSelectedItem(veiculosTemp.getMarca());
        ALmodelo_vei.setText(veiculosTemp.getModelo());
        ALcor_vei.setText(veiculosTemp.getCor());
        //ALano_vei.setText(Integer.valueOf(veiculosTemp.getAno()));
        ALcomb_vei.setSelectedItem(veiculosTemp.getComb());
        ALcat_vei.setSelectedIndex(veiculosTemp.getCat());

    }

}