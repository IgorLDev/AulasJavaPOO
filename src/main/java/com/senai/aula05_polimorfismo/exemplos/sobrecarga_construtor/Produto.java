package com.senai.aula05_polimorfismo.exemplos.sobrecarga_construtor;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto() {
    }

    // Construtor 1
    public Produto(String nome) {
        this.nome = nome;
    }

    // Construtor 2
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Construtor 3
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
}
