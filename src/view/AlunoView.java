package view;

import dao.AlunoDAO;
import javax.swing.JOptionPane;
import model.Aluno;
import table.AlunoTableModel;

public class AlunoView extends javax.swing.JFrame {
    
    Aluno alu = new Aluno();
    AlunoDAO aln = new AlunoDAO();

    public AlunoView() {
        initComponents();
        setLocationRelativeTo(null);
        tbAluno.setModel(new AlunoTableModel(new AlunoDAO().listar()));
        btExcluir.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfPesquisarNome = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfEndereco = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAluno = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        tfIdentidade = new javax.swing.JFormattedTextField();
        tfCPF = new javax.swing.JFormattedTextField();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Aluno");
        setResizable(false);

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Identidade:");

        jLabel4.setText("Endereço:");

        jLabel5.setText("CPF:");

        tfCodigo.setEditable(false);
        tfCodigo.setBackground(new java.awt.Color(255, 204, 204));
        tfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoActionPerformed(evt);
            }
        });

        tfPesquisarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesquisarNomeActionPerformed(evt);
            }
        });
        tfPesquisarNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPesquisarNomeKeyPressed(evt);
            }
        });

        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        tfEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEnderecoActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        tbAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAlunoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbAluno);

        jLabel6.setText("Pesquisar (Nome):");

        try {
            tfIdentidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            tfCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfPesquisarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSalvar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                                .addComponent(tfEndereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                                .addComponent(tfIdentidade, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfIdentidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btExcluir)
                    .addComponent(btLimpar))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(tfPesquisarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoActionPerformed

    private void tfPesquisarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisarNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPesquisarNomeActionPerformed

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void tfEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEnderecoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (tfNome.getText().equals("") || tfIdentidade.getText().equals("") || tfEndereco.getText().equals("") || tfCPF.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Há campos em branco, verifique e tente novamente!","Aluno - Aviso",JOptionPane.WARNING_MESSAGE);
        } else {       
        if(tfCodigo.getText().equals("")) {
            alu.setNome(tfNome.getText());
            alu.setIdentidade(tfIdentidade.getText());
            alu.setEndereco(tfEndereco.getText());
            alu.setCpf(tfCPF.getText());
            aln.registrar(alu);
        } else {
            alu.setNome(tfNome.getText());
            alu.setIdentidade(tfIdentidade.getText());
            alu.setEndereco(tfEndereco.getText());
            alu.setCpf(tfCPF.getText());     
            alu.setId(Integer.parseInt(tfCodigo.getText()));
            aln.alterar(alu);
        }
        tbAluno.setModel(new AlunoTableModel(new AlunoDAO().listar()));
        tfCodigo.setText("");
        tfNome.setText("");
        tfIdentidade.setText("");
        tfEndereco.setText("");
        tfCPF.setText("");
        tfPesquisarNome.setText("");
        btSalvar.setEnabled(false);
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void tbAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAlunoMouseClicked
        btExcluir.setEnabled(true);
        btSalvar.setEnabled(true);
        tfCodigo.setText(tbAluno.getValueAt(tbAluno.getSelectedRow(), AlunoTableModel.COL_ALUNO_ID).toString());
        tfNome.setText(tbAluno.getValueAt(tbAluno.getSelectedRow(), AlunoTableModel.COL_ALUNO_NOME).toString());
        tfIdentidade.setText(tbAluno.getValueAt(tbAluno.getSelectedRow(), AlunoTableModel.COL_ALUNO_IDENTIDADE).toString());
        tfEndereco.setText(tbAluno.getValueAt(tbAluno.getSelectedRow(), AlunoTableModel.COL_ALUNO_ENDERECO).toString());
        tfCPF.setText(tbAluno.getValueAt(tbAluno.getSelectedRow(), AlunoTableModel.COL_ALUNO_CPF).toString());
    }//GEN-LAST:event_tbAlunoMouseClicked

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        btExcluir.setEnabled(false);
        tbAluno.setModel(new AlunoTableModel(new AlunoDAO().listar()));
        tfCodigo.setText("");
        tfNome.setText("");
        tfIdentidade.setText("");
        tfEndereco.setText("");
        tfCPF.setText("");
        tfPesquisarNome.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int escolha = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir?","Aluno - Excluir",JOptionPane.YES_NO_OPTION);
        if (escolha == 0) {
        int codigo  = Integer.parseInt(tfCodigo.getText());
        aln.excluir(codigo);
        tbAluno.setModel(new AlunoTableModel(new AlunoDAO().listar()));
        tfCodigo.setText("");
        tfNome.setText("");
        tfIdentidade.setText("");
        tfEndereco.setText("");
        tfCPF.setText("");
        tfPesquisarNome.setText("");
        btExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void tfPesquisarNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarNomeKeyPressed
        
        String pesquisa = tfPesquisarNome.getText();
        tbAluno.setModel(new AlunoTableModel(new AlunoDAO().listarTodosNome(pesquisa)));
    }//GEN-LAST:event_tfPesquisarNomeKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbAluno;
    private javax.swing.JFormattedTextField tfCPF;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JFormattedTextField tfIdentidade;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPesquisarNome;
    // End of variables declaration//GEN-END:variables
}
