package view;

import dao.InstrutorDAO;
import dao.TipoAtividadeDAO;
import javax.swing.JOptionPane;
import model.Instrutor;
import model.TipoAtividade;
import table.InstrutorTableModel;

public class InstrutorView extends javax.swing.JFrame {
    
    Instrutor inst = new Instrutor();
    InstrutorDAO ins = new InstrutorDAO();

    public InstrutorView() {
        initComponents();
        setLocationRelativeTo(null);
        tbInstrutor.setModel(new InstrutorTableModel(new InstrutorDAO().listar()));
        btExcluir.setEnabled(false);
        
        TipoAtividadeDAO dao = new TipoAtividadeDAO();
        
        for (TipoAtividade t: dao.listar()) {
            cjTipoAtividade.addItem(t);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfIdentidade = new javax.swing.JFormattedTextField();
        tfCPF = new javax.swing.JFormattedTextField();
        btLimpar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbInstrutor = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        tfPesquisarNome = new javax.swing.JTextField();
        cjTipoAtividade = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Instrutor");

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Identidade:");

        jLabel4.setText("CPF:");

        jLabel5.setText("Tipo de Atividade:");

        tfCodigo.setEditable(false);
        tfCodigo.setBackground(new java.awt.Color(255, 204, 204));

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

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        tbInstrutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbInstrutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbInstrutorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbInstrutor);

        jLabel6.setText("Pesquisar (Nome):");

        tfPesquisarNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPesquisarNomeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(btLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(86, 86, 86)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                                    .addComponent(tfIdentidade, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                                    .addComponent(tfCPF)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSalvar))
                            .addComponent(cjTipoAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(70, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfPesquisarNome))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)))
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfIdentidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cjTipoAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btExcluir)
                    .addComponent(btSalvar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfPesquisarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(148, 148, 148))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        btExcluir.setEnabled(false);
        btSalvar.setEnabled(true);
        tbInstrutor.setModel(new InstrutorTableModel(new InstrutorDAO().listar()));
        tfCodigo.setText("");
        tfNome.setText("");
        tfIdentidade.setText("");
        tfCPF.setText("");
        cjTipoAtividade.setSelectedIndex(0);
        tfPesquisarNome.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int escolha = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir?","Aluno - Excluir",JOptionPane.YES_NO_OPTION);
        if (escolha == 0) {
        int codigo  = Integer.parseInt(tfCodigo.getText());
        ins.excluir(codigo);
        tbInstrutor.setModel(new InstrutorTableModel(new InstrutorDAO().listar()));
        tfCodigo.setText("");
        tfNome.setText("");
        tfIdentidade.setText("");
        tfCPF.setText("");
        cjTipoAtividade.setSelectedIndex(0);
        tfPesquisarNome.setText("");
        btExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (tfNome.getText().equals("") || tfIdentidade.getText().equals("  .   .   - ") || tfCPF.getText().equals("   .   .   -  ")) {
            JOptionPane.showMessageDialog(null,"Há campos em branco, verifique e tente novamente!","Instrutor - Aviso",JOptionPane.WARNING_MESSAGE);
        } else {       
        if(tfCodigo.getText().equals("")) {
            inst.setNome(tfNome.getText());
            inst.setIdentidade(tfIdentidade.getText());
            inst.setCpf(tfCPF.getText());
            inst.setTipoAtividade(cjTipoAtividade.getSelectedItem().toString());
            ins.registrar(inst);
            JOptionPane.showMessageDialog(null, "O instrutor foi cadastrado com sucesso!");
        } else {
            inst.setNome(tfNome.getText());
            inst.setIdentidade(tfIdentidade.getText());
            inst.setCpf(tfCPF.getText());   
            inst.setTipoAtividade(cjTipoAtividade.getSelectedItem().toString());
            inst.setId(Integer.parseInt(tfCodigo.getText()));
            ins.alterar(inst);
            JOptionPane.showMessageDialog(null, "O instrutor foi alterado com sucesso!");
        }
        tbInstrutor.setModel(new InstrutorTableModel(new InstrutorDAO().listar()));
        tfCodigo.setText("");
        tfNome.setText("");
        tfIdentidade.setText("");
        tfCPF.setText("");
        tfPesquisarNome.setText("");
        btSalvar.setEnabled(false);
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void tbInstrutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbInstrutorMouseClicked
        btExcluir.setEnabled(true);
        btSalvar.setEnabled(true);        
        tfCodigo.setText(tbInstrutor.getValueAt(tbInstrutor.getSelectedRow(), InstrutorTableModel.COL_INSTRUTOR_ID).toString());
        tfNome.setText(tbInstrutor.getValueAt(tbInstrutor.getSelectedRow(), InstrutorTableModel.COL_INSTRUTOR_NOME).toString());
        tfIdentidade.setText(tbInstrutor.getValueAt(tbInstrutor.getSelectedRow(), InstrutorTableModel.COL_INSTRUTOR_IDENTIDADE).toString());
        tfCPF.setText(tbInstrutor.getValueAt(tbInstrutor.getSelectedRow(), InstrutorTableModel.COL_INSTRUTOR_CPF).toString());
        cjTipoAtividade.setSelectedItem(tbInstrutor.getValueAt(tbInstrutor.getSelectedRow(), InstrutorTableModel.COL_INSTRUTOR_TIPOATIVIDADE).toString());
    }//GEN-LAST:event_tbInstrutorMouseClicked

    private void tfPesquisarNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarNomeKeyPressed
        String pesquisa = tfPesquisarNome.getText();
        tbInstrutor.setModel(new InstrutorTableModel(new InstrutorDAO().pesquisarPorNome(pesquisa)));
    }//GEN-LAST:event_tfPesquisarNomeKeyPressed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Javca SE 6) is not available, stay with the default look and feel.
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
            java.util.logging.Logger.getLogger(InstrutorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InstrutorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InstrutorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InstrutorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InstrutorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<Object> cjTipoAtividade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbInstrutor;
    private javax.swing.JFormattedTextField tfCPF;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JFormattedTextField tfIdentidade;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPesquisarNome;
    // End of variables declaration//GEN-END:variables
}
