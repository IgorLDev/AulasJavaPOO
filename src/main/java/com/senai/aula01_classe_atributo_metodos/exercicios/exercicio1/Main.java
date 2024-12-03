package com.senai.aula01_classe_atributo_metodos.exercicios.exercicio1;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto (
                "Arroz",
                32.49,
                10);

        Produto produto2 = new Produto (
                "Refrigerante",
                8.99,
                18);

        System.out.println("2. Atualize o estoque de um dos produtos.");
        produto1.atualizaEstoque();
        System.out.println();

        System.out.println("3. Exiba os detalhes de ambos os produtos.");
        produto1.exibirDetalhes();
        produto2.exibirDetalhes();
        System.out.println();

        System.out.println("4. Mostre o valor total do estoque de cada produto");
        produto1.calcularValorEstoque();
        System.out.println();
        produto2.calcularValorEstoque();
    }



}
