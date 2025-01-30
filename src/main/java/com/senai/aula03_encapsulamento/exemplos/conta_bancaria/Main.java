package com.senai.aula03_encapsulamento.exemplos.conta_bancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaBancaria contaBancaria1 = new ContaBancaria(
                001,
                100.0,
                new Usuario(
                        "Igor",
                        "26/02/2003",
                        123456),
                "Bradesco",
                "Conta Corrente"
        );

        ContaBancaria contaBancaria2 = new ContaBancaria(
                002,
                200.0,
                new Usuario(
                        "Gabriel",
                        "11/11/2011",
                        654321),
                "Caixa",
                "Conta Corrente"
        );

        contaBancaria1.getSaldo();
        contaBancaria2.getSaldo();
        contaBancaria1.depositar(100);
        contaBancaria2.sacar(10);
        contaBancaria1.transferir(20, contaBancaria2);
        contaBancaria2.getSaldo();


//        String menu = """
//                --------------- Bem Vindo Usúario --------------
//                1 - Depositar dinheiro na sua conta.
//                2 - Sacar dinheiro da sua conta.
//                3 - Transferir dinheiro.
//                4 - Sair do sistema
//                ------------------------------------------------
//                """;
//
//
//
//        do {
//            System.out.println(menu);
//            int escolhaUser = scanner.nextInt();
//
//            switch (escolhaUser) {
//                case 1:
//                    System.out.println("1 - Depositar dinheiro na sua conta:");
//                    System.out.println("Digite a quantidade que deseja sacar: ");
//                    double qtdASacar = scanner.nextDouble();
//                    contaBancaria1.sacar(qtdASacar);
//                    break;
//                case 2:
//                    System.out.println("Digite a quantidade que deseja depositar: ");
//                    double qtdADepositar = scanner.nextDouble();
//                    contaBancaria1.depositar(qtdADepositar);
//                    break;
//                case 3:
//                    System.out.println("Digite o usuario que deseja transferir: ");
//                    break;
//                default:
//                    System.out.println("Número inválido digite outro número.");
//            }
//            System.out.println(menu);
//
    }
}
