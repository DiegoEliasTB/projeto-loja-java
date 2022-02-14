package model.bo;

import java.math.BigDecimal;

public class ItensVenda {

    private Long idItensVenda;
    private Venda venda;
    private CaracteristicaProduto caracteristicaProduto;
    private BigDecimal valorUnitario;
    private BigDecimal quantidadeProduto;

    public ItensVenda() {

    }

    public ItensVenda(Long idItensVenda, Venda venda, CaracteristicaProduto caracteristicaProduto, BigDecimal valorUnitario, BigDecimal quantidadeProduto) {
        this.idItensVenda = idItensVenda;
        this.venda = venda;
        this.caracteristicaProduto = caracteristicaProduto;
        this.valorUnitario = valorUnitario;
        this.quantidadeProduto = quantidadeProduto;
    }

    public Long getIdItensVenda() {
        return idItensVenda;
    }

    public void setIdItensVenda(Long idItensVenda) {
        this.idItensVenda = idItensVenda;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public CaracteristicaProduto getCaracteristicaProduto() {
        return caracteristicaProduto;
    }

    public void setCaracteristicaProduto(CaracteristicaProduto caracteristicaProduto) {
        this.caracteristicaProduto = caracteristicaProduto;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public BigDecimal getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(BigDecimal quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    @Override
    public String toString() {
        return "ItensVenda{" +
                "idItensVenda=" + idItensVenda +
                ", venda=" + venda +
                ", caracteristicaProduto=" + caracteristicaProduto +
                ", valorUnitario=" + valorUnitario +
                ", quantidadeProduto=" + quantidadeProduto +
                '}'
        ;
    }
}