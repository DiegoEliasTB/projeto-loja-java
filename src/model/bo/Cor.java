package model.bo;

public class Cor {

    private Long idCor;
    private String descricao;

    public Cor() {

    }

    public Cor(Long idCor, String descricao) {
        this.idCor = idCor;
        this.descricao = descricao;
    }

    public Long getIdCor() {
        return idCor;
    }

    public void setIdCor(Long idCor) {
        this.idCor = idCor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Cor{" +
                "idCor=" + idCor +
                ", descricao='" + descricao + '\'' +
                '}'
        ;
    }
}