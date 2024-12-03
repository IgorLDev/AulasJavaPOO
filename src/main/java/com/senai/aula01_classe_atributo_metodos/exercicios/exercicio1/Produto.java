package com.senai.aula01_classe_atributo_metodos.exercicios.exercicio1;

import java.util.Scanner;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + nome +
                " | Preço: " + preco +
                " | Quantidade: " + quantidade;
    }

    void exibirDetalhes () {
        System.out.println(toString());
    }

    void atualizaEstoque () {
        Scanner scanner = new Scanner(System.in);
        int userEscolha = 0;

        System.out.println("Digite um valor positivo para adicionar ao estoque e digite um valor negativo para subtrair do estoque de " + nome + ":");
        System.out.println("Quantidade atual: " + quantidade);
        userEscolha = scanner.nextInt();
        System.out.println("Número digitado: " + userEscolha);
        quantidade += userEscolha;
        System.out.println("Estoque atualizado. | " + "Estoque atual: " + quantidade);
    }

    void calcularValorEstoque () {
        double valorEstoque;

        System.out.println(toString());
        valorEstoque = preco * quantidade;
        System.out.println("Valor do Estoque: R$" + valorEstoque);
    }

}
