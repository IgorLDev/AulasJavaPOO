package com.senai.aula03_encapsulamento.exercicios.cadastro_de_produto_simples;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        if(preco>0){
        this.preco = preco;} else {
            System.out.println("O preço não pode ser negativo, " +
                    "o valor do produto '" + this.nome + "' será preenchido com 0.0");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Não é permitido números negativos.");
        }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }


}
