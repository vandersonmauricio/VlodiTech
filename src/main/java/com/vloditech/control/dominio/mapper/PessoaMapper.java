package com.vloditech.control.dominio.mapper;


import com.vloditech.control.dominio.dao.PessoaDAO;
import com.vloditech.control.dominio.domain.Pessoa;
import org.modelmapper.ModelMapper;


public class PessoaMapper {
    private final ModelMapper modelMapper;


    public PessoaMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Pessoa toPessoa(PessoaDAO request){
        return modelMapper.map(request, Pessoa.class);
    }

}
