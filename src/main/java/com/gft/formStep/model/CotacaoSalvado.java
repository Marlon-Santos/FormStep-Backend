package com.gft.formStep.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class CotacaoSalvado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Long id;
    @NotNull(message = "testtest")
    private Long valorCotacao;
    @NotNull(message = "testtest")
    @Temporal(TemporalType.DATE)
    private Date dataCotacao = new Date();
    @NotNull(message = "testtest")
    private Long valorProdutoOfertado;
    @NotNull(message = "testtest")
    private Long valorTotalOferta;
    @NotNull(message = "testtest")
    private Long diferenca;
    @OneToMany(mappedBy = "cotacaoSalvado", cascade = CascadeType.ALL)
    private List<ArquivoControlePerdas> arquivoControlePerdas;
    @OneToOne(mappedBy = "cotacaoSalvado")
    @JsonIgnore
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

    public List<ArquivoControlePerdas> getArquivoControlePerdas() {
        return arquivoControlePerdas;
    }

    public void setArquivoControlePerdas(List<ArquivoControlePerdas> arquivoControlePerdas) {
        this.arquivoControlePerdas = arquivoControlePerdas;
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
