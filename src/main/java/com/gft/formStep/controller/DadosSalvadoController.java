package com.gft.formStep.controller;

import com.gft.formStep.controller.form.DadosSalvadoForm;
import com.gft.formStep.model.ArquivoControlePerdas;
import com.gft.formStep.model.CotacaoSalvado;
import com.gft.formStep.model.DadosSalvado;
import com.gft.formStep.model.Salvado;
import com.gft.formStep.repository.SalvadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("api/salvado/dadosSalvado")
public class DadosSalvadoController {
    @Autowired
    private SalvadoRepository salvadoRepository;

    @PostMapping("/{id}")
    @Transactional
    public ResponseEntity<Salvado> dadosSalvadoPost (@RequestBody @Valid DadosSalvadoForm dadosSalvadoForm, UriComponentsBuilder uriBuilder) throws Exception {
            Salvado salvado = new Salvado();
            CotacaoSalvado cotacaoSalvado = new CotacaoSalvado();
            salvado.setCotacaoSalvado(cotacaoSalvado);
            salvado.setDadosSalvado(dadosSalvadoForm.convert());
            salvadoRepository.save(salvado);
            URI uri = uriBuilder.path("{id}").buildAndExpand(salvado.getId()).toUri();
            return ResponseEntity.created(uri).body(salvado);
    }
}