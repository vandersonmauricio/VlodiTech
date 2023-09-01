package com.vloditech.control.dominio.dao;

import lombok.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class PessoaDAO {
    private Long id;
    private  String login;
    private  String senha;

    private  String niveisDeAcesso;
}
