package com.senai.aula04_heranca.exercicios.controle_de_estoque;

public class Alimentos extends Produto{
    private String dataDeValidade;

    public Alimentos(String nome, double preco, int quantidade, String dataDeValidade) {
        super(nome, preco, quantidade);
        this.dataDeValidade = dataDeValidade;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    public void exibirInfos() {
        super.exibirInfos();
        System.out.println("Data de Validade: " + dataDeValidade);
    }
}
