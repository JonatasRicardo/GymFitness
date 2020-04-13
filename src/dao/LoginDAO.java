package dao;

import java.sql.Connection;
import model.Login;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class LoginDAO {
    
    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    boolean check = false;
    
    public LoginDAO() {
        conn = new ConnectionFactory().getConexao();
    }       
        public boolean checkLogin(String usuario, String senha, String tipo) {
        String sql = "SELECT * from login WHERE login_usuario LIKE '%"+usuario+"%' AND login_senha LIKE '%"+senha+"%' AND login_tipo LIKE '%"+tipo+"%'";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Login login = new Login();
                login.setUsuario(rs.getString("login_usuario"));
                login.setSenha(rs.getString("login_senha"));
                login.setTipologin(rs.getString("login_tipo"));
                check = true;
            }
            
        } catch (Exception erro) {
            throw new RuntimeException("Erro 5: "+erro);
        }
        return check;
    }
        
        public boolean checkTipoLogin(String tipo) {
        String sql = "SELECT * from login WHERE login_tipo LIKE '%"+tipo+"%'";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Login login = new Login();
                login.setUsuario(rs.getString("login_tipo"));
                check = true;
            }
            
        } catch (Exception erro) {
            throw new RuntimeException("Erro 5: "+erro);
        }
        return check;
    }    
}