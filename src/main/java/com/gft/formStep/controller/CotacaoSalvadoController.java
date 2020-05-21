package com.gft.formStep.controller;

import com.gft.formStep.model.CotacaoSalvado;
import com.gft.formStep.model.DadosSalvado;
import com.gft.formStep.model.Salvado;
import com.gft.formStep.repository.SalvadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api/salvado/cotacaoSalvado")
public class CotacaoSalvadoController {
    @Autowired
    private SalvadoRepository salvadoRepository;

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<Salvado> cotacaoSalvadoPost(@PathVariable Long id, @RequestBody @Valid CotacaoSalvado cotacaoSalvado) throws Exception {
        Optional<Salvado> optionalSalvado = salvadoRepository.findById(id);
        Salvado salvado;
        if (optionalSalvado.isPresent()) {
            salvado = optionalSalvado.get();
            cotacaoSalvado.setId(salvado.getCotacaoSalvado().getId());
            salvado.setCotacaoSalvado(cotacaoSalvado);
            salvadoRepository.save(salvado);
            return ResponseEntity.ok(salvado);
        }
        throw new Exception("error no put");
    }
}
