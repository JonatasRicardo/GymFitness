package dao;

import java.sql.Connection;
import model.TipoAtividade;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class TipoAtividadeDAO {

    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList<TipoAtividade> lista = new ArrayList<TipoAtividade>();

    public TipoAtividadeDAO() {
        conn = new ConnectionFactory().getConexao();
    }

    public ArrayList<TipoAtividade> listar() {
        String sql = "SELECT * from tipoatividade";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                TipoAtividade tipoatividade = new TipoAtividade();
                tipoatividade.setId(rs.getInt("tipoatividade_id"));
                tipoatividade.setDescricao(rs.getString("tipoatividade_descricao"));
                lista.add(tipoatividade);
            }

        } catch (Exception erro) {
            throw new RuntimeException("Erro 5: " + erro);
        }
        return lista;
    }
}
