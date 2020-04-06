package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Aluno;
import model.Pagamento;

public class PagamentoDAO {
    
    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList<Pagamento> lista = new ArrayList<Pagamento>();
    private ArrayList<Aluno> lista2 = new ArrayList<Aluno>();
    
    public PagamentoDAO() {
        conn = new ConnectionFactory().getConexao();
    }
    
    public void registrar(Pagamento pagamento) {
        String sql = "INSERT INTO pagamento (pagamento_tipoplano, pagamento_nomealuno, pagamento_datavencimento, pagamento_datapagamento, pagamento_dataproximopagamento) VALUES (?,?,?,?,?)";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, pagamento.getTipoPlano());
            stmt.setString(2, pagamento.getNomeAluno());
            stmt.setString(3, pagamento.getDataVencimento());
            stmt.setString(4, pagamento.getDataPagamento());
            stmt.setString(5, pagamento.getDataProximoPagamento());
            stmt.execute();
            stmt.close();
        } catch (Exception erro) {
            throw new RuntimeException("Erro 2: "+erro);
        }
    }
    
        public void alterar(Pagamento pagamento) {
        String sql = "UPDATE pagamento SET pagamento_tipoplano = ?, pagamento_nomealuno = ?, pagamento_datavencimento = ?, pagamento_datapagamento = ?, pagamento_dataproximopagamento = ? WHERE pagamento_id = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, pagamento.getTipoPlano());
            stmt.setString(2, pagamento.getNomeAluno());
            stmt.setString(3, pagamento.getDataVencimento());
            stmt.setString(4, pagamento.getDataPagamento());
            stmt.setString(5, pagamento.getDataProximoPagamento());
            stmt.setInt(6, pagamento.getId());
            stmt.execute();
            stmt.close();
        } catch (Exception erro) {
            throw new RuntimeException("Erro 3: "+erro);
        }
    }
        public ArrayList<Pagamento> listar() {
        String sql = "SELECT * from pagamento";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Pagamento pagamento = new Pagamento();
                pagamento.setId(rs.getInt("pagamento_id"));
                pagamento.setTipoPlano(rs.getString("pagamento_tipoplano"));
                pagamento.setNomeAluno(rs.getString("pagamento_nomealuno"));
                pagamento.setDataVencimento(rs.getString("pagamento_datavencimento"));
                pagamento.setDataPagamento(rs.getString("pagamento_datapagamento"));
                pagamento.setDataProximoPagamento(rs.getString("pagamento_dataproximopagamento"));
                lista.add(pagamento);
            }
            
        } catch (Exception erro) {
            throw new RuntimeException("Erro 5: "+erro);
        }
        return lista;
    }
        public ArrayList<Pagamento> listarMatriculadosOrdemAlfabetica() {
        String sql = "select pagamento_id, pagamento_nomealuno, pagamento_dataproximopagamento from pagamento\n" +
        "INNER JOIN aluno\n" +
        "ON aluno.aluno_nome = pagamento.pagamento_nomealuno\n" +
        "order by aluno.aluno_nome ASC;";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Pagamento pagamento = new Pagamento();
                pagamento.setId(rs.getInt("pagamento_id"));
                pagamento.setNomeAluno(rs.getString("pagamento_nomealuno"));
                pagamento.setDataProximoPagamento(rs.getString("pagamento_dataproximopagamento"));
                lista.add(pagamento);
            }
            
        } catch (Exception erro) {
            throw new RuntimeException("Erro 5: "+erro);
        }
        return lista;
    }
        public ArrayList<Pagamento> listarPorData() {
        String sql = "select pagamento_id, pagamento_nomealuno, to_date(pagamento_dataproximopagamento,'DD-MM-YYYY') from pagamento\n" +
        "INNER JOIN aluno\n" +
        "ON aluno.aluno_nome = pagamento.pagamento_nomealuno\n" +
        "order by to_date(pagamento_dataproximopagamento,'DD-MM-YYYY') ASC;";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Pagamento pagamento = new Pagamento();
                pagamento.setId(rs.getInt("pagamento_id"));
                pagamento.setNomeAluno(rs.getString("pagamento_nomealuno"));
                pagamento.setDataProximoPagamento(rs.getString("to_date"));
                lista.add(pagamento);
            }
            
        } catch (Exception erro) {
            throw new RuntimeException("Erro 5: "+erro);
        }
        return lista;
    }                
        public ArrayList<Pagamento> listarNormal() {
        String sql = "select pagamento_id, pagamento_nomealuno, pagamento_dataproximopagamento from pagamento\n" +
        "INNER JOIN aluno\n" +
        "ON aluno.aluno_nome = pagamento.pagamento_nomealuno\n";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Pagamento pagamento = new Pagamento();
                pagamento.setId(rs.getInt("pagamento_id"));
                pagamento.setNomeAluno(rs.getString("pagamento_nomealuno"));
                pagamento.setDataProximoPagamento(rs.getString("pagamento_dataproximopagamento"));
                lista.add(pagamento);
            }
            
        } catch (Exception erro) {
            throw new RuntimeException("Erro 5: "+erro);
        }
        return lista;
    }            
}