package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.DiaSemana;

public class DiaSemanaDAO {

    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList<DiaSemana> lista = new ArrayList<DiaSemana>();

    public DiaSemanaDAO() {
        conn = new ConnectionFactory().getConexao();
    }

    public ArrayList<DiaSemana> listar() {
        String sql = "SELECT * from diasemana";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                DiaSemana diasemana = new DiaSemana();
                diasemana.setId(rs.getInt("diasemana_id"));
                diasemana.setDescricao(rs.getString("diasemana_descricao"));
                lista.add(diasemana);
            }

        } catch (Exception erro) {
            throw new RuntimeException("Erro 5: " + erro);
        }
        return lista;
    }
}
