package model.bo;

public class Marca {

    private Long idMarca;
    private String descricao;

    public Marca() {

    }

    public Marca(Long idMarca, String descricao) {
        this.idMarca = idMarca;
        this.descricao = descricao;
    }

    public Long getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Long idMarca) {
        this.idMarca = idMarca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Marca{" +
                "idMarca=" + idMarca +
                ", descricao='" + descricao + '\'' +
                '}'
        ;
    }
}