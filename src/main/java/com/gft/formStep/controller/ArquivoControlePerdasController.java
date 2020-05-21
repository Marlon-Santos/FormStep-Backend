package com.gft.formStep.controller;

import com.gft.formStep.controller.form.ArquivoControlePerdasForm;
import com.gft.formStep.model.ArquivoControlePerdas;
import com.gft.formStep.model.Salvado;
import com.gft.formStep.repository.ArquivoControlePerdasRepository;
import com.gft.formStep.repository.SalvadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/arquivoControlePerdas")
public class ArquivoControlePerdasController {

    @Autowired
    private ArquivoControlePerdasRepository acpRepository;
    @Autowired
    private SalvadoRepository salvadoRepository;

    @PostMapping("/{id}")
    public ResponseEntity<ArquivoControlePerdas> arquivo(@PathVariable Long id, @ModelAttribute ArquivoControlePerdasForm acpForm) throws IOException {
        Salvado salvado = salvadoRepository.findById(id).get();
        ArquivoControlePerdas arquivoControlePerdas = acpForm.convert(salvado.getDadosSalvado());
        acpRepository.save(arquivoControlePerdas);
        return ResponseEntity.ok(arquivoControlePerdas);
    }
}
