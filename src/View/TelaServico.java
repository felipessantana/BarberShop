/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.DAO.ServicoDAO;
import Model.Servico;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felipe Santana
 */
public class TelaServico extends javax.swing.JFrame {

    /**
     * Creates new form Servico
     */
    ServicoDAO servicoDAO;
     
    public TelaServico() throws SQLException {
        
        initComponents();
        servicoDAO = new ServicoDAO();
        DefaultTableModel  modelServ = (DefaultTableModel) jTableConsulta.getModel();
        readJTable();
    }
    public void readJTable() throws SQLException{
        DefaultTableModel  modelServ = (DefaultTableModel) jTableConsulta.getModel();
        modelServ.setNumRows(0);
        
        ServicoDAO servicoDAO = new ServicoDAO();
        
        for (Servico s: servicoDAO.read()) {
            modelServ.addRow(new Object[]{
                s.getId(),
                s.getDescricao(),
                s.getValor()
                    
                    
            });
            
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

        jButtonLimpar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSalvar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsulta = new javax.swing.JTable();
        jTextValor = new javax.swing.JTextField();
        jLabelValor = new javax.swing.JLabel();
        jTextDescricao = new javax.swing.JTextField();
        jLabelDescricao = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelSombra = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(937, 600));
        setName("servico"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonLimpar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/apagar.png"))); // NOI18N
        jButtonLimpar.setText("LIMPAR");
        jButtonLimpar.setMaximumSize(new java.awt.Dimension(101, 38));
        jButtonLimpar.setMinimumSize(new java.awt.Dimension(101, 38));
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 110, 40));

        jButtonEditar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/editar.png"))); // NOI18N
        jButtonEditar.setText("EDITAR");
        jButtonEditar.setMaximumSize(new java.awt.Dimension(101, 38));
        jButtonEditar.setMinimumSize(new java.awt.Dimension(101, 38));
        jButtonEditar.setPreferredSize(new java.awt.Dimension(101, 38));
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        jButtonEditar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButtonEditarKeyReleased(evt);
            }
        });
        getContentPane().add(jButtonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, 110, 40));

        jButtonExcluir.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/excluir.png"))); // NOI18N
        jButtonExcluir.setText("EXCLUIR");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, 120, 40));

        jButtonSalvar1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonSalvar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/salvar.png"))); // NOI18N
        jButtonSalvar1.setText("SALVAR");
        jButtonSalvar1.setMaximumSize(new java.awt.Dimension(101, 38));
        jButtonSalvar1.setMinimumSize(new java.awt.Dimension(101, 38));
        jButtonSalvar1.setPreferredSize(new java.awt.Dimension(101, 38));
        jButtonSalvar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSalvar1MouseClicked(evt);
            }
        });
        jButtonSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalvar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 120, 40));

        jTableConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Descrição", "Valor R$"
            }
        ));
        jTableConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableConsultaMouseClicked(evt);
            }
        });
        jTableConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableConsultaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableConsulta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 630, 150));

        jTextValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextValorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 370, 30));

        jLabelValor.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelValor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValor.setText("Valor R$");
        getContentPane().add(jLabelValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        jTextDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDescricaoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 370, 30));

        jLabelDescricao.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelDescricao.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDescricao.setText("Descrição");
        getContentPane().add(jLabelDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Serviços");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        jLabelSombra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(jLabelSombra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 810, 520));

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/fundo_servicos.jpg"))); // NOI18N
        getContentPane().add(jLabelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 900, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDescricaoActionPerformed

    private void jTextValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextValorActionPerformed

    private void jButtonSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvar1ActionPerformed
        try {
            if(!jTextDescricao.getText().equals("")){
            
                Servico servico = new Servico();
                
                servico.setDescricao(jTextDescricao.getText());
                servico.setValor(Float.parseFloat(jTextValor.getText()));
                servicoDAO.insert(servico);
                JOptionPane.showMessageDialog(rootPane, "Servico Salvo com Sucesso");
                readJTable();
            
            }else{
                JOptionPane.showMessageDialog(rootPane, "O Servico não foi salvo, pois o campo mome não foi preenchido");
            
            }
            
        } catch (HeadlessException | NumberFormatException e) {
            
            JOptionPane.showMessageDialog(rootPane, e);
        } catch (SQLException ex) {
            Logger.getLogger(TelaServico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButtonSalvar1ActionPerformed

    private void jButtonSalvar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalvar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalvar1MouseClicked

    private void jButtonEditarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonEditarKeyReleased
        
        
            
        
        
        
    }//GEN-LAST:event_jButtonEditarKeyReleased

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
       
        
        
            try {
                 if(jTableConsulta.getSelectedRow() != -1){
            
                    Servico servico = new Servico();
                    ServicoDAO servicoDAO = new ServicoDAO();
            
                    servico.setDescricao(jTextDescricao.getText());
                    servico.setValor(Float.parseFloat(jTextValor.getText()));
                    servico.setId((int)jTableConsulta.getValueAt(jTableConsulta.getSelectedRow(),0 ));
                    servicoDAO.update(servico);
                    JOptionPane.showMessageDialog(rootPane, "Servico Atualizado com Sucesso");
            
                    jTextDescricao.setText("");
                    jTextValor.setText("");
                    readJTable();
                }else{
                JOptionPane.showMessageDialog(rootPane, "O Servico não foi atualiado, pois o campo mome não foi preenchido");
            
                }
            }catch (HeadlessException | NumberFormatException e) {
            
                JOptionPane.showMessageDialog(rootPane, e);
            } catch (SQLException ex) {
                Logger.getLogger(TelaServico.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
        
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jTableConsultaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableConsultaKeyReleased
       
    }//GEN-LAST:event_jTableConsultaKeyReleased

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
       try {
                 if(jTableConsulta.getSelectedRow() != -1){
            
                    Servico servico = new Servico();
                    ServicoDAO servicoDAO = new ServicoDAO();
            
                    
                    servico.setId((int)jTableConsulta.getValueAt(jTableConsulta.getSelectedRow(),0 ));
                    servicoDAO.delete(servico);
                    JOptionPane.showMessageDialog(rootPane, "Servico Excluido com Sucesso");
            
                    jTextDescricao.setText("");
                    jTextValor.setText("");
                    readJTable();
                }else{
                JOptionPane.showMessageDialog(rootPane, "O Servico não foi excluido, pois o campo mome não foi preenchido");
            
                }
            }catch (HeadlessException | NumberFormatException e) {
            
                JOptionPane.showMessageDialog(rootPane, e);
            } catch (SQLException ex) {
                Logger.getLogger(TelaServico.class.getName()).log(Level.SEVERE, null, ex);
            }
            
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTableConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConsultaMouseClicked
        if(jTableConsulta.getSelectedRow() != -1){
            jTextDescricao.setText(jTableConsulta.getValueAt(jTableConsulta.getSelectedRow(), 1).toString());
            jTextValor.setText(jTableConsulta.getValueAt(jTableConsulta.getSelectedRow(), 2).toString());          
        
        }
    }//GEN-LAST:event_jTableConsultaMouseClicked

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
                    jTextDescricao.setText("");
                    jTextValor.setText("");
                    
    }//GEN-LAST:event_jButtonLimparActionPerformed

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
            java.util.logging.Logger.getLogger(TelaServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaServico().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaServico.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar1;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelSombra;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableConsulta;
    private javax.swing.JTextField jTextDescricao;
    private javax.swing.JTextField jTextValor;
    // End of variables declaration//GEN-END:variables
}
