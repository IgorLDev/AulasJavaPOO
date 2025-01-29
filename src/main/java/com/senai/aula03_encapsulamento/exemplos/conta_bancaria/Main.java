package com.senai.aula03_encapsulamento.exemplos.conta_bancaria;

public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario(
                "Igor",
                "26/02/2003",
                123456
        );

        ContaBancaria contaBancaria1 = new ContaBancaria(
                001,
                0.0,
                usuario1,
                "Bradesco",
                "Conta Corrente"
        );


        usuario1.nome ="Igor";

        contaBancaria1.usuario = usuario1;

        System.out.println(contaBancaria1.usuario.nome);
        contaBancaria1.saldo = 10000;
        System.out.println(contaBancaria1.saldo);
    }
}
