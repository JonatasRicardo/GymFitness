package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.TipoLogin;

public class TipoLoginDAO {

    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList<TipoLogin> lista = new ArrayList<TipoLogin>();

    public TipoLoginDAO() {
        conn = new ConnectionFactory().getConexao();
    }

    public ArrayList<TipoLogin> buscarTodos() {
        String sql = "SELECT * from logintipo";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                TipoLogin logintipo = new TipoLogin();
                logintipo.setId(rs.getInt("logintipo_id"));
                logintipo.setDescricao(rs.getString("logintipo_descricao"));
                lista.add(logintipo);
            }

        } catch (Exception erro) {
            throw new RuntimeException("Erro 5: " + erro);
        }
        return lista;
    }
}
