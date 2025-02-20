package com.senai.aula04_heranca.exercicios.ex01_controle_de_estoque;

public class Eletronico extends Produto{
    private float voltagem;

    public Eletronico(String nome, double preco, int quantidade, float voltagem) {
        super(nome, preco, quantidade);
        this.voltagem = voltagem;
    }

    public float getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(float voltagem) {
        this.voltagem = voltagem;
    }

    public void exibirInfos(){
        super.exibirInfos();
        System.out.println("Voltagem: " + voltagem + "v");
    }
}
