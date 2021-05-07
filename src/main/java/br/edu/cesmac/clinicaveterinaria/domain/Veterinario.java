package br.edu.cesmac.clinicaveterinaria.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Veterinario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idVeterinario;
    private String nome;
    private String login;
    private String senha;

    public Veterinario () {
    }

    public Veterinario (Long idVeterinario , String nome, String login, String senha) {
        this.idVeterinario = idVeterinario;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public Long getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(Long idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
}
