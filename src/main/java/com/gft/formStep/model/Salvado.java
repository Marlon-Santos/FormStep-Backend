package com.gft.formStep.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Salvado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private DadosSalvado dadosSalvado;

    @OneToOne(cascade = CascadeType.ALL)
    private CotacaoSalvado cotacaoSalvado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        Salvado salvado = (Salvado) o;
        return Objects.equals(id, salvado.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
