package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.TipoPlano;

public class TipoPlanoDAO {

    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList<TipoPlano> lista = new ArrayList<TipoPlano>();

    public TipoPlanoDAO() {
        conn = new ConnectionFactory().getConexao();
    }

    public ArrayList<TipoPlano> listar() {
        String sql = "SELECT * from tipoplano";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                TipoPlano tipoplano = new TipoPlano();
                tipoplano.setId(rs.getInt("tipoplano_id"));
                tipoplano.setDescricao(rs.getString("tipoplano_descricao"));
                lista.add(tipoplano);
            }

        } catch (Exception erro) {
            throw new RuntimeException("Erro 5: " + erro);
        }
        return lista;
    }
}
