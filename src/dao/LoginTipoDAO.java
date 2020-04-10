package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.LoginTipo;

public class LoginTipoDAO {

    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList<LoginTipo> lista = new ArrayList<LoginTipo>();

    public LoginTipoDAO() {
        conn = new ConnectionFactory().getConexao();
    }

    public ArrayList<LoginTipo> listar() {
        String sql = "SELECT * from logintipo";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                LoginTipo logintipo = new LoginTipo();
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
