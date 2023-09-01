package com.vloditech.control.dominio.service;

import com.vloditech.control.dominio.dao.PessoaDAO;
import com.vloditech.control.dominio.domain.Pessoa;
import com.vloditech.control.dominio.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class FuncionarioService {
    @Autowired
    PessoaRepository repository;

    public void criarLogin(PessoaDAO pessoa){
        //vejo se a pessoa esta no banco se não estiver crio ela no banco
        repository.findById(pessoa.g)
    //    repository.findById(pessoa.)
      //  Pessoa pessoa = new Pessoa();
    }
}
