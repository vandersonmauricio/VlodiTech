package com.vloditech.control.dominio.service;

import com.vloditech.control.dominio.domain.Pessoa;
import com.vloditech.control.dominio.repository.PessoaRepository;
import com.vloditech.control.exception.BusinessException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@Transactional
@RequiredArgsConstructor
public class PessoaService {

    private final PessoaRepository pessoaRepository;


    private Pessoa buscaPessoaOuRetornaExcecao(Long id){
       return pessoaRepository.findById(id).orElseThrow(()-> new BusinessException("Nulo ou vazio"));
    }

    public Pessoa criarLogin(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }
}