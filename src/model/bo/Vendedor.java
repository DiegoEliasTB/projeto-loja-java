package model.bo;

import java.math.BigDecimal;

public class Vendedor extends Pessoa {

    private Long idVendedor;
    private String cpf;
    private String telefone1;
    private String telefone2;
    private BigDecimal percentualComissao;
    private BigDecimal percentualRecebido;

    public Vendedor() {

    }

    public Vendedor(Long idVendedor, String nome, String email, String compleEndereco, Endereco endereco, String cpf, String telefone1, String telefone2, BigDecimal percentualComissao, BigDecimal percentualRecebido) {
        super(nome, email, compleEndereco, endereco);
        this.idVendedor = idVendedor;
        this.cpf = cpf;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.percentualComissao = percentualComissao;
        this.percentualRecebido = percentualRecebido;
    }

    public Long getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(Long idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public BigDecimal getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(BigDecimal percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public BigDecimal getPercentualRecebido() {
        return percentualRecebido;
    }

    public void setPercentualRecebido(BigDecimal percentualRecebido) {
        this.percentualRecebido = percentualRecebido;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "idVendedor=" + idVendedor +
                ", cpf='" + cpf + '\'' +
                ", telefone1='" + telefone1 + '\'' +
                ", telefone2='" + telefone2 + '\'' +
                ", percentualComissao=" + percentualComissao +
                ", percentualRecebido=" + percentualRecebido +
                '}'
        ;
    }
}