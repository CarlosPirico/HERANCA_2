package models;

// importando biblioteca LocalDate para a data de nascimento da pessoa.
import java.time.LocalDate;

// criando a superclasse.
public abstract class Pessoa {
    
	// criando os atributos.
	private String nome;
    private String cpf;
    private LocalDate dataNascimento;

    // criando o construtor da superclasse.
    public Pessoa(String nome, String cpf, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    // metodo para retornar nome.
    public String getNome() {
        return nome;
    }
    
    // metodo para retornar cpf
    public String getCpf() {
        return cpf;
    }
    
    // metodo para retornar 
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}

