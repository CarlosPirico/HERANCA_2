package app;

import models.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando um vendedor
        Vendedor vendedor = new Vendedor("Carlos Souza", "123.456.789-00", LocalDate.of(1990, 5, 20), 
                                           LocalDate.of(2020, 3, 1), 2500.00, 10.0);
        
        // Criando um gerente
        Gerente gerente = new Gerente("Ana Paula", "987.654.321-00", LocalDate.of(1985, 7, 15), 
                                       LocalDate.of(2018, 6, 1), 5000.00, "Vendas");
        
        // Criando um cliente
        Cliente cliente = new Cliente("Fernanda Lima", "456.789.123-00", LocalDate.of(1992, 10, 10), 
                                       "fernanda@email.com", "1234-5678", "9999-8888");

        // Exibindo informações
        System.out.println("Vendedor: " + vendedor.getNome() + ", CPF: " + vendedor.getCpf() + 
                           ", Salário Base: " + vendedor.getSalarioBase() + ", Comissão: " + vendedor.getPercentualComissao());
        
        System.out.println("Gerente: " + gerente.getNome() + ", CPF: " + gerente.getCpf() + 
                           ", Salário Base: " + gerente.getSalarioBase() + ", Departamento: " + gerente.getDepartamento());
        
        System.out.println("Cliente: " + cliente.getNome() + ", CPF: " + cliente.getCpf() + 
                           ", Email: " + cliente.getEmail());
    }
}

