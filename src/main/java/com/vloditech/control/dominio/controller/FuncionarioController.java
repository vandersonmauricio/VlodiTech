package com.vloditech.control.dominio.controller;

import com.vloditech.control.dominio.dao.PessoaDAO;
import com.vloditech.control.dominio.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class FuncionarioController {

    @Autowired
    PessoaRepository repository;

    @PostMapping
    public ResponseEntity postEmployee (@RequestBody @Validated PessoaDAO body) {

    }
}
