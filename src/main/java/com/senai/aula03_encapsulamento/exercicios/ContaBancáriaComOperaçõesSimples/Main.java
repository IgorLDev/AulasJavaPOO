package com.senai.aula03_encapsulamento.exercicios.ContaBancáriaComOperaçõesSimples;

public class Main {
    public static void main(String[] args) {

        ContaBancaria contaBancaria1 = new ContaBancaria(
                "Igor",
                1000
        );

        ContaBancaria contaBancaria2 = new ContaBancaria(
                "Bia",
                0
        );

        contaBancaria1.getSaldo();
        System.out.println();
        contaBancaria1.depositar(100);
        System.out.println();
        contaBancaria1.sacar(1600);

    }
}
