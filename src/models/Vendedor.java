package models;

import java.time.LocalDate;

public class Vendedor extends Pessoa {
    private LocalDate dataContratacao;
    private double salarioBase;
    private double percentualComissao;

    public Vendedor(String nome, String cpf, LocalDate dataNascimento, LocalDate dataContratacao, double salarioBase, double percentualComissao) {
        super(nome, cpf, dataNascimento);
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
        this.percentualComissao = percentualComissao;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }
}

