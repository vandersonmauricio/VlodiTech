package com.vloditech.control.dominio.dao;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNiveisDeAcesso() {
        return niveisDeAcesso;
    }

    public void setNiveisDeAcesso(String niveisDeAcesso) {
        this.niveisDeAcesso = niveisDeAcesso;
    }

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
