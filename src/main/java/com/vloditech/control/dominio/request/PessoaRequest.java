package com.vloditech.control.dominio.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Objects;
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PessoaRequest {
    @NotNull
    @NotEmpty
    private String login;
    @NotNull
    @NotEmpty
    private String senha;

    @NotNull
    @NotEmpty
    private String niveisDeAcesso;

}
