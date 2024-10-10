package models;

// importando LocalDate para dataNascimento e dataContratacao.
import java.time.LocalDate;

// criando umas subclasse da superclasse pessoa.
public class Vendedor extends Pessoa {
	
	// criando os atributos
    private LocalDate dataContratacao;
    private double salarioBase;
    private double percentualComissao;

    // construtor de subclasse herdando o construtor da superclasse.
    public Vendedor(String nome, String cpf, LocalDate dataNascimento, LocalDate dataContratacao, double salarioBase, double percentualComissao) {
        super(nome, cpf, dataNascimento);
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
        this.percentualComissao = percentualComissao;
    }

    // metodo para retornar data de contratação.
    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    // metodo para retornar salario
    public double getSalarioBase() {
        return salarioBase;
    }

 // metodo para retornar percentual de comissao.
    public double getPercentualComissao() {
        return percentualComissao;
    }
}

