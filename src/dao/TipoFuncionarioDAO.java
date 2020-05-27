package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.TipoFuncionario;

public class TipoFuncionarioDAO {

    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList<TipoFuncionario> lista = new ArrayList<TipoFuncionario>();

    public TipoFuncionarioDAO() {
        conn = new ConnectionFactory().getConexao();
    }

    public ArrayList<TipoFuncionario> buscarTodos() {
        String sql = "SELECT * from funcionariotipo";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                TipoFuncionario funcionariotipo = new TipoFuncionario();
                funcionariotipo.setId(rs.getInt("funcionariotipo_id"));
                funcionariotipo.setDescricao(rs.getString("funcionariotipo_descricao"));
                lista.add(funcionariotipo);
            }

        } catch (Exception erro) {
            throw new RuntimeException("Erro 5: " + erro);
        }
        return lista;
    }
}
