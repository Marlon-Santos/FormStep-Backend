package com.gft.formStep.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class CotacaoSalvado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private Long valorCotacao;
    @Temporal(TemporalType.DATE)
    private Date dataCotacao;
    @NotNull
    private Long valorProdutoOfertado;
    private Long valorTotalOferta;
    private Long diferenca;
    @OneToOne(mappedBy = "cotacaoSalvado") @JsonIgnore
    private Salvado salvado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getValorCotacao() {
        return valorCotacao;
    }

    public void setValorCotacao(Long valorCotacao) {
        this.valorCotacao = valorCotacao;
    }

    public Date getDataCotacao() {
        return dataCotacao;
    }

    public void setDataCotacao(Date dataCotacao) {
        this.dataCotacao = dataCotacao;
    }

    public Long getValorProdutoOfertado() {
        return valorProdutoOfertado;
    }

    public void setValorProdutoOfertado(Long valorProdutoOfertado) {
        this.valorProdutoOfertado = valorProdutoOfertado;
    }

    public Long getValorTotalOferta() {
        return valorTotalOferta;
    }

    public void setValorTotalOferta(Long valorTotalOferta) {
        this.valorTotalOferta = valorTotalOferta;
    }

    public Long getDiferenca() {
        return diferenca;
    }

    public void setDiferenca(Long diferenca) {
        this.diferenca = diferenca;
    }

    public Salvado getSalvado() {
        return salvado;
    }

    public void setSalvado(Salvado salvado) {
        this.salvado = salvado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CotacaoSalvado that = (CotacaoSalvado) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
