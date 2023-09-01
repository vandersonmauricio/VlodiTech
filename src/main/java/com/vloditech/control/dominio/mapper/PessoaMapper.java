package com.vloditech.control.dominio.mapper;


import com.vloditech.control.dominio.request.PessoaRequest;
import com.vloditech.control.dominio.domain.Pessoa;
import com.vloditech.control.dominio.response.PessoaResponse;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PessoaMapper {
    private final ModelMapper modelMapper;

    public Pessoa toPessoa(PessoaRequest request) {
        return modelMapper.map(request, Pessoa.class);
    }

    public PessoaResponse toPessoaResponse(Pessoa pessoa) {
        return modelMapper.map(pessoa, PessoaResponse.class);
    }
}