package com.senai.aula03_encapsulamento.exercicios.cadastro_de_produto_simples;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto(
                "Batata",
                -1.33
        );

        Produto produto2 = new Produto(
                "Arroz",
                23.59
        );

        System.out.println();
        System.out.println("TESTE 1");
        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println();

        System.out.println("TESTE 2");
        System.out.println(produto1.getNome());
        System.out.println(produto1.getPreco());
        produto1.setPreco(2);
        System.out.println(produto1.getNome());
        System.out.println(produto1.getPreco());
        System.out.println();

        System.out.println("TESTE 3");
        System.out.println(produto2.getPreco());
        produto2.setPreco(-30);
        System.out.println(produto2.getPreco());
        System.out.println(produto2.getNome());
        System.out.println();

        System.out.println("TESTE 4");
        System.out.println(produto2.getPreco());
        produto2.setPreco(20);
        System.out.println(produto2.getPreco());
    }
}
