package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Aula;

public class AulaDAO {
    
    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList<Aula> lista = new ArrayList<Aula>();
    
    public AulaDAO() {
        conn = new ConnectionFactory().getConexao();
    }
    
    public void registrar(Aula aulagrupo) {
        String sql = "INSERT INTO aulagrupo (aulagrupo_nome, aulagrupo_instrutor, aulagrupo_diasemana, aulagrupo_sala, aulagrupo_horarioinicio, aulagrupo_horariofim) VALUES (?,?,?,?,?,?)";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, aulagrupo.getNome());
            stmt.setString(2, aulagrupo.getNomeInstrutor());
            stmt.setString(3, aulagrupo.getDiaSemana());
            stmt.setString(4, aulagrupo.getSala());
            stmt.setString(5, aulagrupo.getHorarioInicio());
            stmt.setString(6, aulagrupo.getHorarioFim()); 
            stmt.execute();
            stmt.close();
        } catch (Exception erro) {
            throw new RuntimeException("Erro 2: "+erro);
        }
    }
    
        public void alterar(Aula aulagrupo) {
        String sql = "UPDATE aulagrupo SET aulagrupo_nome = ?, aulagrupo_instrutor = ?, aulagrupo_diasemana = ?, aulagrupo_sala = ?, aulagrupo_horarioinicio = ?, aulagrupo_horariofim = ? WHERE aulagrupo_id = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, aulagrupo.getNome());
            stmt.setString(2, aulagrupo.getNomeInstrutor());
            stmt.setString(3, aulagrupo.getDiaSemana());
            stmt.setString(4, aulagrupo.getSala());
            stmt.setString(5, aulagrupo.getHorarioInicio());
            stmt.setString(6, aulagrupo.getHorarioFim()); 
            stmt.setInt(7, aulagrupo.getId());
            stmt.execute();
            stmt.close();
        } catch (Exception erro) {
            throw new RuntimeException("Erro 3: "+erro);
        }
    }
        
        public void excluir(int valor) {
        String sql = "DELETE FROM aulagrupo WHERE aulagrupo_id ="+valor;
        try {
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        } catch (Exception erro) {
            throw new RuntimeException("Erro 4: "+erro);
        }
    }
            
        public ArrayList<Aula> listar() {
        String sql = "SELECT * from aulagrupo";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Aula aulagrupo = new Aula();
                aulagrupo.setId(rs.getInt("aulagrupo_id"));
                aulagrupo.setNome(rs.getString("aulagrupo_nome"));
                aulagrupo.setNomeInstrutor(rs.getString("aulagrupo_instrutor"));
                aulagrupo.setDiaSemana(rs.getString("aulagrupo_diasemana"));
                aulagrupo.setSala(rs.getString("aulagrupo_sala"));
                aulagrupo.setHorarioInicio(rs.getString("aulagrupo_horarioinicio"));
                aulagrupo.setHorarioFim(rs.getString("aulagrupo_horariofim"));                
                lista.add(aulagrupo);
            }
            
        } catch (Exception erro) {
            throw new RuntimeException("Erro 5: "+erro);
        }
        return lista;
    }
        
            public ArrayList<Aula> pesquisarPorNome(String valor) {
        String sql = "SELECT * from aulagrupo WHERE aulagrupo_nome LIKE '%"+valor+"%'";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Aula aulagrupo = new Aula();
                aulagrupo.setId(rs.getInt("aulagrupo_id"));
                aulagrupo.setNome(rs.getString("aulagrupo_nome"));
                aulagrupo.setNomeInstrutor(rs.getString("aulagrupo_instrutor"));
                aulagrupo.setDiaSemana(rs.getString("aulagrupo_diasemana"));
                aulagrupo.setSala(rs.getString("aulagrupo_sala"));
                aulagrupo.setHorarioInicio(rs.getString("aulagrupo_horarioinicio"));
                aulagrupo.setHorarioFim(rs.getString("aulagrupo_horariofim"));   
                lista.add(aulagrupo);
            }
            
        } catch (Exception erro) {
            throw new RuntimeException("Erro 5: "+erro);
        }
        return lista;
    }    
}