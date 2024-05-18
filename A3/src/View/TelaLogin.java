package View;

import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        c_nome = new javax.swing.JTextField();
        c_senha = new javax.swing.JTextField();
        b_entrar = new javax.swing.JButton();
        b_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nome:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 126, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Senha:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 167, -1, -1));

        c_nome.setBackground(new java.awt.Color(204, 204, 204));
        c_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_nomeActionPerformed(evt);
            }
        });
        jPanel1.add(c_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 123, 133, -1));

        c_senha.setBackground(new java.awt.Color(204, 204, 204));
        c_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_senhaActionPerformed(evt);
            }
        });
        jPanel1.add(c_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 167, 134, -1));

        b_entrar.setBackground(new java.awt.Color(204, 204, 204));
        b_entrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b_entrar.setForeground(new java.awt.Color(51, 51, 51));
        b_entrar.setText("Entrar");
        b_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_entrarActionPerformed(evt);
            }
        });
        jPanel1.add(b_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));

        b_cancelar.setBackground(new java.awt.Color(204, 204, 204));
        b_cancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b_cancelar.setForeground(new java.awt.Color(0, 0, 0));
        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(b_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void c_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_nomeActionPerformed
        
    }//GEN-LAST:event_c_nomeActionPerformed

    private void c_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_senhaActionPerformed
        
    }//GEN-LAST:event_c_senhaActionPerformed

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        
        
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void b_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_entrarActionPerformed
        try {
            

            if (this.c_nome.getText().equals("cometela") & this.c_senha.getText().equals("tiburcio")) {
                JOptionPane.showMessageDialog(null, "Conectado!");
                TelaMenu objeto = new TelaMenu();
                objeto.setVisible(true);
                this.setVisible(false);

            } else {
                throw new Mensagens("Usuário Inválido");
            }
            this.c_nome.setText("");
            this.c_senha.setText("");

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());

        }
    }//GEN-LAST:event_b_entrarActionPerformed

    public static void main(String args[]) {
     
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cancelar;
    private javax.swing.JButton b_entrar;
    private javax.swing.JTextField c_nome;
    private javax.swing.JTextField c_senha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
