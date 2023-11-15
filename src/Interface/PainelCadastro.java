
package Interface;

import Exceptions.LimiteCharException;
import Exceptions.NomeVazioException;
import JavaBeans.Contato;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PainelCadastro extends javax.swing.JPanel {
    
    String url = "jdbc:h2:tcp://localhost//BancoDeDados/AgendaContatos";
    String username = "admin";
    String senha = "123";
    TelaPrincipal frame;
    public PainelCadastro(TelaPrincipal frame) {
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

        bVoltar = new javax.swing.JButton();
        nome = new javax.swing.JLabel();
        tNome = new javax.swing.JTextField();
        titulo = new javax.swing.JLabel();
        fone = new javax.swing.JLabel();
        tFone = new javax.swing.JTextField();
        celular = new javax.swing.JLabel();
        tCelular = new javax.swing.JTextField();
        endereco = new javax.swing.JLabel();
        tEndereco = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        tEmail = new javax.swing.JTextField();
        bCadastrar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(400, 300));

        bVoltar.setText("Voltar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        nome.setText("Nome:");

        tNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNomeActionPerformed(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titulo.setText("Cadastro de Contatos");

        fone.setText("Telefone:");

        celular.setText("Celular:");

        endereco.setText("Endereço:");

        email.setText("E-mail:");

        bCadastrar.setText("Cadastrar");
        bCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(titulo)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(email)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(endereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                .addGap(18, 18, 18)
                                .addComponent(tFone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(84, 84, 84)
                        .addComponent(bCadastrar)))
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fone)
                    .addComponent(tFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(celular)
                    .addComponent(tCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endereco)
                    .addComponent(tEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bVoltar)
                    .addComponent(bCadastrar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        this.setVisible(false);
        frame.painelPrincipal.setVisible(true);
        tNome.setText("");
        tFone.setText("");
        tCelular.setText("");
        tEndereco.setText("");
        tEmail.setText("");
    }//GEN-LAST:event_bVoltarActionPerformed

    private void tNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNomeActionPerformed
    }//GEN-LAST:event_tNomeActionPerformed

    private void bCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarActionPerformed
        try {
            Contato contato = new Contato();

            contato.setNome(tNome.getText());
            contato.setTelefone(tFone.getText());
            contato.setCelular(tCelular.getText());
            contato.setEndereco(tEndereco.getText());
            contato.setEmail(tEmail.getText());
        
            Connection conexao = DriverManager.getConnection(url, username, senha);
            String sql = "INSERT INTO CONTATO (NOME, TELEFONE, CELULAR, ENDERECO, EMAIL) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, contato.getNome());
            ps.setString(2, contato.getTelefone());
            ps.setString(3, contato.getCelular());
            ps.setString(4, contato.getEndereco());
            ps.setString(5, contato.getEmail());
            ps.executeUpdate();
            ps.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, "Cadastrado");
            tNome.setText("");
            tFone.setText("");
            tCelular.setText("");
            tEndereco.setText("");
            tEmail.setText("");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Um erro ocorreu ao se conectar com o banco de dados.","ERRO",JOptionPane.ERROR_MESSAGE);
        } catch (NomeVazioException ex) {
            JOptionPane.showMessageDialog(null, "Insira um nome.","ERRO",JOptionPane.ERROR_MESSAGE);
        } catch (LimiteCharException ex) {
            if (ex.i == 1) JOptionPane.showMessageDialog(null, "Nome muito grande.","ERRO",JOptionPane.ERROR_MESSAGE);;
            if (ex.i == 2) JOptionPane.showMessageDialog(null, "Numero de telefone muito grande.","ERRO",JOptionPane.ERROR_MESSAGE);;
            if (ex.i == 3) JOptionPane.showMessageDialog(null, "Número de celular muito grande.","ERRO",JOptionPane.ERROR_MESSAGE);;
            if (ex.i == 4) JOptionPane.showMessageDialog(null, "Endereço muito grande.","ERRO",JOptionPane.ERROR_MESSAGE);;
            if (ex.i == 5) JOptionPane.showMessageDialog(null, "E-mail muito grande.","ERRO",JOptionPane.ERROR_MESSAGE);;
        }
    }//GEN-LAST:event_bCadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCadastrar;
    private javax.swing.JButton bVoltar;
    private javax.swing.JLabel celular;
    private javax.swing.JLabel email;
    private javax.swing.JLabel endereco;
    private javax.swing.JLabel fone;
    private javax.swing.JLabel nome;
    private javax.swing.JTextField tCelular;
    private javax.swing.JTextField tEmail;
    private javax.swing.JTextField tEndereco;
    private javax.swing.JTextField tFone;
    private javax.swing.JTextField tNome;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
