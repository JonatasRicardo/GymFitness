package model;

public class Pagamento {
    int id;
    String nomeAluno;
    String tipoPlano;
    String dataVencimento;
    String dataPagamento;
    String dataProximoPagamento;

    public String getDataProximoPagamento() {
        return dataProximoPagamento;
    }

    public void setDataProximoPagamento(String dataProximoPagamento) {
        this.dataProximoPagamento = dataProximoPagamento;
    }
    
    
    
    public String getTipoPlano() {
        return tipoPlano;
    }

    public void setTipoPlano(String tipoPlano) {
        this.tipoPlano = tipoPlano;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    @Override
    public String toString() {
    return getTipoPlano();        
    }
}
