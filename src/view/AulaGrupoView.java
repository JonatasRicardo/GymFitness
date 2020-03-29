package view;

import dao.AulaGrupoDAO;
import dao.DiaSemanaDAO;
import dao.InstrutorDAO;
import javax.swing.JOptionPane;
import model.AulaGrupo;
import model.DiaSemana;
import model.Instrutor;
import table.AulaGrupoTableModel;

public class AulaGrupoView extends javax.swing.JFrame {
    
    AulaGrupo aus = new AulaGrupo();
    AulaGrupoDAO aust = new AulaGrupoDAO();

    public AulaGrupoView() {
        initComponents();
        setLocationRelativeTo(null);
        tbAulaGrupo.setModel(new AulaGrupoTableModel(new AulaGrupoDAO().listar()));
        btExcluir.setEnabled(false);
        
        DiaSemanaDAO dao = new DiaSemanaDAO();
        
        for (DiaSemana t: dao.listar()) {
            jcDiaSemana.addItem(t);
        }
        
        InstrutorDAO daoinst = new InstrutorDAO();
        
        for (Instrutor i: daoinst.listar()) {
            jcNomeInstrutor.addItem(i);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbAulaGrupo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfNomeAula = new javax.swing.JTextField();
        jcNomeInstrutor = new javax.swing.JComboBox<>();
        jcDiaSemana = new javax.swing.JComboBox<>();
        tfHorarioFim = new javax.swing.JFormattedTextField();
        tfHorarioInicio = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        tfPesquisarNome = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tfSala = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbAulaGrupo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbAulaGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAulaGrupoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbAulaGrupo);

        jLabel1.setText("Código:");

        jLabel2.setText("Nome da Aula:");

        jLabel3.setText("Nome do Instrutor:");

        jLabel4.setText("Dia da Semana:");

        jLabel5.setText("Horário Início:");

        jLabel6.setText("Horário Fim:");

        tfCodigo.setEditable(false);
        tfCodigo.setBackground(new java.awt.Color(255, 204, 204));

        try {
            tfHorarioFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            tfHorarioInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setText("Pesquisar (Nome):");

        tfPesquisarNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPesquisarNomeKeyPressed(evt);
            }
        });

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

        jLabel8.setText("Sala:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfSala, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(tfHorarioInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfHorarioFim, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfPesquisarNome))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btLimpar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btExcluir)
                                    .addGap(18, 18, 18)
                                    .addComponent(btSalvar)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfNomeAula, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(197, 197, 197)
                                .addComponent(jLabel6))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jcNomeInstrutor, 0, 490, Short.MAX_VALUE)
                                .addComponent(jcDiaSemana, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNomeAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcNomeInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcDiaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(tfHorarioFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfHorarioInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btExcluir)
                    .addComponent(btSalvar))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfPesquisarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        btExcluir.setEnabled(false);
        tbAulaGrupo.setModel(new AulaGrupoTableModel(new AulaGrupoDAO().listar()));
        tfCodigo.setText("");
        tfNomeAula.setText("");
        jcDiaSemana.setSelectedIndex(0);
        jcNomeInstrutor.setSelectedIndex(0);
        tfPesquisarNome.setText("");
        tfHorarioFim.setText("");
        tfHorarioInicio.setText("");
        tfSala.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int escolha = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir?","Aluno - Excluir",JOptionPane.YES_NO_OPTION);
        if (escolha == 0) {
        int codigo  = Integer.parseInt(tfCodigo.getText());
        aust.excluir(codigo);
        tbAulaGrupo.setModel(new AulaGrupoTableModel(new AulaGrupoDAO().listar()));
        tfCodigo.setText("");
        tfNomeAula.setText("");
        jcDiaSemana.setSelectedIndex(0);
        jcNomeInstrutor.setSelectedIndex(0);
        tfPesquisarNome.setText("");
        tfHorarioFim.setText("");
        tfHorarioInicio.setText("");
        tfSala.setText("");
        btExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
               if (tfNomeAula.getText().equals("") || tfHorarioFim.getText().equals("") || tfHorarioInicio.getText().equals("") || tfSala.getText().equals("") ) {
            JOptionPane.showMessageDialog(null,"Há campos em branco, verifique e tente novamente!","Aula Grupo - Aviso",JOptionPane.WARNING_MESSAGE);
        } else {       
        if(tfCodigo.getText().equals("")) {
            aus.setNome(tfNomeAula.getText());
            aus.setNomeInstrutor((jcNomeInstrutor.getSelectedItem().toString()));
            aus.setDiaSemana((jcDiaSemana.getSelectedItem().toString()));
            aus.setSala((tfSala.getText()));
            aus.setHorarioInicio(tfHorarioInicio.getText());
            aus.setHorarioFim(tfHorarioFim.getText());
            aust.registrar(aus);
        } else {
            aus.setNome(tfNomeAula.getText());
            aus.setNomeInstrutor((jcNomeInstrutor.getSelectedItem().toString()));
            aus.setDiaSemana((jcDiaSemana.getSelectedItem().toString()));
            aus.setSala((tfSala.getText()));
            aus.setHorarioInicio(tfHorarioInicio.getText());
            aus.setHorarioFim(tfHorarioFim.getText());
            aus.setId(Integer.parseInt(tfCodigo.getText()));
            aust.alterar(aus);
            btExcluir.setEnabled(false);
        }
        tbAulaGrupo.setModel(new AulaGrupoTableModel(new AulaGrupoDAO().listar()));
        tfCodigo.setText("");
        tfNomeAula.setText("");
        jcDiaSemana.setSelectedIndex(0);
        jcNomeInstrutor.setSelectedIndex(0);
        tfPesquisarNome.setText("");
        btSalvar.setEnabled(false);
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void tbAulaGrupoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAulaGrupoMouseClicked
        btExcluir.setEnabled(true);
        btSalvar.setEnabled(true);        
        tfCodigo.setText(tbAulaGrupo.getValueAt(tbAulaGrupo.getSelectedRow(), AulaGrupoTableModel.COL_AULAGRUPO_ID).toString());
        tfNomeAula.setText(tbAulaGrupo.getValueAt(tbAulaGrupo.getSelectedRow(), AulaGrupoTableModel.COL_AULAGRUPO_NOME).toString());
        jcNomeInstrutor.setSelectedItem(tbAulaGrupo.getValueAt(tbAulaGrupo.getSelectedRow(), AulaGrupoTableModel.COL_AULAGRUPO_NOMEINSTRUTOR).toString());
        jcDiaSemana.setSelectedItem(tbAulaGrupo.getValueAt(tbAulaGrupo.getSelectedRow(), AulaGrupoTableModel.COL_AULAGRUPO_DIASEMANA).toString());
        tfHorarioInicio.setText(tbAulaGrupo.getValueAt(tbAulaGrupo.getSelectedRow(), AulaGrupoTableModel.COL_AULAGRUPO_HORARIOINICIO).toString());
        tfHorarioFim.setText(tbAulaGrupo.getValueAt(tbAulaGrupo.getSelectedRow(), AulaGrupoTableModel.COL_AULAGRUPO_HORARIOFIM).toString());
        tfSala.setText(tbAulaGrupo.getValueAt(tbAulaGrupo.getSelectedRow(), AulaGrupoTableModel.COL_AULAGRUPO_SALA).toString());
                                    

    }//GEN-LAST:event_tbAulaGrupoMouseClicked

    private void tfPesquisarNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarNomeKeyPressed
        String pesquisa = tfPesquisarNome.getText();
        tbAulaGrupo.setModel(new AulaGrupoTableModel(new AulaGrupoDAO().listarTodosNome(pesquisa)));
    }//GEN-LAST:event_tfPesquisarNomeKeyPressed

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
            java.util.logging.Logger.getLogger(AulaGrupoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AulaGrupoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AulaGrupoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AulaGrupoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AulaGrupoView().setVisible(true);
            }
        });
    }

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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Object> jcDiaSemana;
    private javax.swing.JComboBox<Object> jcNomeInstrutor;
    private javax.swing.JTable tbAulaGrupo;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JFormattedTextField tfHorarioFim;
    private javax.swing.JFormattedTextField tfHorarioInicio;
    private javax.swing.JTextField tfNomeAula;
    private javax.swing.JTextField tfPesquisarNome;
    private javax.swing.JTextField tfSala;
    // End of variables declaration//GEN-END:variables
}
