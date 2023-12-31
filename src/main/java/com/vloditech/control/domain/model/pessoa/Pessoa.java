package com.vloditech.control.domain.model.pessoa;

import jakarta.persistence.*;
import lombok.*;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String login;
    private  String senha;

    private  String niveisDeAcesso;
}
