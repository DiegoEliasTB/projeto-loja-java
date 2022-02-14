package model.bo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pagar {

    private Long IdPagar;
    private Compra compra;
    private LocalDateTime dataEmissao;
    private LocalDate dataVencimento;
    private BigDecimal valorPagar;
    private BigDecimal valorAcrescimo;
    private BigDecimal valorDesconto;
    private LocalDate dataPagamento;
    private BigDecimal valorPago;
    private char status;

    public Pagar() {

    }

    public Pagar(Long idPagar, Compra compra, LocalDateTime dataEmissao, LocalDate dataVencimento, BigDecimal valorPagar, BigDecimal valorAcrescimo, BigDecimal valorDesconto, LocalDate dataPagamento, BigDecimal valorPago, char status) {
        IdPagar = idPagar;
        this.compra = compra;
        this.dataEmissao = dataEmissao;
        this.dataVencimento = dataVencimento;
        this.valorPagar = valorPagar;
        this.valorAcrescimo = valorAcrescimo;
        this.valorDesconto = valorDesconto;
        this.dataPagamento = dataPagamento;
        this.valorPago = valorPago;
        this.status = status;
    }

    public Long getIdPagar() {
        return IdPagar;
    }

    public void setIdPagar(Long idPagar) {
        IdPagar = idPagar;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public LocalDateTime getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDateTime dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public BigDecimal getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(BigDecimal valorPagar) {
        this.valorPagar = valorPagar;
    }

    public BigDecimal getValorAcrescimo() {
        return valorAcrescimo;
    }

    public void setValorAcrescimo(BigDecimal valorAcrescimo) {
        this.valorAcrescimo = valorAcrescimo;
    }

    public BigDecimal getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pagar{" +
                "IdPagar=" + IdPagar +
                ", compra=" + compra +
                ", dataEmissao=" + dataEmissao +
                ", dataVencimento=" + dataVencimento +
                ", valorPagar=" + valorPagar +
                ", valorAcrescimo=" + valorAcrescimo +
                ", valorDesconto=" + valorDesconto +
                ", dataPagamento=" + dataPagamento +
                ", valorPago=" + valorPago +
                ", status=" + status +
                '}'
        ;
    }
}