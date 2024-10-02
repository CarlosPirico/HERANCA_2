package models;

import java.time.LocalDate;

public class Cliente extends Pessoa {
    private String email;
    private String numeroCartaoFidelidade;
    private String telefone;

    public Cliente(String nome, String cpf, LocalDate dataNascimento, String email, String numeroCartaoFidelidade, String telefone) {
        super(nome, cpf, dataNascimento);
        this.email = email;
        this.numeroCartaoFidelidade = numeroCartaoFidelidade;
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getNumeroCartaoFidelidade() {
        return numeroCartaoFidelidade;
    }

    public String getTelefone() {
        return telefone;
    }
}

