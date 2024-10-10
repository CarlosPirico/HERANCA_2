package models;
//importando LocalDate para dataNascimento e dataContratacao.
import java.time.LocalDate;

//criando umas subclasse da superclasse pessoa.
public class Cliente extends Pessoa {
	// criando atributo
    private String email;
    private String numeroCartaoFidelidade;
    private String telefone;

    // construtor de subclasse herdando o construtor da superclasse.
    public Cliente(String nome, String cpf, LocalDate dataNascimento, String email, String numeroCartaoFidelidade, String telefone) {
        super(nome, cpf, dataNascimento);
        this.email = email;
        this.numeroCartaoFidelidade = numeroCartaoFidelidade;
        this.telefone = telefone;
    }

    // metodo para retornar o email
    public String getEmail() {
        return email;
    }

    // metodo para retornar o numero do cartao fidelidade
    public String getNumeroCartaoFidelidade() {
        return numeroCartaoFidelidade;
    }

    // metodo para retornar o telefone
    public String getTelefone() {
        return telefone;
    }
}

