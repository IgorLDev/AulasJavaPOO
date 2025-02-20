package com.senai.aula04_heranca.exercicios.ex05_sistema_de_bibliotecas;

public class Main {
    public static void main(String[] args) {
        LivroDigital livro1 = new LivroDigital("A Chapeuzinho Vermelho", "Eric Souza", 233);
        LivroFisico livro2 = new LivroFisico("A revolução industrial na era vitoriana", "Gabriel Galhiardo", 252);


        livro1.exibirInfos();
        System.out.println();
        livro2.exibirInfos();
    }
}
