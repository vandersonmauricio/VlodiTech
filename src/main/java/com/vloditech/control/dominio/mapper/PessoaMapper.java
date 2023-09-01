package com.vloditech.control.dominio.mapper;


import com.vloditech.control.dominio.dao.PessoaDAO;
import com.vloditech.control.dominio.domain.Pessoa;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PessoaMapper {
    private final ModelMapper modelMapper;

    public Pessoa toPessoa(PessoaDAO request) {
        return modelMapper.map(request, Pessoa.class);
    }
}