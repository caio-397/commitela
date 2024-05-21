package View;

import Model.Produto;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CadastroProduto extends javax.swing.JFrame {

    private Produto objproduto; 

    public CadastroProduto() {
        initComponents();
        this.objproduto = new Produto(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        c_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        c_descricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        c_quantidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        c_preco = new javax.swing.JTextField();
        b_cadastrar = new javax.swing.JButton();
        b_cancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        c_data = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        jLabel5.setText("Preço");

        setTitle("Cadastro de Produtos");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Produto:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 108, -1, -1));

        c_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_nomeActionPerformed(evt);
            }
        });
        getContentPane().add(c_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 130, 246, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Descrição:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 158, -1, -1));

        c_descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_descricaoActionPerformed(evt);
            }
        });
        getContentPane().add(c_descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 178, 246, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Quantidade:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 206, -1, -1));

        c_quantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_quantidadeActionPerformed(evt);
            }
        });
        getContentPane().add(c_quantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 224, 120, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Preço:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 252, -1, -1));

        c_preco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_precoActionPerformed(evt);
            }
        });
        getContentPane().add(c_preco, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 272, 120, -1));

        b_cadastrar.setText("Cadastrar");
        b_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(b_cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 375, -1, 34));

        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(b_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 375, -1, 34));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 169, -1, -1));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 412, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Data:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 300, -1, -1));

        c_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_dataActionPerformed(evt);
            }
        });
        getContentPane().add(c_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 322, 120, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 810, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void c_quantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_quantidadeActionPerformed
        
    }//GEN-LAST:event_c_quantidadeActionPerformed

    private void c_descricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_descricaoActionPerformed
        
    }//GEN-LAST:event_c_descricaoActionPerformed

    private void c_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_dataActionPerformed
      
    }//GEN-LAST:event_c_dataActionPerformed

    private void c_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_nomeActionPerformed
       
    }//GEN-LAST:event_c_nomeActionPerformed

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        
        this.setVisible(false);
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void b_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cadastrarActionPerformed

        try {
            
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
                throw new Mensagens("Descrição deve ser escrita corretamente");
            } else {
                descricao = this.c_descricao.getText();
            }

            if (this.c_quantidade.getText().length() <= 0) {
                throw new Mensagens("Quantidade deve ser escrita corretamente");
            } else {
                quantidade = Integer.parseInt(this.c_quantidade.getText());
            }

            if (this.c_preco.getText().length() <= 0) {
                throw new Mensagens("Preço deve ser escrito corretamente");
            } else {
                preco = Double.parseDouble(this.c_preco.getText());
            }

            if (this.c_data.getText().length() < 10 && this.c_data.getText().length() >10) {
                throw new Mensagens("Utilize o formato __/__/__");
            } else {
                data = this.c_data.getText();
            }

            
            if (this.objproduto.InsertProdutoBD(quantidade, preco, nome, descricao, data, total)) {
                JOptionPane.showMessageDialog(rootPane, "Produto Cadastrado com Sucesso!");

                // limpa campos da interface
                this.c_nome.setText("");
                this.c_descricao.setText("");
                this.c_quantidade.setText("");
                this.c_preco.setText("");
                this.c_data.setText("");

            }

            System.out.println(this.objproduto.getMinhaLista().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um numero.");
        } catch (SQLException ex) {
            Logger.getLogger(CadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_b_cadastrarActionPerformed

    private void c_precoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_precoActionPerformed
       
    }//GEN-LAST:event_c_precoActionPerformed

 
    public static void main(String args[]) {
       

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cadastrar;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JTextField c_data;
    private javax.swing.JTextField c_descricao;
    private javax.swing.JTextField c_nome;
    private javax.swing.JTextField c_preco;
    private javax.swing.JTextField c_quantidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
