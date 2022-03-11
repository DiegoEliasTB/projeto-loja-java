package model.bo;

import java.time.LocalDate;
import java.util.Date;

public class CondicaoPagamento {

    private Long idCondicaoPagamento;
    private String descricao;
    private LocalDate diasAtePrimeiraParcela;
    private LocalDate diasEntreParcelas;

    public CondicaoPagamento () {

    }

    public CondicaoPagamento(Long idCondicaoPagamento, String descricao, LocalDate diasAtePrimeiraParcela, LocalDate diasEntreParcelas) {
        this.idCondicaoPagamento = idCondicaoPagamento;
        this.descricao = descricao;
        this.diasAtePrimeiraParcela = diasAtePrimeiraParcela;
        this.diasEntreParcelas = diasEntreParcelas;
    }

    public Long getIdCondicaoPagamento() {
        return idCondicaoPagamento;
    }

    public void setIdCondicaoPagamento(Long idCondicaoPagamento) {
        this.idCondicaoPagamento = idCondicaoPagamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDiasAtePrimeiraParcela() {
        return diasAtePrimeiraParcela;
    }

    public void setDiasAtePrimeiraParcela(Date diasAtePrimeiraParcela) {
        this.diasAtePrimeiraParcela = LocalDate.parse(diasAtePrimeiraParcela.toString());
    }

    public LocalDate getDiasEntreParcelas() {
        return diasEntreParcelas;
    }

    public void setDiasEntreParcelas(Date diasEntreParcelas) {
        this.diasEntreParcelas = LocalDate.parse(diasEntreParcelas.toString());
    }

    @Override
    public String toString() {
        return "CondicaoPagamento{" +
                "idCondicaoPagamento=" + idCondicaoPagamento +
                ", descricao='" + descricao + '\'' +
                ", diasAtePrimeiraParcela=" + diasAtePrimeiraParcela +
                ", diasEntreParcelas=" + diasEntreParcelas +
                '}'
        ;
    }
}