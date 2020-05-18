package com.gft.formStep.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class DadosSalvado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    private String nome;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHoraCadastro;
    private String observacao;
    @OneToOne(mappedBy = "dadosSalvado") @JsonIgnore
    private Salvado salvado;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataHoraCadastro() {
        return dataHoraCadastro;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
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
