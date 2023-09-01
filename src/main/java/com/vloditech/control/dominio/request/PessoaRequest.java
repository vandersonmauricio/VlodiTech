package com.vloditech.control.dominio.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class PessoaRequest {
    private Long id;
    @NotNull
    @NotEmpty
    private String login;
    @NotNull
    @NotEmpty
    private String senha;

    @NotNull
    @NotEmpty
    private String niveisDeAcesso;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaRequest pessoaRequest = (PessoaRequest) o;
        return Objects.equals(id, pessoaRequest.id) && Objects.equals(login, pessoaRequest.login) && Objects.equals(senha, pessoaRequest.senha) && Objects.equals(niveisDeAcesso, pessoaRequest.niveisDeAcesso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, senha, niveisDeAcesso);
    }
}
