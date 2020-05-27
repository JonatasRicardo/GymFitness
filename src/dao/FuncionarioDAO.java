package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import model.Funcionario;

public class FuncionarioDAO {
    
    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    boolean check = false;
    
    public FuncionarioDAO() {
        conn = new ConnectionFactory().getConexao();
    }       
        public boolean checkLogin(String usuario, String senha, String tipo) {
        String sql = "SELECT * from funcionario WHERE funcionario_usuario LIKE '%"+usuario+"%' AND funcionario_senha LIKE '%"+senha+"%' AND funcionario_tipo LIKE '%"+tipo+"%'";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Funcionario login = new Funcionario();
                login.setUsuario(rs.getString("funcionario_usuario"));
                login.setSenha(rs.getString("funcionario_senha"));
                login.setTipologin(rs.getString("funcionario_tipo"));
                check = true;
            }
            
        } catch (Exception erro) {
            throw new RuntimeException("Erro 5: "+erro);
        }
        return check;
    }
        
        public boolean checkTipoFuncionario(String tipo) {
        String sql = "SELECT * from funcionario WHERE funcionario_tipo LIKE '%"+tipo+"%'";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Funcionario login = new Funcionario();
                login.setUsuario(rs.getString("funcionario_tipo"));
                check = true;
            }
            
        } catch (Exception erro) {
            throw new RuntimeException("Erro 5: "+erro);
        }
        return check;
    }    
}