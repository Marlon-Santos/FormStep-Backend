package com.gft.formStep.controller.form;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gft.formStep.model.ArquivoControlePerdas;
import com.gft.formStep.model.CotacaoSalvado;
import com.gft.formStep.model.DadosSalvado;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

public class ArquivoControlePerdasForm implements Serializable {
    private MultipartFile nome;
    private String observacao;

    public ArquivoControlePerdas convert(CotacaoSalvado cotacaoSalvado) throws IOException {
        return new ArquivoControlePerdas(this.nome.getBytes(), new Date(),observacao,cotacaoSalvado);
    }
    public ArquivoControlePerdas convert(DadosSalvado dadosSalvado ) throws IOException {
        return new ArquivoControlePerdas(this.nome.getBytes(), new Date(),observacao,dadosSalvado);
    }


    public MultipartFile getNome() {
        return nome;
    }

    public void setNome(MultipartFile nome) {
        this.nome = nome;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }


}
