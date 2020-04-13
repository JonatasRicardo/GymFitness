package dao;

import java.sql.Connection;
import model.Aluno;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AlunoDAO {
    
    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    boolean check = false;
    private ArrayList<Aluno> lista = new ArrayList<Aluno>();
    
    public AlunoDAO() {
        conn = new ConnectionFactory().getConexao();
    }
    
    public void registrar(Aluno aluno) {
        String sql = "INSERT INTO aluno (aluno_nome, aluno_identidade, aluno_endereco, aluno_cpf) VALUES (?,?,?,?)";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getIdentidade());
            stmt.setString(3, aluno.getEndereco());
            stmt.setString(4, aluno.getCpf());
            stmt.execute();
            stmt.close();
        } catch (Exception erro) {
            throw new RuntimeException("Erro 2: "+erro);
        }
    }
    
        public void alterar(Aluno aluno) {
        String sql = "UPDATE aluno SET aluno_nome = ?, aluno_identidade = ?, aluno_endereco = ?, aluno_cpf = ? WHERE aluno_id = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getIdentidade());
            stmt.setString(3, aluno.getEndereco());
            stmt.setString(4, aluno.getCpf());
            stmt.setInt(5, aluno.getId());
            stmt.execute();
            stmt.close();
        } catch (Exception erro) {
            throw new RuntimeException("Erro 3: "+erro);
        }
    }
        
        public void excluir(int valor) {
        String sql = "DELETE FROM aluno WHERE aluno_id ="+valor;
        try {
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        } catch (Exception erro) {
            throw new RuntimeException("Erro 4: "+erro);
        }
    }
            
        public ArrayList<Aluno> listar() {
        String sql = "SELECT * from aluno";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setId(rs.getInt("aluno_id"));
                aluno.setNome(rs.getString("aluno_nome"));
                aluno.setIdentidade(rs.getString("aluno_identidade"));
                aluno.setEndereco(rs.getString("aluno_endereco"));
                aluno.setCpf(rs.getString("aluno_cpf"));
                lista.add(aluno);
            }
            
        } catch (Exception erro) {
            throw new RuntimeException("Erro 5: "+erro);
        }
        return lista;
    }
        
            public ArrayList<Aluno> pesquisarPorNome(String valor) {
        String sql = "SELECT * from aluno WHERE aluno_nome LIKE '%"+valor+"%'";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setId(rs.getInt("aluno_id"));
                aluno.setNome(rs.getString("aluno_nome"));
                aluno.setIdentidade(rs.getString("aluno_identidade"));
                aluno.setEndereco(rs.getString("aluno_endereco"));
                aluno.setCpf(rs.getString("aluno_cpf"));
                lista.add(aluno);
            }
            
        } catch (Exception erro) {
            throw new RuntimeException("Erro 5: "+erro);
        }
        return lista;
    }
        public ArrayList<Aluno> listarNome() {
        String sql = "SELECT aluno_nome from aluno";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setNome(rs.getString("aluno_nome"));
                lista.add(aluno);
            }
            
        } catch (Exception erro) {
            throw new RuntimeException("Erro 5: "+erro);
        }
        return lista;
    }    
}