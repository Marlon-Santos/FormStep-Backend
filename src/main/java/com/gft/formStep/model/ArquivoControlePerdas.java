package com.gft.formStep.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Date;
import java.util.Objects;

@Entity
public class ArquivoControlePerdas {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Lob
    private byte[] nome;
    private Date data;
    private String observacao;
    @JsonIgnore
    @ManyToOne
    private DadosSalvado dadosSalvado;
    @JsonIgnore
    @ManyToOne
    private CotacaoSalvado cotacaoSalvado;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getNome() {
        return nome;
    }

    public void setNome(byte[] nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public DadosSalvado getDadosSalvado() {
        return dadosSalvado;
    }

    public void setDadosSalvado(DadosSalvado dadosSalvado) {
        this.dadosSalvado = dadosSalvado;
    }

    public CotacaoSalvado getCotacaoSalvado() {
        return cotacaoSalvado;
    }

    public void setCotacaoSalvado(CotacaoSalvado cotacaoSalvado) {
        this.cotacaoSalvado = cotacaoSalvado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArquivoControlePerdas that = (ArquivoControlePerdas) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
