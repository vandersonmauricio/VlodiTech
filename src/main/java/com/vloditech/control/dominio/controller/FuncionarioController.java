package com.vloditech.control.dominio.controller;

import com.vloditech.control.dominio.dao.PessoaDAO;
import com.vloditech.control.dominio.domain.Pessoa;
import com.vloditech.control.dominio.repository.PessoaRepository;
import com.vloditech.control.dominio.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class FuncionarioController {

    @Autowired
    FuncionarioService funcionarioService;

    @PostMapping
    public ResponseEntity<Pessoa> postEmployee (@RequestBody @Validated PessoaDAO body) {

        funcionarioService.criarLogin(body);

        return ResponseEntity.ok().build();
    }
}
