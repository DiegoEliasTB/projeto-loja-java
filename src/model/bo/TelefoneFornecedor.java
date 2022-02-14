package model.bo;

public class TelefoneFornecedor {

    private String telefone;
    private Fornecedor fornecedor;

    public TelefoneFornecedor() {
    }

    public TelefoneFornecedor(String telefone, Fornecedor fornecedor) {
        this.telefone = telefone;
        this.fornecedor = fornecedor;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return "TelefoneFornecedor{" +
                "telefone='" + telefone + '\'' +
                ", fornecedor=" + fornecedor +
                '}'
        ;
    }
}