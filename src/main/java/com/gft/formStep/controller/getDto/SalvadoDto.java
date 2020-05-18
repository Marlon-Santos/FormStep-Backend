//package com.gft.formStep.controller.getDto;
//
//import com.gft.formStep.model.Salvado;
//
//import java.util.List;
//import java.util.Objects;
//import java.util.stream.Collectors;
//
//public class SalvadoDto {
//    private Long id;
//    private DadosSalvadoDto dadosSalvado;
//    private CotacaoSalvadoDto cotacaoSalvado;
//
//    public SalvadoDto(Salvado salvado) {
//        this.id = salvado.getId();
//        this.dadosSalvado = salvado.getDadosSalvado() != null ? new DadosSalvadoDto(salvado.getDadosSalvado()) : null;
//        this.cotacaoSalvado = salvado.getCotacaoSalvado() != null ? new CotacaoSalvadoDto(salvado.getCotacaoSalvado()) : null;
//    }
//
//    public static List<SalvadoDto> convert(List<Salvado> salvadoList) {
//        return salvadoList.stream().map(SalvadoDto::new).collect(Collectors.toList());
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public DadosSalvadoDto getDadosSalvado() {
//        return dadosSalvado;
//    }
//
//    public void setDadosSalvado(DadosSalvadoDto dadosSalvado) {
//        this.dadosSalvado = dadosSalvado;
//    }
//
//    public CotacaoSalvadoDto getCotacaoSalvado() {
//        return cotacaoSalvado;
//    }
//
//    public void setCotacaoSalvado(CotacaoSalvadoDto cotacaoSalvado) {
//        this.cotacaoSalvado = cotacaoSalvado;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        SalvadoDto that = (SalvadoDto) o;
//        return Objects.equals(id, that.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
//}
