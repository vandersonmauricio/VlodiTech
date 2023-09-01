package com.vloditech.control.dominio.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PessoaResponse {

    private Long id;
    private String login;
    private String senha;
    private String niveisDeAcesso;
}
