package com.vloditech.control.dominio.controller;

import com.vloditech.control.dominio.request.PessoaRequest;
import com.vloditech.control.dominio.domain.Pessoa;
import com.vloditech.control.dominio.mapper.PessoaMapper;
import com.vloditech.control.dominio.response.PessoaResponse;
import com.vloditech.control.dominio.service.PessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class PessoaController {
    private final PessoaService pessoaService;
    private final PessoaMapper pessoaMapper;

    @PostMapping
    public ResponseEntity<PessoaResponse> postEmployee(@RequestBody @Validated PessoaRequest request) {
        Pessoa pessoa = pessoaMapper.toPessoa(request);
        Pessoa pessoasalva = pessoaService.criarLogin(pessoa);
        PessoaResponse pessoaResponse = pessoaMapper.toPessoaResponse(pessoasalva);

        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaResponse);
    }
}