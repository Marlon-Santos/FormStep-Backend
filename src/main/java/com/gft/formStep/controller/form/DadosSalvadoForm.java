package com.gft.formStep.controller.form;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gft.formStep.model.DadosSalvado;
import com.gft.formStep.model.Salvado;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Objects;

public class DadosSalvadoForm {
    @NotNull(message = "testtest") @NotBlank(message = "test")
    private String origem;
    @NotNull(message = "testtest") @NotBlank(message = "test2")
    private String causa;
    @NotNull(message = "testtest") @NotBlank(message = "test2")
    private String local;
    @NotNull(message = "testtest") @NotBlank(message = "test2")
    private String produto;
    @NotNull(message = "testtest") @NotBlank(message = "test2")
    private String qualidade;
    @NotNull(message = "testtest") @NotBlank(message = "test2")
    private Double quantidade;
    @NotNull(message = "testtest") @NotBlank(message = "test2")
    private String meta;
    @NotNull(message = "testtest") @NotBlank(message = "test2")
    private Long vagao;
    @NotNull(message = "testtest") @NotBlank(message = "test2")
    private Long sindicancia;
    @NotNull(message = "testtest") @NotBlank(message = "test2")
    private String nome;
    @NotNull(message = "testtest") @NotBlank(message = "test2")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHoraCadastro;
    @NotNull(message = "testtest") @NotBlank(message = "test2")
    private String observacao;

    public DadosSalvado convert(){
        return new DadosSalvado(origem,causa,local,produto,qualidade,quantidade,meta,vagao,sindicancia,nome
                ,dataHoraCadastro,observacao);
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

    public void setDataHoraCadastro(Date dataHoraCadastro) {
        this.dataHoraCadastro = dataHoraCadastro;
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

}