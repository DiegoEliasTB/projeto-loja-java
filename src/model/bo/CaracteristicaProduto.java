package model.bo;

public class CaracteristicaProduto {

    private Long idCaracteristicaProduto;
    private Produto produto;
    private Cor cor;
    private String tamanho;
    private String barra;
    private Long quantidadeEstoque;

    public CaracteristicaProduto () {

    }

    public CaracteristicaProduto(Long idCaracteristicaProduto, Produto produto, Cor cor, String tamanho, String barra, Long quantidadeEstoque) {
        this.idCaracteristicaProduto = idCaracteristicaProduto;
        this.produto = produto;
        this.cor = cor;
        this.tamanho = tamanho;
        this.barra = barra;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Long getIdCaracteristicaProduto() {
        return idCaracteristicaProduto;
    }

    public void setIdCaracteristicaProduto(Long idCaracteristicaProduto) {
        this.idCaracteristicaProduto = idCaracteristicaProduto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getBarra() {
        return barra;
    }

    public void setBarra(String barra) {
        this.barra = barra;
    }

    public Long getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Long quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String toString() {
        return "CaracteristicaProduto{" +
                "idCaracteristicaProduto=" + idCaracteristicaProduto +
                ", produto=" + produto +
                ", cor=" + cor +
                ", tamanho='" + tamanho + '\'' +
                ", barra='" + barra + '\'' +
                ", quantidadeEstoque=" + quantidadeEstoque +
                '}'
        ;
    }
}