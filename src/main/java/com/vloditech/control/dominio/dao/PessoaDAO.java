package com.vloditech.control.dominio.dao;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class PessoaDAO {
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
        PessoaDAO pessoaDAO = (PessoaDAO) o;
        return Objects.equals(id, pessoaDAO.id) && Objects.equals(login, pessoaDAO.login) && Objects.equals(senha, pessoaDAO.senha) && Objects.equals(niveisDeAcesso, pessoaDAO.niveisDeAcesso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, senha, niveisDeAcesso);
    }
}
