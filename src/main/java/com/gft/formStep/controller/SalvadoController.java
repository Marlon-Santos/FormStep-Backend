package com.gft.formStep.controller;

import com.gft.formStep.model.CotacaoSalvado;
import com.gft.formStep.model.DadosSalvado;
import com.gft.formStep.model.Salvado;
import com.gft.formStep.repository.SalvadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("api/salvado")
public class SalvadoController {
    @Autowired
    private SalvadoRepository salvadoRepository;

    @GetMapping
    public List<Salvado> test() {
        return this.salvadoRepository.findAll();
    }
}
