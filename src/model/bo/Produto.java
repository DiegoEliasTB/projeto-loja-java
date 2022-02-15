package model.bo;

import java.math.BigDecimal;

public class Produto {

    private Long idProduto;
    private String descricao;
    private BigDecimal valor;
    private Marca marca;
    private TipoProduto tipoProduto;
    private Tamanho tamanho;

    public Produto () {

    }

    public Produto(Long idProduto, String descricao, BigDecimal valor, Marca marca, TipoProduto tipoProduto, Tamanho tamanho) {
        this.idProduto = idProduto;
        this.descricao = descricao;
        this.valor = valor;
        this.marca = marca;
        this.tipoProduto = tipoProduto;
        this.tamanho = tamanho;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public TipoProduto getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(TipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "idProduto=" + idProduto +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", marca=" + marca +
                ", tipoProduto=" + tipoProduto +
                ", tamanho=" + tamanho +
                '}'
        ;
    }
}