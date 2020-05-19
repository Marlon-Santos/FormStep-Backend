package com.gft.formStep.controller;

import com.gft.formStep.model.CotacaoSalvado;
import com.gft.formStep.model.DadosSalvado;
import com.gft.formStep.model.Salvado;
import com.gft.formStep.repository.SalvadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/api/salvado/cotacaoSalvado")
public class CotacaoSalvadoController {
    @Autowired
    private SalvadoRepository salvadoRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<Salvado> cotacaoSalvadoPost( @RequestBody @Valid CotacaoSalvado cotacaoSalvado, UriComponentsBuilder uriBuilder) throws Exception {
        Salvado salvado = new Salvado();
        salvado.setCotacaoSalvado(cotacaoSalvado);
        salvado.setDadosSalvado(new DadosSalvado());
        salvadoRepository.save(salvado);
        URI uri = uriBuilder.path("{id}").buildAndExpand(salvado.getId()).toUri();
        return ResponseEntity.created(uri).body(salvado);
    }
}
