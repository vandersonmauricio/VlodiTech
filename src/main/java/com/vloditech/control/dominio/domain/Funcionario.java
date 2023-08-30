package com.vloditech.control.dominio.domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.*;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String login;
    private  String senha;

    private  String niveisDeAcesso;
}
