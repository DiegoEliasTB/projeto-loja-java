package model.bo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Receber {

    private Long idReceber;
    private Venda venda;
    private LocalDateTime dataEmissao;
    private BigDecimal valorEmissao;
    private LocalDate dataVencimento;
    private LocalDate dataPagamentoRecebido;
    private BigDecimal desconto;
    private BigDecimal acrescimo;
    private BigDecimal valorRecebido;
    private char status;

    public Receber() {

    }

    public Receber(Long idReceber, Venda venda, LocalDateTime dataEmissao, BigDecimal valorEmissao, LocalDate dataVencimento, LocalDate dataPagamentoRecebido, BigDecimal desconto, BigDecimal acrescimo, BigDecimal valorRecebido, char status) {
        this.idReceber = idReceber;
        this.venda = venda;
        this.dataEmissao = dataEmissao;
        this.valorEmissao = valorEmissao;
        this.dataVencimento = dataVencimento;
        this.dataPagamentoRecebido = dataPagamentoRecebido;
        this.desconto = desconto;
        this.acrescimo = acrescimo;
        this.valorRecebido = valorRecebido;
        this.status = status;
    }

    public Long getIdReceber() {
        return idReceber;
    }

    public void setIdReceber(Long idReceber) {
        this.idReceber = idReceber;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public LocalDateTime getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDateTime dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public BigDecimal getValorEmissao() {
        return valorEmissao;
    }

    public void setValorEmissao(BigDecimal valorEmissao) {
        this.valorEmissao = valorEmissao;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public LocalDate getDataPagamentoRecebido() {
        return dataPagamentoRecebido;
    }

    public void setDataPagamentoRecebido(LocalDate dataPagamentoRecebido) {
        this.dataPagamentoRecebido = dataPagamentoRecebido;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public BigDecimal getAcrescimo() {
        return acrescimo;
    }

    public void setAcrescimo(BigDecimal acrescimo) {
        this.acrescimo = acrescimo;
    }

    public BigDecimal getValorRecebido() {
        return valorRecebido;
    }

    public void setValorRecebido(BigDecimal valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Receber{" +
                "idReceber=" + idReceber +
                ", venda=" + venda +
                ", dataEmissao=" + dataEmissao +
                ", valorEmissao=" + valorEmissao +
                ", dataVencimento=" + dataVencimento +
                ", dataPagamentoRecebido=" + dataPagamentoRecebido +
                ", desconto=" + desconto +
                ", acrescimo=" + acrescimo +
                ", valorRecebido=" + valorRecebido +
                ", status=" + status +
                '}'
        ;
    }
}