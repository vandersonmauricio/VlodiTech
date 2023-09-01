package com.vloditech.control.dominio.service;

import com.vloditech.control.dominio.domain.Pessoa;
import com.vloditech.control.dominio.repository.PessoaRepository;
import com.vloditech.control.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class FuncionarioService {
    @Autowired
    PessoaRepository pessoaRepository;

    public Pessoa criarLogin(Pessoa pessoa) {

        Optional<Pessoa> pessoaExiste = pessoaRepository.findById(pessoa.getId());
        if (pessoaExiste.isPresent()) {
            throw new BusinessException("Cadastro ja foi realizado com essa pessoa");
        }

        return pessoaRepository.save(pessoa);
    }
}
