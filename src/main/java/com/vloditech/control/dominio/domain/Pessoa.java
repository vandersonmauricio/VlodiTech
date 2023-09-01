package com.vloditech.control.dominio.domain;

import jakarta.persistence.*;
import lombok.*;


@Data
@Entity
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String login;
    private  String senha;

    private  String niveisDeAcesso;

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
}
