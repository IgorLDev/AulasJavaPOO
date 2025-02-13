package com.senai.aula04_heranca.exemplos.sistema_de_cadastro_de_funcionarios;

public class Main {
    public static void main(String[] args) {
            Funcionario funcionario1 = new Funcionario("Gabriel", 10);
            Gerente gerente1 = new Gerente("Igor", 35000, 500);

        System.out.println("Detalhes do Funcionário: ");
        funcionario1.exibirDados();

        System.out.println("\nDetalhes do Gerente: ");
        gerente1.exibirDados();
    }
}
