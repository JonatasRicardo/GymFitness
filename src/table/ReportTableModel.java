package table;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Pagamento;

public class ReportTableModel extends AbstractTableModel{
    public static final int COL_PAGAMENTO_ID = 0;
    public static final int COL_PAGAMENTO_NOMEALUNO = 1;
    public static final int COL_PAGAMENTO_DATAPROXIMOPAGAMENTO = 2;
    public ArrayList<Pagamento> lista;
    
    public ReportTableModel(ArrayList<Pagamento>l) {
        lista = new ArrayList<Pagamento>(l);
    }    

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
    Pagamento pagamento = lista.get(linhas);
    if (colunas == COL_PAGAMENTO_ID) return pagamento.getId();
    if (colunas == COL_PAGAMENTO_NOMEALUNO) return pagamento.getNomeAluno();
    if (colunas == COL_PAGAMENTO_DATAPROXIMOPAGAMENTO) return pagamento.getDataProximoPagamento();
    return "";
    }

    @Override
    public String getColumnName(int colunas) {
    if (colunas == COL_PAGAMENTO_ID) return "ID do Pagamento";
    if (colunas == COL_PAGAMENTO_NOMEALUNO) return "Nome do Aluno";
    if (colunas == COL_PAGAMENTO_DATAPROXIMOPAGAMENTO) return "Data do Próximo Pagamento";
    return "";
    }
}
