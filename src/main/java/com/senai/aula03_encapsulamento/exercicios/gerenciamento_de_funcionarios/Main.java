package com.senai.aula03_encapsulamento.exercicios.gerenciamento_de_funcionarios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario(
                "Igor",
                2,
                1000
        );
        System.out.println(funcionario1);

        funcionario1.setSalario(1400);
        funcionario1.setSalario(1000);
        funcionario1.setCargo(3);
        funcionario1.setNome(null);
        funcionario1.setNome("");
        funcionario1.setNome("      ");

        System.out.println(funcionario1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Preencha as informações do funcionário: ");
        System.out.print("Nome: ");
        while (funcionario1.setNome(scanner.nextLine())) {
            System.out.println("Digite um nome válido!");
        }
        System.out.println(funcionario1);

        System.out.print("Cargo: ");
        while (funcionario1.setCargo(scanner.nextInt())) {
            System.out.println("Digite um cargo válido!");
        }
        System.out.println(funcionario1);

        System.out.print("Salário: ");
        while (funcionario1.setSalario(scanner.nextDouble())) {
            System.out.println("Digite um salário válido!");
        }
        System.out.println(funcionario1);

        //----------------------Construtor------------------------

        System.out.println("Preencha as informações do funcionário: ");
        System.out.println("Nome: ");
        String nome;
        do {
            nome = scanner.nextLine();
            System.out.println("Digite um nome válido.");
        }  while (nome == null && nome.isBlank());

        System.out.println("Preencha as informações do funcionário: \n1- Gerente\n2- Analista\n3- Programador.");
        System.out.println("Cargo: ");
        int idCargo = scanner.nextInt();
        while (idCargo >= 0 && idCargo < 3){
            System.out.println("Digite um cargo válido\n1- Gerente\n2- Analista\n3- Programador.");
        }

        System.out.println("Preencha as informações do funcionário: ");
        System.out.println("Salário: ");
        double salario = scanner.nextDouble();
        while (salario > 1350){
            System.out.println("Digite um salário válido.");
        }


        Funcionario funcionario2 = new Funcionario(nome, idCargo, salario);
        System.out.println(funcionario2);


    }
}