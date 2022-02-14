package model.bo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Venda {

    private Long idVenda;
    private String serie;
    private LocalDate dataVenda;
    private String hora;
    private BigDecimal desconto;
    private BigDecimal total;
    private Cliente cliente;
    private CondicaoPagamento condicaoPagamento;
    private Long diaVencimentoParcela;
    private Vendedor vendedor;

    public Venda() {

    }

    public Venda(Long idVenda, String serie, LocalDate dataVenda, String hora, BigDecimal desconto, BigDecimal total, Cliente cliente, CondicaoPagamento condicaoPagamento, Long diaVencimentoParcela, Vendedor vendedor) {
        this.idVenda = idVenda;
        this.serie = serie;
        this.dataVenda = dataVenda;
        this.hora = hora;
        this.desconto = desconto;
        this.total = total;
        this.cliente = cliente;
        this.condicaoPagamento = condicaoPagamento;
        this.diaVencimentoParcela = diaVencimentoParcela;
        this.vendedor = vendedor;
    }

    public Long getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Long idVenda) {
        this.idVenda = idVenda;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public CondicaoPagamento getCondicaoPagamento() {
        return condicaoPagamento;
    }

    public void setCondicaoPagamento(CondicaoPagamento condicaoPagamento) {
        this.condicaoPagamento = condicaoPagamento;
    }

    public Long getDiaVencimentoParcela() {
        return diaVencimentoParcela;
    }

    public void setDiaVencimentoParcela(Long diaVencimentoParcela) {
        this.diaVencimentoParcela = diaVencimentoParcela;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "idVenda=" + idVenda +
                ", serie='" + serie + '\'' +
                ", dataVenda=" + dataVenda +
                ", hora='" + hora + '\'' +
                ", desconto=" + desconto +
                ", total=" + total +
                ", cliente=" + cliente +
                ", condicaoPagamento=" + condicaoPagamento +
                ", diaVencimentoParcela=" + diaVencimentoParcela +
                ", vendedor=" + vendedor +
                '}'
        ;
    }
}