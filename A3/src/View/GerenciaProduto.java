package View;

import Model.Produto;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GerenciaProduto extends javax.swing.JFrame {

    private Produto objproduto; 

    public GerenciaProduto() {
        initComponents();
        this.objproduto = new Produto(); 
        this.carregaTabela();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProduto = new javax.swing.JTable();
        b_cancelar = new javax.swing.JButton();
        b_alterar = new javax.swing.JButton();
        b_apagar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        c_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        c_descricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        c_quantidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        c_preco = new javax.swing.JTextField();
        c_data = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        c_total = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setTitle("Tabela de Produtos");
        setAlwaysOnTop(true);
        setBounds(new java.awt.Rectangle(0, 0, 1200, 1200));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableProduto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Descricao", "Quantidade", "Preço", "Data", "Valor Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProduto);
        if (jTableProduto.getColumnModel().getColumnCount() > 0) {
            jTableProduto.getColumnModel().getColumn(0).setMinWidth(30);
            jTableProduto.getColumnModel().getColumn(0).setMaxWidth(30);
            jTableProduto.getColumnModel().getColumn(1).setMinWidth(90);
            jTableProduto.getColumnModel().getColumn(1).setMaxWidth(90);
            jTableProduto.getColumnModel().getColumn(2).setMinWidth(130);
            jTableProduto.getColumnModel().getColumn(2).setMaxWidth(130);
            jTableProduto.getColumnModel().getColumn(3).setMinWidth(90);
            jTableProduto.getColumnModel().getColumn(3).setMaxWidth(90);
            jTableProduto.getColumnModel().getColumn(6).setMinWidth(80);
            jTableProduto.getColumnModel().getColumn(6).setMaxWidth(80);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 14, 552, 572));

        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(b_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, -1, -1));

        b_alterar.setText("Alterar");
        b_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_alterarActionPerformed(evt);
            }
        });
        getContentPane().add(b_alterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 460, -1, -1));

        b_apagar.setText("Apagar");
        b_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_apagarActionPerformed(evt);
            }
        });
        getContentPane().add(b_apagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 460, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, -1, -1));

        c_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_nomeActionPerformed(evt);
            }
        });
        getContentPane().add(c_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, 170, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Descrição:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, -1, -1));

        c_descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_descricaoActionPerformed(evt);
            }
        });
        getContentPane().add(c_descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, 170, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Quantidade:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, -1, -1));

        c_quantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_quantidadeActionPerformed(evt);
            }
        });
        getContentPane().add(c_quantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 85, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Preço:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 330, -1, -1));
        getContentPane().add(c_preco, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, 85, -1));
        getContentPane().add(c_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, 85, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Data:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, -1, -1));

        c_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_totalActionPerformed(evt);
            }
        });
        getContentPane().add(c_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(912, 83, 0, 0));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void b_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_alterarActionPerformed

        try {
            
            int id = 0;
            String nome = "";
            String descricao = "";
            int quantidade = 0;
            double preco = 0;
            String data = "";
            double total = (preco * quantidade);

            if (this.c_nome.getText().length() < 2) {
                throw new Mensagens("Produto deve ser escrito corretamente");
            } else {
                nome = this.c_nome.getText();
            }

            if (this.c_descricao.getText().length() <= 0) {
                throw new Mensagens("Preço deve ser escrito corretamente");
            } else {
                descricao = this.c_descricao.getText();
            }

            if (this.c_quantidade.getText().length() <= 0) {
                throw new Mensagens("Quantidade deve ser escrito corretamente");
            } else {
                quantidade = Integer.parseInt(this.c_quantidade.getText());
            }

            if (this.c_preco.getText().length() <= 0) {
                throw new Mensagens("Preço deve ser escrito corretamente");
            } else {
                preco = Double.parseDouble(this.c_preco.getText());
            }

            if (this.jTableProduto.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um Produto para Alterar");
            } else {
                id = Integer.parseInt(this.jTableProduto.getValueAt(this.jTableProduto.getSelectedRow(), 0).toString());
            }
            if (this.c_data.getText().length() < 10) {
                throw new Mensagens("Utilize o formato __/__/__");
            } else {
                data = this.c_data.getText();
            }
            
            if (this.c_total.getText().length() > 0){
                total = Double.parseDouble(this.c_total.getText());
            }
            
            if (this.objproduto.UpdateProdutoBD(quantidade, preco, id, nome, descricao, data, total)) {

                
                this.c_nome.setText("");
                this.c_descricao.setText("");
                this.c_quantidade.setText("");
                this.c_preco.setText("");
                this.c_data.setText("");
                this.c_total.setText("");
                JOptionPane.showMessageDialog(rootPane, "Produto Alterado com Sucesso!");

            }
            System.out.println(this.objproduto.getMinhaLista().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número.");
        } finally {
            carregaTabela(); 
        }
    }//GEN-LAST:event_b_alterarActionPerformed

    private void jTableProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutoMouseClicked

        if (this.jTableProduto.getSelectedRow() != -1) {

            String nome = this.jTableProduto.getValueAt(this.jTableProduto.getSelectedRow(), 1).toString();
            String descricao = this.jTableProduto.getValueAt(this.jTableProduto.getSelectedRow(), 2).toString();
            String quantidade = this.jTableProduto.getValueAt(this.jTableProduto.getSelectedRow(), 3).toString();
            String preco = this.jTableProduto.getValueAt(this.jTableProduto.getSelectedRow(), 4).toString();
            String data = this.jTableProduto.getValueAt(this.jTableProduto.getSelectedRow(), 5).toString();
            String total = this.jTableProduto.getValueAt(this.jTableProduto.getSelectedRow(), 6).toString();

            this.c_nome.setText(nome);
            this.c_descricao.setText(descricao);
            this.c_quantidade.setText(quantidade);
            this.c_preco.setText(preco);
            this.c_data.setText(data);
            this.c_total.setText(total);

        }
    }//GEN-LAST:event_jTableProdutoMouseClicked

    private void b_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_apagarActionPerformed
        try {
            
            int id = 0;
            if (this.jTableProduto.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um Produto para APAGAR");
            } else {
                id = Integer.parseInt(this.jTableProduto.getValueAt(this.jTableProduto.getSelectedRow(), 0).toString());
            }

            
            int resposta_usuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja APAGAR este Produto ?");

            if (resposta_usuario == 0) {// clicou em SIM

                
                if (this.objproduto.DeleteProdutoBD(id)) {

                    // limpa os campos
                    this.c_nome.setText("");
                    this.c_descricao.setText("");
                    this.c_quantidade.setText("");
                    this.c_preco.setText("");
                    this.c_data.setText("");
                    this.c_total.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Produto Apagado com Sucesso!");

                }

            }

            System.out.println(this.objproduto.getMinhaLista().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            // atualiza a tabela.
            carregaTabela();
        }
    }//GEN-LAST:event_b_apagarActionPerformed

    private void c_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_nomeActionPerformed

    private void c_descricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_descricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_descricaoActionPerformed

    private void c_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_totalActionPerformed

    private void c_quantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_quantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_quantidadeActionPerformed

    
    @SuppressWarnings("unchecked")
    public void carregaTabela() {

        DefaultTableModel modelo = (DefaultTableModel) this.jTableProduto.getModel();
        modelo.setNumRows(0);

        ArrayList<Produto> minhalista = new ArrayList<>();
        minhalista = objproduto.getMinhaLista();

        for (Produto a : minhalista) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getDescricao(),
                a.getQuantidade(),
                a.getPreco(),
                a.getData(),
                a.getTotal()
            });
        }
    }

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
            java.util.logging.Logger.getLogger(GerenciaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciaProduto().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_alterar;
    private javax.swing.JButton b_apagar;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JTextField c_data;
    private javax.swing.JTextField c_descricao;
    private javax.swing.JTextField c_nome;
    private javax.swing.JTextField c_preco;
    private javax.swing.JTextField c_quantidade;
    private javax.swing.JTextField c_total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProduto;
    // End of variables declaration//GEN-END:variables
}
