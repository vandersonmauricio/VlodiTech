package com.vloditech.control.dominio.controller;

import com.vloditech.control.dominio.dao.PessoaDAO;
import com.vloditech.control.dominio.domain.Pessoa;
import com.vloditech.control.dominio.mapper.PessoaMapper;
import com.vloditech.control.dominio.service.PessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("login")
@RequiredArgsConstructor
public class PessoaController {
    private final PessoaService pessoaService;
    private final PessoaMapper pessoaMapper;

    @PostMapping
    public ResponseEntity<Pessoa> postEmployee(@RequestBody @Validated PessoaDAO request) {
        Pessoa pessoa = pessoaMapper.toPessoa(request);
        Pessoa pessoasalva = pessoaService.criarLogin(pessoa);

        return ResponseEntity.ok().build();
    }
}