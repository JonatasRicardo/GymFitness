package dao;

import java.sql.Connection;
import model.Instrutor;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class InstrutorDAO {
    
    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList<Instrutor> lista = new ArrayList<Instrutor>();
    
    public InstrutorDAO() {
        conn = new ConnectionFactory().getConexao();
    }
    
    public void registrar(Instrutor instrutor) {
        String sql = "INSERT INTO instrutor (instrutor_nome, instrutor_identidade, instrutor_cpf, instrutor_tipoatividade) VALUES (?,?,?,?)";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, instrutor.getNome());
            stmt.setString(2, instrutor.getIdentidade());
            stmt.setString(3, instrutor.getCpf());
            stmt.setString(4, instrutor.getTipoAtividade());
            stmt.execute();
            stmt.close();
        } catch (Exception erro) {
            throw new RuntimeException("Erro 2: "+erro);
        }
    }
    
        public void alterar(Instrutor instrutor) {
        String sql = "UPDATE instrutor SET instrutor_nome = ?, instrutor_identidade = ?, instrutor_cpf = ?, instrutor_tipoatividade = ? WHERE instrutor_id = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, instrutor.getNome());
            stmt.setString(2, instrutor.getIdentidade());
            stmt.setString(3, instrutor.getCpf());
            stmt.setString(4, instrutor.getTipoAtividade());
            stmt.setInt(5, instrutor.getId());
            stmt.execute();
            stmt.close();
        } catch (Exception erro) {
            throw new RuntimeException("Erro 3: "+erro);
        }
    }
        
        public void excluir(int valor) {
        String sql = "DELETE FROM instrutor WHERE instrutor_id ="+valor;
        try {
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        } catch (Exception erro) {
            throw new RuntimeException("Erro 4: "+erro);
        }
    }
            
        public ArrayList<Instrutor> listar() {
        String sql = "SELECT * from instrutor";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Instrutor instrutor = new Instrutor();
                instrutor.setId(rs.getInt("instrutor_id"));
                instrutor.setNome(rs.getString("instrutor_nome"));
                instrutor.setIdentidade(rs.getString("instrutor_identidade"));
                instrutor.setCpf(rs.getString("instrutor_cpf"));
                instrutor.setTipoAtividade(rs.getString("instrutor_tipoatividade"));                
                lista.add(instrutor);
            }
            
        } catch (Exception erro) {
            throw new RuntimeException("Erro 5: "+erro);
        }
        return lista;
    }
        
            public ArrayList<Instrutor> listarTodosNome(String valor) {
        String sql = "SELECT * from instrutor WHERE instrutor_nome LIKE '%"+valor+"%'";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Instrutor instrutor = new Instrutor();
                instrutor.setId(rs.getInt("instrutor_id"));
                instrutor.setNome(rs.getString("instrutor_nome"));
                instrutor.setIdentidade(rs.getString("instrutor_identidade"));
                instrutor.setCpf(rs.getString("instrutor_cpf"));
                instrutor.setTipoAtividade(rs.getString("instrutor_tipoatividade"));
                lista.add(instrutor);
            }
            
        } catch (Exception erro) {
            throw new RuntimeException("Erro 5: "+erro);
        }
        return lista;
    }    
}