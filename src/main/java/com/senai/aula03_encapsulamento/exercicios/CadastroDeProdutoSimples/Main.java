package com.senai.aula03_encapsulamento.exercicios.CadastroDeProdutoSimples;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto(
                "Batata",
                1.33
        );

        Produto produto2 = new Produto(
                "Arroz",
                3.59
        );

        System.out.println(produto2.getPreco());
        produto2.setPreco(0);
        System.out.println(produto2.getPreco());
    }
}
