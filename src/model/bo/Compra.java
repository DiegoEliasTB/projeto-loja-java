package model.bo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Compra {

    private Long idCompra;
    private Fornecedor fornecedor;
    private CondicaoPagamento condicaoPagamento;
    private Long numeroNota;
    private String serieNota;
    private LocalDate dataCompra;
    private BigDecimal desconto;
    private BigDecimal total;

    public Compra() {

    }

    public Compra(Long idCompra, Fornecedor fornecedor, CondicaoPagamento condicaoPagamento, Long numeroNota, String serieNota, LocalDate dataCompra, BigDecimal desconto, BigDecimal total) {
        this.idCompra = idCompra;
        this.fornecedor = fornecedor;
        this.condicaoPagamento = condicaoPagamento;
        this.numeroNota = numeroNota;
        this.serieNota = serieNota;
        this.dataCompra = dataCompra;
        this.desconto = desconto;
        this.total = total;
    }

    public Long getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Long idCompra) {
        this.idCompra = idCompra;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public CondicaoPagamento getCondicaoPagamento() {
        return condicaoPagamento;
    }

    public void setCondicaoPagamento(CondicaoPagamento condicaoPagamento) {
        this.condicaoPagamento = condicaoPagamento;
    }

    public Long getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(Long numeroNota) {
        this.numeroNota = numeroNota;
    }

    public String getSerieNota() {
        return serieNota;
    }

    public void setSerieNota(String serieNota) {
        this.serieNota = serieNota;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "idCompra=" + idCompra +
                ", fornecedor=" + fornecedor +
                ", condicaoPagamento=" + condicaoPagamento +
                ", numeroNota=" + numeroNota +
                ", serieNota='" + serieNota + '\'' +
                ", dataCompra=" + dataCompra +
                ", desconto=" + desconto +
                ", total=" + total +
                '}'
        ;
    }
}