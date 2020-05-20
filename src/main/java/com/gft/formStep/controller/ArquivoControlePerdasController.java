package com.gft.formStep.controller;

import com.gft.formStep.model.ArquivoControlePerdas;
import com.gft.formStep.model.Salvado;
import com.gft.formStep.repository.ArquivoControlePerdasRepository;
import com.gft.formStep.repository.SalvadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.sql.rowset.serial.SerialBlob;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

@RestController
@RequestMapping("/api/arquivoControlePerdas")
public class ArquivoControlePerdasController {
    @Autowired
    private ArquivoControlePerdasRepository acpRepository;
    @Autowired
    private SalvadoRepository salvadoRepository;

    @PostMapping
    public ResponseEntity<Salvado> arquivo(@RequestParam MultipartFile nome) throws IOException, SQLException {
        ArquivoControlePerdas arquivoControlePerdas = new ArquivoControlePerdas();

        arquivoControlePerdas.setNome(nome.getBytes());
        arquivoControlePerdas.setData(new Date());
        arquivoControlePerdas.setCotacaoSalvado(salvadoRepository.findById(1L).get().getCotacaoSalvado());
        salvadoRepository.findById(1L).get().getCotacaoSalvado().getArquivoControlePerdas().forEach(a->{
            System.out.println(Arrays.toString(a.getNome()));
        });
        acpRepository.save(arquivoControlePerdas);
        return ResponseEntity.ok(Objects.requireNonNull(salvadoRepository.findById(1L).get()));
    }
}
