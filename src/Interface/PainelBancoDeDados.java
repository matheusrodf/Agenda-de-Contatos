
package Interface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PainelBancoDeDados extends javax.swing.JPanel {
    
    String url = "jdbc:h2:tcp://localhost//BancoDeDados/AgendaContatos";
    String username = "admin";
    String senha = "123";
    TelaPrincipal frame;
    
    public PainelBancoDeDados(TelaPrincipal frame) {
        this.frame = frame;
        initComponents();
        this.setBounds(0, 0, 400, 300);
        this.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bLimpar = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        visualizar = new javax.swing.JButton();
        bVoltar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        bLimpar.setText("Limpar Banco de Dados");
        bLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimparActionPerformed(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titulo.setText("Gerenciar Banco de dados");

        visualizar.setText("Ver banco de dados");
        visualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarActionPerformed(evt);
            }
        });

        bVoltar.setText("Voltar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(bLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(visualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(125, 125, 125))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(bLimpar)
                .addGap(18, 18, 18)
                .addComponent(visualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(bVoltar)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimparActionPerformed
        int j = JOptionPane.showOptionDialog(null, "Isso excluirá todos os itens do banco de dados\nDeseja continuar?", "", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, 2);
        switch(j) {
            case 0:
                try {
                    Connection conexao = DriverManager.getConnection(url, username, senha);

                    PreparedStatement ps = conexao.prepareStatement("DELETE FROM CONTATO");
                    ps.execute();
                    //Para os IDs voltarem do 1.
                    ps = conexao.prepareStatement("ALTER TABLE CONTATO ALTER COLUMN ID RESTART WITH 1");
                    ps.execute();
                    ps.close();
                    
                    conexao.close();
                    JOptionPane.showMessageDialog(null, "Banco de Dados excluído.");
                }
                catch (SQLException ex) {
                    Logger.getLogger(PainelPesquisa.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "Um erro ocorreu ao se conectar com o banco de dados.","ERRO",JOptionPane.ERROR_MESSAGE);
                }
        }
    }//GEN-LAST:event_bLimparActionPerformed

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        this.setVisible(false);
        frame.painelPrincipal.setVisible(true);
    }//GEN-LAST:event_bVoltarActionPerformed

    private void visualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarActionPerformed
        FrameBancoDados dados = new FrameBancoDados();
    }//GEN-LAST:event_visualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bLimpar;
    private javax.swing.JButton bVoltar;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton visualizar;
    // End of variables declaration//GEN-END:variables
}
