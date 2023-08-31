package com.vloditech.control.dominio.dao;

import lombok.Getter;
import lombok.Setter;


@Setter @Getter
public class PessoaDAO {
    private Long id;
    private  String login;
    private  String senha;

    private  String niveisDeAcesso;
}
