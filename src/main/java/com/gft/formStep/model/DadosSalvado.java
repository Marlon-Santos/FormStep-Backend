package com.gft.formStep.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class DadosSalvado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Long id;
    private String origem;
    private String causa;
    private String local;
    private String produto;
    private String qualidade;
    private Double quantidade;
    private String meta;
    private Long vagao;
    private Long sindicancia;
    @OneToMany(mappedBy = "dadosSalvado", cascade = CascadeType.ALL)
    private List<ArquivoControlePerdas> arquivoControlePerdas;
    @OneToOne(mappedBy = "dadosSalvado")
    @JsonIgnore
    private Salvado salvado;

    public DadosSalvado() {
    }

    public DadosSalvado(String origem, String causa, String local, String produto, String qualidade
            , Double quantidade, String meta, Long vagao, Long sindicancia, List<ArquivoControlePerdas> arquivoControlePerdas) {
        this.origem = origem;
        this.causa = causa;
        this.local = local;
        this.produto = produto;
        this.qualidade = qualidade;
        this.quantidade = quantidade;
        this.meta = meta;
        this.vagao = vagao;
        this.sindicancia = sindicancia;
        this.arquivoControlePerdas = arquivoControlePerdas;
    }

    public Salvado getSalvado() {
        return salvado;
    }

    public void setSalvado(Salvado salvado) {
        this.salvado = salvado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getQualidade() {
        return qualidade;
    }

    public void setQualidade(String qualidade) {
        this.qualidade = qualidade;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public Long getVagao() {
        return vagao;
    }

    public void setVagao(Long vagao) {
        this.vagao = vagao;
    }

    public Long getSindicancia() {
        return sindicancia;
    }

    public void setSindicancia(Long sindicancia) {
        this.sindicancia = sindicancia;
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
        DadosSalvado that = (DadosSalvado) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
