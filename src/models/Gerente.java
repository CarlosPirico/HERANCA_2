package models;

//importando LocalDate para dataNascimento e dataContratacao.
import java.time.LocalDate;

//criando umas subclasse da superclasse pessoa.
public class Gerente extends Pessoa {
	
	// criando atributos
    private LocalDate dataContratacao;
    private double salarioBase;
    private String departamento;

    // construtor de subclasse herdando o construtor da superclasse.
    public Gerente(String nome, String cpf, LocalDate dataNascimento, LocalDate dataContratacao, double salarioBase, String departamento) {
        super(nome, cpf, dataNascimento);
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    // metodo para retornar data de contratação.
    public LocalDate getDataContratacao() {
        return dataContratacao;
    }
    // metodo para retornar salario
    public double getSalarioBase() {
        return salarioBase;
    }

    // metodo para retornar o departamento
    public String getDepartamento() {
        return departamento;
    }
}

