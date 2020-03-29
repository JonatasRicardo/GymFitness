package table;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Instrutor;

public class InstrutorTableModel extends AbstractTableModel{
    public static final int COL_INSTRUTOR_ID = 0;
    public static final int COL_INSTRUTOR_NOME = 1;
    public static final int COL_INSTRUTOR_IDENTIDADE = 2;
    public static final int COL_INSTRUTOR_CPF = 3;
    public static final int COL_INSTRUTOR_TIPOATIVIDADE = 4;
    public ArrayList<Instrutor> lista;
    
    public InstrutorTableModel(ArrayList<Instrutor>l) {
        lista = new ArrayList<Instrutor>(l);
    }    

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
    Instrutor instrutor = lista.get(linhas);
    if (colunas == COL_INSTRUTOR_ID) return instrutor.getId();
    if (colunas == COL_INSTRUTOR_NOME) return instrutor.getNome();
    if (colunas == COL_INSTRUTOR_IDENTIDADE) return instrutor.getIdentidade();
    if (colunas == COL_INSTRUTOR_CPF) return instrutor.getCpf();
    if (colunas == COL_INSTRUTOR_TIPOATIVIDADE) return instrutor.getTipoAtividade();
    return "";
    }

    @Override
    public String getColumnName(int colunas) {
    if (colunas == COL_INSTRUTOR_ID) return "Código";
    if (colunas == COL_INSTRUTOR_NOME) return "Nome";
    if (colunas == COL_INSTRUTOR_IDENTIDADE) return "Identidade";
    if (colunas == COL_INSTRUTOR_CPF) return "CPF";
    if (colunas == COL_INSTRUTOR_TIPOATIVIDADE) return "Tipo de Atividade";
    return "";
    }
}
