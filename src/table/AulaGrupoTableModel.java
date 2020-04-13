package table;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Aula;

public class AulaGrupoTableModel extends AbstractTableModel{
    public static final int COL_AULAGRUPO_ID = 0;
    public static final int COL_AULAGRUPO_NOME = 1;
    public static final int COL_AULAGRUPO_NOMEINSTRUTOR = 2;
    public static final int COL_AULAGRUPO_DIASEMANA = 3;
    public static final int COL_AULAGRUPO_SALA = 4;
    public static final int COL_AULAGRUPO_HORARIOINICIO = 5;
    public static final int COL_AULAGRUPO_HORARIOFIM = 6;
    public ArrayList<Aula> lista;
    
    public AulaGrupoTableModel(ArrayList<Aula>l) {
        lista = new ArrayList<Aula>(l);
    }    

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
    Aula aulagrupo = lista.get(linhas);
    if (colunas == COL_AULAGRUPO_ID) return aulagrupo.getId();
    if (colunas == COL_AULAGRUPO_NOME) return aulagrupo.getNome();
    if (colunas == COL_AULAGRUPO_NOMEINSTRUTOR) return aulagrupo.getNomeInstrutor();
    if (colunas == COL_AULAGRUPO_DIASEMANA) return aulagrupo.getDiaSemana();
    if (colunas == COL_AULAGRUPO_SALA) return aulagrupo.getSala();
    if (colunas == COL_AULAGRUPO_HORARIOINICIO) return aulagrupo.getHorarioInicio();
    if (colunas == COL_AULAGRUPO_HORARIOFIM) return aulagrupo.getHorarioFim();
    return "";
    }

    @Override
    public String getColumnName(int colunas) {
    if (colunas == COL_AULAGRUPO_ID) return "Código";
    if (colunas == COL_AULAGRUPO_NOME) return "Nome da Aula";
    if (colunas == COL_AULAGRUPO_NOMEINSTRUTOR) return "Nome do Instrutor";
    if (colunas == COL_AULAGRUPO_DIASEMANA) return "Dia da Semana";
    if (colunas == COL_AULAGRUPO_SALA) return "Sala";
    if (colunas == COL_AULAGRUPO_HORARIOINICIO) return "Horário Início";
    if (colunas == COL_AULAGRUPO_HORARIOFIM) return "Horário Fim";
    return "";
    }
}
