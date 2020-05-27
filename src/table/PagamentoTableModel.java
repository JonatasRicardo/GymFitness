package table;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Pagamento;

public class PagamentoTableModel extends AbstractTableModel{
    public static final int COL_PAGAMENTO_ID = 0;
    public static final int COL_PAGAMENTO_TIPOPLANO = 1;
    public static final int COL_PAGAMENTO_NOMEALUNO = 2;
    public static final int COL_PAGAMENTO_DATAVENCIMENTO = 3;
    public static final int COL_PAGAMENTO_DATAPAGAMENTO = 4;
    public static final int COL_PAGAMENTO_DATAPROXIMOPAGAMENTO = 5;
    public ArrayList<Pagamento> lista;
    
    public PagamentoTableModel(ArrayList<Pagamento>l) {
        lista = new ArrayList<Pagamento>(l);
    }    

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
    Pagamento pagamento = lista.get(linhas);
    if (colunas == COL_PAGAMENTO_ID) return pagamento.getId();
    if (colunas == COL_PAGAMENTO_TIPOPLANO) return pagamento.getTipoPlano();
    if (colunas == COL_PAGAMENTO_NOMEALUNO) return pagamento.getNomeAluno();
    if (colunas == COL_PAGAMENTO_DATAVENCIMENTO) return pagamento.getDataVencimento();
    if (colunas == COL_PAGAMENTO_DATAPAGAMENTO) return pagamento.getDataPagamento();
    if (colunas == COL_PAGAMENTO_DATAPROXIMOPAGAMENTO) return pagamento.getDataProximoPagamento();
    return "";
    }

    @Override
    public String getColumnName(int colunas) {
    if (colunas == COL_PAGAMENTO_ID) return "Código";
    if (colunas == COL_PAGAMENTO_TIPOPLANO) return "Tipo do Plano";
    if (colunas == COL_PAGAMENTO_NOMEALUNO) return "Nome do Aluno";
    if (colunas == COL_PAGAMENTO_DATAVENCIMENTO) return "Data de Vencimento";
    if (colunas == COL_PAGAMENTO_DATAPAGAMENTO) return "Data de Pagamento";
    if (colunas == COL_PAGAMENTO_DATAPROXIMOPAGAMENTO) return "Data do Próximo Pagamento";
    return "";
    }
}
