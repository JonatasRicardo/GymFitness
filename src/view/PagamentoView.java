package view;

import dao.AlunoDAO;
import dao.PagamentoDAO;
import dao.TipoPlanoDAO;
import javax.swing.JOptionPane;
import model.Aluno;
import model.Pagamento;
import model.TipoPlano;
import table.PagamentoTableModel;

public class PagamentoView extends javax.swing.JFrame {
    
    Pagamento pagam = new Pagamento();
    PagamentoDAO pag = new PagamentoDAO();

    public PagamentoView() {
        initComponents();
        setLocationRelativeTo(null);        
        tbPagamento.setModel(new PagamentoTableModel(new PagamentoDAO().listar()));
        
        TipoPlanoDAO dao = new TipoPlanoDAO();
        
        
        for (TipoPlano t: dao.buscarTodos()) {
            cjTipoPlano.addItem(t);
        }
        
        AlunoDAO dao2 = new AlunoDAO();
        
        for (Aluno a : dao2.listarNome()) {
            cjNomeAluno.addItem(a);
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
        tfDataVencimento = new javax.swing.JFormattedTextField();
        tfDataPagamento = new javax.swing.JFormattedTextField();
        cjTipoPlano = new javax.swing.JComboBox<>();
        cjNomeAluno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPagamento = new javax.swing.JTable();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfProximoPagamento = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pagamento");

        jLabel1.setText("Código:");

        jLabel2.setText("Tipo do Plano:");

        jLabel3.setText("Nome do Aluno:");

        jLabel4.setText("Data de Vencimento:");

        jLabel5.setText("Data de Pagamento:");

        tfCodigo.setEditable(false);
        tfCodigo.setBackground(new java.awt.Color(255, 204, 204));

        try {
            tfDataVencimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            tfDataPagamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tbPagamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbPagamento);

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        jLabel6.setText("Data próximo pagamento:");

        try {
            tfProximoPagamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDataVencimento)
                            .addComponent(tfDataPagamento)
                            .addComponent(cjNomeAluno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cjTipoPlano, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfCodigo)
                            .addComponent(tfProximoPagamento)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSalvar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE))))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cjTipoPlano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cjNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfDataPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfProximoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btSalvar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        tbPagamento.setModel(new PagamentoTableModel(new PagamentoDAO().listar()));
        tfCodigo.setText("");
        tfDataPagamento.setText("");
        tfDataVencimento.setText("");
        cjNomeAluno.setSelectedIndex(0);
        cjTipoPlano.setSelectedIndex(0);
        tfProximoPagamento.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (tfDataPagamento.getText().equals("") || tfDataVencimento.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Há campos em branco, verifique e tente novamente!","Pagamento - Aviso",JOptionPane.WARNING_MESSAGE);
        } else {       
        if(tfCodigo.getText().equals("")) {
            pagam.setTipoPlano(cjTipoPlano.getSelectedItem().toString());
            pagam.setNomeAluno(cjNomeAluno.getSelectedItem().toString());
            pagam.setDataVencimento(tfDataVencimento.getText());
            pagam.setDataPagamento(tfDataPagamento.getText());
            pagam.setDataProximoPagamento(tfProximoPagamento.getText());
            pag.registrar(pagam);
            JOptionPane.showMessageDialog(null, "O pagamento foi cadastrado com sucesso!");
        } else {
            pagam.setTipoPlano(cjTipoPlano.getSelectedItem().toString());
            pagam.setNomeAluno(cjNomeAluno.getSelectedItem().toString());
            pagam.setDataVencimento(tfDataVencimento.getText());
            pagam.setDataPagamento(tfDataPagamento.getText());
            pagam.setId(Integer.parseInt(tfCodigo.getText()));
            pagam.setDataProximoPagamento(tfProximoPagamento.getText());
            pag.alterar(pagam);
            JOptionPane.showMessageDialog(null, "O pagamento foi alterado com sucesso!");
        }
        tbPagamento.setModel(new PagamentoTableModel(new PagamentoDAO().listar()));
        tfCodigo.setText("");
        tfDataPagamento.setText("");
        tfDataVencimento.setText("");
        cjNomeAluno.setSelectedIndex(0);
        cjTipoPlano.setSelectedIndex(0);
        tfProximoPagamento.setText("");
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(PagamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagamentoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<Object> cjNomeAluno;
    private javax.swing.JComboBox<Object> cjTipoPlano;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbPagamento;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JFormattedTextField tfDataPagamento;
    private javax.swing.JFormattedTextField tfDataVencimento;
    private javax.swing.JFormattedTextField tfProximoPagamento;
    // End of variables declaration//GEN-END:variables
}
