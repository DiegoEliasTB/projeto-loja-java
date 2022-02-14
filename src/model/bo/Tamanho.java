package model.bo;

public class Tamanho {

    private Long idTamanho;
    private String descricao;

    public Tamanho () {

    }

    public Tamanho(Long idTamanho, String descricao) {
        this.idTamanho = idTamanho;
        this.descricao = descricao;
    }

    public Long getIdTamanho() {
        return idTamanho;
    }

    public void setIdTamanho(Long idTamanho) {
        this.idTamanho = idTamanho;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Tamanho{" +
                "idTamanho=" + idTamanho +
                ", descricao='" + descricao + '\'' +
                '}'
        ;
    }
}