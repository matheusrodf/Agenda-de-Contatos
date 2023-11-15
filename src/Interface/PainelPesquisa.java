
package Interface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PainelPesquisa extends javax.swing.JPanel {

    TelaPrincipal frame;
    String url = "jdbc:h2:tcp://localhost//BancoDeDados/AgendaContatos";
    String username = "admin";
    String senha = "123";
    
    public PainelPesquisa(TelaPrincipal frame) {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Classe não encontrada.");
        }
        this.frame = frame;
        initComponents();
        this.setBounds(0, 0, 400, 300);
        this.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        email = new javax.swing.JLabel();
        bVoltar = new javax.swing.JButton();
        tEmail = new javax.swing.JTextField();
        nome = new javax.swing.JLabel();
        bPesquisar = new javax.swing.JButton();
        tNome = new javax.swing.JTextField();
        titulo = new javax.swing.JLabel();
        fone = new javax.swing.JLabel();
        tFone = new javax.swing.JTextField();
        celular = new javax.swing.JLabel();
        tCelular = new javax.swing.JTextField();
        endereco = new javax.swing.JLabel();
        tEndereco = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        tID = new javax.swing.JTextField();
        bEditar = new javax.swing.JButton();
        bExcluir = new javax.swing.JButton();
        bLimpar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(400, 300));

        email.setText("E-mail:");

        bVoltar.setText("Voltar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        nome.setText("Nome:");

        bPesquisar.setText("Pesquisar");
        bPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisarActionPerformed(evt);
            }
        });

        tNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNomeActionPerformed(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titulo.setText("Pesquisa de Contatos");

        fone.setText("Telefone:");

        celular.setText("Celular:");

        endereco.setText("Endereço:");

        id.setText("ID");

        tID.setEditable(false);

        bEditar.setText("Editar");
        bEditar.setEnabled(false);
        bEditar.setPreferredSize(new java.awt.Dimension(63, 23));
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });

        bExcluir.setText("Excluir");
        bExcluir.setEnabled(false);
        bExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirActionPerformed(evt);
            }
        });

        bLimpar.setText("Limpar");
        bLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(endereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(tEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(celular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(nome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(fone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tFone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(email)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bVoltar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(bLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(28, 28, 28)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(bExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(id))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(bEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(titulo)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fone)
                            .addComponent(tFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(celular)
                            .addComponent(tCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(id)
                                .addGap(21, 21, 21))
                            .addComponent(tID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(endereco)
                            .addComponent(tEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bPesquisar)
                            .addComponent(bEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(email)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bLimpar)
                    .addComponent(bVoltar)
                    .addComponent(bExcluir))
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        this.setVisible(false);
        frame.painelPrincipal.setVisible(true);
        bLimpar.doClick();
    }//GEN-LAST:event_bVoltarActionPerformed

    private void bPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarActionPerformed
        try {
            Connection conexao = DriverManager.getConnection(url, username, senha);
            if (tNome.getText().equals("") && tFone.getText().equals("") && tCelular.getText().equals("")
                    && tEndereco.getText().equals("") 
                    && tEmail.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Insira algo para pesquisar.","ERRO",JOptionPane.ERROR_MESSAGE);
            else {
            String sql = "SELECT * FROM CONTATO WHERE (NOME, TELEFONE, CELULAR, ENDERECO, EMAIL) LIKE ('%"
                    + tNome.getText() + "%','%"
                    + tFone.getText() + "%','%"
                    + tCelular.getText() + "%','%"
                    + tEndereco.getText() + "%','%"
                    + tEmail.getText() + "%');";
            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.next();
            tID.setText(rs.getString("ID"));
            tNome.setText(rs.getString("NOME"));
            tFone.setText(rs.getString("TELEFONE"));
            tCelular.setText(rs.getString("CELULAR"));
            tEndereco.setText(rs.getString("ENDERECO"));
            tEmail.setText(rs.getString("EMAIL"));
            
            ps.execute();
            ps.close();
            conexao.close();
            
            bEditar.setEnabled(true);
            bExcluir.setEnabled(true);
            }
        } catch (ExceptionInInitializerError ex) {
            JOptionPane.showMessageDialog(null, "Nenhum resultado corresponde com sua busca.","ERRO",JOptionPane.ERROR_MESSAGE);
        }
        
        catch (SQLException ex) {
            Logger.getLogger(PainelPesquisa.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Um erro ocorreu ao se conectar com o banco de dados.","ERRO",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bPesquisarActionPerformed

    private void tNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNomeActionPerformed

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        try {
            Connection conexao = DriverManager.getConnection(url, username, senha);
            if (tNome.getText().equals("") && tFone.getText().equals("") && tCelular.getText().equals("")
                    && tEndereco.getText().equals("") 
                    && tEmail.getText().equals(""))
                bExcluir.doClick();
            else {
                String sql = " UPDATE CONTATO SET (NOME, TELEFONE, CELULAR, ENDERECO, EMAIL) = ('"
                        + tNome.getText() + "','"
                        + tFone.getText() + "','"
                        + tCelular.getText() + "', '"
                        + tEndereco.getText() +  "', '"
                        + tEmail.getText() + "') WHERE ID=" + tID.getText();
                PreparedStatement ps = conexao.prepareStatement(sql);
                
                ps.executeUpdate();
                ps.close();
                conexao.close();
                JOptionPane.showMessageDialog(null, "Informações do contato atualizadas.");
            }
        }
        
        catch (SQLException ex) {
            Logger.getLogger(PainelPesquisa.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Um erro ocorreu ao se conectar com o banco de dados.","ERRO",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bEditarActionPerformed

    private void bExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirActionPerformed
            int j = JOptionPane.showOptionDialog(null, "Você deseja excluir esse contato?", "", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, 2);
        switch(j) {
            case 0:
                try {
                    Connection conexao = DriverManager.getConnection(url, username, senha);

                    String sql = "DELETE FROM CONTATO WHERE ID =" + tID.getText();
                    PreparedStatement ps = conexao.prepareStatement(sql);

                    ps.executeUpdate();
                    ps.close();
                    conexao.close();
                    JOptionPane.showMessageDialog(null, "Informações do contato removidas.");
                    bLimpar.doClick();
                }

                catch (SQLException ex) {
                    Logger.getLogger(PainelPesquisa.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "Um erro ocorreu ao se conectar com o banco de dados.","ERRO",JOptionPane.ERROR_MESSAGE);
                }
            break;
        }
    }//GEN-LAST:event_bExcluirActionPerformed

    private void bLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimparActionPerformed
        tNome.setText("");
        tFone.setText("");
        tCelular.setText("");
        tEndereco.setText("");
        tEmail.setText("");
        tID.setText("");
        bEditar.setEnabled(false);
        bExcluir.setEnabled(false);
    }//GEN-LAST:event_bLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEditar;
    private javax.swing.JButton bExcluir;
    private javax.swing.JButton bLimpar;
    private javax.swing.JButton bPesquisar;
    private javax.swing.JButton bVoltar;
    private javax.swing.JLabel celular;
    private javax.swing.JLabel email;
    private javax.swing.JLabel endereco;
    private javax.swing.JLabel fone;
    private javax.swing.JLabel id;
    private javax.swing.JLabel nome;
    private javax.swing.JTextField tCelular;
    private javax.swing.JTextField tEmail;
    private javax.swing.JTextField tEndereco;
    private javax.swing.JTextField tFone;
    private javax.swing.JTextField tID;
    private javax.swing.JTextField tNome;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
