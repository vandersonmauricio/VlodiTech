package com.vloditech.control.dominio.response;

import lombok.*;

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
