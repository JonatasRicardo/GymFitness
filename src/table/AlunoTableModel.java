package table;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import model.Aluno;

public class AlunoTableModel extends AbstractTableModel{

    public static final int COL_ALUNO_ID = 0;
    public static final int COL_ALUNO_NOME = 1;
    public static final int COL_ALUNO_IDENTIDADE = 2;
    public static final int COL_ALUNO_ENDERECO = 3;
    public static final int COL_ALUNO_CPF = 4;
    public ArrayList<Aluno> lista;
    
    public AlunoTableModel(ArrayList<Aluno>l) {
        lista = new ArrayList<Aluno>(l);
        
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
    Aluno aluno = lista.get(linhas);
    if (colunas == COL_ALUNO_ID) return aluno.getId();
    if (colunas == COL_ALUNO_NOME) return aluno.getNome();
    if (colunas == COL_ALUNO_IDENTIDADE) return aluno.getIdentidade();
    if (colunas == COL_ALUNO_ENDERECO) return aluno.getEndereco();
    if (colunas == COL_ALUNO_CPF) return aluno.getCpf();
    return "";
    }

    @Override
    public String getColumnName(int colunas) {
    if (colunas == COL_ALUNO_ID) return "Código";
    if (colunas == COL_ALUNO_NOME) return "Nome";
    if (colunas == COL_ALUNO_IDENTIDADE) return "Identidade";
    if (colunas == COL_ALUNO_ENDERECO) return "Endereço";
    if (colunas == COL_ALUNO_CPF) return "CPF";
    return "";
    }
}
